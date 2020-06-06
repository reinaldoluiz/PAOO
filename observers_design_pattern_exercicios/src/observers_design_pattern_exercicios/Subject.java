package observers_design_pattern_exercicios;

public interface Subject {
	
	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
		
}
