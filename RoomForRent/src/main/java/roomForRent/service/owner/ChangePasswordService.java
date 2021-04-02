/**
*ChangePasswordService
*
* 2021/03/10 NTTT Create New
*
* For Update Password
*/
package roomForRent.service.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.owner.LoginDto;
import roomForRent.mapper.owner.ChangePasswordMapper;

@Service
public class ChangePasswordService {

	@Autowired
	ChangePasswordMapper changePasswordMapper;
	
	/**
	 * Retrieve userId
	 * @return userId
	 */
	public LoginDto getRoomWithId(String user_id) {
		// TODO Auto-generated method stub
		return changePasswordMapper.getRoomWithId(user_id);
	}
	
	/**
	 * Update Password from DB
	 * @return LoginDto
	 */
	public void updatePassword(LoginDto dto) {
		// TODO Auto-generated method stub
		changePasswordMapper.updatePassword(dto);
	}
	
	/**
	 * Retrieve Password from DB
	 * @return userId
	 */
	public String getPassword(String user_id) {
		// TODO Auto-generated method stub
		return changePasswordMapper.getPassword(user_id);
	}

}
