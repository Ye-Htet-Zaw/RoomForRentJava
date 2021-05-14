/**
 *
 * SearchRoomController
 *
 * 2021/03/08 KMMN Create New
 *
 * search room
 */
package roomForRent.controller.renter;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import roomForRent.dto.renter.HouseDto;
import roomForRent.dto.renter.SearchParameterDto;
import roomForRent.service.renter.SearchRoomService;

@RestController
public class SearchRoomController {

	@Autowired
	SearchRoomService searchRoomService;

	/**
	 * get all room list
	 * 
	 * @return List<HouseDto>
	 */
	@GetMapping("/getAllRoomList")
	public List<HouseDto> getAllRoomList() {
		return searchRoomService.getAllRoomList();
	}

	/**
	 * Search by category Name
	 * 
	 * @param categoryName
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByCategory/{CATEGORY_NAME}")
	public List<HouseDto> getRoomListByCategory(@PathVariable(value = "CATEGORY_NAME") String categoryName) {
		String categoryId = searchRoomService.getCategoryId(categoryName);
		return searchRoomService.getRoomListByCategory(categoryId);
	}

	/**
	 * Search by township
	 * 
	 * @param township
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByTownship/{TOWNSHIP}")
	public List<HouseDto> getRoomListByTownship(@PathVariable(value = "TOWNSHIP") String township) {
		return searchRoomService.getRoomListByTownship(township);
	}

	/**
	 * Search by Amount
	 * 
	 * @param rentprice
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByAmount/{RENT}")
	public List<HouseDto> getRoomListByAmount(@PathVariable(value = "RENT") Integer rentprice) {
		return searchRoomService.getRoomListByAmount(rentprice);
	}

	/**
	 * Search by Peroid
	 * 
	 * @param period
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByPeroid/{PERIOD}")
	private List<HouseDto> getRoomListByPeroid(@PathVariable(value = "PERIOD") Integer period) {
		return searchRoomService.getRoomListByPeroid(period);
	}

	/**
	 * Search by Category and TownShip
	 * 
	 * @param categoryName
	 * @param township
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByCategoryAndTownShip/{CATEGORY_NAME}&{TOWNSHIP}")
	private List<HouseDto> getRoomListByCategoryAndTownShip(@PathVariable(value = "CATEGORY_NAME") String categoryName,
			@PathVariable(value = "TOWNSHIP") String township) {
		String categoryId = searchRoomService.getCategoryId(categoryName);
		SearchParameterDto paramDto = new SearchParameterDto();
		paramDto.setCATEGORY_ID(categoryId);
		paramDto.setTOWNSHIP(township);
		return searchRoomService.getRoomListByCategoryAndTownShip(paramDto);
	}

	/**
	 * Search by category and amount
	 * 
	 * @param categoryName
	 * @param amount
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByCategoryAndAmount/{CATEGORY_NAME}&{RENT}")
	public List<HouseDto> getRoomListByCategoryAndAmount(@PathVariable(value = "CATEGORY_NAME") String categoryName,
			@PathVariable(value = "RENT") Integer amount) {
		String categoryId = searchRoomService.getCategoryId(categoryName);
		SearchParameterDto paramDto = new SearchParameterDto();
		paramDto.setCATEGORY_ID(categoryId);
		paramDto.setRENT(amount);
		return searchRoomService.getRoomListByCategoryAndAmount(paramDto);
	}

	/**
	 * Search by category and period
	 * 
	 * @param categoryName
	 * @param period
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByCategoryAndPeriod/{CATEGORY_NAME}&{PERIOD}")
	public List<HouseDto> getRoomListByCategoryAndPeriod(@PathVariable(value = "CATEGORY_NAME") String categoryName,
			@PathVariable(value = "PERIOD") Integer period) {
		String categoryId = searchRoomService.getCategoryId(categoryName);
		SearchParameterDto paramDto = new SearchParameterDto();
		paramDto.setCATEGORY_ID(categoryId);
		paramDto.setPERIOD(period);
		return searchRoomService.getRoomListByCategoryAndPeriod(paramDto);
	}

	/**
	 * Search by Township and Amount
	 * 
	 * @param township
	 * @param amount
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByTownshipAndRent/{TOWNSHIP}&{RENT}")
	private List<HouseDto> getRoomListByTownshipAndRent(@PathVariable(value = "TOWNSHIP") String township,
			@PathVariable(value = "RENT") Integer amount) {

		SearchParameterDto paramDto = new SearchParameterDto();
		paramDto.setTOWNSHIP(township);
		paramDto.setRENT(amount);
		return searchRoomService.getRoomListByTownshipAndRent(paramDto);
	}

	/**
	 * Search by Township and Period
	 * 
	 * @param township
	 * @param period
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByTownshipAndPeriod/{TOWNSHIP}&{PERIOD}")
	public List<HouseDto> getRoomListByTownshipAndPeriod(@PathVariable(value = "TOWNSHIP") String township,
			@PathVariable(value = "PERIOD") Integer period) {
		SearchParameterDto paramDto = new SearchParameterDto();
		paramDto.setTOWNSHIP(township);
		paramDto.setPERIOD(period);
		return searchRoomService.getRoomListByTownshipAndPeriod(paramDto);
	}

	/**
	 * Search by Amount and Period
	 * 
	 * @param amount
	 * @param period
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByAmountAndPeriod/{RENT}&{PERIOD}")
	public List<HouseDto> getRoomListByAmountAndPeriod(@PathVariable(value = "RENT") Integer amount,
			@PathVariable(value = "PERIOD") Integer period) {
		SearchParameterDto paramDto = new SearchParameterDto();
		paramDto.setRENT(amount);
		paramDto.setPERIOD(period);
		return searchRoomService.getRoomListByAmountAndPeriod(paramDto);
	}

	/**
	 * Search by Category , Address And Period
	 * 
	 * @param categoryName
	 * @param township
	 * @param period
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByCategoryAndAddressAndPeriod/{CATEGORY_NAME}&{TOWNSHIP}&{PERIOD}")
	private List<HouseDto> getRoomListByCategoryAndAddressAndPeriod(
			@PathVariable(value = "CATEGORY_NAME") String categoryName,
			@PathVariable(value = "TOWNSHIP") String township, @PathVariable(value = "PERIOD") Integer period) {
		String categoryId = searchRoomService.getCategoryId(categoryName);
		SearchParameterDto paramDto = new SearchParameterDto();
		paramDto.setCATEGORY_ID(categoryId);
		paramDto.setTOWNSHIP(township);
		paramDto.setPERIOD(period);
		return searchRoomService.getRoomListByCategoryAndAddressAndPeriod(paramDto);
	}

	/**
	 * Search by Category , Address And Amount
	 * 
	 * @param categoryName
	 * @param township
	 * @param rent
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByCategoryAndAddressAndAmount/{CATEGORY_NAME}&{TOWNSHIP}&{RENT}")
	private List<HouseDto> getRoomListByCategoryAndAddressAndAmount(
			@PathVariable(value = "CATEGORY_NAME") String categoryName,
			@PathVariable(value = "TOWNSHIP") String township, @PathVariable(value = "RENT") Integer rent) {
		String categoryId = searchRoomService.getCategoryId(categoryName);
		SearchParameterDto paramDto = new SearchParameterDto();
		paramDto.setCATEGORY_ID(categoryId);
		paramDto.setTOWNSHIP(township);
		paramDto.setRENT(rent);
		return searchRoomService.getRoomListByCategoryAndAddressAndAmount(paramDto);
	}

	/**
	 * Search by Category , Amount And Period
	 * 
	 * @param categoryName
	 * @param rent
	 * @param period
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByCategoryAndAmountAndPeriod/{CATEGORY_NAME}&{RENT}&{PERIOD}")
	private List<HouseDto> getRoomListByCategoryAndAmountAndPeriod(
			@PathVariable(value = "CATEGORY_NAME") String categoryName, @PathVariable(value = "RENT") Integer rent,
			@PathVariable(value = "PERIOD") Integer period) {
		String categoryId = searchRoomService.getCategoryId(categoryName);
		SearchParameterDto paramDto = new SearchParameterDto();
		paramDto.setCATEGORY_ID(categoryId);
		paramDto.setRENT(rent);
		paramDto.setPERIOD(period);
		return searchRoomService.getRoomListByCategoryAndAmountAndPeriod(paramDto);
	}

	/**
	 * Search by Address , Amount And Period
	 * 
	 * @param townShip
	 * @param rent
	 * @param period
	 * @return List<HouseDto>
	 */
	@GetMapping("/getRoomListByAddressAndAmountAndPeriod/{TOWNSHIP}&{RENT}&{PERIOD}")
	private List<HouseDto> getRoomListByAddressAndAmountAndPeriod(@PathVariable(value = "TOWNSHIP") String townShip,
			@PathVariable(value = "RENT") Integer rent, @PathVariable(value = "PERIOD") Integer period) {
		SearchParameterDto paramDto = new SearchParameterDto();
		paramDto.setTOWNSHIP(townShip);
		paramDto.setRENT(rent);
		paramDto.setPERIOD(period);
		return searchRoomService.getRoomListByAddressAndAmountAndPeriod(paramDto);
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
	@GetMapping("/getRoomListByAll/{CATEGORY_NAME}&{TOWNSHIP}&{RENT}&{PERIOD}")
	private List<HouseDto> getRoomListByAll(@PathVariable(value = "CATEGORY_NAME") String categoryName,
			@PathVariable(value = "TOWNSHIP") String townShip, @PathVariable(value = "RENT") Integer rent,
			@PathVariable(value = "PERIOD") Integer period) {
		String categoryId = searchRoomService.getCategoryId(categoryName);
		SearchParameterDto paramDto = new SearchParameterDto();
		paramDto.setCATEGORY_ID(categoryId);
		paramDto.setTOWNSHIP(townShip);
		paramDto.setRENT(rent);
		paramDto.setPERIOD(period);
		return searchRoomService.getRoomListByAll(paramDto);

	}

}
