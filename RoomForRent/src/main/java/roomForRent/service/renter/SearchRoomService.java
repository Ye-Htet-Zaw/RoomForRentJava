package roomForRent.service.renter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.renter.HouseDto;
import roomForRent.mapper.renter.SearchRoomMapper;

@Service
public class SearchRoomService {

	@Autowired
	SearchRoomMapper searchRoomMapper;

	public List<HouseDto> getAllRoomList() {
		return searchRoomMapper.getAllRoomList();
	}

	public String getCategoryId(String categoryName) {
		return searchRoomMapper.getCategoryId(categoryName);
	}

	public List<HouseDto> getRoomListByCategory(String categoryId) {
		return searchRoomMapper.getRoomListByCategory(categoryId);
	}

	public List<HouseDto> getRoomListByTownship(String township) {
		return searchRoomMapper.getRoomListByTownship(township);
	}

	public List<HouseDto> getRoomListByAmount(Integer rentprice) {
		return searchRoomMapper.getRoomListByAmount(rentprice);
	}

	public List<HouseDto> getRoomListByPeroid(Integer period) {
		return searchRoomMapper.getRoomListByPeroid(period);
	}

}
