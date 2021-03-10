package roomForRent.mapper.owner;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.owner.LoginDto;
@Mapper
public interface ChangePasswordMapper {

	LoginDto getRoomWithId(String user_id);

	void updatepassword(LoginDto dto);

}
