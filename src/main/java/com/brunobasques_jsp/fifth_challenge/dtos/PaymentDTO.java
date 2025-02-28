package com.brunobasques_jsp.fifth_challenge.dtos;

import java.time.Instant;

public class PaymentDTO {

	private Long id;
	private Instant moment;
	
	public PaymentDTO() {	
	}
	
	public PaymentDTO(Long id, Instant moment) {
		this.id = id;
		this.moment = moment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}
}
