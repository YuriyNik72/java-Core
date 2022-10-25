/*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
2. Создать переменные всех пройденных типов данных и инициализировать их значения.
3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
   где a, b, c, d – аргументы этого метода, имеющие тип float.
4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
   если да – вернуть true, в противном случае – false.
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли
   число передали или отрицательное. Замечание: ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное,
   и вернуть false если положительное.
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение
   «Привет, указанное_имя!».
8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным,
   кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

public class Main {
    public static void main(String[] args) {
    //Задание 2
        byte a1=120; // целое число от -128 до 127
        short b1=11457; // целое число от -32768 до 32767
        int  c1=2000000; // целое число
        long d1=1234567890L; // целое число
        float e1=3.14f; // число с плавающей точкой
        double f1=12.3; // число с плавающей точкой
        char g1='o'; // один символ
        boolean  h=true; // false

        System.out.println("Ответ на задание 3 =" + isFloat(2.5f,3.9f,6.8f,0.5f));

        System.out.println("Ответ на задание 4 = " + chek(5,10));

        whole(6);

        System.out.println("Ответ на задание 6 = " + whole1(6));

        methodString("Юрий");

        Year(2020);

    }

    // Задание 3
    private static float isFloat(float a, float b, float c, float d) {
        float foo = a * (b + (c / d));
        return foo;
    }

    //Задание4
    private static boolean chek(int a,int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 5
    public static void whole(int a) {
        a = 6;
        if (a >= 0) {
            System.out.println("Ответ на задание 5 -Число положительное");
        } else {
            System.out.println("Ответ на задание 5 -Число отрицательное");
        }
    }

    // Задание 6
    public static boolean whole1(int a) {
        a = 6;
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }
    // Задание 7
    public static void methodString(String name) {
        String text = "Юрий!";
        System.out.println("Привет " + name + "!");
    }

    public static void Year(int year) {
        year=2020;
        if (year % 100 == 0 && year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год не високосный");
        } else
            System.out.println(year + " год високосный");
    }
}