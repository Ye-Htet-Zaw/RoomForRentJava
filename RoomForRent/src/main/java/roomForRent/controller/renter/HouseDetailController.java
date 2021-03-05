package roomForRent.controller.renter;

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
		return houseDetailById;
	}
}
