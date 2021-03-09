package roomForRent.mapper.renter;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.renter.HouseListDto;

/**
*
* HouseListMapper
*
* 2021/03/08 HNT Create New
*
* house list mapper
*/

@Mapper
public interface HouseListMapper {

	List<HouseListDto> getHouseList();

}
