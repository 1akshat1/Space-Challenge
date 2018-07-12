public class U2 extends Rocket {

    public U2(){
        super(120,18,29);
    }
    @Override
    public boolean launch() {
        double chance = 0.004*((double)super.getWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }

    @Override
    public boolean land() {
        double chance = 0.008*((double)super.getWeight()/super.getMaxWeight());
        double rand = Math.random()*.01;
        return chance<=rand;
    }
}
