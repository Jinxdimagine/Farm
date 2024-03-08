import java.util.ArrayList;

public class Barn {
    ArrayList<Animal> AnimalList;
    int numberBiganimals;
    int numberSmallanimals;

    public Barn(){
        AnimalList=new ArrayList<>(20);
    }
   public boolean addAnimal(Animal animal)throws Exception{
        switch (animal.size){
            case BIG:{
                if (numberBiganimals<10){
                    AnimalList.add(animal);
                    return true;
                }else {
                    throw new Exception("number of Big animals are at limit");
                }
            }
            case SMALL:{
                if (numberSmallanimals<10){
                    AnimalList.add(animal);
                    return true;
                }else {
                    throw new Exception("number of Small animals are at limit");
                }
            }
            default:return false;
        }
   }
}
