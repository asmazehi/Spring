package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.List;

@Service
@AllArgsConstructor

public class EtudiantService implements IEtudiantService{
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return List.of();
    }

    @Override
    public Etudiant retrieveEtudiant(Long EtudiantId) {
        return null;
    }

    @Override
    public Etudiant addEtudiant(Etudiant c) {
        return null;
    }

    @Override
    public void removeEtudiant(Long EtudiantId) {

    }

    @Override
    public Etudiant modifyEtudiant(Etudiant Etudiant) {
        return null;
    }
}
