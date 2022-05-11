public class App {
    public static void main(String[] args) {

        Result resultados = new Result();
        Arithmetic2 cuentas = new Arithmetic2();

        double num1 = 27.4;
        double num2 = 22.9;


        cuentas.sum(resultados, num1, num2);
        System.out.println("Suma = " + resultados.getResultSum());

        cuentas.subtraction(resultados, num1, num2);
        System.out.println("Resta = " + resultados.getResultSubstraction());

        cuentas.multiplication(resultados, num1, num2);
        System.out.println("Multiplicación = " + resultados.getMultiplication());

        cuentas.division(resultados, num1, num2);
        System.out.println("División = " + resultados.getDivision());
    }
}