public class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public void displayDetails() {
        System.out.println("Computer Brand: " + brand);
        processor.displayDetails();
        memory.displayDetails();
        monitor.displayDetails();
    }
}
