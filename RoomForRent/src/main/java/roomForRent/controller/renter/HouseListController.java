/**
*
* HouseListController
*
* 2021/03/08 HNT Create New
*
* house list
*/
package roomForRent.controller.renter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import roomForRent.dto.renter.HouseListDto;
import roomForRent.service.renter.HouseListService;


@RestController
public class HouseListController {

	@Autowired
	HouseListService houseListService;

	/**
	 * @return houseList
	 */
	@GetMapping("/houseLists")
	public List<HouseListDto> getHouseList() {	
		List<HouseListDto> houseList = houseListService.getHouseList();
		for (int i = 0; i <houseList.size(); i++) {
            String id = houseList.get(i).getHouse_id();
            //accList.get(i).setImage("http://192.168.100.4:9090/images/"+id+".jpg");
            ArrayList<String> images = new ArrayList<>();
            for(int j = 1; j<=10; j++) {
            	images.add("http://192.168.43.148:9090/images/house/"+id+"/"+j+".jpg");
            }
		
		}
		return houseList;
	}
}
