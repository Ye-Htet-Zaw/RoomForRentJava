package roomForRent.service.renter;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roomForRent.dto.renter.PhoneDto;
import roomForRent.mapper.renter.PhoneUserMapper;

@Service
public class PhoneUserService {

	@Autowired
	PhoneUserMapper phoneUserMapper;

	public void savePhoneUser(@Valid PhoneDto phoneDto) {
		phoneUserMapper.savePhoneUser(phoneDto);
	}

	public String getMaxUserId() {
		return phoneUserMapper.getMaxUserId();
	}

	public PhoneDto getPhoneUserCount(String phone_one) {
		return phoneUserMapper.getPhoneUserCount(phone_one);
	}
}
