public class Calculadora {
    public static void main(String[] args) {
    }

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static int mayor(int numero1, int numero2) {
        return Math.max(numero1, numero2);
    }

    public static int menor(int numero1, int numero2) {
        return Math.min(numero1, numero2);
    }

    public static double elevarNumero(double numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }

    public static double porcentaje(double numero, double porcentaje) {
        return (porcentaje * numero) / 100;
    }

    public static String calcularEcuacionRecta(double[] x1, double[] x2) {
        double m = (x1[1] - x2[1]) / (x1[0] - x2[0]);
        if (m != 0) {
            return "y = " + m + "x + " + (x1[1] - m * x1[0]);
        } else {
            return "y = " + x1[1];
        }
    }
}
