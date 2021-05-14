/**
*
* PostHouseController
*
* 2021/04/20 HNT Create New
*
* create house
*/
package roomForRent.controller.owner;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import roomForRent.controller.renter.IDCreatorController;
import roomForRent.dto.renter.HouseDto;
import roomForRent.service.owner.PostHouseService;

@RestController
public class PostHouseController {
	
	@Autowired
	PostHouseService postHouseService;
	
	@Autowired
	IDCreatorController idCreatorController;
	
	String houseId;
	
	/**
	 * Create House
	 * @param houseDto
	 * @return house list
	 */
	@PostMapping("/createHouse")
	public List<HouseDto> createHouse(@RequestBody HouseDto houseDto) {
		houseId=idCreatorController.createId(houseDto.getHouse_ID());
		houseDto.setHouse_ID(houseId);
		postHouseService.createHouse(houseDto);
		return postHouseService.getAllHouseListWithOwnerId(houseDto.getUser_ID());
	}
	
	
	/**
	 * add single image to static folder
	 * @param file
	 * @param path
	 * @param imagename
	 */
	@PostMapping("/uploadImages")
    public void uploadFile(@RequestParam("file") MultipartFile file, String path,Integer imagename) {
		
		postHouseService.storeFile(file,path,imagename);

    }
		
	
	/**
	 * 
	 * add multiple to static folder
	 * @param files
	 */
	@PostMapping("/uploadMultipleFiles")
	 public void uploadMultipleFiles(@RequestParam("imageupload") MultipartFile[] files) {
		  String path = "src\\main\\resources\\static\\image\\house\\";
		  File ss = new File(path+houseId);
		  System.out.println(houseId);
		  String filePath = null;
		  Integer imagename=0;
		  if(ss.mkdir()) {
			  filePath="src\\main\\resources\\static\\image\\house\\"+ss.getName();
		  }
	      for (MultipartFile multipartFile : files) {
	    	  imagename+=1;
	    	  uploadFile(multipartFile,filePath,imagename);
	      }
	 }
	

}
