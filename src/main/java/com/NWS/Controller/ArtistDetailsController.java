package com.NWS.Controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.NWS.Entity.ArtistDetails;
import com.NWS.Service.ArtistDetailsService;
//import org.springframework.security.access.annotation.Secured;

@RestController
@RequestMapping("/api/artistDetails")
public class ArtistDetailsController {

	@Autowired
	private ArtistDetailsService aService;
	
	//post request
	@PostMapping("/addArtistDetails")
	public ArtistDetails addArtistDetails(@RequestBody ArtistDetails artistDetails) {
		return aService.saveArtistDetails(artistDetails); 
	}
	
	@PostMapping("/addAllArtistDetails")
	public List<ArtistDetails> addArtistDetails(@RequestBody List<ArtistDetails> artistDetailsList) {
		return aService.saveArtistDetails(artistDetailsList);
	}
	
	@GetMapping("/AllArtistDetails")
	public List<ArtistDetails> findAllArtistDetails(){
	return aService.getArtistDetails();
	}
	
	@GetMapping("/ArtistDetails/{artistID}")
	public ArtistDetails findArtistDetailsByArtistID(@PathVariable int artistID) {
		return aService.getArtistDetailsByArtistID(artistID);
	}
	
	@GetMapping("/ArtistDetails/{artistName}")
	public ArtistDetails findArtistDetailsByArtistName(@PathVariable String artistName) {
		return aService.getArtistDetailsByArtistName(artistName);
	}
	

	@DeleteMapping("/delete/{artistID}")
	public void deleteArtistDetails(@PathVariable int artistID) {
	    aService.deleteArtistDetails(artistID);
	}
	
	 public List<ArtistDetails> findAllArtistsByPincode(@RequestParam String pincode) {
	        return aService.findAllArtistsByPincode(pincode);
	    }
	
	
	
	
}
