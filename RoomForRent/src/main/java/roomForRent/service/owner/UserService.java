package roomForRent.service.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roomForRent.dto.owner.UserDto;
import roomForRent.mapper.owner.UserMapper;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	

	public UserDto getUserInfo(String user_id) {
		// TODO Auto-generated method stub
		return userMapper.getUserInfo(user_id);
	}

}
