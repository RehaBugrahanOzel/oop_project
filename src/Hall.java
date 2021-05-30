
public class Hall {

	String hallName;
	Seat seat;
	String section;
	String type;
	
	public Hall(String hallName, Seat seat, String section, String type) {
		this.hallName = hallName;
		this.seat = seat;
		this.section = section;
		this.type = type;
	}

	public String getHallName() {return hallName;}

	public void setHallName(String hallName) {this.hallName = hallName;}

	public Seat getSeat() {return seat;}

	public void setSeat(Seat seat) {this.seat = seat;}

	public String getSection() {return section;}

	public void setSection(String section) {this.section = section;}

	public String getType() {return type;}

	public void setType(String type) {this.type = type;}

}
