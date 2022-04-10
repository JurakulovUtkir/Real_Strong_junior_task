package uz.pdp.corxona_telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.corxona_telecom.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}