package javatrees;

public class Smartphone implements Comparable<Smartphone> {

    private String brandName;
    private String model;
    private double rating;
    private double ramCapacity;
    private String operationalSystem;

    public Smartphone() {
    }

    public Smartphone(String brandName, String model, double rating, double ram, String os) {
        this.brandName = brandName;
        this.model = model;
        this.rating = rating;
        this.ramCapacity = ram;
        this.operationalSystem = os;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(double ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public String getOperationalSystem() {
        return operationalSystem;
    }

    public void setOperationalSystem(String operationalSystem) {
        this.operationalSystem = operationalSystem;
    }

    @Override
    public int compareTo(Smartphone anotherSmartphone) {
        return Double.compare(rating, anotherSmartphone.rating);
    }

    @Override
    public String toString() {
        return this.brandName + "," + this.model + "," + this.operationalSystem + "," + this.rating + "," + this.ramCapacity;
    }
}
