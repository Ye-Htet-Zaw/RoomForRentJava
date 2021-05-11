/**
*
* PostHouseService
*
* 2021/04/20 HNT Create New
*
* create house  service
*/
package roomForRent.service.owner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import roomForRent.dto.renter.HouseDto;
import roomForRent.mapper.owner.PostHouseMapper;

@Service
public class PostHouseService {
	
	@Autowired
	PostHouseMapper postHouseMapper;

	private Path fileStorageLocation;
	
	public void createHouse(HouseDto houseDto) {
		postHouseMapper.createHouse(houseDto);
		
	}
	

	public void storeFile(MultipartFile file,String path,Integer imagename) {
    	
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
           Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

       } catch (IOException ex) {
           
       }
		//return fileName;
   }

   public Resource loadFileAsResource(String fileName) {
       try {
           Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
           Resource resource = new UrlResource(filePath.toUri());
           if(resource.exists()) {
               return resource;
           } else {
               
           }
       } catch (MalformedURLException ex) {
           
       }
		return null;
   }

   

	public List<HouseDto> getAllHouseListWithOwnerId(String user_ID) {
		// TODO Auto-generated method stub
		return postHouseMapper.getAllHouseListWithOwnerId(user_ID);
	}
	
	

}
