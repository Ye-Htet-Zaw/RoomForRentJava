package roomForRent.controller.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import roomForRent.dto.owner.UserDto;
import roomForRent.service.owner.UserService;


/**
*UserController
*
* 2021/03/05 CSH Create New
*
* For Owner Profile
*/
@RestController
public class UserController {

	@Autowired
	UserService userService;

	
	
	@GetMapping("/getUserInfo/{user_id}")
	public UserDto getUserInfo(@PathVariable(value = "user_id")String user_id) {
		return userService.getUserInfo(user_id);
		
	}
	
	@PutMapping("/updateUserInfo")
	public void updateUserInfo(@RequestBody UserDto userDto) {
		 userService.updateUserInfo(userDto);
		
	}
	
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	     registry.addResourceHandler("/image/user**")
	     .addResourceLocations("classpath:/static/","classpath:/image/user")
	     .setCachePeriod(0);
	 }
	
}
