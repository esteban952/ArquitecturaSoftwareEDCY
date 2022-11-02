
package builder;

class Puerta {
    public double alto, ancho;
    public MaterialPuerta materialPuerta;
    public Color color;
    public Puerta(){
    
    }
    public Puerta(double alto, double ancho, MaterialPuerta materialPuerta, Color color){
        this.alto = alto;
        this.ancho = ancho;
        this.materialPuerta = materialPuerta;
        this.color = color;
    }
}
