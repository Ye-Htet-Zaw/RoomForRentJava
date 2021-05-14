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

	/**
	 * get favourite list with user id
	 * 
	 * @param user_id
	 * @return List<FavouriteDto>
	 */
	@GetMapping("/getAllFavouriteListWithUserId/{USER_ID}")
	private List<FavouriteDto> getAllFavouriteListWithUserId(@PathVariable(value = "USER_ID") String user_id) {
		return favouriteService.getAllFavouriteListWithUserId(user_id);
	}

	/**
	 * get favourite house list with user id
	 * 
	 * @param user_id
	 * @return List<HouseDto>
	 */
	@GetMapping("/getFavHouseListWithUserId/{USER_ID}")
	private List<HouseDto> getFavHouseListWithUserId(@PathVariable(value = "USER_ID") String user_id) {
		return favouriteService.getFavHouseListWithUserId(user_id);
	}

	/**
	 * create favourite info
	 * 
	 * @param favouriteDto
	 * @return List<FavouriteDto>
	 */
	@PostMapping("/saveFavouriteInfo")
	private List<FavouriteDto> saveFavouriteInfo(@Valid @RequestBody FavouriteDto favouriteDto) {
		favouriteDto.setFavourite_id(idCreatorController.createId(favouriteDto.getFavourite_id()));
		favouriteService.saveFavouriteInfo(favouriteDto);
		return favouriteService.getAllFavouriteListWithUserId(favouriteDto.getUser_id());
	}

	/**
	 * delete favourite item with user id and favourite id
	 * 
	 * @param userId
	 * @param favourite_id
	 * @return List<FavouriteDto>
	 */
	@DeleteMapping("/deleteFavouriteWithId/{USER_ID}&{FAVOURITE_ID}")
	public List<FavouriteDto> deleteFavouriteWithId(@PathVariable(value = "USER_ID") String userId,
			@PathVariable(value = "FAVOURITE_ID") String favourite_id) {
		favouriteService.deleteFavouriteWithId(favourite_id);
		return favouriteService.getAllFavouriteListWithUserId(userId);
	}

	/**
	 * get favourite id with user id
	 * 
	 * @param userId
	 * @param houseId
	 * @return FavouriteDto
	 */
	@GetMapping("/getFavouriteId/{USER_ID}&{HOUSE_ID}")
	private FavouriteDto getFavouriteId(@PathVariable(value = "USER_ID") String userId,
			@PathVariable(value = "HOUSE_ID") String houseId) {
		FavouriteDto dto = new FavouriteDto();
		dto.setUser_id(userId);
		dto.setHouse_id(houseId);
		return favouriteService.getFavouriteId(dto);
	}

	/**
	 * get all favourite house list
	 * 
	 * @return List<HouseDto>
	 */
	@GetMapping("/getFavouritHouseList")
	private List<HouseDto> getFavouritHouseList() {
		return favouriteService.getFavouritHouseList();
	}

	/**
	 * delete Favourite With UserAnd HouseId
	 * 
	 * @param user_id
	 * @param house_id
	 * @return List<HouseDto>
	 */
	@DeleteMapping("/deleteFavouriteWithUserAndHouseId/{USER_ID}&{HOUSE_ID}")
	public List<HouseDto> deleteFavouriteWithUserAndHouseId(@PathVariable(value = "USER_ID") String user_id,
			@PathVariable(value = "HOUSE_ID") String house_id) {
		FavouriteDto favouriteDto = new FavouriteDto();
		favouriteDto.setUser_id(user_id);
		favouriteDto.setHouse_id(house_id);
		favouriteService.deleteFavouriteWithUserAndHouseId(favouriteDto);
		return favouriteService.getFavHouseListWithUserId(user_id);
	}
}
