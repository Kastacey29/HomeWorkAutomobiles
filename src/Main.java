//Lada Grande, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя - 1,7
//        Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя 3.0 литра
//        BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем – 3.0
//        Kia Sportage 4 поколение, 2018 год выпуска, сборка в Южной Корее, цвет кузова красный, объем двигателя – 2,4 литра.
//        Hyundai Avante, сборка в Южной Корее, цвет кузова оранжевый, объем двигателя - 1,6 литра, год выпуска - 2016 год.
public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", 1.7, "yellow", 2015, "Russia");
        Car audi = new Car("Audi", "A8_50_L_TDI_quattro", 3.0, "black",
                2020, "Germany");
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Car kia = new Car("Kia", "Sportage", 2.4, "red", 2018, "SouthKorea");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016,
                "SouthKorea");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}