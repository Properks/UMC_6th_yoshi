package umc.spring.converter;

import umc.spring.domain.Store;
import umc.spring.web.dto.StoreRequestDTO;
import umc.spring.web.dto.StoreResponseDTO;

public class StoreConverter {

    public static Store toStore(StoreRequestDTO.JoinStoreDTO request) {
        return Store.builder()
                .name(request.getName())
                .score(request.getScore())
                .address(request.getAddress())
                .build();
    }

    public static StoreResponseDTO.JoinResultDTO toJoinResultDTO(Store store) {
        return StoreResponseDTO.JoinResultDTO.builder()
                .id(store.getId())
                .createdAt(store.getCreatedAt())
                .build();
    }
}
