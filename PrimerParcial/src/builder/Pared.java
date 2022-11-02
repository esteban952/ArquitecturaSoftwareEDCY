
package builder;

import java.util.ArrayList;

public class Pared {
    public Color color;
    public MaterialPared material;
    public ArrayList<Ventana> ventana = new ArrayList<>();
    public ArrayList<Puerta> puerta = new ArrayList<>();
    public Pared(){}
    public Pared(Color color, MaterialPared material, Ventana ventana, Puerta puerta){
        this.color = color;
        this.material = material;
        this.ventana.add(ventana);
        this.puerta.add(puerta);
    }
}
