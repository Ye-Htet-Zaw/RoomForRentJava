package roomForRent.service.renter;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.renter.FavouriteDto;
import roomForRent.mapper.renter.FavouriteMapper;

@Service
public class FavouriteService {
	@Autowired
	FavouriteMapper favouriteMapper;

	public List<FavouriteDto> getAllFavouriteListWithUserId(String user_id) {
		return favouriteMapper.getAllFavouriteListWithUserId(user_id);
	}

	public void saveFavouriteInfo(@Valid FavouriteDto favouriteDto) {
		favouriteMapper.saveFavouriteInfo(favouriteDto);
	}

	public void deleteFavouriteWithId(String favourite_id) {
		favouriteMapper.deleteFavouriteWithId(favourite_id);
	}

	public FavouriteDto getFavouriteId(FavouriteDto dto) {
		return favouriteMapper.getFavouriteId(dto);
	}

}
