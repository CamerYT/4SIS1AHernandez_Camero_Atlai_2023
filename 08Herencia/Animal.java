//tienda de adopcion

public class Animal {
    /*
     * Principio de encapsulamiento
     * acceso a los datos, para agrupar en una clase
     * acceso a diferentes atributos y metodos de la clase para que n puede
     * ser modificados en otro lugar
     */

    //definir variables
    private String nombre, raza, tipoAlimento;
    private int edad;


    //Para el encapsulamiento se debe crear el constructor, sirve para declarar
    //existencia de un clase, para inicializar las varibles 
    //instancias de una clase
 
    //definir un constructor
    public Animal (){ 
        //este es un constructor por defecto

    }

    //cuando hay un construccion del objeto de acuerdo a las necesidades del usurario
    //hay que utilzar la sobrecarga del constructor
    
    /*la SobreCarga
        *para registrar la mascota
    */
    public Animal(String nombre, String raza, String tipoAlimento, int edad){
        //son privados pondremos una forma de acceso
        //this = sirve para poder acceder a los atributos privados
        this.nombre = nombre; //asigno a la variable
        this.raza = raza;
        this.tipoAlimento = tipoAlimento; 
        this.edad = edad;
    }

    /*Para poder modificar los valores
     * los metodos get y setters
     * get -- obtener -- recibir
     * set -- asignar -- enviar
    */

    //metodos get y set para las variables
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String name){
        this.nombre = name;
    }

    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getTipoAlimento(){
        return tipoAlimento;
    }
    public void setTipoAlimento(String tipoAlimento){
        this.tipoAlimento = tipoAlimento;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    





}
