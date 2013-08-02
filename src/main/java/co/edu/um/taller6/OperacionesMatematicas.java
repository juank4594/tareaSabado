package co.edu.um.taller6;

/**
 Esta clase permite realizar unas operaciones básicas de la matemática
 */
public class OperacionesMatematicas {


    /**
     * Este método realiza la adición de dos números enteros
     * @param valor1 Primer parámetro de tipo entero
     * @param valor2 Segundo parámetro de tipo entero
     * @return la suma de los dos parámetros
     */
    public int suma(int valor1, int valor2){
        return valor1+valor2;
    }
    public int resta(int valor1, int valor2){
        return valor1-valor2;
    }public int multiplicacion(int valor1, int valor2){
        return valor1*valor2;
    }public double division(int valor1, int valor2) throws ArithmeticException{
        if(valor2==0){
            throw new ArithmeticException();
        }
        return valor1/valor2;

    }

}
