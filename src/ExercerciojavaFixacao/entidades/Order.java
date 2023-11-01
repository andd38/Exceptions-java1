package ExercerciojavaFixacao.entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
    private Date moment;
    private OrderStatus status;

    private List <OrderItem> orderItemList = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Cliente c1) {
        this.status = status;
    }

    public void addItem(OrderItem item){

        orderItemList.add(item);

    }
    public void remove(OrderItem item){
        orderItemList.remove(item);
    }
    public void Total(){

    }

    public Date getMoment() throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date moment = sdf1.parse("20/04/2018 11:25:09");
        return moment;
    }

    public void setMoment(Date moment) {

        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }


    public Order(){

    }
    public Order(Date moment, OrderStatus status, List<OrderItem> orderItemList) {
        this.moment = moment;
        this.status = status;
        this.orderItemList = orderItemList;
    }
}
