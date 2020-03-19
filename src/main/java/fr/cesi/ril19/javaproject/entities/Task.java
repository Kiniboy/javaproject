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
    @Column(name="num")
    private String num;
    @Column(name="hourCost")
    private Integer hourCost;
    @Column(name="duration")
    private String duration;
    @Column(name="Projet")
    private Integer Projet;

}

