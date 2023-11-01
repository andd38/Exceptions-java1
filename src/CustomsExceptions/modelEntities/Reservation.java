package CustomsExceptions.modelEntities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private  Integer roomNumber;
    private Date Checkin;
    private Date Chekout;

    private static SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
    public Reservation(int roomNumber, Date checkin, Date chekout) {
        this.roomNumber = roomNumber;
        Checkin = checkin;
        Chekout = chekout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return Checkin;
    }

    public Date getChekout() {
        return Chekout;
    }


    public  long duration(){
        long diff = getChekout().getTime() - getCheckin().getTime();
       return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
    }
    public void updateDates(Date checkin, Date checkout){
        this.Checkin = checkin;
        this.Chekout = checkout;
    }
    @Override
    public String toString(){
        return "room"+roomNumber+"Check-in : "+ sdf.format(getCheckin())+
                "check-out: "+sdf.format(getChekout())+
                ", "+ duration()+" nights";
    }
}
