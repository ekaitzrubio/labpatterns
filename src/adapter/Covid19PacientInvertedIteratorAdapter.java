package adapter;

import java.util.ArrayList;
import java.util.List;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator {
    private List<Symptom> symptoms;
    private int currentIndex;

    public Covid19PacientInvertedIteratorAdapter(Covid19Pacient pacient) {
        this.symptoms = new ArrayList<>(pacient.getSymptoms());
        this.currentIndex = 0;
    }

    @Override
    public void goLast() {
        this.currentIndex = symptoms.size() - 1;
    }

    @Override
    public boolean hasPrevious() {
        return this.currentIndex >= 0;
    }

    @Override
    public Object previous() {
        if (hasPrevious()) {
            Symptom s = symptoms.get(currentIndex);
            currentIndex--;
            return s;
        }
        return null;
    }
}