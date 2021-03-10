/**
*ChangePasswordService
*
* 2021/03/10 NTTT Create New
*
* For ChangePassword
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
	public LoginDto getRoomWithId(String user_id) {
		// TODO Auto-generated method stub
		return changePasswordMapper.getRoomWithId(user_id);
	}
	public void updatepassword(LoginDto dto) {
		// TODO Auto-generated method stub
		changePasswordMapper.updatepassword(dto);
	}

}
