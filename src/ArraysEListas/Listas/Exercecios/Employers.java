package ArraysEListas.Listas.Exercecios;

public class Employers {
    private int ID;
    private String nome;
    private double salario;


    public Employers(int ID, String nome, double salario) {
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void increaseSalary(double percentage) {
        salario += salario * percentage / 100.0;
    }

    @Override
    public String toString() {
        return "Employers{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", "+ String.format("%.2f",salario);

    }
}
