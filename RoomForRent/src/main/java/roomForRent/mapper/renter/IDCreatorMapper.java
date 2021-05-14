/**
*
* IDCreatorMapper
*
* 2021/05/05 KMMN Create New
*
* create id
*/
package roomForRent.mapper.renter;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IDCreatorMapper {

	/**
	 * get maximum id of user table
	 * 
	 * @return maximum id of user table
	 */
	String getOneUserID();

	/**
	 * get maximum id of house table
	 * 
	 * @return maximum id of house table
	 */
	String getOneHouseID();

	/**
	 * get maximum id of favourite table
	 * 
	 * @return maximum id of favourite table
	 */
	String getOneFavouriteID();

}
