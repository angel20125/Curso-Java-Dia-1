
import nuevoPaquete.ClaseDos;


public class ClaseUno {
    protected int cont;
  
    public static void main(String[] args) {
        ClaseUno objCurso = new ClaseUno();
        ClaseDos objClase2 = new ClaseDos();
       
        for (objCurso.cont = 0; objCurso.cont < 10; objCurso.cont++) {
            System.out.println("contador  : "+ objCurso.cont);
        }

    }
}
