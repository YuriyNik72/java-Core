public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    int diff;

    boolean decreaseFood(int n) { //проверка на заполненность тарелки
        diff = food - n;
        if (diff < 0) {
            return false;
        }
        food -= n;
        return true;
    }


    void addFood(int adfood) {
        if (diff < 0) {
            food += adfood;
        }
    }

    //информация о тарелке

    public void info() {
        if (diff < 0) {
            System.out.println("Plate: " + diff+ " Добавим корма");
        } else {
            System.out.println("plate: " + food);
        }
    }
}



