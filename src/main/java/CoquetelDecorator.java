/**
 * Created by diogomoreira on 15/08/16.
 */
public abstract class CoquetelDecorator extends Coquetel {

    private Coquetel coquetelDecorado;

    public CoquetelDecorator(Coquetel coquetelDecorado) {
        this.coquetelDecorado = coquetelDecorado;
    }

    @Override
    public String getNome() {
        return this.nome + " + " + coquetelDecorado.getNome();
    }

    @Override
    public double getPreco() {
        return this.preco + coquetelDecorado.getPreco();
    }
}
