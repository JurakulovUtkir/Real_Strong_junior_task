package uz.pdp.corxona_telecom.entity;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Weather {
    @Id
    private UUID id = UUID.randomUUID();

    private Date date;

    private Float rainRate;
    private Float windRate;
    private Float degree;

    @ManyToOne()
    private City city;
}
