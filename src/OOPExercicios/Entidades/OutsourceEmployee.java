package OOPExercicios.Entidades;

public final class OutsourceEmployee extends Employee{
    private Double additionalCharge;

    public Double getAdditionalCharge() {
        return additionalCharge*110/100;
    }

    @Override
    public Double payment(){
        return  getHours()*getValuePerHour()+getAdditionalCharge();
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public OutsourceEmployee(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
