public class Monitor {
    private String resolution;
    private double size; // Inches

    public Monitor(String resolution, double size) {
        this.resolution = resolution;
        this.size = size;
    }

    public void displayDetails() {
        System.out.println("Monitor: " + size + " inch, Resolution: " + resolution);
    }
}
