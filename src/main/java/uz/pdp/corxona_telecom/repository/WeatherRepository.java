package uz.pdp.corxona_telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.corxona_telecom.entity.Weather;

import java.util.Optional;
import java.util.UUID;

public interface WeatherRepository extends JpaRepository<Weather, UUID> {
    Optional<Weather[]> findAllByCity_Id (String cityId);
}