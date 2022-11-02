
package builder;

public class Casa {
   public Pared[] paredes = new Pared[4];
   public Techo techo;
   public Piso piso;
   public Garaje garaje;
   public Puerta  puerta; 
   public Ventana ventana;
   public void mostrar(){
        System.out.println("Este tipo de casa tiene " + paredes.length + " paredes de " + paredes[0].material);
        System.out.println("Techo de " + techo.material);
        System.out.println("Piso de " + piso.material);
        if (garaje == null) {
            System.out.println("No tiene garaje");
        } else {
            System.out.println("Garaje de " + garaje.alto + "x" + garaje.ancho + "x" + garaje.largo);
        }
        System.out.println(paredes[0].puerta.size() + " puerta de " + paredes[0].puerta.get(0).material
                + " en la pared principal " + paredes[0].puerta.get(0).alto + "x" + paredes[0].puerta.get(0).ancho);
        
        System.out.println(paredes[0].ventana.size() + " ventana de " + paredes[0].ventana.get(0).marco
                + " en la pared izquierda " + paredes[0].ventana.get(0).alto + "x" + paredes[0].ventana.get(0).ancho);
   }
   
}

enum Color {guindo,rojo,anaranjado,blanco,verde, amarillo, azul}
enum MaterialPared{cemento,ladrillo,adobe}
enum MaterialTecho{teja, duralit, calamina}
enum MaterialPiso{ceramica, porcelanato,cemento}
enum TipoMarco{madera, aluminio, fierro}
enum MaterialPuerta{madera, aglomerado, fierro, aluminio}