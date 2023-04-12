import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void DosMasDosEsCuatro() {
        assertEquals(4, Calculadora.sumar(2, 2));
    }

    @Test
    void ceroMasCeroEsCero() {
        assertEquals(0, Calculadora.sumar(0, 0));
    }

    @Test
    void intMasChicoMasIntMasGrandeEsMenosUno() {
        assertEquals(-1, Calculadora.sumar(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void sumaDeDosNegativosDaNegativo() {
        assertEquals(-2, Calculadora.sumar(-1, -1));
    }

    @Test
    void dosMenosUnoEsUno() {
        assertEquals(1, Calculadora.restar(2, 1));
    }

    @Test
    void ceroMenosCeroEsCero() {
        assertEquals(0, Calculadora.restar(0, 0));
    }

    @Test
    void negativoPorPositivoDaNegativo() {
        assertEquals(-1, Calculadora.multiplicar(-1, 1));
    }

    @Test
    void cualquierNumeroPorCeroEsCero() {
        assertEquals(0, Calculadora.multiplicar(Integer.MAX_VALUE, 0));
    }

    @Test
    void UnoDivididoEnDosEsUnMedio() {
        assertEquals(0.5, Calculadora.dividir(1, 2));
    }

    @Test
    void ceroDivididoPorCualquierNumeroEsCero() {
        assertEquals(0.0, Calculadora.dividir(0, 1));
    }

    @Test
    void UnoEsMayorQueCero() {
        assertEquals(1, Calculadora.mayor(1, 0));
    }

    @Test
    void mayorEntreDosNumerosRetornaElMismoNumero() {
        assertEquals(0, Calculadora.mayor(0, 0));
    }

    @Test
    void numeroPositivoEsMayorANumeroNegativo() {
        assertEquals(1, Calculadora.mayor(-1, 1));
    }

    @Test
    void NumeroNegativoEsMenorQueNumeroPositivo() {
        assertEquals(-1, Calculadora.menor(1, -1));
    }

    @Test
    void dosNumerosIgualRetornaElMismoNumero() {
        assertEquals(0, Calculadora.menor(0, 0));
    }

    @Test
    void elevarNumero() {
    }

    @Test
    void porcentaje() {
    }
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