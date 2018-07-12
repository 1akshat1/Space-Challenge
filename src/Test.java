

public class Test {

    public static void main(String []args){
        Simulation sim = new Simulation();
        sim.loadItems("phase1.txt");
        sim.loadItems("phase2.txt");
        System.out.println("Running simulation for U1 rockets------>");
        int cost_U1 = sim.runSimulation(sim.loadU1());
        System.out.println("Total cost for U1 rockets: " +cost_U1 + " millions");
        System.out.println("Running simulation for U2 rockets------>");
        int cost_U2 = sim.runSimulation(sim.loadU2());
        System.out.println("Total cost for U2 rockets: " +cost_U2 + " millions");
    }
}
