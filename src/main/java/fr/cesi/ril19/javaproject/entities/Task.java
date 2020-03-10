package fr.cesi.ril19.javaproject.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="trackingNumber")
    private String trackingNumber;
    @Column(name="hourlyCost")
    private Integer hourlyCost;
    @Column(name="duration")
    private String duration;
    @Column(name="idProjet")
    private String idProjet;

}

