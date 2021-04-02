/**
*ChangePasswordController
*
* 2021/03/10 NTTT Create New
*
* For Update Password
*/
package roomForRent.controller.owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import roomForRent.dto.owner.LoginDto;
import roomForRent.service.owner.ChangePasswordService;

@RestController
public class ChangePasswordController {

	@Autowired
	ChangePasswordService changePasswordService;
	
	/**
	 * Retrieve Password from DB
	 * @return userId
	 */
	@GetMapping("/getPassword/{user_id}")
	public String getPassword(@PathVariable(value = "user_id") String user_id) {
		return changePasswordService.getPassword(user_id);
	}
	

	/**
	 * Update Password from DB
	 * @return LoginDto
	 */
	@PutMapping("/updatePassword/{user_id}&{password}")
	public LoginDto updatepassword(@PathVariable(value = "user_id") String user_id,
			@PathVariable(value = "password") String password)
			 {
		LoginDto dto = changePasswordService.getRoomWithId(user_id);
		dto.setPassword(password);
		changePasswordService.updatePassword(dto);
		return dto;
	}
}
