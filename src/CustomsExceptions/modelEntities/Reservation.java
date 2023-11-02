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
    public String updateDates(Date checkin, Date checkout){
        Date now = new Date();
        if(checkin.before(now) || checkout.before(now)){
           return "Reservation dates for updates must be future";
        }
        if(!checkout.after(checkin)){
           return  "ckeck-out date must be after checkin date";
        }
        this.Checkin = checkin;
        this.Chekout = checkout;
        return null;
    }
    @Override
    public String toString(){
        return "room"+roomNumber+"Check-in : "+ sdf.format(getCheckin())+
                "check-out: "+sdf.format(getChekout())+
                ", "+ duration()+" nights";
    }
}
