package roomForRent.service.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.owner.LoginDto;
import roomForRent.dto.owner.UserDto;
import roomForRent.mapper.owner.UserLoginMapper;
/**
*UserLoginService
*
* 2021/03/08 NTTT Create New
*
* For Login User
*/
@Service
public class UserLoginService {
	
	@Autowired
	UserLoginMapper userLoginMapper;

	public UserDto getUserWithEmailAndPassword(LoginDto loginDto) {
		
		return userLoginMapper.getUserWithEmailAndPassword(loginDto);
	}

}
