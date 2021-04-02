/**
*UserLoginService
*
* 2021/03/08 NTTT Create New
*
* For Login User
*/
package roomForRent.service.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.owner.LoginDto;
import roomForRent.mapper.owner.UserLoginMapper;

@Service
public class UserLoginService {
	
	@Autowired
	UserLoginMapper userLoginMapper;

	/**
	 * Retrieve Email & Password
	 * @return loginDto
	 */
	public LoginDto getUserWithEmailAndPassword(LoginDto loginDto) {
		// TODO Auto-generated method stub
		return userLoginMapper.getUserWithEmailAndPassword(loginDto);
	}

}
