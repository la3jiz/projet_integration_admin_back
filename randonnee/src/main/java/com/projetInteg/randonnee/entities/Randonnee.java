package com.projetInteg.randonnee.entities;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;


@Entity
public class Randonnee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRandonnee;
	private Double prixRandonnee;
	private String titreRandonnee;
	private String description;
	private Date dateRandonnee;
	private Date dateDebut;
	private Date dateFin;
	private String destination;
	private long nbPlace;
	private long guideId;
	
	public long getGuideId() {
		return guideId;
	}

	public void setGuideId(long guideId) {
		this.guideId = guideId;
	}

	@Lob
	@Column(columnDefinition = "TEXT")
	private String image;

	@ManyToOne
	private Guide guide;
	
	 



	public long getIdRandonnee() {
		return idRandonnee;
	}

	public void setIdRandonnee(long idRandonnee) {
		this.idRandonnee = idRandonnee;
	}

	public Double getPrixRandonnee() {
		return prixRandonnee;
	}

	public void setPrixRandonnee(Double prixRandonnee) {
		this.prixRandonnee = prixRandonnee;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateRandonnee() {
		return dateRandonnee;
	}

	public void setDateRandonnee(Date dateRandonnee) {
		this.dateRandonnee = dateRandonnee;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getdestination() {
		return destination;
	}

	public void setdestination(String destination) {
		this.destination = destination;
	}

	public long getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(long nbPlace) {
		this.nbPlace = nbPlace;
	}

	public Guide getGuide() {
		return guide;
	}

	public void setGuide(Guide guide) {
		this.guide = guide;
	}



	@Override
	public String toString() {
		return "Randonnee [idRandonnee=" + idRandonnee + ", prixRandonnee=" + prixRandonnee + ", titreRandonnee="
				+ titreRandonnee + ", description=" + description + ", dateRandonnee=" + dateRandonnee + ", dateDebut="
				+ dateDebut + ", dateFin=" + dateFin + ", destination=" + destination + ", nbPlace=" + nbPlace
				+ ", guide=" + guide + ", image=" + image + "]";
	}
	

	public Randonnee( Double prixRandonnee, String titreRandonnee, String description,
			Date dateRandonnee, Time dateDebut, Time dateFin, String destination, long nbPlace, Guide guide,
			String image) {
		this.prixRandonnee = prixRandonnee;
		this.titreRandonnee = titreRandonnee;
		this.description = description;
		this.dateRandonnee = dateRandonnee;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.destination = destination;
		this.nbPlace = nbPlace;
		this.guide = guide;
		this.image = image;
	}
	
	

	public Randonnee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitreRandonnee() {
		return titreRandonnee;
	}

	public void setTitreRandonnee(String titreRandonnee) {
		this.titreRandonnee = titreRandonnee;
	}


	
	
	

	
	
	
	
	
	
	
	
	


}
