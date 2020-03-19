package fr.cesi.ril19.javaproject.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="titre")
    private String titre;
    @Column(name="description")
    private String description;
    @Column(name="mode")
    private String mode;
    @Column(name="Manager")
    private String Manager;
    @Column(name = "budget")
    private String budget;
    @Column(name = "StartDate")
    private Timestamp StartDate;
    @Column(name = "workDays")
    private  int workDays;
}

