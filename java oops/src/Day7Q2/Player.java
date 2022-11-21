package Day7Q2;

public class Player  {
	String pName; 
	int totalRun; 
	int noOfWickets; 
	int noOfMatches; 
	String country; 
	int noOfCentury; 
	char Category ;
	
	public Player() {
	}
	public Player(String pName, int totalRun, int noOfWickets, int noOfMatches, String country, int noOfCentury,
			char category) {
		this.pName = pName;
		this.totalRun = totalRun;
		this.noOfWickets = noOfWickets;
		this.noOfMatches = noOfMatches;
		this.country = country;
		this.noOfCentury = noOfCentury;
		Category = category;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getTotalRun() {
		return totalRun;
	}
	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}
	public int getNoOfWickets() {
		return noOfWickets;
	}
	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getNoOfCentury() {
		return noOfCentury;
	}
	public void setNoOfCentury(int noOfCentury) {
		this.noOfCentury = noOfCentury;
	}
	public char getCategory() {
		return Category;
	}
	public void setCategory(char category) {
		Category = category;
	}
	
	
}
