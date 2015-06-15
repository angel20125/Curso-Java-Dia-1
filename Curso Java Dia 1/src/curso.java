/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laboratorio
 */
public class curso {
    protected int cont;
  
    public static void main(String[] args) {
        curso objCurso = new curso();
        for (objCurso.cont = 0; objCurso.cont < 10; objCurso.cont++) {
            System.out.println("contador  : "+ objCurso.cont);
        }

    }
}
