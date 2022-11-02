
package builder;

class Puerta {
    public double alto, ancho;
    public MaterialPuerta material;
    public Color color;
    public Puerta(){
    
    }
    public Puerta(double alto, double ancho, MaterialPuerta materialPuerta, Color color){
        this.alto = alto;
        this.ancho = ancho;
        this.material = materialPuerta;
        this.color = color;
    }
}
