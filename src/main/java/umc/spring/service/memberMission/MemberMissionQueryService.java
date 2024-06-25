package umc.spring.service.memberMission;

import org.springframework.data.domain.Page;
import umc.spring.domain.enums.MissionStatus;
import umc.spring.domain.mapping.MemberMission;

public interface MemberMissionQueryService {
    Page<MemberMission> findMissionByUserAndStatus(Long memberId, MissionStatus status, Integer page);
}
