package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
	
	public static char findMissingLetter(char[] letters) {
//declaramos el arreglo del abecedario
 char[] array_letters = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};            
  
 //declaramos una variable donde se guarda la posicion de la primera letra y de la ultima
int primera_posicion=0;
int ultima_posicion=0;
//declaramos la variable donde se guardará la letra faltante
char letra_faltante=' ';
//declaramos el tamaño del arreglo enviado
int numero_letras=letters.length+1;
//char [] array_letras_rango = new char []{};
//obtenemos el valor de la primera y ultima letra 
 char primera_letra = Character.toLowerCase(letters[0]);
 char ultima_letra = Character.toLowerCase(letters[letters.length-1]);
 

 //recorremos el arreglo del abecedario para obtener las posiciones de la primera y segunda letra y asi hacer una lista de las letras que se encuentran 
 //dentro de ese rango
 for (int i=0; i<array_letters.length; i++){
   
     //guardamos la primera posicion
     if (array_letters[i]==primera_letra){
      primera_posicion=i;
     }
     //guardamos la segunda posicion
     if (array_letters[i]==ultima_letra){
      ultima_posicion=i;
     }     
     
     
 }
 
 //declaramos un contador de letras el cual nos indicará en que posicion nos encontramos checando las letras
 int contador_seleccion_letras=0;
 //recorremos el arreglo del abecedario desde la primera posicion que guardamos hasta la ultima
 for (int x=primera_posicion; x<array_letters.length; x++){
 
                //validamos  que estemos dentro del rango 
               if (x<=ultima_posicion){  
                   
                   //validamos si la letra en la posicion X es igual a la letra en la posicion del contador
                   if (array_letters[x]==Character.toLowerCase(letters[contador_seleccion_letras])){

            //System.out.println("letra encontrada: "+array_letters[x]);
                  contador_seleccion_letras++;
                   }else{    
                               //en caso de que la letra faltante aparezca, se almacena en una variable que retornará la letra faltante 
                               System.out.println("letra faltante :"+array_letters[x]);
                               letra_faltante=array_letters[x];
                               
                   }
                   
             }
 }
            
            return letra_faltante;
	}

}
