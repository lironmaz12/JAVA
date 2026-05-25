public class DatabaseNode extends CloudResource {

    private int storageCapacityGb;

    public DatabaseNode(String resourceId, int storageCapacityGb) {

        super(resourceId);
        this.storageCapacityGb = storageCapacityGb;
    }

    @Override
    public void allocateMemory(int gigabytes) {

        System.out.println("Reserving " + gigabytes +
                " GB RAM for database indexing.");
    }

    @Override
    public String generateHealthReport() {

        if (isActive) {
            return "Database is running properly";
        } else {
            return "Database is offline";
        }
    }

    @Override
    public int getUptime() {

        return 48;
    }
    
}