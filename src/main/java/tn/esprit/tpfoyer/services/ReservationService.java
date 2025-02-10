package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.repositories.ReservationRepository;
import tn.esprit.tpfoyer.repositories.ReservationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ReservationService implements IReservationService {
    @Autowired
    ReservationRepository reservationRepository;
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }
    public Reservation retrieveReservation(Long ReservationId) {
        return reservationRepository.findById(ReservationId).get();
    }
    public Reservation addReservation(Reservation c) {
        return reservationRepository.save(c);
    }
    public void removeReservation(Long ReservationId) {
        reservationRepository.deleteById(ReservationId);
    }
    public Reservation modifyReservation(Reservation Reservation) {
        return reservationRepository.save(Reservation);
    }
}
