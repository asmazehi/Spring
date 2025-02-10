package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.repositories.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }
    public Foyer retrieveFoyer(Long FoyerId) {
        return foyerRepository.findById(FoyerId).get();
    }
    public Foyer addFoyer(Foyer c) {
        return foyerRepository.save(c);
    }
    public void removeFoyer(Long FoyerId) {
        foyerRepository.deleteById(FoyerId);
    }
    public Foyer modifyFoyer(Foyer Foyer) {
        return foyerRepository.save(Foyer);
    }
}
