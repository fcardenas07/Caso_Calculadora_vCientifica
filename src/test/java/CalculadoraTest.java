import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void calcularEcuacionRectaTest() {
        double[] x1 = {3, 2};
        double[] x2 = {2, 1};
        assertEquals("y = 1.0x + -1.0", Calculadora.calcularEcuacionRecta(x1, x2));
    }

    @Test
    void calcularEcuacionRectaPendienteCero() {
        double[] x1 = {2, 5};
        double[] x2 = {5, 5};
        assertEquals("y = 5.0", Calculadora.calcularEcuacionRecta(x1,x2));
    }

}