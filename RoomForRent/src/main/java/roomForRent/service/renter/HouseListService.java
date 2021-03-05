package roomForRent.service.renter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.renter.HouseListDto;
import roomForRent.mapper.renter.HouseListMapper;

@Service
public class HouseListService {
	

	@Autowired
	HouseListMapper houseListMapper;
	
	public List<HouseListDto> getHouseList() {
		return houseListMapper.getHouseList();
	}

}
