import static org.junit.jupiter.api.Assertions.*;                // Устанавливаем библиотеку для тестирования

class CalculatorTest {
    @org.junit.jupiter.api.Test
    void addition() {
        Calculator calculator = new Calculator();
        int actual = calculator.addition(100,50);
        int expected = 150;
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void subtraction() {
        Calculator calculator = new Calculator();
        int actual = calculator.subtraction(5800,3800);
        int expected = 2000;
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void multiplication() {
        Calculator calculator = new Calculator();
        int actual = calculator.multiplication(250,4);
        int expected = 1000;
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void division() {
        Calculator calculator = new Calculator();
        int actual = calculator.division(250,5);
        int expected = 50;
        assertEquals(expected,actual);
    }
}