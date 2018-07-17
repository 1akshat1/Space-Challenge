public class Item {
    private String name;
    private int weight;

    //Constructor for Item Class

    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    //Methods

    public int getWeight(){
        return this.weight;
    }

    public String getName(){

        return this.name;
    }
}
