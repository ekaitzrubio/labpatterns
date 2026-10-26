package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.FactorySymptom;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String	args[]){
		Observable	pacient=new	Covid19Pacient("aitor",	35, new FactorySymptom());
		new	PacientObserverGUI	(pacient);
		new	PacientSymptomGUI	((Covid19Pacient) pacient);
		new PacientThermometerGUI(pacient);
	}


}
 	