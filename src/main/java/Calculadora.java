public class Calculadora {
    public static void main(String[] args) {
    }

    public static String calcularEcuacionRecta(double[] x1, double[] x2) {
        double m = (x1[1] - x2[1]) / (x1[0] - x2[0]);
        if(m!=0) {
            return "y = " + m + "x + " + (x1[1] - m * x1[0]);
        }else{
            return "y = "+x1[1];
        }
    }


}
