package com.solucionfactible.dev;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
    
    //variable temporal donde se almacena el resultado de la multiplicación de los elementos recorridos del arreglo (a)
    int temp=0;
    //variable que validará que todos los elementos de (A) tengan su multiplo en (B)
    int VALIDADOR=0;
    
    //validamos si ambos arreglos no vienen vacios
    if (a != null && b!=null){
        
        //validamos que tengan el mismo tamaño los arreglos
            if (a.length==b.length){
                    //recorremos el arreglo (A) para ver el número que tiene cada posición, hacer el calculo correspondiente
                    //y buscar el resultado dentro del arreglo B
                    for(int i=0 ; i<=a.length-1; i++){
                       //guardamos la multiplicación en la variable temp   
                       temp=a[i]*a[i];   
                            //recorremos el arreglo B para verificar si el resultado existe           
                            for(int x=0 ; x<=b.length-1; x++){
                                   //validamos si el elemento actual del arreglo b es igual al resultado de la multiplicación del elemento (a) por si mismo   
                                    if (temp==b[x]){
                                        //igualamos a 0 el elemento para notificar que este elemento ya tiene su multiplo en (A)
                                        b[x]=0;
                                        VALIDADOR++; 
                                    }
                            } 
               

                    }
                               //SI EL VALIDADOR ES IGUAL AL TAMAÑO DEL ARREGLO DE (A) quiere decir que todos los datos fueron verificados y encontrados con sus multiplos
                            if (VALIDADOR==a.length){
                            System.out.println("SUCCESS");
                            return true;
                            }else{
                            System.out.println("ERROR");
                            return false;
                            }
            }else{
             System.out.println("La cantidad de números en los arreglos no coinciden");
            }        
                
                
    }else{    
    System.out.println("Uno de los 2 arreglos estan vacios");
    }            
            
    return true;
         
	}


}
