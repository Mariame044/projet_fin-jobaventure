package odk.apprenant.jobaventure.repository;

import odk.apprenant.jobaventure.model.RoleType;
import odk.apprenant.jobaventure.model.Utilisateur;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
    Optional<Utilisateur> findById(Long id);
    List<Utilisateur> findByRoleType(RoleType roleType);
    Optional<Utilisateur> findByEmail(String email);

}
