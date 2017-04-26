/**
 * Created by diogomoreira on 15/08/16.
 */
public class Limao extends CoquetelDecorator {

    public Limao(Coquetel coquetelDecorado) {
        super(coquetelDecorado);
        this.setNome("Limão");
        this.setPreco(0.5d);
    }

}
