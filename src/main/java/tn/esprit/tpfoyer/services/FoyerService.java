package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;

@Service
@AllArgsConstructor

public class FoyerService implements IFoyerService {
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return List.of();
    }

    @Override
    public Foyer retrieveFoyer(Long FoyerId) {
        return null;
    }

    @Override
    public Foyer addFoyer(Foyer c) {
        return null;
    }

    @Override
    public void removeFoyer(Long FoyerId) {

    }

    @Override
    public Foyer modifyFoyer(Foyer Foyer) {
        return null;
    }
}
