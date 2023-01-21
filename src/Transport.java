public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String bodyColor;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String bodyColor, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.bodyColor = bodyColor;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = (bodyColor != null && bodyColor.isEmpty() != true && bodyColor.isBlank() != true) ? bodyColor : "Зеленый";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = (maxSpeed >= 60 && maxSpeed <= 330) ? maxSpeed : 180;
    }



    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}
