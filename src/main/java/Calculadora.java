import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static double ingresarDouble() {
        Scanner teclado = new Scanner(System.in);
        try {
            return teclado.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("La entrada no es un número, vuelva a intentarlo");
            return ingresarDouble();
        }
    }

    public static double[][] solicitarNumeros() {
        double[] n1 = ingresarPunto();
        double[] n2 = ingresarPunto();
        return new double[][]{n1, n2};
    }

    private static double[] ingresarPunto() {
        System.out.println("Ingresa la coordenada X del punto:");
        double x = ingresarDouble();

        System.out.println("Ingresa la coordenada Y del punto:");
        double y = ingresarDouble();

        return new double[]{x, y};
    }

    public static double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("/ por cero: Indeterminado");
        }
        return dividendo / divisor;
    }

    public static double mayor(double numero1, double numero2) {
        return Math.max(numero1, numero2);
    }

    public static double menor(double numero1, double numero2) {
        return Math.min(numero1, numero2);
    }

    public static double elevarNumero(double numero, double potencia) {
        if (numero == 0 && potencia == 0) {
            throw new ArithmeticException("0 elevado a 0: Indeterminado");
        }
        return Math.pow(numero, potencia);
    }

    public static double porcentaje(double numero, double porcentaje) {
        return (porcentaje * numero) / 100;
    }

    public static String calcularEcuacionRecta(double[] punto1, double[] punto2) {
        if (punto1[0] == punto2[0]) {
            return "Puntos inválidos.";
        }
        double pendiente = (punto2[1] - punto1[1]) / (punto2[0] - punto1[0]);
        if (pendiente != 0) {
            return "y = " + pendiente + "x + " + (punto1[1] - pendiente * punto1[0]);
        } else {
            return "y = " + punto1[1];
        }
    }
}



