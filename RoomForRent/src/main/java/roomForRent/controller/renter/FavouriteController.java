/**
*
* FavouriteController
*
* 2021/04/20 KMMN Create New
*
* favourite list
*/
package roomForRent.controller.renter;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import roomForRent.dto.renter.FavouriteDto;
import roomForRent.dto.renter.HouseDto;
import roomForRent.service.renter.FavouriteService;

@RestController
public class FavouriteController {

	@Autowired
	FavouriteService favouriteService;
	
	@Autowired
	IDCreatorController idCreatorController;
	
	@GetMapping("/getAllFavouriteListWithUserId/{USER_ID}")
	private List<FavouriteDto> getAllFavouriteListWithUserId(@PathVariable(value = "USER_ID")String user_id) {
		return favouriteService.getAllFavouriteListWithUserId(user_id);
	}
	
	@GetMapping("/getFavHouseListWithUserId/{USER_ID}")
	private List<HouseDto> getFavHouseListWithUserId(@PathVariable(value = "USER_ID")String user_id) {
		return favouriteService.getFavHouseListWithUserId(user_id);
	}
	
	@PostMapping("/saveFavouriteInfo")
	private List<FavouriteDto> saveFavouriteInfo(@Valid @RequestBody FavouriteDto favouriteDto) {
		favouriteDto.setFavourite_id(idCreatorController.createId(favouriteDto.getFavourite_id()));
		favouriteService.saveFavouriteInfo(favouriteDto);
		return favouriteService.getAllFavouriteListWithUserId(favouriteDto.getUser_id());
	}
	
	@DeleteMapping("/deleteFavouriteWithId/{USER_ID}&{FAVOURITE_ID}")
	public List<FavouriteDto> deleteFavouriteWithId(@PathVariable(value = "USER_ID")String userId,
			@PathVariable(value = "FAVOURITE_ID") String favourite_id) {
		favouriteService.deleteFavouriteWithId(favourite_id);
		return favouriteService.getAllFavouriteListWithUserId(userId);
	}
	
	@GetMapping("/getFavouriteId/{USER_ID}&{HOUSE_ID}")
	private FavouriteDto getFavouriteId(@PathVariable(value = "USER_ID")String userId,
			@PathVariable(value = "HOUSE_ID")String houseId) {
		FavouriteDto dto = new FavouriteDto();
		dto.setUser_id(userId);
		dto.setHouse_id(houseId);
		return favouriteService.getFavouriteId(dto);
	}
	
	@GetMapping("/getFavouritHouseList")
	private List<HouseDto> getFavouritHouseList() {
		return favouriteService.getFavouritHouseList();
	}
	
	@DeleteMapping("/deleteFavouriteWithUserAndHouseId/{USER_ID}&{HOUSE_ID}")
	public List<HouseDto> deleteFavouriteWithUserAndHouseId(@PathVariable(value = "USER_ID")String user_id,
			@PathVariable(value = "HOUSE_ID") String house_id) {
		FavouriteDto favouriteDto =new FavouriteDto();
		favouriteDto.setUser_id(user_id);
		favouriteDto.setHouse_id(house_id);
		favouriteService.deleteFavouriteWithUserAndHouseId(favouriteDto);
		return favouriteService.getFavouritHouseList();
	}
}
