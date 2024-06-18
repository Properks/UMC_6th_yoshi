package umc.spring.service.review;

import umc.spring.domain.Review;
import umc.spring.web.dto.ReviewRequestDTO;

public interface ReviewCommandService {
    Review join(ReviewRequestDTO.JoinReviewDTO request);
}
