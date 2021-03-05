package roomForRent.service.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.owner.LoginDto;
import roomForRent.dto.owner.UserDto;
import roomForRent.mapper.owner.UserMapper;

@Service
public class UserService {
	
	
	@Autowired
	UserMapper userMapper;
	
	public UserDto getUserWithEmailAndPassword(LoginDto loginDto) {
		
		return userMapper.getUserWithEmailAndPassword(loginDto);
	}

}
