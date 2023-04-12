package assignment5.prob5;

import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor,
                    int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;

    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public double computePower() {
        return ramSize * processorSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Computer)) {
            return false;
        }
        Computer c = (Computer) obj;
        boolean isEquals = this.manufacturer.equals(c.manufacturer) && this.getRamSize() == c.ramSize;
        return isEquals;
    }

    @Override
    public int hashCode() {
        return (int) ((int)manufacturer.hashCode()+processor.hashCode()+ramSize+processorSpeed)*17;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + this.manufacturer + " Processor: " + this.processor + " Ram Size: " + getRamSize() + " Processor Speed: " + getProcessorSpeed();
    }
}
