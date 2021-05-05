/**
*
* IDCreatorService
*
* 2021/05/05 KMMN Create New
*
* create id
*/
package roomForRent.service.renter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.mapper.renter.IDCreatorMapper;

@Service
public class IDCreatorService {

	@Autowired
	IDCreatorMapper idCreatorMapper;
	
	public String getOneUserID() {
		return idCreatorMapper.getOneUserID();
	}

	public String getOneHouseID() {
		return idCreatorMapper.getOneHouseID();
	}

	public String getOneFavouriteID() {
		return idCreatorMapper.getOneFavouriteID();
	}
	
}
