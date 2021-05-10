/**
*ListYourSpaceService
*
* 2021/04/22 NTTT Create New
*
* For show HouseList For Owner
*/
package roomForRent.service.owner;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roomForRent.dto.renter.HouseDto;
import roomForRent.mapper.owner.ListYourSpaceMapper;

@Service
public class ListYourSpaceService {

	@Autowired
	ListYourSpaceMapper listYourSpaceMapper;

	/**
	 * Retrieve All House List
	 * 
	 * @return HouseDto
	 */
	public List<HouseDto> getHouseList(String user_id) {
		
		return listYourSpaceMapper.getHouseList(user_id);
	}
	

}
