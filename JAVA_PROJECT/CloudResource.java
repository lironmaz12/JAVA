public abstract class CloudResource implements Monitorable {

    protected String resourceId;
    protected boolean isActive;

    public CloudResource(String resourceId) {
        this.resourceId = resourceId;
        this.isActive = false;
    }

    public void togglePower() {

        isActive = !isActive;

        if (isActive) {
            System.out.println("Resource " + resourceId + " is now ON");
        } else {
            System.out.println("Resource " + resourceId + " is now OFF");
        }
    }

    public abstract void allocateMemory(int gigabytes);
}  
