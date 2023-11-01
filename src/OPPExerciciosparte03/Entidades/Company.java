package OPPExerciciosparte03.Entidades;

public class Company extends Person{
    private int QuantEmployee;

    public Company(String name, Double anualIncome) {
        super(name, anualIncome);
    }

    public Company(String name, Double anualIncome, int quantEmployee) {
        super(name, anualIncome);
        QuantEmployee = quantEmployee;
    }

    public int getQuantEmployee() {
        return QuantEmployee;
    }

    public void setQuantEmployee(int quantEmployee) {
        QuantEmployee = quantEmployee;
    }
    @Override
    public Double Calculate(){
        if(getQuantEmployee()>10){
            return  0.14*getAnualIncome();
        }
        else{
            return 0.16*getAnualIncome();
        }
    }
}
