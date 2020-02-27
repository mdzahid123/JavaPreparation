package BeginnerJava;

public class Test {

        // int , double , char , string , array,

        public static void main(String[] argument) {
            System.out.println("Md. Ahsan Jahid");//1
            printName();//2

            int resultOfSubstruction= substruct();
            addition();
            System.out.println(resultOfSubstruction);//3
            int number1=10;
            double  number2=15;


            double result=number1*number2;

            System.out.println(result);//4
        }

        public  static  void printName(){

            System.out.println("Nurul Ferdous Sunny");
        }

        public static void addition(){
            double number1=10.5;
            double  number2=15;

            double result=number1+number2;

            System.out.println(result);
        }

        public static int substruct(){

            byte number1 = 5;
            byte number2 = 9;

            int result = number2 - number1;
            return result;//4
        }

    }