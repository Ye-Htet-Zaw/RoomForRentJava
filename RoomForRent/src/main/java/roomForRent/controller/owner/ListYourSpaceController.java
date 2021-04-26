package roomForRent.controller.owner;
//NTTT
//nttt
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import roomForRent.dto.renter.HouseListDto;
import roomForRent.service.owner.ListYourSpaceService;

@RestController
public class ListYourSpaceController {

	@Autowired
	ListYourSpaceService listYourSpaceService;
	
	@GetMapping("/listYourSpace/{user_id}")
	public List<HouseListDto> getHouseList(@PathVariable(value = "user_id")String user_id) {	
		List<HouseListDto> houseList = listYourSpaceService.getHouseList(user_id);
		for (int i = 0; i <houseList.size(); i++) {
            String id = houseList.get(i).getHouse_id();
            ArrayList<String> images = new ArrayList<>();
            for(int j = 1; j<=10; j++) {
            	images.add("http://192.168.1.3:9090/image/house/"+id+"/"+j+".jpg");
            }
		
		}
		return houseList;
	}
}
