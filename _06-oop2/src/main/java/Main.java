//1. Создать классы Собака и Кот с наследованием от класса Животное.

//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

public class Main {

    public static void main(String[] args) {
        Animals cat1=new Cat("Murzik");
        cat1.runAnimal(300);
        cat1.swimAnimal(2);
        Animals cat2=new Cat("Pushok");
        cat2.runAnimal(150);
        cat2.swimAnimal(5);
        Animals cat3=new Cat("Sonya");
        cat3.runAnimal(100);
        cat3.swimAnimal(10);
        Animals cat4=new Cat("Lyusya");
        cat4.runAnimal(200);
        cat4.swimAnimal(5);
        Animals dog1=new Dog("Sharik");
        dog1.runAnimal(700);
        dog1.swimAnimal(5);
        Animals dog2=new Dog("Tuzik");
        dog2.runAnimal(500);
        dog2.swimAnimal(7);
        Animals dog3=new Dog("Marysya");
        dog3.runAnimal(400);
        dog3.swimAnimal(10);
        Animals dog4=new Dog("Funtik");
        dog4.runAnimal(350);
        dog4.swimAnimal(-1);


        System.out.println("\nБыло создано: "+Animals.getCount()+" животных.");
        System.out.println("Кошек: "+Cat.getCount()+" шт.");
        System.out.println("Собак: "+Dog.getCount()+" шт.");
    }
}
