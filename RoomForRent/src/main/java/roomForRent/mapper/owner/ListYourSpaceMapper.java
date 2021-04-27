package roomForRent.mapper.owner;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.renter.HouseDto;
import roomForRent.dto.renter.HouseListDto;

@Mapper
public interface ListYourSpaceMapper {

	List<HouseDto> getHouseList(String user_id);

	

}
