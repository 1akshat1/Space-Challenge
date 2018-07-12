public class U1 extends Rocket {

    public U1(){
        super(100,10,18);
    }
    @Override
    public boolean launch() {
        double chance = 0.005*((double)super.getWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }

    @Override
    public boolean land() {
        double chance = 0.001*((double)super.getWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }
}
