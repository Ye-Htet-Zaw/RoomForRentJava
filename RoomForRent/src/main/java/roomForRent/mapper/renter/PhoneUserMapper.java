package roomForRent.mapper.renter;

import javax.validation.Valid;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.owner.UserDto;

@Mapper
public interface PhoneUserMapper {

	void savePhoneUser(@Valid UserDto userDto);
}
