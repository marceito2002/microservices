package com.docomo.fraudwall.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Session")
@Cacheable
@CompoundIndexes({ @CompoundIndex(name = "session_partner", def = "{'id' : 1, 'partnerName': 1}") })
public class SessionDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4973799439186555253L;

	@Id
	private String id;
	private Date date;
	private String partnerName;
	

	public SessionDomain(String id, String partnerName, Date date) {
		super();
		this.id = id;
		this.partnerName = partnerName;
		this.date=date;
	}

	public SessionDomain() {
		super();
	}

}