public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Тойота", "Супра", 2012, "Япония", "Красный", 160,
                1.6f, "Автомат", "Купе", "шл234х");
        Car car2 = new Car("Митсубиши", "GTO", 2004, "Япония", "Зеленый", 240,
                3.0f, "Автомат", "Джип", "шл008х");
        Car car3 = new Car("Лексус", "М600", 2018, "Япония", "Белый", 200,
                3.5f, "Механика", "Купе", "шл9654х");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        Bus bus1 = new Bus("Икарус", "V660", 1968, "Венгрия", "Оранжевый", 80);
        Bus bus2 = new Bus("Дэу", "W380", 2005, "Ю.Корея", "Зеленый", 70);
        Bus bus3 = new Bus("Камаз", "Т80", 2018, "Россия", "Белый", 100);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }

}
