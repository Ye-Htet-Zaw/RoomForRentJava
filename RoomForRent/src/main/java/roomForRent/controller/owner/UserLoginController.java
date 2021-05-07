/**
*UserLoginController
*
* 2021/03/08 NTTT Create New
*
* For Login User
*/
package roomForRent.controller.owner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import roomForRent.controller.renter.IDCreatorController;
import roomForRent.dto.owner.LoginDto;
import roomForRent.dto.owner.UserDto;
import roomForRent.dto.renter.HouseDto;
import roomForRent.service.owner.UserLoginService;

@RestController
public class UserLoginController {

	@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	IDCreatorController idCreatorController;
	
	String user_id;
	
	@GetMapping("/getUserAll")
	public List<LoginDto> getUserAll() {
		
		return userLoginService.getUserAll();
	}

	/**
	 * Retrieve Email & Password
	 * 
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

	@PostMapping("/createFacebookAccount")
	public List<LoginDto> createFbUser(@RequestBody LoginDto loginDto) {
		user_id=idCreatorController.createId(loginDto.getUser_id());
		loginDto.setUser_id(user_id);
		userLoginService.createFbUser(loginDto);
		return userLoginService.getUserAll();
	}

	
	
	@GetMapping("/getFacebookId/{facebook_id}")
	public Integer getFacebookId(@PathVariable(value = "facebook_id") String facebook_id) {
		LoginDto loginDto = new LoginDto();
		loginDto.setFacebook_id(facebook_id);
		return userLoginService.getFacebookId(loginDto);
	}

	@GetMapping("/getUserId/{facebook_id}")
	public LoginDto getUserId(@PathVariable(value = "facebook_id") String facebook_id) {
		return userLoginService.getUserId(facebook_id);

	}
	
	

}
