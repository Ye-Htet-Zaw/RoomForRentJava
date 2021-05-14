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
	
	/**
	 * Get User With Id
	 * @param user_id
	 * @return UserDto
	 */
	@GetMapping("/getUserInfo/{user_id}")
	public UserDto getUserInfo(@PathVariable(value = "user_id")String user_id) {
		return userService.getUserInfo(user_id);
	}
	
	/**
	 * Update User Info
	 * @param userDto
	 */
	@PutMapping("/updateUserInfo")
	public void updateUserInfo(@RequestBody UserDto userDto) {
		userId = userDto.getUser_id();
		System.out.println(userId);
		userService.updateUserInfo(userDto);	
	}
	
	/**
	 * Update User Image
	 * @param file
	 * @param path
	 * @param imagename
	 */
	@PostMapping("/uploadUserImages")
    public void uploadFile(@RequestParam("file") MultipartFile file, String path,String imagename) {
	
		userService.storeFile(file,path,imagename);
    }
		
	/**
	 * Update User Image
	 * @param files
	 */
	@PostMapping("/uploadUserMultipleFiles")
	 public void uploadMultipleFiles(@RequestParam("imageupload") MultipartFile[] files) {
		  String path = "src\\main\\resources\\static\\image\\user\\";
		  System.out.println(userId);
	      for (MultipartFile multipartFile : files) {
	    	  uploadFile(multipartFile,path,userId);
	      }
	 }
	
	 /**
	 * @param registry
	 */
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	     registry.addResourceHandler("/image/user**")
	     .addResourceLocations("classpath:/static/","classpath:/image/user")
	     .setCachePeriod(0);
	 }
	
}
