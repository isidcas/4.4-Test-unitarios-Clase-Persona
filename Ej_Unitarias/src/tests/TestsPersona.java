package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ejerciciosUnitarias.Persona;

class TestsPersona {

    private Persona persona1;
    private Persona persona2;
    private Persona persona3;

    @BeforeEach
    void setUp() {
        persona1 = new Persona("Isma", 18, 'H', 70, 1.75);
        persona2 = new Persona("Ana", 15, 'M', 55, 1.60);
        persona3 = new Persona("Pepe", 33, 'X', 85, 1.80);
    }

    @Test
    void testComprobarSexo() {
        assertEquals('H', persona1.getSexo());
        assertEquals('M', persona2.getSexo());
        assertEquals('H', persona3.getSexo()); 
    }

    @Test
    void testCalcularIMC() {
        assertEquals(Persona.PESO_IDEAL, persona1.calcularIMC());
        assertEquals(Persona.PESO_IDEAL, persona2.calcularIMC());
        assertEquals(Persona.SOBREPESO, persona3.calcularIMC());
    }

    @Test
    void testEsMayorDeEdad() {
        assertTrue(persona1.esMayorDeEdad());
        assertFalse(persona2.esMayorDeEdad());
        assertTrue(persona3.esMayorDeEdad());
    }

    @Test
    void testToString() {
        String caso1 = "Informacion de la persona:\n" +
                "Nombre: Isma\n" +
                "Sexo: hombre\n" +
                "Edad: 18 años\n" +
                "DNI: " + persona1.getDNI() + "\n" +
                "Peso: 70.0 kg\n" +
                "Altura: 1.75 metros\n";
        assertEquals(caso1, persona1.toString());
    }
}
