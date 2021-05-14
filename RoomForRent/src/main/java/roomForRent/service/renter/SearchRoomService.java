/**
 *
 * SearchRoomService
 *
 * 2021/03/08 KMMN Create New
 *
 * search room service
 */
package roomForRent.service.renter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import roomForRent.dto.renter.HouseDto;
import roomForRent.dto.renter.SearchParameterDto;
import roomForRent.mapper.renter.SearchRoomMapper;


@Service
public class SearchRoomService {

	@Autowired
	SearchRoomMapper searchRoomMapper;

	/**
	 * get all room list
	 * 
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getAllRoomList() {
		return searchRoomMapper.getAllRoomList();
	}

	/**
	 * get category id by category name
	 * 
	 * @param categoryName
	 * @return category id
	 */
	public String getCategoryId(String categoryName) {
		return searchRoomMapper.getCategoryId(categoryName);
	}

	/**
	 * Search by category
	 * 
	 * @param categoryId
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByCategory(String categoryId) {
		return searchRoomMapper.getRoomListByCategory(categoryId);
	}

	/**
	 * Search by township
	 * 
	 * @param township
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByTownship(String township) {
		return searchRoomMapper.getRoomListByTownship(township);
	}

	/**
	 * Search by Amount
	 * 
	 * @param rentprice
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByAmount(Integer rentprice) {
		return searchRoomMapper.getRoomListByAmount(rentprice);
	}

	/**
	 * Search by Peroid
	 * 
	 * @param period
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByPeroid(Integer period) {
		return searchRoomMapper.getRoomListByPeroid(period);
	}

	/**
	 * Search by Category and TownShip
	 * 
	 * @param categoryName
	 * @param township
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByCategoryAndTownShip(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndTownShip(paramDto);
	}

	/**
	 * Search by category and amount
	 * 
	 * @param categoryName
	 * @param amount
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByCategoryAndAmount(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndAmount(paramDto);
	}

	/**
	 * Search by category and period
	 * 
	 * @param categoryName
	 * @param period
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByCategoryAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndPeriod(paramDto);
	}

	/**
	 * Search by Township and Amount
	 * 
	 * @param township
	 * @param amount
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByTownshipAndRent(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByTownshipAndRent(paramDto);
	}

	/**
	 * Search by Township and Period
	 * 
	 * @param township
	 * @param period
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByTownshipAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByTownshipAndPeriod(paramDto);
	}

	/**
	 * Search by Amount and Period
	 * 
	 * @param amount
	 * @param period
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByAmountAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByAmountAndPeriod(paramDto);
	}

	/**
	 * Search by Category , Address And Period
	 * 
	 * @param categoryName
	 * @param township
	 * @param period
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByCategoryAndAddressAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndAddressAndPeriod(paramDto);
	}

	/**
	 * Search by Category , Address And Amount
	 * 
	 * @param categoryName
	 * @param township
	 * @param rent
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByCategoryAndAddressAndAmount(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndAddressAndAmount(paramDto);
	}

	/**
	 * Search by Category , Amount And Period
	 * 
	 * @param categoryName
	 * @param rent
	 * @param period
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByCategoryAndAmountAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByCategoryAndAmountAndPeriod(paramDto);
	}

	/**
	 * Search by Address , Amount And Period
	 * 
	 * @param townShip
	 * @param rent
	 * @param period
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByAddressAndAmountAndPeriod(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByAddressAndAmountAndPeriod(paramDto);
	}

	/**
	 * Search by all
	 * 
	 * @param categoryName
	 * @param townShip
	 * @param rent
	 * @param period
	 * @return List<HouseDto>
	 */
	public List<HouseDto> getRoomListByAll(SearchParameterDto paramDto) {
		return searchRoomMapper.getRoomListByAll(paramDto);
	}

}
