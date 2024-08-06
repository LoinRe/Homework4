public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно подождать");
        }

        System.out.println("----------------");
        // Задание 2
        int temperature = 8;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("----------------");
        // Задание 3
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется платить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно");
        }

        System.out.println("----------------");
        // Задание 4
        int age1 = 27;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }

        System.out.println("----------------");
        // Задание 5
        int childAge = 9;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("----------------");
        // Задание 6
        int occupiedSeats = 50;
        if (occupiedSeats < 102 && occupiedSeats < 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (occupiedSeats < 102 && occupiedSeats >= 60) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("Вагон уже забит");
        }

        System.out.println("----------------");
        // Задание 7
        int one = 50;
        int two = 60;
        int three = 30;
        if (one > two & one > three) {
            System.out.println(one + " - большее число");
        } else if (two > one & two > three) {
            System.out.println(two + " - большее число");
        } else {
            System.out.println(three + " - большее число");
        }
    }
}