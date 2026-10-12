//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int age = 26;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2.");
        int temperature = 15;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно одеть шапку");
        }
        System.out.println("Задача 3.");
        int speed = 80;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то водителю придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println("Задача 4.");
        int years = 5;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека " + years + " лет, то ему нужно ходить в детский сад");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека " + years + " лет, то ему нужно ходить в школу");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека " + years + " лет, то ему нужно ходить в университет");
        }
        if (years > 24) {
            System.out.println("Если возраст человека " + years + " лет, то ему нужно ходить на работу");
        }
        System.out.println("Задача 5.");
        int childAge = 9;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка " + childAge + " лет, то он не может кататься на аттракционе");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то он может кататься в сопровождении взрослого");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен" + childAge + " лет, то ему можно кататься без сопровождения взрослого");
        }
        System.out.println("Задача 6");
        int quantity = 100;
        if (quantity < 60) {
            System.out.println("Место сидячее");
        }
        if (quantity >= 60 && quantity < 102) {
            System.out.println("Место стоя");
        } else {
            System.out.println("Мест нет");
        }
        System.out.println("Задача 7.");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Переменная " + one + " наибольшее значение");
        }
        if (two > three && two > one) {
            System.out.println("Переменная " + two + " наибольшее значение");
        }
        if (three > two && three > one) {
            System.out.println("Переменная " + three + " наибольшее значение");
        }
    }
}
