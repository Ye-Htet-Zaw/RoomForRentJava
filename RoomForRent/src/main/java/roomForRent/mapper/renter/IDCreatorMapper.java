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
	
	String getOneUserID();

	String getOneHouseID();

	String getOneFavouriteID();

}
