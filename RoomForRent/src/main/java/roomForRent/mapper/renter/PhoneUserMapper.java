/**
*
* PhoneUserMapper
*
* 2021/04/28 YHZ Create New
*
* Get, Insert User With Phone
*/
package roomForRent.mapper.renter;

import javax.validation.Valid;
import org.apache.ibatis.annotations.Mapper;
import roomForRent.dto.renter.PhoneDto;

@Mapper
public interface PhoneUserMapper {

	void savePhoneUser(@Valid PhoneDto phoneDto);

	String getMaxUserId();

	PhoneDto getPhoneUserCount(String phone_one);
}
