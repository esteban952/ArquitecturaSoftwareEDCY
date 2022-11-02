
package builder;

public class CasaMaker {
    private CasaBuilder builder;

    public CasaMaker(CasaBuilder builder){
        this.builder = builder;
    }
    
    public void construirCasa(){
        builder.createCasa();
        builder.construirParedes();
        builder.colocarPuertas();
        builder.colocarVentanas();
        builder.construirTecho();
        builder.construirPiso();
        builder.construirGaraje();
        
    }
    public Casa getCasa(){
        return builder.getCasa();
    }
    
}
