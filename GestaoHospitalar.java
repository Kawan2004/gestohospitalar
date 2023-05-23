import patient.Patient;
import patient.Priority;
import queue.Queue;

public class GestaoHospitalar {

    private boolean continuar1 = true;
    private boolean continuar2 = false;
    private boolean continuar3 = false;
    private boolean continuar4 = false;
    
    Queue normal = new Queue();
    Queue leve = new Queue();
    Queue moderado = new Queue();
    Queue severo = new Queue();

    public void addPatient (Patient patient) {
        if (patient.getPriority() == Priority.NORMAL) {
            normal.push(patient);
        }

        else if (patient.getPriority() == Priority.LEVE) {
            leve.push(patient);
        }

        else if (patient.getPriority() == Priority.MODERADO) {
            moderado.push(patient);
        }

        else if (patient.getPriority() == Priority.SEVERO) {
            severo.push(patient);
        }
    }

    public void assistantPatient () {
        if (continuar1) {
            severo.pop();
            continuar1 = false;
            continuar2 = true;
        }

        else if (continuar2) {
            moderado.pop();
            continuar2 = false;
            continuar3 = true;
        }

        else if (continuar3) {
            leve.pop();
            continuar3 = false;
            continuar4 = true;
        }

        else if (continuar4) {
            normal.pop();
            continuar4 = false;
            continuar1 = true;
        }
    }

}
