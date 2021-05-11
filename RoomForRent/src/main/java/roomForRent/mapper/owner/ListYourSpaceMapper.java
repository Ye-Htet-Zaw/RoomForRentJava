/**
*ListYourSpaceMapper
*
* 2021/04/22 NTTT Create New
*
* For show HouseList For Owner
*/
package roomForRent.mapper.owner;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import roomForRent.dto.renter.HouseDto;

@Mapper
public interface ListYourSpaceMapper {

	/**
	 * Retrieve All House List
	 * 
	 * @return HouseDto
	 */
	List<HouseDto> getHouseList(String user_id);

}
