package roomForRent.mapper.owner;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.renter.HouseDto;

@Mapper
public interface PostHouseMapper {

	void createHouse(HouseDto houseDto);

}
