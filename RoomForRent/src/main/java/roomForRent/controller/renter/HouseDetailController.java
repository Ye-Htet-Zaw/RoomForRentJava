package roomForRent.controller.renter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import roomForRent.dto.renter.RoomDetailDto;
import roomForRent.service.renter.RoomDetailService;

@RestController
public class RoomDetailController {

	@Autowired
	RoomDetailService roomDetailService;
	
	@GetMapping("/roomDetail/{id}")
	public RoomDetailDto getRoomDetailById(@PathVariable(value = "id") String houseId) {	
		RoomDetailDto roomDetailById = roomDetailService.getRoomDetailById(houseId);	
		return roomDetailById;
	}
}
