public class Employe {
    //это поля класса Employee
    public String fio;
    public String position;
    public String email;
    public int numberTelefone;
    public int pay;
    public int age;

    //это конструктор
    public Employe(String fio,String position,String email,int numberTelefone, int pay,int age) {
        this.fio=fio;
        this.position=position;
        this.email=email;
        this.numberTelefone=numberTelefone;
        this.pay=pay;
        this.age=age;
    }
    @Override
    public String toString(){
        return String.format("ФИО: %s \t Должность: %s \n email: %s \t Номер телефона: %d \n Зарплата: %d \t Возраст: %d \n",fio,position,email,numberTelefone,pay,age);
    }
    //метод вывода в консоль
    public void show (){
        System.out.println(this);
    }
}
