package roomForRent.dto.renter;

import java.sql.Timestamp;
import java.util.Date;

/**
*
  HouseDto
*
* 2021/03/08 KMMN Create New
*
* house dto
*/
public class HouseDto {

	String house_ID;
	String user_ID;
	String category_ID;
	String house_ADDRESS;
	String township;
    Integer no_OF_GUESTS;
    Integer no_OF_ROOM;
    Integer no_OF_BATH;
    Integer no_OF_TOILET;
    Integer area;
    Integer no_OF_FLOOR;
    Integer no_OF_AIRCON;
    Integer wifi;
    String phone_ONE;
    String phone_TWO;
    Date available_DATE;
    Integer rent;
    Integer deposit;
    String longitude;
    String latitude;
    Date expired_DATE;
    String recommented_POINTS;
    String contract_RULE;
    Integer period;
    Integer rent_FLAG;
    Integer delete_FLAG;
    Timestamp delete_DATETIME;
    String creator_ID;
    Timestamp create_DATETIME;
    String updator_ID;
    Timestamp update_DATETIME;
    
	public String getHouse_ID() {
		return house_ID;
	}
	public void setHouse_ID(String house_ID) {
		this.house_ID = house_ID;
	}
	public String getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}
	public String getCategory_ID() {
		return category_ID;
	}
	public void setCategory_ID(String category_ID) {
		this.category_ID = category_ID;
	}
	public String getHouse_ADDRESS() {
		return house_ADDRESS;
	}
	public void setHouse_ADDRESS(String house_ADDRESS) {
		this.house_ADDRESS = house_ADDRESS;
	}
	public String getTownship() {
		return township;
	}
	public void setTownship(String township) {
		this.township = township;
	}
	public Integer getNo_OF_GUESTS() {
		return no_OF_GUESTS;
	}
	public void setNo_OF_GUESTS(Integer no_OF_GUESTS) {
		this.no_OF_GUESTS = no_OF_GUESTS;
	}
	public Integer getNo_OF_ROOM() {
		return no_OF_ROOM;
	}
	public void setNo_OF_ROOM(Integer no_OF_ROOM) {
		this.no_OF_ROOM = no_OF_ROOM;
	}
	public Integer getNo_OF_BATH() {
		return no_OF_BATH;
	}
	public void setNo_OF_BATH(Integer no_OF_BATH) {
		this.no_OF_BATH = no_OF_BATH;
	}
	public Integer getNo_OF_TOILET() {
		return no_OF_TOILET;
	}
	public void setNo_OF_TOILET(Integer no_OF_TOILET) {
		this.no_OF_TOILET = no_OF_TOILET;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Integer getNo_OF_FLOOR() {
		return no_OF_FLOOR;
	}
	public void setNo_OF_FLOOR(Integer no_OF_FLOOR) {
		this.no_OF_FLOOR = no_OF_FLOOR;
	}
	public Integer getNo_OF_AIRCON() {
		return no_OF_AIRCON;
	}
	public void setNo_OF_AIRCON(Integer no_OF_AIRCON) {
		this.no_OF_AIRCON = no_OF_AIRCON;
	}
	public Integer getWifi() {
		return wifi;
	}
	public void setWifi(Integer wifi) {
		this.wifi = wifi;
	}
	public String getPhone_ONE() {
		return phone_ONE;
	}
	public void setPhone_ONE(String phone_ONE) {
		this.phone_ONE = phone_ONE;
	}
	public String getPhone_TWO() {
		return phone_TWO;
	}
	public void setPhone_TWO(String phone_TWO) {
		this.phone_TWO = phone_TWO;
	}
	public Date getAvailable_DATE() {
		return available_DATE;
	}
	public void setAvailable_DATE(Date available_DATE) {
		this.available_DATE = available_DATE;
	}
	public Integer getRent() {
		return rent;
	}
	public void setRent(Integer rent) {
		this.rent = rent;
	}
	public Integer getDeposit() {
		return deposit;
	}
	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Date getExpired_DATE() {
		return expired_DATE;
	}
	public void setExpired_DATE(Date expired_DATE) {
		this.expired_DATE = expired_DATE;
	}
	public String getRecommented_POINTS() {
		return recommented_POINTS;
	}
	public void setRecommented_POINTS(String recommented_POINTS) {
		this.recommented_POINTS = recommented_POINTS;
	}
	public String getContract_RULE() {
		return contract_RULE;
	}
	public void setContract_RULE(String contract_RULE) {
		this.contract_RULE = contract_RULE;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public Integer getRent_FLAG() {
		return rent_FLAG;
	}
	public void setRent_FLAG(Integer rent_FLAG) {
		this.rent_FLAG = rent_FLAG;
	}
	public Integer getDelete_FLAG() {
		return delete_FLAG;
	}
	public void setDelete_FLAG(Integer delete_FLAG) {
		this.delete_FLAG = delete_FLAG;
	}
	public Timestamp getDelete_DATETIME() {
		return delete_DATETIME;
	}
	public void setDelete_DATETIME(Timestamp delete_DATETIME) {
		this.delete_DATETIME = delete_DATETIME;
	}
	public String getCreator_ID() {
		return creator_ID;
	}
	public void setCreator_ID(String creator_ID) {
		this.creator_ID = creator_ID;
	}
	public Timestamp getCreate_DATETIME() {
		return create_DATETIME;
	}
	public void setCreate_DATETIME(Timestamp create_DATETIME) {
		this.create_DATETIME = create_DATETIME;
	}
	public String getUpdator_ID() {
		return updator_ID;
	}
	public void setUpdator_ID(String updator_ID) {
		this.updator_ID = updator_ID;
	}
	public Timestamp getUpdate_DATETIME() {
		return update_DATETIME;
	}
	public void setUpdate_DATETIME(Timestamp update_DATETIME) {
		this.update_DATETIME = update_DATETIME;
	}
    
    
}
