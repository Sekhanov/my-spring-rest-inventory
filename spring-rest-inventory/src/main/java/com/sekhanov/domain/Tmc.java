package com.sekhanov.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Tmc {
	
	@Id
	@GeneratedValue()
	private int id;	
	@NonNull
	@ManyToOne
	@JoinColumn(name = "tmc_category_id")
	private TmcCategory tmcCategory;
	@NonNull
	@ManyToOne
	@JoinColumn(name = "tmc_type_id")
	private TmcType tmcType;
	@NonNull
	@ManyToOne
	@JoinColumn(name = "tmc_name_id")
	private TmcName tmcName;
	private String serialNumber;
	@NonNull
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Person owner;
	private String comment;
	private boolean onBalance;
	
	
}
