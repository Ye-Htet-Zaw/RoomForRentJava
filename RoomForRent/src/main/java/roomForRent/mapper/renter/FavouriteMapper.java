package roomForRent.mapper.renter;

import java.util.List;

import javax.validation.Valid;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.renter.FavouriteDto;
import roomForRent.dto.renter.HouseDto;

@Mapper
public interface FavouriteMapper {

	List<FavouriteDto> getAllFavouriteListWithUserId(String user_id);

	void saveFavouriteInfo(@Valid FavouriteDto favouriteDto);

	void deleteFavouriteWithId(String favourite_id);

	FavouriteDto getFavouriteId(FavouriteDto dto);
	
	List<HouseDto> getFavouritHouseList();	
}
