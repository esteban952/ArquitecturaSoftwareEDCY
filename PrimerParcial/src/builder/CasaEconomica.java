
package builder;

public class CasaEconomica extends CasaBuilder {

    @Override
    public void construirParedes() {
        for(int i = 0; i < 4; i++){
            casa.paredes[i] = new Pared();
            casa.paredes[i].material = MaterialPared.adobe;
        }
    }

    @Override
    public void colocarPuertas() {
        casa.puerta = new Puerta();
        casa.puerta.material = MaterialPuerta.aglomerado;
        casa.puerta.alto = 2;
        casa.puerta.ancho = 0.9;
        casa.paredes[0].puerta.add(casa.puerta);
    }

    @Override
    public void colocarVentanas() {
        casa.ventana = new Ventana();
        casa.ventana.marco = TipoMarco.fierro;
        casa.ventana.alto = 1;
        casa.ventana.ancho = 1;
        casa.paredes[0].ventana.add(casa.ventana);
    }

    @Override
    public void construirTecho() {
        casa.techo = new Techo();
        casa.techo.material = MaterialTecho.calamina;
    }

    @Override
    public void construirPiso() {
        casa.piso = new Piso();
        casa.piso.material = MaterialPiso.cemento;
    }

    @Override
    public void construirGaraje() {
        casa.garaje = null;
    }
    
}
