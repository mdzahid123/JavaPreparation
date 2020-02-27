package BeginnerJava;

public class Calculator {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add();
    }

    public void add() {

        int x= 2;
        int y = 3;
        int result = x +y;
        System.out.println( result);
    }
}