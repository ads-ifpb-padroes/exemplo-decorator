/**
 * Created by diogomoreira on 15/08/16.
 */
public class Loader {

    public static void main(String[] args) {
        Coquetel coquetel = new Vodka();
        System.out.println(coquetel);
        coquetel = new Limao(coquetel);
        coquetel = new Laranja(coquetel);

        System.out.println(coquetel.getNome());
        System.out.println(coquetel.getPreco());
    }
}
