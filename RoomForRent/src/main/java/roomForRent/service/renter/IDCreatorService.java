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
	
	
	/**
	 * get maximum id of user table 
	 * @return maximum id of user table
	 */
	public String getOneUserID() {
		return idCreatorMapper.getOneUserID();
	}

	/**
	 * get maximum id of house table 
	 * @return maximum id of house table
	 */
	public String getOneHouseID() {
		return idCreatorMapper.getOneHouseID();
	}

	/**
	 * get maximum id of favourite table 
	 * @return maximum id of favourite table
	 */
	public String getOneFavouriteID() {
		return idCreatorMapper.getOneFavouriteID();
	}
	
}
