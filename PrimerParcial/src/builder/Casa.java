
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
       System.out.println("");
   }
   
}

enum Color {guindo,rojo,anaranjado,blanco,verde, amarillo, azul}
enum MaterialPared{cemento,ladrillo,adobe}
enum MaterialTecho{teja, duralit, calamina}
enum MaterialPiso{ceramica, porcelanato,cemento}
enum TipoMarco{madera, aluminio, fierro}
enum MaterialPuerta{madera, aglomerado, fierro, aluminio}