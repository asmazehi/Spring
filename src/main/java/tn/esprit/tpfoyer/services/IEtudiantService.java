package tn.esprit.tpfoyer.services;
import tn.esprit.tpfoyer.entities.Etudiant;
import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiant(Long EtudiantId);
    public Etudiant addEtudiant(Etudiant c);
    public void removeEtudiant(Long EtudiantId);
    public Etudiant modifyEtudiant(Etudiant Etudiant);
}
