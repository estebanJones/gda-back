package dev.domain.dto;

import java.time.LocalDate;

import dev.domain.entite.Absence;
import dev.utils.ConversionDateJours;

public class DtoJoursFerieResponse {

	long idCollegue;
	LocalDate dateJourFerie;
	String jourSemaine;
	String typeConge;
	String commentaireAbsence;
	String statutDemande;

	public DtoJoursFerieResponse(Absence abs) {
		this.idCollegue = abs.getCollegue().getId();
		this.dateJourFerie = abs.getDatePremierJourAbsence();
		this.jourSemaine = ConversionDateJours.convertionDateJourSemaine(abs.getDatePremierJourAbsence());
		this.typeConge = abs.getTypeConge().toString();
		this.commentaireAbsence = abs.getCommentaireAbsence();
		this.statutDemande = abs.getStatutDemandeAbsence().toString();
	}

	public long getIdCollegue() {
		return idCollegue;
	}

	public void setIdCollegue(long idCollegue) {
		this.idCollegue = idCollegue;
	}

	public LocalDate getDateJourFerie() {
		return dateJourFerie;
	}

	public void setDateJourFerie(LocalDate dateJourFerie) {
		this.dateJourFerie = dateJourFerie;
	}

	public String getTypeConge() {
		return typeConge;
	}

	public void setTypeConge(String typeConge) {
		this.typeConge = typeConge;
	}

	public String getCommentaireAbsence() {
		return commentaireAbsence;
	}

	public void setCommentaireAbsence(String commentaireAbsence) {
		this.commentaireAbsence = commentaireAbsence;
	}

	public String getStatutDemande() {
		return statutDemande;
	}

	public void setStatutDemande(String statutDemande) {
		this.statutDemande = statutDemande;
	}

}
