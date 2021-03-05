package roomForRent.mapper.renter;

import org.apache.ibatis.annotations.Mapper;
import roomForRent.dto.renter.HouseDetailDto;

@Mapper
public interface HouseDetailMapper {

	HouseDetailDto getHouseDetailById(String houseId);

}
