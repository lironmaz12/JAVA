
public class Main {

    public static void main(String[] args) {

        DatacenterConfig.printSop();

        ComputeNode node1 = new ComputeNode("C-01", 16);

        DatabaseNode node2 = new DatabaseNode("DB-01", 500);

        node1.togglePower();
        node2.togglePower();

        node1.allocateMemory(32);
        node2.allocateMemory(32);

        System.out.println(node1.generateHealthReport());
        System.out.println(node2.generateHealthReport());

        System.out.println("Compute Node Uptime: " +
                node1.getUptime());

        System.out.println("Database Node Uptime: " +
                node2.getUptime());
    }
}