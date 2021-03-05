package roomForRent.service.renter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.renter.RoomDetailDto;
import roomForRent.mapper.renter.RoomDetailMapper;

@Service
public class RoomDetailService {

	@Autowired
	RoomDetailMapper roomDetailMapper;
	public RoomDetailDto getRoomDetailById(String houseId) {
		return roomDetailMapper.getRoomDetailById(houseId);
	}

}
