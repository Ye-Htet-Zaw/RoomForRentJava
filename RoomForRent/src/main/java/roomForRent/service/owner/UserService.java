/**
*UserService
*
* 2021/03/05 CSH Create New
*
* For owner profile
*/
package roomForRent.service.owner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import roomForRent.dto.owner.UserDto;
import roomForRent.mapper.owner.UserMapper;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	private Path fileStorageLocation;
	

	public UserDto getUserInfo(String user_id) {
		// TODO Auto-generated method stub
		return userMapper.getUserInfo(user_id);
	}


	public void updateUserInfo(UserDto userDto) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=null ;
		try {
			 d = sdf.parse(userDto.getDobString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error in date parsing");
		}
		userDto.setUser_dob(d);
		userDto.setUpdate_datetime(new Date());
		 userMapper.updateUserInfo(userDto);
	}
	
	public void storeFile(MultipartFile file,String path,String imagename) {
    	
	   	 this.fileStorageLocation = Paths.get(path)
	   			 .toAbsolutePath()
	                .normalize();
	   	 
	   	 try {
				Files.createDirectories(this.fileStorageLocation);
			} catch (IOException e) {
				e.printStackTrace();
			}
	   	String imName=imagename.toString()+".jpg";
	       // Normalize file name
	       String fileName = StringUtils.cleanPath(imName);

	       try {
	           // Copy file to the target location (Replacing existing file with the same name)
	           Path targetLocation =  this.fileStorageLocation.resolve(fileName);
	           //Files.delete(targetLocation);
	           Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);	           
	       } catch (IOException ex) {
	           
	       }
			//return fileName;
	   }
}
