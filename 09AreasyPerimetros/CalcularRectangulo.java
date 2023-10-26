public class CalcularRectangulo extends CalculoDeLasFiguras{
    
    public CalcularRectangulo(){

    }

    public CalcularRectangulo(int area, int perimetro){
        super(area, perimetro);
        
    }

    public void mostrarRectangulo(){
        System.out.println("El area del Rectangulo: " + getArea() + "\n"
        +  " El perimetro es: " + getPerimetro());
    }


}
