
package builder;

public abstract class CasaBuilder {
    protected Casa casa;
    public Casa getCasa(){
        return casa;
    }
    public void createCasa(){
        casa = new Casa();
    }
    public abstract void construirParedes();
    public abstract void colocarPuertas();
    public abstract void colocarVentanas();
    public abstract void construirTecho();
    public abstract void construirPiso();
    public abstract void construirGaraje();
}
