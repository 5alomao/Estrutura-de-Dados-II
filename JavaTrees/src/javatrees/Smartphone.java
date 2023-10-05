package javatrees;

public class Smartphone implements Comparable<Smartphone>{
    private String brandName;
    private String model;
    private int rating;
//    private double processorSpeed;

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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
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
