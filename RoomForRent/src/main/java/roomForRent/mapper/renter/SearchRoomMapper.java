package roomForRent.mapper.renter;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.renter.HouseDto;

@Mapper
public interface SearchRoomMapper {

	List<HouseDto> getAllRoomList();

	String getCategoryId(String categoryName);

	List<HouseDto> getRoomListByCategory(String categoryId);

	List<HouseDto> getRoomListByTownship(String township);

	List<HouseDto> getRoomListByAmount(Integer rentprice);

	List<HouseDto> getRoomListByPeroid(Integer period);

}
