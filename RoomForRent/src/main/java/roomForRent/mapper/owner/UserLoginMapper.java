package roomForRent.mapper.owner;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.owner.LoginDto;

/**
 * UserLoginMapper
 *
 * 2021/03/05 NTTT Create New
 *
 * For Login User
 */
@Mapper
public interface UserLoginMapper {

	LoginDto getUserWithEmailAndPassword(LoginDto loginDto);

}
