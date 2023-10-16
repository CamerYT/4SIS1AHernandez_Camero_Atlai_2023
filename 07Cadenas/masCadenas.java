import java.util.Scanner;

public class masCadenas {
    
    Scanner entrada = new Scanner(System.in);

    public void masFuncionesCadena(){
        String sl = new String("Hola habia una vez un oso muy guapo");
        String s2 = "Snape es muy sexy";
        String s3 = "Feliz no cumplaños";
        String s4 = "FELIZ NO CUMPLAÑOS";

        //vamos a concatenar cadenas

        String salida = "Cadenas a concatenar: " + sl + "\n"
                        + s2 + "\n" + s3 + "\n";
        //vamos a comprobar si dos cadena son iguales
        if(sl.equals("Solo juguito contigo")){
            //a ver...
            salida += "Si es igual a la cadena \n";
            System.out.println(salida);

        }else{
            salida += "No es la misma cadena \n";
            System.out.println(salida);
        }

        if(s3.equals(s4)){
            //vamos a ver
            salida += "Si es igual a la cadena \n";
            System.out.println(salida);
        }else{
            salida += "Si es igual a la cadena \n";
            System.out.println(salida);
        }

        //si no buscamos la diferencia entre minusculas o mayusculas
        //pero si el mismo mensaje entonces...

        if(s3.equalsIgnoreCase(s4)){
            //vamos a ver
            salida += "Si es igual a la cadena \n";
            System.out.println(salida);
        }else{
            salida += "Si es igual a la cadena \n";
            System.out.println(salida);
        }

        //metodo compareTo = comparado con otro metodo no con sigo misma

        //salida += "\n s3 compareTo s4 " + s3.compareTo(s4);
        //salida += "\n s3 compareTo s4 " + sl.compareTo(s4);
        salida += "\n s3 compareTo s3 " + s3.compareTo(s3);

        /*
         * orden lexico de las cadenas 
         
         *  S n a p e e s muy sexy"; 
            F e l i z n o cumplaños";
            
            como aqui la s compara con f o la n con la e y ven si es false o true
            *si sale -2 es porque una cadena es mas grande y dice que dos son las negativas osea mas grande
            2 si dice dos significa de toda la comparacion es porque hay dos que si ejemplo "o" compara "o" osea este caso si hay true saldria como 1 (ejemplo profe va :3)
         */

        System.out.println(salida); 

        //obtener la posicion de un caracter
        String s5 = "Patito patito color de cafe";
        
        int pos = 0;
        
        //cada "t" que encuentres quiero que la incrementes
        
        pos = s5.indexOf('t', pos+1);
        System.out.println("La segunda t esta en la posicion " + pos);



    }
}
