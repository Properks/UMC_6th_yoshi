package umc.spring.converter;

import umc.spring.domain.enums.MissionStatus;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.web.dto.MemberMissionResponseDTO;

public class MemberMissionConverter {

    public static MemberMission toMemberMission(MissionStatus status) {
        return MemberMission.builder()
                .status(status)
                .build();
    }

    public static MemberMissionResponseDTO.JoinResultDTO toJoinResultDTO(MemberMission memberMission) {
        return MemberMissionResponseDTO.JoinResultDTO.builder()
                .id(memberMission.getId())
                .createdAt(memberMission.getCreatedAt())
                .build();
    }
}
