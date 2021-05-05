package roomForRent.controller.owner;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import roomForRent.dto.renter.HouseDto;
import roomForRent.service.owner.PostHouseService;

@RestController
public class PostHouseController {
	
	@Autowired
	PostHouseService postHouseService;
	
	@PostMapping("/createHouse")
	public void createHouse(@RequestBody HouseDto houseDto) {
		postHouseService.createHouse(houseDto);
	}
	
	@PostMapping("/uploadImages")
    public void uploadFile(@RequestParam("file") MultipartFile file, String path) {
		postHouseService.storeFile(file,path);

    }
	
	@PostMapping("/uploadMultipleFiles")
	   public void uploadMultipleFiles(@RequestParam("imageupload") MultipartFile[] files) {
		  String path = "src\\main\\resources\\static\\image\\house\\";
		  File ss = new File(path+"house");
		  String filePath = null;
		  if(ss.mkdir()) {
			  filePath="src\\main\\resources\\static\\image\\house\\"+ss.getName();
		  }
	         for (MultipartFile multipartFile : files) {
				uploadFile(multipartFile,filePath);
			}
	 }

}
