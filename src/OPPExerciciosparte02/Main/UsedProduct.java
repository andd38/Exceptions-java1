package OPPExerciciosparte02.Main;

import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }



    @Override
    public String priceTag(){
        return " (used) $" +getPrice()+"(Manufacture date)"+getManufactureDate();

    }
}
