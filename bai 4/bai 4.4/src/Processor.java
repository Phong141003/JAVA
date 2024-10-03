public class Processor {
    private String model;
    private int cores;
    private double clockSpeed; // GHz
    public Processor(String model, int cores, double clockSpeed) {
        this.model = model;
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }
    public void displayDetails() {
        System.out.println("Processor: " + model + ", Cores: " + cores + ", Clock Speed: " + clockSpeed + " GHz");
    }
}
