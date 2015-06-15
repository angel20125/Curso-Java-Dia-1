package nuevoPaquete;


public class ClaseDos {
    private     String nombre;
    protected   int algo;
    public      boolean OtraCosa;
    
    public ClaseDos(){
        this.nombre= "hola";
        this.algo=0;
        this.OtraCosa=true;
    }
    public ClaseDos(String nombre,int algo,boolean OtraCosa){
        this.nombre=nombre;
        this.algo= algo;
        this.OtraCosa= OtraCosa;
    }

}