package roomForRent.mapper.renter;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.renter.HouseDto;
import roomForRent.dto.renter.SearchParameterDto;

@Mapper
public interface SearchRoomMapper {

	List<HouseDto> getAllRoomList();

	String getCategoryId(String categoryName);

	List<HouseDto> getRoomListByCategory(String categoryId);

	List<HouseDto> getRoomListByTownship(String township);

	List<HouseDto> getRoomListByAmount(Integer rentprice);

	List<HouseDto> getRoomListByPeroid(Integer period);
	
	List<HouseDto> getRoomListByCategoryAndTownShip(SearchParameterDto paramDto);

	List<HouseDto> getRoomListByCategoryAndAmount(SearchParameterDto paramDto);

	List<HouseDto> getRoomListByCategoryAndPeriod(SearchParameterDto paramDto);

	List<HouseDto> getRoomListByTownshipAndRent(SearchParameterDto paramDto);

	List<HouseDto> getRoomListByTownshipAndPeriod(SearchParameterDto paramDto);

	List<HouseDto> getRoomListByAmountAndPeriod(SearchParameterDto paramDto);

}
