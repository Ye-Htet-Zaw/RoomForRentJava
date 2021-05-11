/**
*
* IDCreatorController
*
* 2021/05/05 KMMN Create New
*
* create id
*/
package roomForRent.controller.renter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import roomForRent.service.renter.IDCreatorService;

@RestController
public class IDCreatorController {

	@Autowired
	IDCreatorService idCreatorService;
	
	@GetMapping("/getOneID/{idKey}")
	public String getOneID(@PathVariable(value = "idKey")String idKey) {
		String id = "";
		switch (idKey) {
		case "USE":{
			id = idCreatorService.getOneUserID();
			break;
		}
		case "HOU":{
			id = idCreatorService.getOneHouseID();
			break;
		}
		case "FAV":{
			id = idCreatorService.getOneFavouriteID();
			break;
		}
		}
		return id;
		}
	
	@GetMapping("/createId/{idKey}")
	public String createId(@PathVariable(value = "idKey")String idKey) {
		String generatedID ="";
		String id = getOneID(idKey);                
        if (id != null) {   
            int maxId = Integer.parseInt(id.substring(3)) + 1;
            generatedID = idKey + String.format("%07d", maxId);
        }else {
        	generatedID = idKey+"0000001";
        }
		return generatedID; 
	}
	
}
