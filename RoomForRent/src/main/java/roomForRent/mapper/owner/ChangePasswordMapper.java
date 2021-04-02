/**
*ChangePasswordMapper
*
* 2021/03/10 NTTT Create New
*
* For ChangePassword
*/
package roomForRent.mapper.owner;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.owner.LoginDto;
@Mapper
public interface ChangePasswordMapper {

	LoginDto getRoomWithId(String user_id);

	void updatePassword(LoginDto dto);

	String getPassword(String user_id);

}
