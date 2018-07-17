public class U2 extends Rocket {

    //Constructor for U2 Class
    public U2(){
        super(120,18,29);
    }

    //Overridden the launch function of rocket class to include the probability of failure
    @Override
    public boolean launch() {
        double chance = 0.004*((double)super.getWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }

    //Overridden the land function of rocket class to include the probability of failure
    @Override
    public boolean land() {
        double chance = 0.008*((double)super.getWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }
}
