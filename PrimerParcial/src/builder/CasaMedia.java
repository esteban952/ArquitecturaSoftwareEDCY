
package builder;


public class CasaMedia extends CasaBuilder{
    
    @Override
    public void construirParedes() {
        for(int i = 0; i < 4; i++){
            casa.paredes[i] = new Pared();
            casa.paredes[i].material = MaterialPared.ladrillo;
        }
        
    }

    @Override
    public void colocarPuertas() {
        casa.puerta = new Puerta();
        casa.puerta.materialPuerta = MaterialPuerta.madera;
        casa.puerta.alto = 2;
        casa.puerta.ancho = 0.9;
    }

    @Override
    public void colocarVentanas() {
        casa.ventana = new Ventana();
        casa.ventana.marco = TipoMarco.aluminio;
        casa.ventana.alto = 1.5;
        casa.ventana.ancho = 1.5;
    }

    @Override
    public void construirTecho() {
        casa.techo = new Techo();
        casa.techo.material = MaterialTecho.calamina;
    }

    @Override
    public void construirPiso() {
        casa.piso = new Piso();
        casa.piso.material = MaterialPiso.ceramica;
    }

    @Override
    public void construirGaraje() {
        casa.garaje = new Garaje();
        casa.garaje.alto = 2;
        casa.garaje.ancho = 3;
        casa.garaje.largo = 2;
    }
    
}
