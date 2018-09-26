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
    Map<String, String> horarios = new HashMap<>();
    
  public void adcComprmisso(String acronimo, String disciplina, String professor, String data){
  compromissos.put(acronimo,disciplina+" "+professor);
  horarios.put(acronimo, data);
  }
  public void lista(){
      for(String acronimo:compromissos.keySet()){
          System.out.println(acronimo);
          System.out.println(compromissos.get(acronimo));
          System.out.println(horarios.get(acronimo));
          System.out.println("--------------------------------------------------");
      }
      
      
  }
  public void excluirComp(String acronimo){
  compromissos.remove(acronimo);
  }
  public void EditComp(String acronimo){
  
  }
  
}
