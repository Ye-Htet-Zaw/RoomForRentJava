package roomForRent.controller.owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import roomForRent.dto.owner.LoginDto;
import roomForRent.service.owner.ChangePasswordService;

@RestController
public class ChangePasswordController {

	@Autowired
	ChangePasswordService changePasswordService;

	@PutMapping("/updatepassword/{user_id}&{password}")
	public LoginDto updateRoom(@PathVariable(value = "user_id") String user_id,
			@PathVariable(value = "password") String password) {
		LoginDto dto = changePasswordService.getRoomWithId(user_id);
		dto.setPassword(password);
		changePasswordService.updatepassword(dto);
		return dto;
	}
}
