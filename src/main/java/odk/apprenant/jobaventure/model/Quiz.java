package odk.apprenant.jobaventure_backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;


    // Relation OneToMany avec Question (si un quiz a plusieurs questions)
    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question1> question1 = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "metier_id")
    private Metier metier;

    @ManyToMany(mappedBy = "quiz")
    private List<Enfant> enfant = new ArrayList<>();
}