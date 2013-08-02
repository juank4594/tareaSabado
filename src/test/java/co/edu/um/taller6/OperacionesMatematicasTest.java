package co.edu.um.taller6;

import junit.framework.Assert;
import org.junit.Test;

/**
 *Realiza las pruebas unitarias para la clase operaciones matemáticas
 */
public class OperacionesMatematicasTest {
    @Test
    public void testSuma() throws Exception {
        OperacionesMatematicas op = new OperacionesMatematicas();

        Assert.assertNotNull(op);

        Assert.assertEquals(5, op.suma(3,2));
        Assert.assertEquals(-3,op.suma(-2,-1));
        Assert.assertEquals(0,op.suma(0,0));
    }

    @Test
    public void testResta() throws Exception {

        OperacionesMatematicas op = new OperacionesMatematicas();

        Assert.assertNotNull(op);

        Assert.assertEquals(1, op.resta(3,2));
        Assert.assertEquals(-1,op.resta(-2,-1));
        Assert.assertEquals(0,op.resta(0,0));

    }

    @Test
    public void testMultiplicacion() throws Exception {
        OperacionesMatematicas op = new OperacionesMatematicas();

        Assert.assertNotNull(op);

        Assert.assertEquals(6, op.multiplicacion(3,2));
        Assert.assertEquals(2,op.multiplicacion(-2,-1));
        op.multiplicacion(0,0);
    }

    @Test(expected=ArithmeticException.class)
    public void testDivision() {
        OperacionesMatematicas op = new OperacionesMatematicas();

        Assert.assertNotNull(op);
        Assert.assertEquals(2.0,op.division(0,0));
        Assert.assertEquals(2.0,op.division(-2,-1));
    }


}
