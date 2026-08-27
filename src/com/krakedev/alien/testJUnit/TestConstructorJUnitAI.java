package com.krakedev.alien.testJUnit;

import org.junit.jupiter.api.Test;

import com.krakedev.alien.Alien;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para el constructor Alien(int tamanio, String color).
 * Nombre requerido: TestConstructorJUnitAI
 */
public class TestConstructorJUnitAI {

    private static final double DELTA = 1e-6;

    /**
     * Valida que cuando se pasa un tamaño dentro del rango [5,30]
     * se asigne exactamente ese tamaño y se calculen correctamente los precios.
     */
    @Test
    void testTamanioDentroRangoCalculaPreciosCorrectamente() {
        // tamaño dentro del rango permitido
        Alien a = new Alien(10, "verde");

        // verifica tamaño asignado (debe ser el mismo que se pasó)
        assertEquals(10, a.getTamanio(), "El tamaño debe conservarse cuando está en el rango [5,30]");

        // verifica color asignado
        assertEquals("verde", a.getColor(), "El color debe asignarse tal cual");

        // verifica precios con tolerancia para double
        // precioCuerpo = tamanio * 0.20 = 10 * 0.20 = 2.0
        assertEquals(10 * 0.20, a.getPrecioCuerpo(), DELTA, "Precio del cuerpo calculado incorrectamente");

        // precioExtremidad = tamanio * 0.10 = 1.0
        assertEquals(10 * 0.10, a.getPrecioExtremidad(), DELTA, "Precio de extremidad calculado incorrectamente");

        // precioOjo = tamanio * 0.05 = 0.5
        assertEquals(10 * 0.05, a.getPrecioOjo(), DELTA, "Precio de ojo calculado incorrectamente");

        // atributos numéricos no inicializados explícitamente deben ser 0
        assertEquals(0, a.getNumeroOjos(), "Número de ojos por defecto debe ser 0");
        assertEquals(0, a.getNumeroBrazos(), "Número de brazos por defecto debe ser 0");
        assertEquals(0, a.getNumeroPies(), "Número de pies por defecto debe ser 0");
    }

    /**
     * Valida que si se pasa un tamaño menor a 5, el constructor ajuste el tamaño a 5
     * y recalcula los precios en base a 5.
     */
    @Test
    void testTamanioMenorAlMinimoSeAjustaA5() {
        // tamaño menor al mínimo permitido
        Alien a = new Alien(2, "azul");

        // debe ajustarse a 5
        assertEquals(5, a.getTamanio(), "Si tamanio < 5, debe ajustarse a 5");

        // precios calculados con tamanio = 5
        assertEquals(5 * 0.20, a.getPrecioCuerpo(), DELTA, "Precio del cuerpo debe calcularse con tamaño ajustado a 5");
        assertEquals(5 * 0.10, a.getPrecioExtremidad(), DELTA, "Precio de extremidad debe calcularse con tamaño ajustado a 5");
        assertEquals(5 * 0.05, a.getPrecioOjo(), DELTA, "Precio de ojo debe calcularse con tamaño ajustado a 5");

        // color debe asignarse correctamente
        assertEquals("azul", a.getColor(), "El color debe asignarse tal cual");
    }

    /**
     * Valida que si se pasa un tamaño mayor a 30, el constructor ajuste el tamaño a 30
     * y recalcula los precios en base a 30.
     */
    @Test
    void testTamanioMayorAlMaximoSeAjustaA30() {
        // tamaño mayor al máximo permitido
        Alien a = new Alien(100, "rojo");

        // debe ajustarse a 30
        assertEquals(30, a.getTamanio(), "Si tamanio > 30, debe ajustarse a 30");

        // precios calculados con tamanio = 30
        assertEquals(30 * 0.20, a.getPrecioCuerpo(), DELTA, "Precio del cuerpo debe calcularse con tamaño ajustado a 30");
        assertEquals(30 * 0.10, a.getPrecioExtremidad(), DELTA, "Precio de extremidad debe calcularse con tamaño ajustado a 30");
        assertEquals(30 * 0.05, a.getPrecioOjo(), DELTA, "Precio de ojo debe calcularse con tamaño ajustado a 30");

        // color debe asignarse correctamente
        assertEquals("rojo", a.getColor(), "El color debe asignarse tal cual");
    }

    /**
     * Valida comportamiento en los límites exactos: 5 y 30.
     * Asegura que en los límites no haya ajuste y que los precios se calculen con esos valores.
     */
    @Test
    void testTamanioEnLimites5y30() {
        // límite inferior
        Alien aMin = new Alien(5, "negro");
        assertEquals(5, aMin.getTamanio(), "Tamaño 5 debe permanecer 5");
        assertEquals(5 * 0.20, aMin.getPrecioCuerpo(), DELTA, "Precio del cuerpo con tamaño 5 incorrecto");

        // límite superior
        Alien aMax = new Alien(30, "blanco");
        assertEquals(30, aMax.getTamanio(), "Tamaño 30 debe permanecer 30");
        assertEquals(30 * 0.10, aMax.getPrecioExtremidad(), DELTA, "Precio de extremidad con tamaño 30 incorrecto");
    }

    /**
     * Valida que el constructor solo use los parámetros proporcionados y no modifique
     * otros atributos inesperadamente (ej. color se mantiene, números por defecto en 0).
     */
    @Test
    void testColorYAtributosPorDefecto() {
        Alien a = new Alien(12, "morado");

        // color asignado
        assertEquals("morado", a.getColor(), "El color debe asignarse tal cual");

        // atributos numéricos no inicializados explícitamente deben ser 0
        assertEquals(0, a.getNumeroOjos(), "Número de ojos por defecto debe ser 0");
        assertEquals(0, a.getNumeroBrazos(), "Número de brazos por defecto debe ser 0");
        assertEquals(0, a.getNumeroPies(), "Número de pies por defecto debe ser 0");
    }
}