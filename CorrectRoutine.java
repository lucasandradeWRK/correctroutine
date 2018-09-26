package correctroutine;

public class CorrectRoutine {
    public static void main(String[] args) {
       Compromisso comp = new Compromisso();
       comp.adcComprmisso("redacao Pt","Portugues", "Gerson", "10-09-2018 10:30:00");
       comp.adcComprmisso("atv Mt","Matematica", "Lobaoo", "13-09-2018 04:15:00");
       comp.adcComprmisso("prov gf","geografia", "thiago", "05-07-2018 09:30:00");
       comp.excluirComp("redacao Pt");
       comp.lista();
    }
    
}
