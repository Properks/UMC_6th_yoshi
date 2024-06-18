package umc.spring.web.dto;

import lombok.Getter;
import umc.spring.validation.annotation.ExistMember;
import umc.spring.validation.annotation.ExistStore;

import javax.validation.constraints.NotNull;

public class ReviewRequestDTO {

    @Getter
    public static class JoinReviewDTO {

        @NotNull
        private String body;

        private Float score;

        @ExistMember
        private Long memberId;

        @ExistStore
        private Long storeId;
    }
}
