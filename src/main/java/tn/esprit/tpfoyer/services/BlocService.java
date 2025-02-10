package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Bloc;

import java.util.List;

@Service
@AllArgsConstructor

public class BlocService implements IBlocService{
    @Override
    public List<Bloc> retrieveAllBlocs() {
        return List.of();
    }

    @Override
    public Bloc retrieveBloc(Long BlocId) {
        return null;
    }

    @Override
    public Bloc addBloc(Bloc c) {
        return null;
    }

    @Override
    public void removeBloc(Long BlocId) {

    }

    @Override
    public Bloc modifyBloc(Bloc Bloc) {
        return null;
    }
}
