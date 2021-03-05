package roomForRent.mapper.renter;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.renter.HouseListDto;

@Mapper
public interface HouseListMapper {

	List<HouseListDto> getHouseList();

}
