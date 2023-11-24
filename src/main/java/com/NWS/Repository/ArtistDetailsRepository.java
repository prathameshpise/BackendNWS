package com.NWS.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.NWS.Entity.ArtistDetails;

@Repository
public interface ArtistDetailsRepository extends JpaRepository<ArtistDetails, Integer> {

	Optional<ArtistDetails> findByArtistName(String artistName);

//    @Modifying
//    @Query("UPDATE ArtistDetails a SET a.artistName = :artistName WHERE a.artistID = :artistID")
//    void updateArtistName(@Param("artistID") int artistID, @Param("artistName") String artistName);

	Optional<ArtistDetails> deleteByArtistID(int artistID);
//	@Modifying
//    @Query("DELETE FROM ArtistDetails a WHERE a.artistID = :artistID")
//    void deleteArtist(@Param("artistID") int artistID);

	Optional<ArtistDetails> findByArtistID(int artistID);
	 
//	ArtistDetails save(ArtistDetails artistDetails);
//
//	List<ArtistDetails> saveAll(List<ArtistDetails> artistDetailss);
	
	List<ArtistDetails> findByPincode(String pincode);

}
