/**
 * Created by jade on 1/18/17.
 */
public class Dog extends Pet{
    String name;

    public Dog( String name ){
        name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public void cuddle(){
        System.out.println( name + " barks and wags its tail");
    }
}
