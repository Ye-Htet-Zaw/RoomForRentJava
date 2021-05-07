/**
 * UserLoginMapper
 *
 * 2021/03/05 NTTT Create New
 *
 * For Login User
 */
package roomForRent.mapper.owner;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.owner.LoginDto;
import roomForRent.dto.renter.HouseDto;


@Mapper
public interface UserLoginMapper {

	/**
	 * Retrieve Email & Password
	 * @return loginDto
	 */
	LoginDto getUserWithEmailAndPassword(LoginDto loginDto);

	void createFbUser(LoginDto loginDto);

	Integer getFacebookId(LoginDto loginDto);

	LoginDto getUserId(String facebook_id);

	List<LoginDto> getUserAll();

}
