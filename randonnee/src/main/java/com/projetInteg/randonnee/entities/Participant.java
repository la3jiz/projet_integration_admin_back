package com.projetInteg.randonnee.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Participant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParticipant;
	@Column(unique = true)
	private String username;
	private String password;
	private Long NumTelUser;
	private String EmailUser;
	private Integer status;
	
	/*
	@ManyToOne
	private User userReservation;
	
	 @ManyToOne
	 private Randonnee RandonneeReservation;
	
	*/
	

	public String getUsername() {
		return username;
	}
	public Long getIdParticipant() {
		return idParticipant;
	}
	public void setIdParticipant(Long idParticipant) {
		this.idParticipant = idParticipant;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getNumTelUser() {
		return NumTelUser;
	}
	public void setNumTelUser(Long numTelUser) {
		NumTelUser = numTelUser;
	}
	public String getEmailUser() {
		return EmailUser;
	}
	public void setEmailUser(String emailUser) {
		EmailUser = emailUser;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Participant(Long idParticipant, String username, String password, Long numTelUser, String emailUser,
			Integer status) {
		super();
		this.idParticipant = idParticipant;
		this.username = username;
		this.password = password;
		NumTelUser = numTelUser;
		EmailUser = emailUser;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Participant [idParticipant=" + idParticipant + ", username=" + username + ", password=" + password
				+ ", NumTelUser=" + NumTelUser + ", EmailUser=" + EmailUser + ", status=" + status + "]";
	}
	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
