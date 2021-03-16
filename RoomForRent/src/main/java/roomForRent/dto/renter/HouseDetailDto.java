/**
*
* HouseDetailDto
*
* 2021/03/05 YHZ Create New
*
* HouseDetailDto
*/
package roomForRent.dto.renter;

import java.util.List;

public class HouseDetailDto {
	private List<String> house_image;
	private String house_address;
	private int no_of_guests;
	private int no_of_room;
	private int no_of_bath;
	private int no_of_toilet;
	private int area;
	private int no_of_floor;
	private int no_of_aircon;
	private int wifi;
	private String phone_one;
	private String phone_two;
	private String available_date;
	private int rent;
	private int deposit;
	private String longitude;
	private String latitude;
	private String recommented_points;
	private String contract_rule;
	private String period;
	
	public List<String> getHouse_image() {
		return house_image;
	}
	public void setHouse_image(List<String> house_image) {
		this.house_image = house_image;
	}
	public String getHouse_address() {
		return house_address;
	}
	public void setHouse_address(String house_address) {
		this.house_address = house_address;
	}
	public int getNo_of_guests() {
		return no_of_guests;
	}
	public void setNo_of_guests(int no_of_guests) {
		this.no_of_guests = no_of_guests;
	}
	public int getNo_of_room() {
		return no_of_room;
	}
	public void setNo_of_room(int no_of_room) {
		this.no_of_room = no_of_room;
	}
	public int getNo_of_bath() {
		return no_of_bath;
	}
	public void setNo_of_bath(int no_of_bath) {
		this.no_of_bath = no_of_bath;
	}
	public int getNo_of_toilet() {
		return no_of_toilet;
	}
	public void setNo_of_toilet(int no_of_toilet) {
		this.no_of_toilet = no_of_toilet;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getNo_of_floor() {
		return no_of_floor;
	}
	public void setNo_of_floor(int no_of_floor) {
		this.no_of_floor = no_of_floor;
	}
	public int getNo_of_aircon() {
		return no_of_aircon;
	}
	public void setNo_of_aircon(int no_of_aircon) {
		this.no_of_aircon = no_of_aircon;
	}
	public int getWifi() {
		return wifi;
	}
	public void setWifi(int wifi) {
		this.wifi = wifi;
	}
	public String getPhone_one() {
		return phone_one;
	}
	public void setPhone_one(String phone_one) {
		this.phone_one = phone_one;
	}
	public String getPhone_two() {
		return phone_two;
	}
	public void setPhone_two(String phone_two) {
		this.phone_two = phone_two;
	}
	
	public String getAvailable_date() {
		return available_date;
	}
	public void setAvailable_date(String available_date) {
		this.available_date = available_date;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
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
	public String getRecommented_points() {
		return recommented_points;
	}
	public void setRecommented_points(String recommented_points) {
		this.recommented_points = recommented_points;
	}
	public String getContract_rule() {
		return contract_rule;
	}
	public void setContract_rule(String contract_rule) {
		this.contract_rule = contract_rule;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
}
