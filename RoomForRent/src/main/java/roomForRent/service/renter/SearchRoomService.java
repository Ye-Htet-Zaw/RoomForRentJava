package roomForRent.service.renter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.renter.HouseDto;
import roomForRent.dto.renter.SearchParameterDto;
import roomForRent.mapper.renter.SearchRoomMapper;

/**
*
  SearchRoomService
*
* 2021/03/08 KMMN Create New
*
* search room service
*/
@Service
public class SearchRoomService {

	@Autowired
	SearchRoomMapper searchRoomMapper;

	public List<HouseDto> getAllRoomList() {
		return searchRoomMapper.getAllRoomList();
	}

	public String getCategoryId(String categoryName) {
		return searchRoomMapper.getCategoryId(categoryName);
	}

	public List<HouseDto> getRoomListByCategory(String categoryId) {
		return searchRoomMapper.getRoomListByCategory(categoryId);
	}

	public List<HouseDto> getRoomListByTownship(String township) {
		return searchRoomMapper.getRoomListByTownship(township);
	}

	public List<HouseDto> getRoomListByAmount(Integer rentprice) {
		return searchRoomMapper.getRoomListByAmount(rentprice);
	}

	public List<HouseDto> getRoomListByPeroid(Integer period) {
		return searchRoomMapper.getRoomListByPeroid(period);
	}
	
	public List<HouseDto> getRoomListByCategoryAndTownShip(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndTownShip(paramDto);
	}

	public List<HouseDto> getRoomListByCategoryAndAmount(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndAmount(paramDto);
	}

	public List<HouseDto> getRoomListByCategoryAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndPeriod(paramDto);
	}

	public List<HouseDto> getRoomListByTownshipAndRent(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByTownshipAndRent(paramDto);
	}

	public List<HouseDto> getRoomListByTownshipAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByTownshipAndPeriod(paramDto);
	}

	public List<HouseDto> getRoomListByAmountAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByAmountAndPeriod(paramDto);
	}
	
	public List<HouseDto> getRoomListByCategoryAndAddressAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndAddressAndPeriod(paramDto);
	}

	public List<HouseDto> getRoomListByCategoryAndAddressAndAmount(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndAddressAndAmount(paramDto);
	}

	public List<HouseDto> getRoomListByCategoryAndAmountAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndAmountAndPeriod(paramDto);
	}

	public List<HouseDto> getRoomListByAddressAndAmountAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByAddressAndAmountAndPeriod(paramDto);
	}

}
