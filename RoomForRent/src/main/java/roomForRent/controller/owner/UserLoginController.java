/**
*UserLoginController
*
* 2021/03/08 NTTT Create New
*
* For Login User
*/
package roomForRent.controller.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import roomForRent.dto.owner.LoginDto;
import roomForRent.service.owner.UserLoginService;

@RestController
public class UserLoginController {

	@Autowired
	UserLoginService  userLoginService;
	
	/**
	 * Retrieve Email & Password
	 * @return loginDto
	 */
	@GetMapping("/getUserWithEmailAndPassword/{user_email}&{password}")
	public LoginDto getUserWithEmailAndPassword(@PathVariable(value = "user_email") String user_email,
			@PathVariable(value = "password") String password) {
		LoginDto loginDto = new LoginDto();
		loginDto.setUser_email(user_email);
		loginDto.setPassword(password);
		return userLoginService.getUserWithEmailAndPassword(loginDto);
	}
	
	
}
