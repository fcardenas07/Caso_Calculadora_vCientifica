import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

    }
    public static double menuGeometria() {
        int eleccion;
        String texto = """
                1| Cuadrado perimetro
                2| Cuadrado area
                3| Rectangulo perimetro
                4| Rectangulo area
                5| Circulo perimetro
                6| Circulo area
                7| Esfera area
                8| Esfera volumen
                9| Cubo perimetro
                10| Cubo area
                11| Cubo volumen
                12| Cono area
                13| Cono volumen
                0| Salir""";
        System.out.println(texto);
        eleccion = validarEntero();
        double resp = 0;
        switch (eleccion) {
            case 0:
                System.out.println("salir");
                break;
            case 1:
                resp = (perimetroCuadrado(validarDouble("lado")));
                return resp;
            case 2:
                resp = (areaCuadrado(validarDouble("lado")));
                return resp;
            case 3:
                resp = (perimetroRectangulo(validarDouble("ancho"), validarDouble("largo")));
                return resp;
            case 4:
                resp = (areaRectangulo(validarDouble("ancho"), validarDouble("largo")));
                return resp;
            case 5:
                resp = (perimetroCirculo(validarDouble("radio")));
                return resp;
            case 6:
                resp = (areaCirculo(validarDouble("radio")));
                return resp;
            case 7:
                resp = (areaEsfera(validarDouble("radio")));
                return resp;
            case 8:
                resp = (volumenEsfera(validarDouble("radio")));
                return resp;
            case 9:
                resp = (perimetroCubo(validarDouble("radio")));
                return resp;
            case 10:
                resp = (areaCubo(validarDouble("radio")));
                return resp;
            case 11:
                resp = (volumenCubo(validarDouble("lados")));
                return resp;
            case 12:
                resp = (areaCono(validarDouble("generatriz"), validarDouble("radio")));
                return resp;
            case 13:
                resp = (volumenCono(validarDouble("radio"), validarDouble("altura")));
                return resp;
            default:
                System.out.println("ingrese opcion valida ");
                menuGeometria();
        }
        return resp;
    }
    public static int validarEntero() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        int num = -1;
        while (!valido) {
            System.out.print("Ingresa una opcion: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num >= 0) {
                    valido = true;
                } else {
                    System.out.println("El número debe ser mayor que cero");
                }
            } else {
                System.out.println("No es un número entero válido");
                sc.next();
            }
        }

        return num;
    }
    public static double validarDouble(String solicitud) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        double num = 0;
        while (!valido) {
            System.out.print("Ingresa un número para "+solicitud+" de la figura: ");
            if (sc.hasNextDouble()) {
                num = sc.nextDouble();
                if (num > 0) {
                    valido = true;
                } else {
                    System.out.println("Debe ser mayor que cero");
                }
            } else {
                System.out.println("No es un número decimal válido");
                sc.next();
            }
        }
        return num;
    }
    public static double volumenCono(double radio, double altura) {
        return (Math.PI * Math.pow(radio, 2) * altura);
    }
    public static double areaCono(double generatriz, double radio) {
        return (Math.PI * Math.pow(radio, 2)) + (Math.PI * radio * generatriz);
    }
    public static double volumenCubo(double lado) {
        return Math.pow(lado, 3);
    }
    public static double areaCubo(double lado) {
        return 6 * areaCuadrado(lado);
    }
    public static double perimetroCubo(double lado) {
        return perimetroCuadrado(lado) * 3;
    }
    public static double volumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
    public static double areaEsfera(double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    public static double perimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
    public static double perimetroCuadrado(double lado) {
        return lado * 4;
    }
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }
    public static double perimetroRectangulo(double ancho, double largo) {
        return (2 * largo) + (2 * ancho);
    }
    public static double areaRectangulo(double ancho, double largo) {
        return largo * ancho;
    }
}
