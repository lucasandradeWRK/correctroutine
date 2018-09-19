package correctroutine;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;

public class Compromisso {
    String acronimo;
    String disciplina;
    String professor;
    Calendar calendario = Calendar.getInstance();
    int dia = calendario.get(Calendar.DAY_OF_MONTH);
    int mes = calendario.get(Calendar.MONTH);
    int ano = calendario.get(Calendar.YEAR);
    int hora = calendario.get(Calendar.HOUR_OF_DAY);
    int minuto = calendario.get(Calendar.MINUTE);
    String tag;
    Map<String, String> compromissos = new HashMap<>();
    
  public void adcComprmisso(String acronimo, String disciplina, String professor){
  compromissos.put(acronimo,disciplina+" "+professor);
  }
  public void lista(){
      for(String acronimo:compromissos.keySet()){
          System.out.println(acronimo);
          System.out.println(compromissos.get(acronimo));
          System.out.println(dia+"--------------------------------------------------");
      }
      
      
  }
  public void excluirComp(String acronimo){
  compromissos.remove(acronimo);
  }
}
