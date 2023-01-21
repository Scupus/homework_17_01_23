import java.util.Objects;

public class Car extends Transport{
    private float engineVolume;
    private String typeOfGear;
    private final String typeOfBodywork;
    private String registrationNumber;

    public Car(String brand, String model, int year, String country, String bodyColor, int maxSpeed, float engineVolume, String typeOfGear, String typeOfBodywork, String registrationNumber) {
        super(brand, model, year, country, bodyColor, maxSpeed);
        this.engineVolume = engineVolume;
        this.typeOfGear = typeOfGear;
        this.typeOfBodywork = typeOfBodywork;
        this.registrationNumber = registrationNumber;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTypeOfGear() {
        return typeOfGear;
    }

    public void setTypeOfGear(String typeOfGear) {
        this.typeOfGear = typeOfGear;
    }

    public String getTypeOfBodywork() {
        return typeOfBodywork;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public  String toString() {
        return "Марка авто:" + getBrand() + ", модель:" + getModel() + ", год выпуска:" + getYear() +
                ", страна производитель:" + getCountry() + ", цвет кузова:" + getBodyColor() + ", максимальная скорость:"
                + getMaxSpeed() + ", объем двигателя:" + this.engineVolume + ", тип коробки:" + this.typeOfGear +
                ", тип кузова:" + this.typeOfBodywork + ", регитрационный номер:" + this.registrationNumber + "/";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && typeOfGear.equals(car.typeOfGear) && typeOfBodywork.equals(car.typeOfBodywork) && registrationNumber.equals(car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume, typeOfGear, typeOfBodywork, registrationNumber);
    }
}
