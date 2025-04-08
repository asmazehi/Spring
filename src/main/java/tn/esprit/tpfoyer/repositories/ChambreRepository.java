package tn.esprit.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findAllByTypeChambre(TypeChambre tc);
    Chambre findChambreByNumeroChambre(Long num);
    // No need to code CRUD here. It is already provided by the Spring Data JPA interfaces:
    // - CrudRepository
    // - PagingAndSortingRepository
    // - JpaRepository

    // You can add custom query methods here if needed
}
