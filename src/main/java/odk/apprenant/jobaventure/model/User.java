package odk.apprenant.jobaventure.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    //private String age;
    @Column(unique = true)
    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private RoleType roleType;
}
