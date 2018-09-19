/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctroutine;

/**
 *
 * @author ifpb
 */
public class CorrectRoutine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Compromisso comp = new Compromisso();
       comp.adcComprmisso("Pt","Portugues", "Gerson");
       comp.adcComprmisso("Mt","Matematica", "Lobao");
       comp.adcComprmisso("gf","geografia", "thiago");
       comp.excluirComp("Pt");
       comp.lista();
    }
    
}
