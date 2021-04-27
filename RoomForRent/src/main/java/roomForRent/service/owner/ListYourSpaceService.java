package roomForRent.service.owner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.renter.HouseDto;
import roomForRent.dto.renter.HouseListDto;
import roomForRent.mapper.owner.ListYourSpaceMapper;

@Service
public class ListYourSpaceService {

	@Autowired
	ListYourSpaceMapper listYourSpaceMapper;

	public List<HouseDto> getHouseList(String user_id) {
		// TODO Auto-generated method stub
		return listYourSpaceMapper.getHouseList(user_id);
	}
	

}
