package roomForRent.service.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roomForRent.dto.owner.UserDto;
import roomForRent.mapper.owner.UserMapper;
/**
*UserService
*
* 2021/03/05 CSH Create New
*
* For owner profile
*/
@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	

	public UserDto getUserInfo(String user_id) {
		// TODO Auto-generated method stub
		return userMapper.getUserInfo(user_id);
	}

}
