/**
*
* HouseDetailController
*
* 2021/03/05 YHZ Create New
*
* Load HouseDetail Information
*/
package roomForRent.controller.renter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import roomForRent.dto.renter.HouseDetailDto;
import roomForRent.service.renter.HouseDetailService;

@RestController
public class HouseDetailController {

	@Autowired
	HouseDetailService houseDetailService;
	
	@GetMapping("/houseDetail/{id}")
	public HouseDetailDto getHouseDetailById(@PathVariable(value = "id") String houseId) {	
		HouseDetailDto houseDetailById = houseDetailService.getHouseDetailById(houseId);	
		List<String> test = new ArrayList<>();
		for(int j= 1; j<=10; j++) {	
			test.add("http://192.168.100.4:9090/image/house/"+houseId+"/"+j+".jpg");		
		}
		houseDetailById.setHouse_image(test);
		return houseDetailById;
	}
}
