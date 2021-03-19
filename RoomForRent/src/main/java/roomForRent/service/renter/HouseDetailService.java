/**
*
* HouseDetailService
*
* 2021/03/05 YHZ Create New
*
* Load HouseDetail Information
*/
package roomForRent.service.renter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roomForRent.dto.renter.HouseDetailDto;
import roomForRent.mapper.renter.HouseDetailMapper;

@Service
public class HouseDetailService {

	@Autowired
	HouseDetailMapper roomDetailMapper;
	public HouseDetailDto getHouseDetailById(String houseId) {
		return roomDetailMapper.getHouseDetailById(houseId);
	}

}
