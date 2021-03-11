/**
*
* HouseListMapper
*
* 2021/03/08 HNT Create New
*
* house list mapper
*/
package roomForRent.mapper.renter;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.renter.HouseListDto;


@Mapper
public interface HouseListMapper {

	/**
	 * @return houseList
	 */
	List<HouseListDto> getHouseList();

}
