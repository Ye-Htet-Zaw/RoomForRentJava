package roomForRent.mapper.owner;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.owner.LoginDto;
import roomForRent.dto.owner.UserDto;

@Mapper
public interface UserLoginMapper {

	UserDto getUserWithEmailAndPassword(LoginDto loginDto);

}
