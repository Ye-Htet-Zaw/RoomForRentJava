/**
*
  FavouriteMapper
*
* 2021/04/20 KMMN Create New
*
* favourite house mapper
*/
package roomForRent.mapper.renter;

import java.util.List;

import javax.validation.Valid;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.renter.FavouriteDto;
import roomForRent.dto.renter.HouseDto;

@Mapper
public interface FavouriteMapper {

	/**
	 * get favourite list with user id
	 * 
	 * @param user_id
	 * @return List<FavouriteDto>
	 */
	List<FavouriteDto> getAllFavouriteListWithUserId(String user_id);

	/**
	 * create favourite info
	 * 
	 * @param favouriteDto
	 * @return List<FavouriteDto>
	 */
	void saveFavouriteInfo(@Valid FavouriteDto favouriteDto);

	/**
	 * delete favourite item with user id and favourite id
	 * 
	 * @param userId
	 * @param favourite_id
	 * @return List<FavouriteDto>
	 */
	void deleteFavouriteWithId(String favourite_id);

	/**
	 * get favourite id with user id
	 * 
	 * @param userId
	 * @param houseId
	 * @return FavouriteDto
	 */
	FavouriteDto getFavouriteId(FavouriteDto dto);

	/**
	 * get all favourite house list
	 * 
	 * @return List<HouseDto>
	 */
	List<HouseDto> getFavouritHouseList();

	/**
	 * delete Favourite With UserAnd HouseId
	 * 
	 * @param user_id
	 * @param house_id
	 * @return List<HouseDto>
	 */
	void deleteFavouriteWithUserAndHouseId(FavouriteDto favouriteDto);

	/**
	 * get favourite house list with user id
	 * 
	 * @param user_id
	 * @return List<HouseDto>
	 */
	List<HouseDto> getFavHouseListWithUserId(String user_id);
}
