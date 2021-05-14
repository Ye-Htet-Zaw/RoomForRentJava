/**
*
  FavouriteService
*
* 2021/04/20 KMMN Create New
*
* favourite house  service
*/
package roomForRent.service.renter;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.renter.FavouriteDto;
import roomForRent.dto.renter.HouseDto;
import roomForRent.mapper.renter.FavouriteMapper;

@Service
public class FavouriteService {
	@Autowired
	FavouriteMapper favouriteMapper;

	/**
	 * get favourite list with user id
	 * 
	 * @param user_id
	 * @return List<FavouriteDto>
	 */
	public List<FavouriteDto> getAllFavouriteListWithUserId(String user_id) {
		return favouriteMapper.getAllFavouriteListWithUserId(user_id);
	}

	/**
	 * create favourite info
	 * 
	 * @param favouriteDto
	 * @return List<FavouriteDto>
	 */
	public void saveFavouriteInfo(@Valid FavouriteDto favouriteDto) {
		favouriteMapper.saveFavouriteInfo(favouriteDto);
	}

	/**
	 * delete favourite item with user id and favourite id
	 * 
	 * @param userId
	 * @param favourite_id
	 * @return List<FavouriteDto>
	 */
	public void deleteFavouriteWithId(String favourite_id) {
		favouriteMapper.deleteFavouriteWithId(favourite_id);
	}

	/**
	 * get favourite id with user id
	 * 
	 * @param userId
	 * @param houseId
	 * @return FavouriteDto
	 */
	public FavouriteDto getFavouriteId(FavouriteDto dto) {
		return favouriteMapper.getFavouriteId(dto);
	}

	/**
	 * get all favourite house list
	 * 
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getFavouritHouseList() {
		return favouriteMapper.getFavouritHouseList();
	}

	/**
	 * delete Favourite With UserAnd HouseId
	 * 
	 * @param user_id
	 * @param house_id
	 * @return List<HouseDto>
	 */
	public void deleteFavouriteWithUserAndHouseId(FavouriteDto favouriteDto) {
		favouriteMapper.deleteFavouriteWithUserAndHouseId(favouriteDto);
	}

	/**
	 * get favourite house list with user id
	 * 
	 * @param user_id
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getFavHouseListWithUserId(String user_id) {
		return favouriteMapper.getFavHouseListWithUserId(user_id);
	}
}
