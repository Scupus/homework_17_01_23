public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String bodyColor, int maxSpeed) {
        super(brand, model, year, country, bodyColor, maxSpeed);
    }

    @Override
    public String toString() {
        return "Марка автобуса:" + getBrand() + ", модель:" + getModel() + ", год выпуска:" + getYear() +
        ", страна производитель:" + getCountry() + ", цвет кузова:" + getBodyColor() + ", максимальная скорость:"
                + getMaxSpeed() + "/";
    }
}
