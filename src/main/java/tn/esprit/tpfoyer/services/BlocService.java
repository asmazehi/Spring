package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.repositories.BlocRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BlocService implements IBlocService{
    @Autowired
    BlocRepository blocRepository;
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }
    public Bloc retrieveBloc(Long BlocId) {
        return blocRepository.findById(BlocId).get();
    }
    public Bloc addBloc(Bloc c) {
        return blocRepository.save(c);
    }
    public void removeBloc(Long BlocId) {
        blocRepository.deleteById(BlocId);
    }
    public Bloc modifyBloc(Bloc Bloc) {
        return blocRepository.save(Bloc);
    }

}
