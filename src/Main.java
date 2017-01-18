/**
 * Created by jade on 1/18/17.
 */
public class Main {
    public static void main( String args[]){
        Store petShop = new Store();
        System.out.println( petShop.getInventory() + "\n" );

        petShop.buy("dog", "Betsy");
        petShop.buy("bird", "Tippie");
        petShop.buy("cat", "Mittens");

        System.out.println( petShop.getInventory() + "\n" );

        petShop.sell("Mittens");
        petShop.buy("cat", "Kiddo");
        petShop.buy("dog", "Bernard");

        System.out.println( petShop.getInventory() );


    }
}
