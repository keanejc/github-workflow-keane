/**
 * Created by jade on 1/18/17.
 */
import java.util.ArrayList;

public class Store {
    private ArrayList inventory;

    public Store(){
        inventory = new ArrayList();
    }

    public void buy(String type, String name){
        // create a new pet object and add to inventory; assumes viable pet type was given
        type = type.toLowerCase();
        if( type.equals("cat")){
            inventory.add( new Cat(name) );

        }
        else if( type.equals("dog")){
            inventory.add( new Dog(name) );

        }
        else if( type.equals("bird")){
            inventory.add( new Bird(name) );

        }
       /* switch(type.toLowerCase()){
            case "cat":
                inventory.add( new Cat(name) );
            case "dog":
                inventory.add( new Dog(name) );
            case "bird":
                inventory.add( new Bird(name) );
        }*/
    }

    public void sell( String petName){
        // Search for pet in inventory; delete by changing to null when found (if not found, do nothing)
        for ( int i = 0; i > inventory.size(); i ++){
            if (inventory.get(i) == petName){
                inventory.set( i, null);
            }
        }
    }

    public String getInventory(){
        // return a string containing information about store inventory
        String string = "Shop Inventory" + "\n" + "Number of Pets: " + inventory.size() + "\n" + "Animal List: " + "\n" + inventory;

        return string;

    }


    public static void main( String args[]){
        Store petShop = new Store();

        petShop.buy("dog", "Betsy");
        petShop.buy("bird", "Tippie");
        petShop.buy("cat", "Mittens");
        petShop.buy("cat", "Kiddo");
        petShop.buy("dog", "Bernard");

        petShop.sell("Mittens");

        String inventory = petShop.getInventory();
        System.out.println( inventory );
    }
}
