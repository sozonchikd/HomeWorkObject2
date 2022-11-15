public class Automobile {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    public Automobile(String brand, String model, float engineVolume, String color, int year, String country) {
        if (brand == "" || brand == null) {
            brand = "default";
        }
        this.brand = brand;
        if (model == "" || model == null) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5f;
        }
        this.engineVolume = engineVolume;
        if (color == "" || color == null) {
            color = "белый";
        }
        this.color = color;
        if (year < 0) {
            year = 2000;
        }
        this.year = year;
        if (country == "" || country == null) {
            country = "default";
        }
        this.country = country;
    }

    @Override
    public String toString() {
        return "Автомобиль - " +
                "Марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", обьём двигателя= " + engineVolume +
                ", цвет='" + color + '\'' +
                ", год производства=" + year +
                ", страна сборки ='" + country + '\'' +
                '.';
    }
}
