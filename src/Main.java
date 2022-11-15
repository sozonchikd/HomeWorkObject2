public class Main {
    public static void main(String[] args) {
        Automobile car1 = new Automobile("Lada", "Granta", 1.7f, "желтый", 2015, "Россия");
        Automobile car2 = new Automobile("Audi", "A8 50 L TDI quattro", 3.0f, "чёреый", 2020, "Германия");
        Automobile car3 = new Automobile("BMW", "Z8", 3.0f, "чёрный", 2021, "Германия");
        Automobile car4 = new Automobile("Kia", "Sportage", 2.4f, "красный", 2018, "Южная Корея");
        Automobile car5 = new Automobile("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");
        System.out.println(car1);
    }
}