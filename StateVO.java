package vo;

public class StateVO {
	private int sid;
	private String state;
	CountryVO cvo;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public CountryVO getCvo() {
		return cvo;
	}
	public void setCvo(CountryVO cvo) {
		this.cvo = cvo;
	}

}
