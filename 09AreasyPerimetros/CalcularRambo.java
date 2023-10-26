

public class CalcularRambo extends CalculoDeLasFiguras{
    
    public CalcularRambo(){

    }

    public CalcularRambo(int area, int perimetro){
        super(area, perimetro);
    }

    public void mostrarRambo(){
        System.out.println("El area del circulo: " + getArea() + "\n" 
        +  " El perimetro es: " + getPerimetro());
    }





}
