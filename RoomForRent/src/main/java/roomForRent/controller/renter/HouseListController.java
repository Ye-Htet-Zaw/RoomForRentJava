package roomForRent.controller.renter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import roomForRent.dto.renter.HouseListDto;
import roomForRent.service.renter.HouseListService;


/**
*
*  HouseListController
*
* 2021/03/08 HNT Create New
*
* house list
*/

@RestController
public class HouseListController {

	@Autowired
	HouseListService houseListService;

	@GetMapping("/houseLists")
	public List<HouseListDto> getHouseList() {	
		List<HouseListDto> houseList = houseListService.getHouseList();
		return houseList;
		
	}
}
