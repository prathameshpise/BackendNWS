package com.NWS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ArtistDetails_tbl")
public class ArtistDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int artistID;
	
	@Column(name= "artist_name")
	private String artistName;
	
	@Column(name= "artist_contact_no")
	private long artistContactNo;
	
	@Column(name= "artist_charges")
	private int artistCharges;
	
	@Column(name= "artist_city")
	private String artistCity;
	
	@Column(name= "artist_pincode")
	private long artistPinCode;



}
