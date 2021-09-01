package com.solucionfactible.dev;
import java.util.LinkedList;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {
	
	public static int persistence(long num) {
	 
                //creamos una variable donde se almacenara el resultado         
                int result = 0;
                
                //validamos que el número ingresado sea mayor a 9 para poder proceder a las multiplicaciones
                //en caso de que sea menor , se retorna el 0
                while (num > 9) {
                    
                    //declaramos la variable donde se almacenará la multiplicación
                    long multiplicacion = 1;
                    
                    //convertimos el numero en un string
                    String string_numeros = String.valueOf (num);
                    //convertirmos el string en un arreglo char 
                    char [] Numeros_divididos = string_numeros.toCharArray();
                                    
                                       //recorremos el array char y multiplicamos por cada numero dentro del arreglo char
                                     for (char x :Numeros_divididos) {
                                            //convertimos el valor del numero de string a long y asignamos los valores resultantes a la variable multiplicacion
                                             multiplicacion *= Long.parseLong(String.valueOf(x));
                                            //System.out.println("RESULTADO-MULTI:"+multiplicacion);

                                     }
                    //guardamos el resultado de las multiplicaciones en num nuevamente y si es necesario, se repite el proceso
                    num = multiplicacion;
                    //guardamos cuantas veces se realizo el proceso   
                    result++;
                             }
                
                             System.out.println("VECES MULTIPLICADA:"+result);
                             return result;


            
	}

}
