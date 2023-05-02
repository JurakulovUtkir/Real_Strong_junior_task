package uz.pdp.corxona_telecom.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class City {
    @Id
    private UUID id = UUID.randomUUID();

    @Column(length = 255) // default 255
    private String name;

    @ManyToMany(mappedBy = "cities")
    private Set<User> users = new HashSet<>();// takrorlanmaydigan bo'lishi
}
