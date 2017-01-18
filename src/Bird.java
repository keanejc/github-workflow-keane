/**
 * Created by jade on 1/18/17.
 */
public class Bird extends Pet{
    String name;

    public Bird( String name ){
        name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public void cuddle(){
        System.out.println( name + " tries to bite you");
    }
}
