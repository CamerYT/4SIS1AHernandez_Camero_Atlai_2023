import javax.swing.JOptionPane;

public class CalcularCirculo extends CalculoDeLasFiguras{

    private int radio;

    public CalcularCirculo(){

    }

    public CalcularCirculo(int area, int perimetro, int radio){
        super(area, perimetro);
        this.radio = radio;
    }

    public int getRadio(){
        return radio;
    }
    public void setRadio(int radio){
        this.radio = radio;
    }

    public void mostrarCirculo(){
        System.out.println("El area del circulo: " + getArea() + "\n"
        +  " El perimetro es: " + getPerimetro() + "\n"
        + " El radio del circulo es: " + radio);
    }





}
