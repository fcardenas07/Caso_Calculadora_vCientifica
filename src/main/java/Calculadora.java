public class Calculadora {
    public static void main(String[] args) {
        System.out.println(Calculadora.elevarNumero(0, 0));
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
}
