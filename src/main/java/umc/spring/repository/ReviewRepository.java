package umc.spring.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Member;
import umc.spring.domain.Review;
import umc.spring.domain.Store;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Page<Review> findReviewsByStoreIsOrderByCreatedAtDesc(Pageable pageable, Store store);
    Page<Review> findReviewsByMemberIsOrderByCreatedAtDesc(Pageable pageable, Member member);
}
