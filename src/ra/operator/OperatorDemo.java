package ra.operator;

public class OperatorDemo {
    public static void main(String[] args) {
        //Toán tử toán học ++ và --
        int number1 = 10;
        int number2 = 10;
        int number3 = number1++;//number3=10
        //B1: number3 = number1 --> number3=10
        //B2: number1++ --> number1=11
        int number4 = ++number2;//number4=11
        //B1: ++number2 --> number2=11
        //B2: number4=number2 --> number4=11
    }
}
