public class Cat {

    private String name;
    private int appetite;
    private boolean hungry;

    //конструктор

     public Cat(String name, int appetite){
        this.name=name;
        this.appetite=appetite;
        this.hungry=true;
    }
     void info(){
        String isHungry=!hungry?" Голоден ":" Поел ";
        System.out.println(name + ":"+isHungry);
    }
    //метод заставляющий кота кушать

      void eat (Plate p) {
          if (!hungry || !p.decreaseFood(appetite)) {
              hungry = false;
          }
      }

}
