import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculadoraTest {

    @Test
    void perimetroCuadrado() {
        double esperado = 8.0;
        double resultado = Calculadora.perimetroCuadrado(2);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void areaCuadrado() {
        double esperado = 25.0;
        double resultado = Calculadora.areaCuadrado(5);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void perimetroRectangulo() {
        double esperado = 10.0;
        double resultado = Calculadora.perimetroRectangulo(2.0, 3.0);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void areaRectangulo() {
        double esperado = 20.0;
        double resultado = Calculadora.areaRectangulo(2,10);
        Assertions.assertEquals(esperado,resultado);
    }
}