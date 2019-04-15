package com.docomo.fraudwall.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class EventDomain implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2860485732929652092L;
	
	private String eventName;
	private String eventId;
	
	
	public EventDomain(String eventName, String eventId) {
		super();
		this.eventName = eventName;
		this.eventId = eventId;
	}


	public EventDomain() {
		super();
	}
	
	
}
