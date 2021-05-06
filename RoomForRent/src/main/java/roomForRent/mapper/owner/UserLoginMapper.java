/**
 * UserLoginMapper
 *
 * 2021/03/05 NTTT Create New
 *
 * For Login User
 */
package roomForRent.mapper.owner;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.owner.LoginDto;


@Mapper
public interface UserLoginMapper {

	/**
	 * Retrieve Email & Password
	 * @return loginDto
	 */
	LoginDto getUserWithEmailAndPassword(LoginDto loginDto);

	void createFbUser(LoginDto loginDto);

	Integer getFacebookId(LoginDto loginDto);

	LoginDto getUserId(String user_id);

}
