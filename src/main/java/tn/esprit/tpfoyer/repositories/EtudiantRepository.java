package tn.esprit.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Etudiant;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{
}
