/**
 * Created by diogomoreira on 15/08/16.
 */
public class Laranja extends CoquetelDecorator {

    public Laranja(Coquetel coquetelDecorado) {
        super(coquetelDecorado);
        this.setNome("Laranja");
        this.setPreco(1d);
    }
}
