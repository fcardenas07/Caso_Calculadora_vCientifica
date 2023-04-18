import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double[][] nros = solicitarNumeros();
        System.out.println(calcularEcuacionRecta(nros[0],nros[1]));
    }

    public static double[] ingresarNumeros(){
        Scanner sc = new Scanner(System.in);
        double x = 0, y = 0;
        try {
            System.out.println("Ingresa la coordenada X del punto:");
            x = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingresa la coordenada Y del punto:");
            y = sc.nextDouble();
            sc.nextLine();
        }catch (InputMismatchException ime) {
            System.out.println("La entrada no es un número.");
            ingresarNumeros();
        }
        return new double[]{x,y};
    }
    public static double[][] solicitarNumeros(){
         double[] n1 = ingresarNumeros();
         double[] n2 = ingresarNumeros();
        return new double[][]{n1,n2};
    }

    public static String calcularEcuacionRecta(double[] x1, double[] x2) {
        if(x1[0]==x2[0]){
            return "Puntos inválidos.";
        }
        double m = (x1[1] - x2[1]) / (x1[0] - x2[0]);
        if(m!=0) {
            return "y = " + m + "x + " + (x1[1] - m * x1[0]);
        }else{
            return "y = "+x1[1];
        }
    }


}
