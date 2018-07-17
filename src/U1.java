public class U1 extends Rocket {

    //Constructor for U1 Class
    public U1(){
        super(100,10,18);
    }

    //Overridden the launch function of rocket class to include the probability of failure
    @Override
    public boolean launch() {
        double chance = 0.005*((double)super.getWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }

    //Overridden the land function of rocket class include the probability of failure
    @Override
    public boolean land() {
        double chance = 0.001*((double)super.getWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }
}
