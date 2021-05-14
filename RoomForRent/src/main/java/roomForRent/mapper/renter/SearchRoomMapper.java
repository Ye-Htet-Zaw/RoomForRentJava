/**
 *
 * SearchRoomMapper
 *
 * 2021/03/08 KMMN Create New
 *
 * search room mapper
 */
package roomForRent.mapper.renter;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import roomForRent.dto.renter.HouseDto;
import roomForRent.dto.renter.SearchParameterDto;


@Mapper
public interface SearchRoomMapper {

	/**
	 * get all room list
	 * 
	 * @return List<HouseDto>
	 */
	List<HouseDto> getAllRoomList();

	/**
	 * get category id by category name
	 * 
	 * @param categoryName
	 * @return category id
	 */
	String getCategoryId(String categoryName);

	/**
	 * Search by category
	 * 
	 * @param categoryId
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByCategory(String categoryId);

	/**
	 * Search by township
	 * 
	 * @param township
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByTownship(String township);

	/**
	 * Search by Amount
	 * 
	 * @param rentprice
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByAmount(Integer rentprice);

	/**
	 * Search by Peroid
	 * 
	 * @param period
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByPeroid(Integer period);

	/**
	 * Search by Category and TownShip
	 * 
	 * @param categoryName
	 * @param township
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByCategoryAndTownShip(SearchParameterDto paramDto);

	/**
	 * Search by category and amount
	 * 
	 * @param categoryName
	 * @param amount
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByCategoryAndAmount(SearchParameterDto paramDto);

	/**
	 * Search by category and period
	 * 
	 * @param categoryName
	 * @param period
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByCategoryAndPeriod(SearchParameterDto paramDto);

	/**
	 * Search by Township and Amount
	 * 
	 * @param township
	 * @param amount
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByTownshipAndRent(SearchParameterDto paramDto);

	/**
	 * Search by Township and Period
	 * 
	 * @param township
	 * @param period
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByTownshipAndPeriod(SearchParameterDto paramDto);

	/**
	 * Search by Amount and Period
	 * 
	 * @param amount
	 * @param period
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByAmountAndPeriod(SearchParameterDto paramDto);

	/**
	 * Search by Category , Address And Period
	 * 
	 * @param categoryName
	 * @param township
	 * @param period
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByCategoryAndAddressAndPeriod(SearchParameterDto paramDto);

	/**
	 * Search by Category , Address And Amount
	 * 
	 * @param categoryName
	 * @param township
	 * @param rent
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByCategoryAndAddressAndAmount(SearchParameterDto paramDto);

	/**
	 * Search by Category , Amount And Period
	 * 
	 * @param categoryName
	 * @param rent
	 * @param period
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByCategoryAndAmountAndPeriod(SearchParameterDto paramDto);

	/**
	 * Search by Address , Amount And Period
	 * 
	 * @param townShip
	 * @param rent
	 * @param period
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByAddressAndAmountAndPeriod(SearchParameterDto paramDto);

	/**
	 * Search by all
	 * 
	 * @param categoryName
	 * @param townShip
	 * @param rent
	 * @param period
	 * @return List<HouseDto>
	 */
	List<HouseDto> getRoomListByAll(SearchParameterDto paramDto);

}
