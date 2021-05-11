package roomForRent.dto.renter;

public class PhoneDto {
	String user_id;
	String phone_one;
	int user_position;
	int delete_flag;
	String creator_id;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPhone_one() {
		return phone_one;
	}
	public void setPhone_one(String phone_one) {
		this.phone_one = phone_one;
	}
	public int getUser_position() {
		return user_position;
	}
	public void setUser_position(int user_position) {
		this.user_position = user_position;
	}
	public int getDelete_flag() {
		return delete_flag;
	}
	public void setDelete_flag(int delete_flag) {
		this.delete_flag = delete_flag;
	}
	public String getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}
}
