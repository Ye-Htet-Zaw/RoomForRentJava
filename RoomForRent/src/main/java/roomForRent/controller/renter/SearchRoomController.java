package roomForRent.controller.renter;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import roomForRent.dto.renter.HouseDto;
import roomForRent.service.renter.SearchRoomService;

@RestController
public class SearchRoomController {

	@Autowired
	SearchRoomService searchRoomService;

	//get all list
	@GetMapping("/getAllRoomList")
	public List<HouseDto> getAllRoomList() {
		System.out.println(searchRoomService.getAllRoomList().size());
		return searchRoomService.getAllRoomList();
	}

	//Search by category Name
	@GetMapping("/getRoomListByCategory/{CATEGORY_NAME}")
	public List<HouseDto> getRoomListByCategory(@PathVariable(value = "CATEGORY_NAME") String categoryName) {
		String categoryId = searchRoomService.getCategoryId(categoryName);
		return searchRoomService.getRoomListByCategory(categoryId);
	}

	//Search by township
	@GetMapping("/getRoomListByTownship/{TOWNSHIP}")
	public List<HouseDto> getRoomListByTownship(@PathVariable(value = "TOWNSHIP") String township) {
		return searchRoomService.getRoomListByTownship(township);
	}
	
	//Search by Amount 
	@GetMapping("/getRoomListByAmount/{RENT}")
	public List<HouseDto> getRoomListByAmount(@PathVariable(value = "RENT")Integer rentprice) {
		return searchRoomService.getRoomListByAmount(rentprice);
	}
	
	//Search by Peroid
	@GetMapping("/getRoomListByPeroid/{PERIOD}")
	private List<HouseDto> getRoomListByPeroid(@PathVariable(value = "PERIOD")Integer period) {
		return searchRoomService.getRoomListByPeroid(period);
	}
}
