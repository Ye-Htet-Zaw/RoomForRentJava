package roomForRent.dto.owner;
/**
*LoginDto
*
* 2021/03/05 NTTT Create New
*
* For Login User
*/
import java.util.Date;
/**
*UserDto
*
* 2021/03/05 CSH Create New
*
* For owner profile
*/
public class UserDto {
private String user_id;
private String user_name;
private String user_email;
private String facebook_id;
private String password;
private String phone_one;
private String phone_two;
private String user_address;
private int user_gender;
private Date user_dob;
private String dobString;
private int user_position;
private int delete_flag;
private Date delete_datetime;
private String creator_id;
private Date create_datetime;
private String updator_id;
private Date update_datetime;



public UserDto(String user_id, String user_name, String user_email, String facebook_id, String password,
		String phone_one, String phone_two, String user_address, int user_gender, Date user_dob, int user_position,
		int delete_flag, Date delete_datetime, String creator_id, Date create_datetime, String updator_id,
		Date update_datetime) {
	super();
	this.user_id = user_id;
	this.user_name = user_name;
	this.user_email = user_email;
	this.facebook_id = facebook_id;
	this.password = password;
	this.phone_one = phone_one;
	this.phone_two = phone_two;
	this.user_address = user_address;
	this.user_gender = user_gender;
	this.user_dob = user_dob;
	this.user_position = user_position;
	this.delete_flag = delete_flag;
	this.delete_datetime = delete_datetime;
	this.creator_id = creator_id;
	this.create_datetime = create_datetime;
	this.updator_id = updator_id;
	this.update_datetime = update_datetime;
}



public UserDto(String user_id, String user_name, String user_email, String phone_one, String phone_two,
		 int user_gender, String dobString, String updator_id) {
	super();
	this.user_id = user_id;
	this.user_name = user_name;
	this.user_email = user_email;
	this.phone_one = phone_one;
	this.phone_two = phone_two;	
	this.user_gender = user_gender;
	this.dobString = dobString;
	this.updator_id = updator_id;
}


public String getDobString() {
	return dobString;
}


public void setDobString(String dobString) {
	this.dobString = dobString;
}


public UserDto() {}

public String getUser_id() {
	return user_id;
}

public void setUser_id(String user_id) {
	this.user_id = user_id;
}

public String getUser_name() {
	return user_name;
}

public void setUser_name(String user_name) {
	this.user_name = user_name;
}

public String getUser_email() {
	return user_email;
}

public void setUser_email(String user_email) {
	this.user_email = user_email;
}

public String getFacebook_id() {
	return facebook_id;
}

public void setFacebook_id(String facebook_id) {
	this.facebook_id = facebook_id;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
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

public String getUser_address() {
	return user_address;
}

public void setUser_address(String user_address) {
	this.user_address = user_address;
}

public int getUser_gender() {
	return user_gender;
}

public void setUser_gender(int user_gender) {
	this.user_gender = user_gender;
}

public Date getUser_dob() {
	return user_dob;
}

public void setUser_dob(Date user_dob) {
	this.user_dob = user_dob;
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

public Date getDelete_datetime() {
	return delete_datetime;
}

public void setDelete_datetime(Date delete_datetime) {
	this.delete_datetime = delete_datetime;
}

public String getCreator_id() {
	return creator_id;
}

public void setCreator_id(String creator_id) {
	this.creator_id = creator_id;
}

public Date getCreate_datetime() {
	return create_datetime;
}

public void setCreate_datetime(Date create_datetime) {
	this.create_datetime = create_datetime;
}

public String getUpdator_id() {
	return updator_id;
}

public void setUpdator_id(String updator_id) {
	this.updator_id = updator_id;
}

public Date getUpdate_datetime() {
	return update_datetime;
}

public void setUpdate_datetime(Date update_datetime) {
	this.update_datetime = update_datetime;
}



}