package odk.apprenant.jobaventure_backend.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Admin extends User {

    @OneToMany(mappedBy = "admin")
    private List<Professionnel> professionnel; // Un
    @OneToMany(mappedBy = "admin")
    private List<Metier> metier; // Unp
    @OneToMany(mappedBy = "admin")
    private List<Jeuderole> jeuderole ; // Unp
    @OneToMany(mappedBy = "admin")
    private List<Categorie> categorie; // Unp
    @OneToMany(mappedBy = "admin")
    private List<Video> video; // Unp
    @OneToMany(mappedBy = "admin")
    private List<Badge> badge;
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<Interview> interview; // Un professionnel peut avoir plusieurs interviews




}
