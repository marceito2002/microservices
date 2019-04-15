package com.docomo.fraudwall.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Partner")
@Cacheable
@Data
public class PartnerDomain implements Serializable {

	private static final long serialVersionUID = -2425865726810811027L;

	@Id
	private String partnerId;
	private Date date;
	private String partnerName;
	private String fraudwallModel;

	private List<EventDomain> events;

	public PartnerDomain(String partnerId, Date date, String partnerName, String fraudwallModel, List<EventDomain> events) {
		super();
		this.partnerId = partnerId;
		this.date = date;
		this.partnerName = partnerName;
		this.fraudwallModel = fraudwallModel;
		this.events = events;
	}

	public PartnerDomain() {
		super();
	}

}
