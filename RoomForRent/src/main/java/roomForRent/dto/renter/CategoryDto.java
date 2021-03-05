package roomForRent.dto.renter;

import java.sql.Timestamp;

public class CategoryDto {
	String CATEGORY_ID;
	String CATEGORY_NAME;
	Integer DELETE_FLAG;
	Timestamp DELETE_DATETIME;
	String CREATOR_ID;
	Timestamp CREATE_DATETIME;
	String UPDATOR_ID;
	Timestamp UPDATE_DATETIME;
	public String getCATEGORY_ID() {
		return CATEGORY_ID;
	}
	public void setCATEGORY_ID(String cATEGORY_ID) {
		CATEGORY_ID = cATEGORY_ID;
	}
	public String getCATEGORY_NAME() {
		return CATEGORY_NAME;
	}
	public void setCATEGORY_NAME(String cATEGORY_NAME) {
		CATEGORY_NAME = cATEGORY_NAME;
	}
	public Integer getDELETE_FLAG() {
		return DELETE_FLAG;
	}
	public void setDELETE_FLAG(Integer dELETE_FLAG) {
		DELETE_FLAG = dELETE_FLAG;
	}
	public Timestamp getDELETE_DATETIME() {
		return DELETE_DATETIME;
	}
	public void setDELETE_DATETIME(Timestamp dELETE_DATETIME) {
		DELETE_DATETIME = dELETE_DATETIME;
	}
	public String getCREATOR_ID() {
		return CREATOR_ID;
	}
	public void setCREATOR_ID(String cREATOR_ID) {
		CREATOR_ID = cREATOR_ID;
	}
	public Timestamp getCREATE_DATETIME() {
		return CREATE_DATETIME;
	}
	public void setCREATE_DATETIME(Timestamp cREATE_DATETIME) {
		CREATE_DATETIME = cREATE_DATETIME;
	}
	public String getUPDATOR_ID() {
		return UPDATOR_ID;
	}
	public void setUPDATOR_ID(String uPDATOR_ID) {
		UPDATOR_ID = uPDATOR_ID;
	}
	public Timestamp getUPDATE_DATETIME() {
		return UPDATE_DATETIME;
	}
	public void setUPDATE_DATETIME(Timestamp uPDATE_DATETIME) {
		UPDATE_DATETIME = uPDATE_DATETIME;
	}
	
}
