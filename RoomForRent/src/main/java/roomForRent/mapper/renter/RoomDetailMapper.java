package roomForRent.mapper.renter;

import org.apache.ibatis.annotations.Mapper;
import roomForRent.dto.renter.RoomDetailDto;

@Mapper
public interface RoomDetailMapper {

	RoomDetailDto getRoomDetailById(String houseId);

}
