package correctroutine;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Compromisso {
    String acronimo;
    String disciplina;
    String professor;
    
    Calendar calendario = Calendar.getInstance();
    int diaHj = calendario.get(Calendar.DAY_OF_MONTH);
    int mesHj = calendario.get(Calendar.MONTH);
    int anoHj = calendario.get(Calendar.YEAR);
    int horaHj = calendario.get(Calendar.HOUR_OF_DAY);
    int minutoHj = calendario.get(Calendar.MINUTE);
    //  dia/mes/ano hora:minuto
    String dataComp = diaHj+"/"+mesHj+"/"+anoHj+" "+horaHj+":"+minutoHj;
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
  public void concluirComp(){
  for(String acronimo:horarios.keySet()){
      if(horarios.get(acronimo).equals(dataComp)){
          JOptionPane.showMessageDialog(null, acronimo+" Terminado");
          excluirComp(acronimo);
      }
  }
  }
  
}
