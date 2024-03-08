public class Farm {

    private FlowerPlace flowerPlace;
    private Barn barn;

    public Farm(){
        setBarn(new Barn());
        setFlowerPlace(new FlowerPlace());
    }

    public FlowerPlace getFlowerPlace() {
        return flowerPlace;
    }

    public void setFlowerPlace(FlowerPlace flowerPlace) {
        this.flowerPlace = flowerPlace;
    }

    public Barn getBarn() {
        return barn;
    }

    public void setBarn(Barn barn) {
        this.barn = barn;
    }
}
