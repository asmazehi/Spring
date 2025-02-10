package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

@Service
@AllArgsConstructor

public class UniversiteService implements IUniversiteService {
    @Override
    public List<Universite> retrieveAllUniversites() {
        return List.of();
    }

    @Override
    public Universite retrieveUniversite(Long UniversiteId) {
        return null;
    }

    @Override
    public Universite addUniversite(Universite c) {
        return null;
    }

    @Override
    public void removeUniversite(Long UniversiteId) {

    }

    @Override
    public Universite modifyUniversite(Universite Universite) {
        return null;
    }
}
