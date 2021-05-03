package roomForRent.controller.renter;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import roomForRent.dto.owner.UserDto;
import roomForRent.service.renter.PhoneUserService;

@RestController
public class PhoneUserController {

	@Autowired
	PhoneUserService phoneUserService;

	@PostMapping("/savePhoneUser")
	private void saveFavouriteInfo(@Valid @RequestBody UserDto userDto) {
		phoneUserService.savePhoneUser(userDto);
	}
}
