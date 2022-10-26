public class Main {

    public static void main(String [] args){
        Cat [] cats={new Cat("Barsik", 75),new Cat("Vaska",10)
                ,new Cat("Snegok",50), new Cat("Kuzy",25),
                new Cat("Kote",1)};
       // )}; //Кот и его аппетит
        Plate plate=new Plate(100); //количество еды в тарелке
        for(Cat cat:cats) {
            cat.eat(plate);
            cat.info();
            plate.info();
            plate.addFood(50);
        }

    }
}
