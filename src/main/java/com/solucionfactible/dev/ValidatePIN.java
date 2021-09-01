package com.solucionfactible.dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 */
public class ValidatePIN {
	
	public static boolean isValid(String pin) {
	//convertimos el string en array 
char[] String_array =pin.toCharArray();
             
            //verificamos si el string comple con el tamaño
            if (String_array.length==4 || String_array.length==6){ 
            
            //recorremos el array char para verificar los datos de cada uno    
            for (char valor: String_array ){
                //verificamos si el valor es un numero , si no lo es retornamos false
                if (!Character.isDigit(valor)){
                 System.out.print("Este Caracter en este Pin no es valido: "+ valor+"\n"); 
                 return false;   
                }   
            }    
                
                
              System.out.print("Pin correcto \n"); 
                return true;
            }else{

                System.out.print("La longitud del String no es valida \n"); 
                return false;



            }



	}

}
