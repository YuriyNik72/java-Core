public class Animals {

    static String name;
    int run;
    int swim;
    private static int count=0;
    public Animals(String name, int run, int swim){
        this.name=name;
        this.run=run;
        this.swim=swim;
        count++;
    }

    public String getName(){
        return name;
    }
    public static int getCount(){
        return count;
    }


      public void swimAnimal(int lenght) {
        if (lenght <= swim && lenght > 0) {
              System.out.println(name + " проплыл(а) " + swim + " м.");
          } else {
              System.out.println("Для животного--> " + name + ", неправильно определена дистанция");
          }
      }
        public void runAnimal(int lenght) {
            if(lenght<=run && lenght>0) {
                System.out.println(name + " пробежал(а) " + lenght + " м.");
            }else {
                System.out.println("Для животного--> "+ name + ", неправильно определена дистанция");
            }
        }

}
