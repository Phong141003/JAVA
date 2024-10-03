public class Memory {
    private String type;
    private int size; // GB

    public Memory(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public void displayDetails() {
        System.out.println("Memory: " + size + " GB " + type);
    }
}
