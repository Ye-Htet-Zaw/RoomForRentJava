package roomForRent.service.renter;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.owner.UserDto;
import roomForRent.mapper.renter.PhoneUserMapper;

@Service
public class PhoneUserService {

	@Autowired
	PhoneUserMapper phoneUserMapper;

	public void savePhoneUser(@Valid UserDto userDto) {
		phoneUserMapper.savePhoneUser(userDto);
	}

}
