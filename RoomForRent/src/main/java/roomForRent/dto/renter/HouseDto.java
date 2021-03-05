package roomForRent.dto.renter;

import java.sql.Timestamp;
import java.util.Date;
import lombok.Data;

@Data
public class HouseDto {

	String HOUSE_ID;
	String USER_ID;
	String CATEGORY_ID;
	String HOUSE_ADDRESS;
	String TOWNSHIP;
	Integer NO_OF_GUESTS;
	Integer NO_OF_ROOM;
	Integer NO_OF_BATH;
	Integer NO_OF_TOILET;
	Integer AREA;
	Integer NO_OF_FLOOR;
	Integer NO_OF_AIRCON;
	Integer WIFI;
	String PHONE_ONE;
	String PHONE_TWO;
	Date AVAILABLE_DATE;
	Integer RENT;
	Integer DEPOSIT;
	String LONGITUDE;
	String LATITUDE;
	Date EXPIRED_DATE;
	String RECOMMENTED_POINTS;
	String CONTRACT_RULE;
	Integer PERIOD;
	Integer RENT_FLAG;
	Integer DELETE_FLAG;
	Timestamp DELETE_DATETIME;
	String CREATOR_ID;
	Timestamp CREATE_DATETIME;
	String UPDATOR_ID;
	Timestamp UPDATE_DATETIME;
	public String getHOUSE_ID() {
		return HOUSE_ID;
	}
	public void setHOUSE_ID(String hOUSE_ID) {
		HOUSE_ID = hOUSE_ID;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getCATEGORY_ID() {
		return CATEGORY_ID;
	}
	public void setCATEGORY_ID(String cATEGORY_ID) {
		CATEGORY_ID = cATEGORY_ID;
	}
	public String getHOUSE_ADDRESS() {
		return HOUSE_ADDRESS;
	}
	public void setHOUSE_ADDRESS(String hOUSE_ADDRESS) {
		HOUSE_ADDRESS = hOUSE_ADDRESS;
	}
	public String getTOWNSHIP() {
		return TOWNSHIP;
	}
	public void setTOWNSHIP(String tOWNSHIP) {
		TOWNSHIP = tOWNSHIP;
	}
	public Integer getNO_OF_GUESTS() {
		return NO_OF_GUESTS;
	}
	public void setNO_OF_GUESTS(Integer nO_OF_GUESTS) {
		NO_OF_GUESTS = nO_OF_GUESTS;
	}
	public Integer getNO_OF_ROOM() {
		return NO_OF_ROOM;
	}
	public void setNO_OF_ROOM(Integer nO_OF_ROOM) {
		NO_OF_ROOM = nO_OF_ROOM;
	}
	public Integer getNO_OF_BATH() {
		return NO_OF_BATH;
	}
	public void setNO_OF_BATH(Integer nO_OF_BATH) {
		NO_OF_BATH = nO_OF_BATH;
	}
	public Integer getNO_OF_TOILET() {
		return NO_OF_TOILET;
	}
	public void setNO_OF_TOILET(Integer nO_OF_TOILET) {
		NO_OF_TOILET = nO_OF_TOILET;
	}
	public Integer getAREA() {
		return AREA;
	}
	public void setAREA(Integer aREA) {
		AREA = aREA;
	}
	public Integer getNO_OF_FLOOR() {
		return NO_OF_FLOOR;
	}
	public void setNO_OF_FLOOR(Integer nO_OF_FLOOR) {
		NO_OF_FLOOR = nO_OF_FLOOR;
	}
	public Integer getNO_OF_AIRCON() {
		return NO_OF_AIRCON;
	}
	public void setNO_OF_AIRCON(Integer nO_OF_AIRCON) {
		NO_OF_AIRCON = nO_OF_AIRCON;
	}
	public Integer getWIFI() {
		return WIFI;
	}
	public void setWIFI(Integer wIFI) {
		WIFI = wIFI;
	}
	public String getPHONE_ONE() {
		return PHONE_ONE;
	}
	public void setPHONE_ONE(String pHONE_ONE) {
		PHONE_ONE = pHONE_ONE;
	}
	public String getPHONE_TWO() {
		return PHONE_TWO;
	}
	public void setPHONE_TWO(String pHONE_TWO) {
		PHONE_TWO = pHONE_TWO;
	}
	public Date getAVAILABLE_DATE() {
		return AVAILABLE_DATE;
	}
	public void setAVAILABLE_DATE(Date aVAILABLE_DATE) {
		AVAILABLE_DATE = aVAILABLE_DATE;
	}
	public Integer getRENT() {
		return RENT;
	}
	public void setRENT(Integer rENT) {
		RENT = rENT;
	}
	public Integer getDEPOSIT() {
		return DEPOSIT;
	}
	public void setDEPOSIT(Integer dEPOSIT) {
		DEPOSIT = dEPOSIT;
	}
	public String getLONGITUDE() {
		return LONGITUDE;
	}
	public void setLONGITUDE(String lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}
	public String getLATITUDE() {
		return LATITUDE;
	}
	public void setLATITUDE(String lATITUDE) {
		LATITUDE = lATITUDE;
	}
	public Date getEXPIRED_DATE() {
		return EXPIRED_DATE;
	}
	public void setEXPIRED_DATE(Date eXPIRED_DATE) {
		EXPIRED_DATE = eXPIRED_DATE;
	}
	public String getRECOMMENTED_POINTS() {
		return RECOMMENTED_POINTS;
	}
	public void setRECOMMENTED_POINTS(String rECOMMENTED_POINTS) {
		RECOMMENTED_POINTS = rECOMMENTED_POINTS;
	}
	public String getCONTRACT_RULE() {
		return CONTRACT_RULE;
	}
	public void setCONTRACT_RULE(String cONTRACT_RULE) {
		CONTRACT_RULE = cONTRACT_RULE;
	}
	public Integer getPERIOD() {
		return PERIOD;
	}
	public void setPERIOD(Integer pERIOD) {
		PERIOD = pERIOD;
	}
	public Integer getRENT_FLAG() {
		return RENT_FLAG;
	}
	public void setRENT_FLAG(Integer rENT_FLAG) {
		RENT_FLAG = rENT_FLAG;
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
