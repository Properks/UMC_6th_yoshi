package umc.spring.web.dto;

import lombok.Getter;
import umc.spring.validation.annotation.ExistMember;
import umc.spring.validation.annotation.ExistMission;

import javax.validation.constraints.Size;

public class MemberMissionRequestDTO {

    @Getter
    public static class JoinMemberMissionDTO {

        @ExistMember
        private Long memberId;

        @ExistMission
        private Long missionId;
    }
}
