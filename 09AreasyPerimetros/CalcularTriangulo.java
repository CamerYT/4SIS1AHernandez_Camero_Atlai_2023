
public class CalcularTriangulo extends CalculoDeLasFiguras{
    
    public CalcularTriangulo(){

    }

    public CalcularTriangulo(int area, int perimetro){
        super(area, perimetro);
    }


    public void mostrarTriangulo(){ 
        System.out.println("El area del circulo: " + getArea() + "\n" 
        +  " El perimetro es: " + getPerimetro());
    }












}
