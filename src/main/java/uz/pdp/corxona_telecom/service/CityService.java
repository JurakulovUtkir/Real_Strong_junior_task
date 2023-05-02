package uz.pdp.corxona_telecom.service;

import java.util.List;
import java.util.UUID;
import java.util.logging.*;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.corxona_telecom.entity.City;
import uz.pdp.corxona_telecom.payload.ApiResponse;
import uz.pdp.corxona_telecom.repository.CityRepository;

@Service
@RequiredArgsConstructor
public class CityService {

    private static final Logger logger = Logger.getLogger(CityService.class.getName());
    private final CityRepository cityRepository;

    /**
     * adding pagination and sorting and filter
     *
     * @return
     */
    public ApiResponse cities() throws Exception {
        try {
            List<City> all = cityRepository.findAll();
            return new ApiResponse("All", true, all);
        } catch (Exception e) {
            logger.info(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

    public ApiResponse subscribeToCity(UUID cityId) throws Exception {
        try {
            // get city;
            // get user
            // user.cities + city  update user;


        } catch (Exception e) {
            logger.info(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

    /**
     * get user subscriptions
     */


}
