/**
*
* HouseDetailController
*
* 2021/03/05 YHZ Create New
*
* Load HouseDetail Information
*/
package roomForRent.controller.renter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import roomForRent.dto.renter.HouseDetailDto;
import roomForRent.service.renter.HouseDetailService;

@RestController
public class HouseDetailController {

	@Autowired
	HouseDetailService houseDetailService;
	
	private Path fileStorageLocation;
	
	/**
	 * Get House Info
	 * @param houseId
	 * @return HouseDetailDto
	 */
	@GetMapping("/houseDetail/{id}")
	public HouseDetailDto getHouseDetailById(@PathVariable(value = "id") String houseId) {	
		HouseDetailDto houseDetailById = houseDetailService.getHouseDetailById(houseId);	
		List<String> test = new ArrayList<>();
		String path = "src\\main\\resources\\static\\image\\house\\"+houseId;
		for(int j= 1; j<=10; j++) {	
			boolean imageExists = storeFile(path, j);
			if (imageExists == true) {
				test.add("http://192.168.0.107:8080/image/house/"+houseId+"/"+j+".jpg");
			};
		}
		houseDetailById.setHouse_image(test);
		return houseDetailById;
	}
	
	/**
	 * Check Image Exists
	 * @param path
	 * @param imagename
	 * @return Boolean
	 */
	private Boolean storeFile(String path, Integer imagename) {

		this.fileStorageLocation = Paths.get(path).toAbsolutePath().normalize();

		try {
			Files.createDirectories(this.fileStorageLocation);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String imName = imagename.toString() + ".jpg";
		// Normalize file name
		String fileName = StringUtils.cleanPath(imName);

		Path targetLocation = this.fileStorageLocation.resolve(fileName);

		boolean imageExists = Files.isExecutable(targetLocation);

		return imageExists;
	}
}
