package adapter;

import java.util.Iterator;
import domain.Covid19Pacient;
import domain.Symptom;
import factory.FactorySymptom;

public class Main {
    public static void main(String[] args) {
        Covid19Pacient pacient = new Covid19Pacient("Aitor", 35, new FactorySymptom());
        
        pacient.addSymptomByName("fiebre", 3);
        pacient.addSymptomByName("tos seca", 2);
        pacient.addSymptomByName("cefalea", 1);
        pacient.addSymptomByName("mialgia", 2);
        pacient.addSymptomByName("nauseas", 1);

        InvertedIterator itAdapter = new Covid19PacientInvertedIteratorAdapter(pacient);

        System.out.println("--- Izen bidez ordenatu ---");
        Iterator<Object> sortedByName = Sorting.sortedIterator(itAdapter, new ComparatorBySymptomName());
        while (sortedByName.hasNext()) {
            Symptom s = (Symptom) sortedByName.next();
            System.out.println(s.getName() + " (Seberitatea: " + s.getSeverityIndex() + ")");
        }

        InvertedIterator itAdapter2 = new Covid19PacientInvertedIteratorAdapter(pacient);

        System.out.println("\n--- Idex bidez ordenatu ---");
        Iterator<Object> sortedBySeverity = Sorting.sortedIterator(itAdapter2, new ComparatorBySeverityIndex());
        while (sortedBySeverity.hasNext()) {
            Symptom s = (Symptom) sortedBySeverity.next();
            System.out.println(s.getName() + " (Seberitatea: " + s.getSeverityIndex() + ")");
        }
    }
}