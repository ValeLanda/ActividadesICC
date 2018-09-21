/**
 * Calculadora.java
 * <br>Clase que implementa las operaciones basicas 
 * de dos enteros.
 * @author Valeria Garcia Landa
 * @version Sept 2018
 */

public class Calculadora{

    //atributos de la clase
    private int num;
   
    /**
     * Constructor por omision, es decir, sin parametros
     * <br> Contructor que pertmite definir un numero entero valido
     */
    public Calculadora(){
	this.num= 0;
    }
    /**
     * Construtor con parametros, es decir, recibe nuevos parametros
     * <br> Permite definir un numero entero a partir de un par de enteros
     * @param int num1 
     * @param int num2
     */
    public Calculadora(int num){
	this.num = num;
    }

    /**
     * Metodo que regresa el valor de num1
     * @return el valor de la variable num1
     */
    public int get(){
	return this.num;
    }

    /**
     * Metodo que cambia el valor de num1
     * @param int parametro de tipo entero
     */
    public void set(int n){
	this.num = n;
    }
	
    /**
     * Metodo que suma dos enteros y regresa la suma de ellos
     * @param n el numero a sumar 
     * @return suma la suma de los dos enteros
     */
    public int suma(int n){
	return (num+n);
    }

    /**
     * Metodo que resta dos enteros y regresa la resta de ellos
     * @param n el numero a restar 
     * @return resta la resta de los dos enteros
     */
    public int resta(int n){
	return (num-n);
    }

    /**
     * Metodo que multiplica dos enteros y regresa la multiplicacion 
     * de ellos
     * @param n el numero a multiplicar
     * @return multiplica la multiplicacion de los dos enteros
     */
    public int multiplica(int n){
	return (n*num);
    }

    /**
     * Metodo que compara dos enteros y regresa true si son iguales
     * @return boolean true si son iguales, false en caso contrario
     */
    public boolean sonIguales(int n){
	if(this.num == n)
	    return true;
	return false;
    }
}
    

    


    


    

