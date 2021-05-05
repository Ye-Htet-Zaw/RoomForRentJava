package roomForRent.mapper.renter;

import java.util.List;

import javax.validation.Valid;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.owner.UserDto;
import roomForRent.dto.renter.PhoneDto;

@Mapper
public interface PhoneUserMapper {

	void savePhoneUser(@Valid UserDto userDto);

	String getMaxUserId();

	List<PhoneDto> getPhoneUserCount(String phone_one);
}
