package roomForRent.mapper.owner;

import org.apache.ibatis.annotations.Mapper;
import roomForRent.dto.owner.UserDto;

@Mapper
public interface UserMapper {

	

	UserDto getUserInfo(String user_id);

}
