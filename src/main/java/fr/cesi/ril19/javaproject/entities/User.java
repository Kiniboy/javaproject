package fr.cesi.ril19.javaproject.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    @JsonProperty("lastname")
    private String lastname;
    @Column(name="email")
    private String email;
    @Column(name="tel")
    private String tel;
    @Column(name="manager")
    private Boolean manager;
}
