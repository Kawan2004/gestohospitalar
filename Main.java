
import patient.Patient;
import patient.Priority;

public class Main {

    public static void main (String [] args){


        GestaoHospitalar hospitalar = new GestaoHospitalar();

        Patient paciente1 = new Patient("nome1", "1238982138", Priority.NORMAL);
        Patient paciente2 = new Patient("nome2", "1238982138", Priority.LEVE);
        Patient paciente3 = new Patient("nome3", "1238982138", Priority.MODERADO);
        Patient paciente4 = new Patient("nome4", "1238982138", Priority.SEVERO);


        hospitalar.addPatient(paciente1);
        hospitalar.addPatient(paciente2);
        hospitalar.addPatient(paciente3);
        hospitalar.addPatient(paciente4);

        hospitalar.assistantPatient();
        hospitalar.assistantPatient();
        hospitalar.assistantPatient();
        hospitalar.assistantPatient();
    }
}