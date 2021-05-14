/**
*
* PhoneUserController
*
* 2021/04/28 YHZ Create New
*
* Get, Insert User With Phone
*/
package roomForRent.controller.renter;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import roomForRent.dto.renter.PhoneDto;
import roomForRent.service.renter.PhoneUserService;

@RestController
public class PhoneUserController {

	@Autowired
	PhoneUserService phoneUserService;

	/**
	 * Insert User With Phone
	 * @param phoneDto
	 * @return PhoneDto
	 */
	@PostMapping("/savePhoneUser")
	private PhoneDto saveFavouriteInfo(@Valid @RequestBody PhoneDto phoneDto) {
		String userId = phoneUserService.getMaxUserId();                 // get user id(max) from db
        if (userId != null) {
            String subStrUser = userId.substring(0, 3);
            int oldUserId = Integer.parseInt(userId.substring(3));     	// convert user id string to integer
            int newUserId = oldUserId + 1;                         		// product user id(plus 1)
            String userIdDigit = String.format("%07d", newUserId);   	// convert user id integer to string
            String finalUserId = subStrUser + userIdDigit;
            phoneDto.setUser_id(finalUserId);
        } else {
        	phoneDto.setUser_id("USE0000001");
        }
        
        phoneUserService.savePhoneUser(phoneDto);
        return phoneUserService.getPhoneUserCount(phoneDto.getPhone_one());	
	}
	
	/**
	 * Get User With Phone No
	 * @param phone_one
	 * @return PhoneDto
	 */
	@GetMapping("/getPhoneUserCount/{PHONE_ONE}")
	public PhoneDto getPhoneUserCount(@PathVariable(value = "PHONE_ONE")String phone_one) {
		return phoneUserService.getPhoneUserCount(phone_one);	
	}
}
