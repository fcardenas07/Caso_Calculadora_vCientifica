public class Calculadora {
    public static double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static double mayor(double numero1, double numero2) {
        return Math.max(numero1, numero2);
    }

    public static double menor(double numero1, double numero2) {
        return Math.min(numero1, numero2);
    }

    public static double elevarNumero(double numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }

    public static double porcentaje(double numero, double porcentaje) {
        return (porcentaje * numero) / 100;
    }
}
