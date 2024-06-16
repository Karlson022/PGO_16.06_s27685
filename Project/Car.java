package Project;

public class Car implements Comparable<Car> {

    protected int productionYear;
    protected String carName;

    public Car(int productionYear, String carName) {
        this.productionYear = productionYear;
        this.carName = carName;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(o.productionYear, this.productionYear);
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    
}
