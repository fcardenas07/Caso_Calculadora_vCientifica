import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    }

    public static double[] ingresarNumeros() {
        Scanner sc = new Scanner(System.in);
        double x = 0, y = 0;
        try {
            System.out.println("Ingresa la coordenada X del punto:");
            x = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingresa la coordenada Y del punto:");
            y = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException ime) {
            System.out.println("La entrada no es un número.");
            ingresarNumeros();
        }
        return new double[]{x, y};
    }

    public static double[][] solicitarNumeros() {
        double[] n1 = ingresarNumeros();
        double[] n2 = ingresarNumeros();
        return new double[][]{n1, n2};
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

    public static String calcularEcuacionRecta(double[] x1, double[] x2) {
        if (x1[0] == x2[0]) {
            return "Puntos inválidos.";
        }
        double m = (x1[1] - x2[1]) / (x1[0] - x2[0]);
        if (m != 0) {
            return "y = " + m + "x + " + (x1[1] - m * x1[0]);
        } else {
            return "y = " + x1[1];
        }
    }
}



