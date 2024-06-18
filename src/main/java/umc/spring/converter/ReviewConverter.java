package umc.spring.converter;

import umc.spring.domain.Review;
import umc.spring.web.dto.ReviewRequestDTO;
import umc.spring.web.dto.ReviewResponseDTO;

public class ReviewConverter {

    public static Review toReview(ReviewRequestDTO.JoinReviewDTO request) {
        return Review.builder()
                .body(request.getBody())
                .score(request.getScore())
                .build();
    }

    public static ReviewResponseDTO.JoinResultDTO toJoinResultDTO(Review review) {
        return ReviewResponseDTO.JoinResultDTO.builder()
                .id(review.getId())
                .createdAt(review.getCreatedAt())
                .build();
    }
}
