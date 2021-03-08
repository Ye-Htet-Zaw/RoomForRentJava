package roomForRent.dto.renter;

public class SearchParameterDto {

	String CATEGORY_ID;
	String TOWNSHIP;
	Integer RENT;
	Integer PERIOD;
	public String getCATEGORY_ID() {
		return CATEGORY_ID;
	}
	public void setCATEGORY_ID(String cATEGORY_ID) {
		CATEGORY_ID = cATEGORY_ID;
	}
	public String getTOWNSHIP() {
		return TOWNSHIP;
	}
	public void setTOWNSHIP(String tOWNSHIP) {
		TOWNSHIP = tOWNSHIP;
	}
	public Integer getRENT() {
		return RENT;
	}
	public void setRENT(Integer rENT) {
		RENT = rENT;
	}
	public Integer getPERIOD() {
		return PERIOD;
	}
	public void setPERIOD(Integer pERIOD) {
		PERIOD = pERIOD;
	}
	
}
