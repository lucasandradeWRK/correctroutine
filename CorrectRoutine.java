package correctroutine;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CorrectRoutine {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int ano = calendario.get(Calendar.YEAR);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minuto = calendario.get(Calendar.MINUTE);
       
       Compromisso comp = new Compromisso();
       comp.adcComprmisso("redacao Pt","Portugues", "Gerson", "10/09/2018 10:30");
       comp.adcComprmisso("atv Mt","Matematica", "Lobaoo", "13/09/2018 04:15");
       comp.adcComprmisso("prov gf","geografia", "thiago", "17/9/2018 0:7");
       comp.excluirComp("redacao Pt");
       comp.concluirComp();
       comp.lista();
    }
    
}
