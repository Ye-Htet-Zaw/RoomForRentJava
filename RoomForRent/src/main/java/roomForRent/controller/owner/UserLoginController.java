package roomForRent.controller.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import roomForRent.dto.owner.LoginDto;
import roomForRent.dto.owner.UserDto;
import roomForRent.service.owner.UserLoginService;


@RestController
public class UserLoginController {

	@Autowired
	UserLoginService  userLoginService;

	@GetMapping("/getUserWithEmailAndPassword/{user_email}&{password}")
	public UserDto getUserWithEmailAndPassword(@PathVariable(value = "user_email") String user_email,
			@PathVariable(value = "password") String password) {
		LoginDto loginDto = new LoginDto();
		loginDto.setUser_email(user_email);
		loginDto.setPassword(password);
		return userLoginService.getUserWithEmailAndPassword(loginDto);
	}
}
