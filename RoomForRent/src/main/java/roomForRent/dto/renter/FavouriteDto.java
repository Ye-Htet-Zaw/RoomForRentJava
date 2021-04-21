package roomForRent.dto.renter;

import java.sql.Timestamp;

public class FavouriteDto {

	String  favourite_id;
	String  user_id;
	String  house_id;
	String  creator_id;
	Timestamp  create_dateTime;
	public String getFavourite_id() {
		return favourite_id;
	}
	public void setFavourite_id(String favourite_id) {
		this.favourite_id = favourite_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getHouse_id() {
		return house_id;
	}
	public void setHouse_id(String house_id) {
		this.house_id = house_id;
	}
	public String getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}
	public Timestamp getCreate_dateTime() {
		return create_dateTime;
	}
	public void setCreate_dateTime(Timestamp create_dateTime) {
		this.create_dateTime = create_dateTime;
	}
	
}
