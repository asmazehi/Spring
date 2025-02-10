package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }
    public Universite retrieveUniversite(Long UniversiteId) {
        return universiteRepository.findById(UniversiteId).get();
    }
    public Universite addUniversite(Universite c) {
        return universiteRepository.save(c);
    }
    public void removeUniversite(Long UniversiteId) {
        universiteRepository.deleteById(UniversiteId);
    }
    public Universite modifyUniversite(Universite Universite) {
        return universiteRepository.save(Universite);
    }
}
