/**
*UserController
*
* 2021/03/05 CSH Create New
*
* For Owner Profile
*/
package roomForRent.controller.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import roomForRent.dto.owner.UserDto;
import roomForRent.service.owner.PostHouseService;
import roomForRent.service.owner.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	PostHouseService postHouseService;
	
	String userId;
	
	@GetMapping("/getUserInfo/{user_id}")
	public UserDto getUserInfo(@PathVariable(value = "user_id")String user_id) {
		return userService.getUserInfo(user_id);
		
	}
	
	@PutMapping("/updateUserInfo")
	public void updateUserInfo(@RequestBody UserDto userDto) {
		userId = userDto.getUser_id();
		System.out.println(userId);
		userService.updateUserInfo(userDto);
		
	}
	
	@PostMapping("/uploadUserImages")
    public void uploadFile(@RequestParam("file") MultipartFile file, String path,String imagename) {
	
		userService.storeFile(file,path,imagename);
    }
		
	@PostMapping("/uploadUserMultipleFiles")
	 public void uploadMultipleFiles(@RequestParam("imageupload") MultipartFile[] files) {
		  String path = "src\\main\\resources\\static\\image\\user\\";
		  System.out.println(userId);
	      for (MultipartFile multipartFile : files) {
	    	  uploadFile(multipartFile,path,userId);
	      }
	 }
	
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	     registry.addResourceHandler("/image/user**")
	     .addResourceLocations("classpath:/static/","classpath:/image/user")
	     .setCachePeriod(0);
	 }
	
}
