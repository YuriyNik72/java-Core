public class Main {
    public static void main(String[] args){
        Employe[]persArrey=new Employe[5];
        persArrey[0]=new Employe("Ivanov Ivan Ivanovich","Driver","ivanov@mail.ru",891010100,30000,30);
        persArrey[1]=new Employe("Petrov Petr Petrovich","Programmer","petrov@mail.ru",892134567,35000,31);
        persArrey[2]=new Employe("Sidorov Pavel Vladimirovich","Mechanic","sidorov@mail.ru",891113579,32000,40);
        persArrey[3]=new Employe("Malkin Andreyi Viktorovich","Electrician","malkin@mail.ru",892264238,40000,39);
        persArrey[4]=new Employe("Koshkin Konstantin Petrovich","Loader","koshkin@mail.ru",891246579,50000,45);

        //проверка на возраст

        for(int i=0;i<persArrey.length;i++){
            if (persArrey[i].age>=40){
                //вывод на печать
                persArrey[i].show();
            }
        }

    }
}
