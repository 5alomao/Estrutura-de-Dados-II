package javatrees;

public class Smartphone implements Comparable<Smartphone>{
    private String brandName;
    private String model;
    private int rating;
//    private double processorSpeed;

    public Smartphone(String brandName, String model, int rating) {
        this.brandName = brandName;
        this.model = model;
        this.rating = rating;
    }
    
    @Override
    public int compareTo(Smartphone anotherSmartphone) {
        return Integer.compare(rating,anotherSmartphone.rating);
    }
    
    @Override
    public String toString() {
        return "Rating["+this.rating+"], Marca:"+brandName+", Modelo:"+model;
    }
}
