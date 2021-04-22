package roomForRent.controller.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}
