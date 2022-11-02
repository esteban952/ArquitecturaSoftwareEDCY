
package builder;

/**
 *
 * @author WINDOWS 10
 */
public class CasaLujo extends CasaBuilder {
   
    @Override
    public void construirParedes() {
        for(int i = 0; i < 4; i++){
            casa.paredes[i] = new Pared();
            casa.paredes[i].material = MaterialPared.cemento;
        }
    }

    @Override
    public void colocarPuertas() {
        casa.puerta = new Puerta();
        casa.puerta.material = MaterialPuerta.madera;
        casa.puerta.alto = 2;
        casa.puerta.ancho = 1.5;
        casa.paredes[0].puerta.add(casa.puerta);
        casa.paredes[0].puerta.add(casa.puerta);
    }

    @Override
    public void colocarVentanas() {
        casa.ventana = new Ventana();
        
        casa.ventana.marco = TipoMarco.madera;
        casa.ventana.alto = 1.5;
        casa.ventana.ancho = 1.5;
        casa.paredes[0].ventana.add(casa.ventana);
        casa.paredes[0].ventana.add(casa.ventana);
    }

    @Override
    public void construirTecho() {
        casa.techo = new Techo();
        
        casa.techo.material = MaterialTecho.teja;
    }

    @Override
    public void construirPiso() {
        casa.piso = new Piso();
        
        casa.piso.material = MaterialPiso.porcelanato;
    }

    @Override
    public void construirGaraje() {
        casa.garaje = new Garaje();
        casa.garaje.alto = 4;
        casa.garaje.ancho = 3;
        casa.garaje.largo = 2;
    }
     
}
