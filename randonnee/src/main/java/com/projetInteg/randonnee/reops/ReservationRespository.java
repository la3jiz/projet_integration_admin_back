package com.projetInteg.randonnee.reops;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetInteg.randonnee.entities.Participant;
@Repository
public interface ReservationRespository extends JpaRepository<Participant, Long> {

}
