package com.NWS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NWS.Entity.ArtistDetails;
import com.NWS.Repository.ArtistDetailsRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ArtistDetailsService {

	@Autowired
	private ArtistDetailsRepository aRepository;
	
	//Post method
	public ArtistDetails saveArtistDetails(ArtistDetails artistDetails) {
		return aRepository.save(artistDetails);
	}
	
	public List<ArtistDetails> saveArtistDetails(List<ArtistDetails> artistDetailsList) {
		return aRepository.saveAll(artistDetailsList);
	}
	
	//get method
	public List<ArtistDetails> getArtistDetails(){
		return aRepository.findAll();
	}
	
	public ArtistDetails getArtistDetailsByArtistID(int artistID){
		return aRepository.findByArtistID(artistID).orElse(null);
	}

	public ArtistDetails getArtistDetailsByArtistName(String artistName) {
		// TODO Auto-generated method stub
		return aRepository.findByArtistName(artistName).orElse(null);
	}


	public ArtistDetails deleteArtistDetails(int artistID) {
		// TODO Auto-generated method stub
		return aRepository.deleteByArtistID(artistID).orElse(null);
	}

	public List<ArtistDetails> findAllArtistsByPincode(String artistPinCode) {
        return aRepository.findByPincode(artistPinCode);
    }

	
	
}
