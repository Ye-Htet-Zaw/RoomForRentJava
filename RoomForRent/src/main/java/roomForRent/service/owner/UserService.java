package roomForRent.service.owner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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


	public void updateUserInfo(UserDto userDto) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=null ;
		try {
			 d = sdf.parse(userDto.getDobString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error in date parsing");
		}
		userDto.setUser_dob(d);
		userDto.setUpdate_datetime(new Date());
		 userMapper.updateUserInfo(userDto);
	}

}
