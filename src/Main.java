public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.print("100 + 50 = ");
        calculator.addition(100,50);
        System.out.print("5800 - 3800 = ");
        calculator.subtraction(5800,3800);
        System.out.print("250 * 4 = ");
        calculator.multiplication(250,4);
        System.out.print("250 / 5 = ");
        calculator.division(250,5);
    }
}