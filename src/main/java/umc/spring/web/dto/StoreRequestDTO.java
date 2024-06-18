package umc.spring.web.dto;

import lombok.Getter;
import umc.spring.validation.annotation.ExistRegion;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StoreRequestDTO {

    @Getter
    public static class JoinStoreDTO {

        @NotNull
        @Size(max = 50)
        private String name;

        @NotNull
        @Size(max = 50)
        private String address;

        private Float score;

        @ExistRegion
        private Long regionId;
    }
}
