package logic;

import java.util.ArrayList;

public class SomeClass {
	/*
	 * W tej paczce tw�rz sobie swoje klasy z wszelk� logik� oblicze�.
	 * Musimy ustali� w jakiej formie b�dziemy przesy�a� dane mi�dzy logik� a gui.
	 * 
	 * Ja to widz� tak, �e w gui b�d� tworzy� obiekt jakiej� klasy st�d i ten obiekt
	 * albo b�dzie mia� metody albo po prostu pola, do kt�rych ja przypisz� dane wzi�te
	 * u�ytkownika w takiej formie jak b�d� Ci potrzebne tutaj czyli lista/tablica/co� innego,
	 * po dostarczeniu wszystkich danych pod jakim� buttonem gui b�dzie si� kry�o
	 * wywo�anie metody run czy start czy co� na tym obiekcie i ta metoda po zrobieniu ahp
	 * zwr�ci jak�� list�/tablic�/co� innego z wynikami, co ja poka�� w gui.
	 */
	
	public SomeClass() {}
	
	public void setProducts(ArrayList<String> list) {
		System.out.println("Produkty:");
		for(String product : list)
			System.out.println(product);
	}
	
	public void setCriteria(int n) {
		System.out.println("Liczba kryteriow: " + n);
		//Wydaje mi sie ze wystarczy Ci liczba kryteriow.
		//Jak jednak nie to pisz.
	}

	public void setPreferences() {
	
	}
	
	public void runAlgorithm() {
		
	}
}
