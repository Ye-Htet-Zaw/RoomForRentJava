package roomForRent.mapper.owner;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.owner.LoginDto;
import roomForRent.dto.owner.UserDto;
/**
*UserLoginMapper
*
* 2021/03/05 NTTT Create New
*
* For Login User
*/
@Mapper
public interface UserLoginMapper {

	UserDto getUserWithEmailAndPassword(LoginDto loginDto);

}
