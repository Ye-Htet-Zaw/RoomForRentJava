package roomForRent.mapper.owner;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.renter.HouseDto;

@Mapper
public interface PostHouseMapper {

	void createHouse(HouseDto houseDto);
	

	List<HouseDto> getAllHouseListWithOwnerId(String user_ID);

}
