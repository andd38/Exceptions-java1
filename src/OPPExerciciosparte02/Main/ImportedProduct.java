package OPPExerciciosparte02.Main;

public class ImportedProduct extends Product{
    private Double customFee;


    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public ImportedProduct(Double customFee) {
        this.customFee = customFee;
    }
    @Override
    public String priceTag(){
     return  " "+TotalPrice() +" (Customs fee :"+getCustomFee()+")";
    }


    public Double TotalPrice() {
        return getPrice()+getCustomFee();
    }
}
