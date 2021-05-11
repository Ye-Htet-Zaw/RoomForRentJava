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

@Mapper
public interface UserLoginMapper {

	/**
	 * Retrieve Email & Password
	 * @return loginDto
	 */
	LoginDto getUserWithEmailAndPassword(LoginDto loginDto);

	/**
	 * Register FbUser
	 * 
	 * @return FbUser
	 */
	void createFbUser(LoginDto loginDto);

	/**
	 * Retrieve facebookId for Count
	 * 
	 * @return loginDto
	 */
	Integer getFacebookId(LoginDto loginDto);

	/**
	 * Retrieve facebookId facebookId
	 * 
	 * @return facebookId
	 */
	LoginDto getUserId(String facebook_id);

	/**
	 * Retrieve All User
	 * 
	 * @return loginDto
	 */
	List<LoginDto> getUserAll();

}
