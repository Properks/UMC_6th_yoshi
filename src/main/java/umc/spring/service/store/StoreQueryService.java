package umc.spring.service.store;

import org.springframework.data.domain.Page;
import umc.spring.domain.Mission;
import umc.spring.domain.Review;
import umc.spring.domain.Store;

import java.util.List;

public interface StoreQueryService {
    boolean isExist(Long id);
    Store getStore(Long id);
    Page<Review> getReviews(Long storeId, Integer page);
    Page<Mission> getMissions(Long storeId, Integer page);
}
