package observer;

import java.util.Observable;

import adapter2.ShowPacientTableGUI;
import domain.Covid19Pacient;
import factory.FactorySymptom;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String	args[]){
		Covid19Pacient	pacient=new	Covid19Pacient("aitor",	35, new FactorySymptom());
		new	PacientObserverGUI	(pacient);
		new	PacientSymptomGUI	((Covid19Pacient) pacient);
		new PacientThermometerGUI(pacient);
		
		
		ShowPacientTableGUI gui= new ShowPacientTableGUI(pacient);
		gui.setPreferredSize(new java.awt.Dimension(300, 200));
		gui.setVisible(true);
		
		
		
		Covid19Pacient	pacient2=new	Covid19Pacient("ane",	20, new FactorySymptom());
		new	PacientObserverGUI	(pacient2);
		new	PacientSymptomGUI	((Covid19Pacient) pacient2);
		new PacientThermometerGUI(pacient2);
		
		
		ShowPacientTableGUI gui2= new ShowPacientTableGUI(pacient2);
		gui.setPreferredSize(new java.awt.Dimension(300, 200));
		gui.setVisible(true);
		
		
		Covid19Pacient	pacient3=new	Covid19Pacient("Jon",	75, new FactorySymptom());
		new	PacientObserverGUI	(pacient3);
		new	PacientSymptomGUI	((Covid19Pacient) pacient3);
		new PacientThermometerGUI(pacient2);
		
		
		ShowPacientTableGUI gui3= new ShowPacientTableGUI(pacient3);
		gui.setPreferredSize(new java.awt.Dimension(300, 200));
		gui.setVisible(true);


	}



}
 	