/*
 * rectángulo, circulo, triangulo, rombo
 *  deberán de calcular el perímetro y área
 * integrar herencia, encapsulamiento, manejo de excepciones
 */

public class CalculoDeLasFiguras {
    
    private int area;
    private int perimetro;

    public CalculoDeLasFiguras(){

    }

    public CalculoDeLasFiguras(int area, int perimetro){
        this.area = area;
        this.perimetro = perimetro;
    }


    public int getArea(){
        return area;
    }
    public void setArea(int area){
        this.area = area;
    }

    public double getPerimetro(){
        return perimetro;
    }
    public void setPerimetro(int perimetro){
        this.perimetro = perimetro;
    }


    

}
