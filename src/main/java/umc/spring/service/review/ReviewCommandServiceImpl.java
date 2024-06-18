package umc.spring.service.review;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.apiPayload.code.status.ErrorStatus;
import umc.spring.apiPayload.exception.handler.MemberHandler;
import umc.spring.apiPayload.exception.handler.StoreHandler;
import umc.spring.converter.ReviewConverter;
import umc.spring.domain.Member;
import umc.spring.domain.Review;
import umc.spring.domain.Store;
import umc.spring.repository.MemberRepository;
import umc.spring.repository.ReviewRepository;
import umc.spring.repository.StoreRepository;
import umc.spring.web.dto.ReviewRequestDTO;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ReviewCommandServiceImpl implements ReviewCommandService {

    private final ReviewRepository reviewRepository;
    private final MemberRepository memberRepository;
    private final StoreRepository storeRepository;

    @Override
    @Transactional
    public Review join(ReviewRequestDTO.JoinReviewDTO request) {
        Review review = ReviewConverter.toReview(request);

        Member member = memberRepository.findById(request.getMemberId()).orElseThrow(() ->
                new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND));

        Store store = storeRepository.findById(request.getStoreId()).orElseThrow(() ->
                new StoreHandler(ErrorStatus.STORE_NOT_FOUND));

        review.setMember(member);
        review.setStore(store);
        updateScoreOfStore(store, review);

        return reviewRepository.save(review);
    }

    private void updateScoreOfStore(Store store, Review review) {
        if (store.getReviewList().isEmpty()) {
            store.updateScore(review.getScore());
        }
        else {
            float total = store.getScore() * store.getReviewList().size() + review.getScore();
            store.updateScore(total / (store.getReviewList().size() + 1));
        }
    }
}
