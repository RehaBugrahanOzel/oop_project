
public class Ticket {

    int ticketNo;
    Seat seat;
    Customer customerInfo;
    Date date;
    Time performanceStart;
    Time PerformanceEnd;
    int ticketPrice;
    String hall;
    String showName;

    public Ticket(int ticketNo, Seat seat, Customer customerInfo, Date date, Time performanceStart,
            int ticketPrice, String hall, String showName) {
        super();
        this.ticketNo = ticketNo;
        this.seat = seat;
        this.customerInfo = customerInfo;
        this.date = date;
        this.performanceStart = performanceStart;
        this.ticketPrice = ticketPrice;
        this.hall = hall;
        this.showName = showName;
    }
}