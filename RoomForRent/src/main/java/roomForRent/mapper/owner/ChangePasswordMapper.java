/**
*ChangePasswordMapper
*
* 2021/03/10 NTTT Create New
*
* For Update Password
*/
package roomForRent.mapper.owner;

import org.apache.ibatis.annotations.Mapper;
import roomForRent.dto.owner.LoginDto;
@Mapper
public interface ChangePasswordMapper {

	/**
	 * Retrieve userId
	 * @return userId
	 */
	LoginDto getRoomWithId(String user_id);

	/**
	 * Update Password from DB
	 * @return LoginDto
	 */
	void updatePassword(LoginDto dto);

	/**
	 * Retrieve Password from DB
	 * @return userId
	 */
	String getPassword(String user_id);

}
