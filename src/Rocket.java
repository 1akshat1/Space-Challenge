public class Rocket implements SpaceShip {
    private int cost;
    private int maxWeight;
    private int weight;

    public Rocket(int cost,int weight, int maxWeight){
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
    }
    public int getWeight(){
        return weight;
    }
    public int getMaxWeight(){
        return maxWeight;
    }
    public int getCost(){
        return cost;
    }
    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item thing) {
        if(thing.getWeight() + weight> maxWeight)
            return false;
        else
            return true;
    }

    @Override
    public void carry(Item thing) {
        weight += thing.getWeight();
    }
}
