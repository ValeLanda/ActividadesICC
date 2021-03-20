/**
 * PruebaCalculadora.java
 * <br>Clase que implementa el metodo main para probar la
 * clase de la calculadora
 * @version Sept 2018
 joshua Said montaño perez 
 */

public class PruebaCalculadora{
    public static void main(String[] args){
	Calculadora n = new Calculadora(5);
	Calculadora m = new Calculadora(7);
	Calculadora x = new Calculadora();
	int suma, resta, mult;
       

	System.out.println(n.get());
	System.out.println(m.get());
	System.out.println(x.get());

	//suma = n.suma(5);
	//System.out.println(suma);
	//forma elegante
	System.out.println(n.suma(4));
	System.out.println(m.resta(4));
	System.out.println(x.multiplica(4));

	System.out.println(n.sonIguales(5));
	System.out.println(m.sonIguales(5));

	
    }
}

