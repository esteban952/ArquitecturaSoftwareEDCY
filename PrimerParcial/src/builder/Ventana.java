
package builder;


class Ventana {
    public double ancho, alto;
    public TipoMarco marco;
    public Color color;
    public Ventana(){}
    public Ventana(double ancho, double alto, TipoMarco marco, Color color){
        this.alto = alto;
        this.ancho = ancho;
        this.marco = marco;
        this.color = color;
    }
}
