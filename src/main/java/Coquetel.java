/**
 * Created by diogomoreira on 15/08/16.
 */
public abstract class Coquetel {

    protected String nome;
    protected double preco;

    public Coquetel() {

    }

    public abstract String getNome();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double getPreco();

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
