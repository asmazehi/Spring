package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

@Service
@AllArgsConstructor

public class ReservationService implements IReservationService {
    @Override
    public List<Reservation> retrieveAllReservations() {
        return List.of();
    }

    @Override
    public Reservation retrieveReservation(Long ReservationId) {
        return null;
    }

    @Override
    public Reservation addReservation(Reservation c) {
        return null;
    }

    @Override
    public void removeReservation(Long ReservationId) {

    }

    @Override
    public Reservation modifyReservation(Reservation Reservation) {
        return null;
    }
}
