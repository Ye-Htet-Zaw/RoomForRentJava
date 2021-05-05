package roomForRent.service.renter;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.owner.UserDto;
import roomForRent.dto.renter.PhoneDto;
import roomForRent.mapper.renter.PhoneUserMapper;

@Service
public class PhoneUserService {

	@Autowired
	PhoneUserMapper phoneUserMapper;

	public void savePhoneUser(@Valid UserDto userDto) {
		phoneUserMapper.savePhoneUser(userDto);
	}

	public String getMaxUserId() {
		return phoneUserMapper.getMaxUserId();
	}

	public List<PhoneDto> getPhoneUserCount(String phone_one) {
		return phoneUserMapper.getPhoneUserCount(phone_one);
	}
}
