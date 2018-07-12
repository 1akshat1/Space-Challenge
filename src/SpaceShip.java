public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry(Item thing);
    void carry(Item thing);
}
