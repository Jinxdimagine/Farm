import java.util.ArrayList;

public class FlowerPlace {
    ArrayList<Flower> listFlower;
    double sizeofplants;
    public FlowerPlace(){
        listFlower=new ArrayList<>(5);
    }

    public boolean addFlower(Flower flower){
        if (sizeofplants<100){
            listFlower.add(flower);
            sizeofplants+=flower.neededArea;
            return true;
        }else {
            return false;
        }
    }
    public ArrayList<Flower> getListFlower() {
        return listFlower;
    }

    public void setListFlower(ArrayList<Flower> listFlower) {
        this.listFlower = listFlower;
    }

    public double getSizeofplants() {
        return sizeofplants;
    }

    public void setSizeofplants(double sizeofplants) {
        this.sizeofplants = sizeofplants;
    }
}
