package uz.pdp.corxona_telecom;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uz.pdp.corxona_telecom.entity.User;
import uz.pdp.corxona_telecom.repository.UserRepository;

@SpringBootApplication
@RequiredArgsConstructor
public class CorxonaTelecomApplication {



    public static void main(String[] args) {
        SpringApplication.run(CorxonaTelecomApplication.class, args);
    }


}
