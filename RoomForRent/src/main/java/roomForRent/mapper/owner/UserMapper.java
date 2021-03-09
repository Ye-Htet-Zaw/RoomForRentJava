package roomForRent.mapper.owner;

import org.apache.ibatis.annotations.Mapper;
import roomForRent.dto.owner.UserDto;
/**
*UserMapper
*
* 2021/03/05 CSH Create New
*
* For owner profile
*/
@Mapper
public interface UserMapper {

	

	UserDto getUserInfo(String user_id);

}
