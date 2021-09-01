package com.solucionfactible.dev;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {
	
	public static int[] diff(int[] a, int[] b) {
		
//arreglo que se retornará 
int [] ARREGLO_TEMPORAL = new int [a.length];
//declaramos una variable que nos dira cuantos elementos se eliminaron
int numeros_eliminados=0;


//si el arreglo de B esta vacio, retornamos el array A
if (b.length==0){
return a;
}

//si el arreglo de a esta vacio, retornamos el array A
if (a.length==0){
return a;
}


    //validamos si ambos arreglos no vienen vacios
    if (a != null && b!=null){
        //creamos el indice para el arreglo que se retornará
        int IND=0;
        //creamos una variable temporal
        int temp=0;
        //creamos una variable que nos dira si el elemento existe
        boolean validador= false;
        
                    //recorremos el arreglo (A) para ver el número que tiene cada posición
                    //y buscar el valor dentro del arreglo B
                    for(int i=0 ; i<=a.length-1; i++){

                            //recorremos el arreglo B para verificar si el resultado existe           
                            for(int x=0 ; x<=b.length-1; x++){
                                   //validamos si el elemento actual del arreglo b es igual al elemento buscado de (A)
                                  if (a[i]==b[x]){ 
                                   //el validador se activa, los elementos coinciden
                                   validador=true;
                                   numeros_eliminados++;
                                   break;
                                  }
                                  //validamos si es el ultimo elemento en revisión y el validador se quedo en false
                                  //se registra el nuevo numero
                                  if (x==b.length-1 && validador==false){
                                      //guardamos el número a guardar en la variable
                                   int elemento_guardar=a[i];   
                                   //System.out.println("DATO A GUARDAR -> "+elemento_guardar+"\n");
                                   //guardamos el numero en el arreglo temporal
                                    ARREGLO_TEMPORAL[IND]=elemento_guardar; 
                                    IND++;
                                  }
                                  
                            } 
                            validador=false;
                    }
                    
//ARREGLO_RETORNO LIMPIAMOS EL ARRAY
//declaramos el arreglo que se retornará con el tamaño exacto de los elementos en el arreglo temporal
int [] ARREGLO_RETORNO = new int [ARREGLO_TEMPORAL.length-numeros_eliminados];
                    for (int s=0; s<ARREGLO_TEMPORAL.length-1; s++){
                       //verificamos que el campo no este en 0 y asi agregamos un elemento nuevo a el array que se retornará
                        if (ARREGLO_TEMPORAL[s]!=0){                        
                           ARREGLO_RETORNO[s]=ARREGLO_TEMPORAL[s];
                           //System.out.println(ARREGLO_TEMPORAL[s]+"\n");
                       }
                    }
                    
                   return ARREGLO_RETORNO;
                    
    }else{    
    System.out.println("Uno de los 2 arreglos estan vacios");
     return ARREGLO_TEMPORAL;
    }            
            
   
	}

}
