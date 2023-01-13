package web.model;

public class Car {
    private String carBrand;
    private String carCountry;
    private int carYear;

    public Car(String carBrand, String carCountry, int carYear) {
        this.carBrand = carBrand;
        this.carCountry = carCountry;
        this.carYear = carYear;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarCountry() {
        return carCountry;
    }

    public void setCarCountry(String carCountry) {
        this.carCountry = carCountry;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    @Override
    public String toString() {
        return carBrand + "  " + carCountry + "  " + carYear;
    }
}
