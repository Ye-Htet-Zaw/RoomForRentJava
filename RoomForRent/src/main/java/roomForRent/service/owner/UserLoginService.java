/**
*UserLoginService
*
* 2021/03/08 NTTT Create New
*
* For Login User
*/
package roomForRent.service.owner;

import java.util.List;
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
	 * 
	 * @return loginDto
	 */
	public LoginDto getUserWithEmailAndPassword(LoginDto loginDto) {
		
		return userLoginMapper.getUserWithEmailAndPassword(loginDto);
	}

	/**
	 * Register FbUser
	 * 
	 * @return FbUser
	 */
	public void createFbUser(LoginDto loginDto) {
		
		userLoginMapper.createFbUser(loginDto);

	}

	/**
	 * Retrieve facebookId for Count
	 * 
	 * @return loginDto
	 */
	public Integer getFacebookId(LoginDto loginDto) {

		return userLoginMapper.getFacebookId(loginDto);
	}

	/**
	 * Retrieve facebookId facebookId
	 * 
	 * @return facebookId
	 */
	public LoginDto getUserId(String facebook_id) {
		
		return userLoginMapper.getUserId(facebook_id);
	}

	/**
	 * Retrieve All User
	 * 
	 * @return loginDto
	 */
	public List<LoginDto> getUserAll() {
		
		return userLoginMapper.getUserAll();
	}

}
