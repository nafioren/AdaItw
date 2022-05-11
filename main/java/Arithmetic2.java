public class Arithmetic2 {

    public void subtraction(Result x, double a, double b) {
        x.setResultSubstraction(a - b);
    }

    public void multiplication(Result x, double a, double b) {
        x.setMultiplication(a * b);
    }

    public void division(Result x, double a, double b) {
        x.setDivision(a / b);
    }

    // sum y Overloading de sum
    public void sum(Result x, double a, double b) {
        double suma = a + b;
        x.setResultSum(suma);
    }

    public void sum(Result x, Double a, double b) {
        double suma = a + b;
        x.setResultSum(suma);
    }

    public void sum(Result x, double a, Double b) {
        double suma = a + b;
        x.setResultSum(suma);
    }

    public void sum(Result x, Double a, Double b) {
        double suma = a + b;
        x.setResultSum(suma);
    }
}