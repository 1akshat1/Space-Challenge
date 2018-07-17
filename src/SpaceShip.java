/*
Interface for the spaceship
 */

public interface SpaceShip {
    boolean launch(); //returns boolean value for successful launch of the spaceship

    boolean land(); //returns boolean value for successful landing of the spaceship

    boolean canCarry(Item thing); //returns whether the total weight of the spaceship including the passed item exceeds the limit or not

    void carry(Item thing); // updates the current weight of the spaceship by adding the weight of the item
}
