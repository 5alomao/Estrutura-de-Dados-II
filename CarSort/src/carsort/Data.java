package carsort;

public class Data implements Comparable<Data> {

    private String name, origin;
    private int modelYear, weigth, horsePower;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public int compareTo(Data o) {
        return this.getName().compareTo(o.getName());
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) 
            return true;
        if(o ==null || getClass() != o.getClass())
            return false;
        Data d = (Data) o;
        return name.equals(d.name);
   }

}
