
package dev.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.domain.entite.Absence;
import dev.domain.enums.EStatutDemandeAbsence;

public interface AbsenceRepo extends JpaRepository<Absence, Long> {

	Optional<Absence> findByDatePremierJourAbsenceAndDateDernierJourAbsence(LocalDate datePremierJourAbsence, LocalDate dateDernierJourAbsence);

	@Query("select a from Absence a where a.typeConge='RTT_EMPLOYEUR' OR a.typeConge='JOUR_FERIE'")
	Optional<List<Absence>> findAllJoursFerieEtRttEmployeur();
	
	Optional<List<Absence>> findByDatePremierJourAbsenceGreaterThanEqualAndDateDernierJourAbsenceLessThan(LocalDate datePremierJourAbsence, LocalDate dateDernierJourAbsence);
	Optional<List<Absence>> findByStatutDemandeAbsence(EStatutDemandeAbsence statutDemandeAbsence);
}

