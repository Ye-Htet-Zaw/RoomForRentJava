package roomForRent.service.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.renter.HouseDto;
import roomForRent.mapper.owner.PostHouseMapper;

@Service
public class PostHouseService {
	
	@Autowired
	PostHouseMapper postHouseMapper;

	public void createHouse(HouseDto houseDto) {
		postHouseMapper.createHouse(houseDto);
		
	}

}
