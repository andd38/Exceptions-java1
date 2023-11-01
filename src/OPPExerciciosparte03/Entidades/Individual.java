package OPPExerciciosparte03.Entidades;

public class Individual extends Person{
    private Double spendHelth;

    public Individual(String name, Double anualIncome, Double spendHelth) {
        super(name, anualIncome);
        this.spendHelth = spendHelth;
    }

    public Double getSpendHelth() {
        return spendHelth;
    }

    public void setSpendHelth(Double spendHelth) {
        this.spendHelth = spendHelth;
    }
    @Override
    public Double Calculate(){
        if(getSpendHelth()<20000){
            return getAnualIncome() * 0.15 - getSpendHelth() * 0.5;
        } else{
            return  getAnualIncome()*0.25 - getSpendHelth()*0.5;
        }
    }
}
