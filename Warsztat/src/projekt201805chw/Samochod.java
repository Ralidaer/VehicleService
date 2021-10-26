package projekt201805chw;

import java.time.LocalDate;
import java.util.Scanner;

public class Samochod extends Pojazd implements DodawanieDanych{
	private String paliwo;
	
	public Samochod(String marka, String model, int rokprodukcji, String nrrejestracyjny, int przebieg, LocalDate dataprzegladu, String paliwo) {
		super(marka, model, rokprodukcji, nrrejestracyjny, przebieg, dataprzegladu);
		this.paliwo=paliwo;
	}
	
	public Samochod(){
		super();
	}
	
	@Override
	public void DodajDane() {
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj rodzaj paliwa [benzyna, olej napêdowy, alkohol, benzyna+gaz]");
		this.paliwo=sc.nextLine();
	}
	
	public String getpaliwo() {
		return paliwo;
	}

	public void setPaliwo(String paliwo) {
		this.paliwo = paliwo;
	}

	@Override
	public String toString() {
		return super.toString()+" Paliwo: "+paliwo;
	}
	
	
	
}
