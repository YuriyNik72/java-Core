public class Cat extends Animals{

   private static int count=0;

   public Cat(String name){
       super(name,200,-1);
       count++;
   }
   public static int getCount(){
       return count;
   }
    @Override
    public void swimAnimal(int lenght){
        System.out.println(name + " не умеет плавать. ");
      }

}
