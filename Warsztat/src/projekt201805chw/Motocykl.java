package projekt201805chw;

import java.time.LocalDate;
import java.util.Scanner;

public class Motocykl extends Pojazd implements DodawanieDanych{
	private int pojemnosc;
	
	public Motocykl(String marka, String model, int rokprodukcji, String nrrejestracyjny, int przebieg, LocalDate dataprzegladu, int pojemnosc) {
		super(marka, model, rokprodukcji, nrrejestracyjny, przebieg, dataprzegladu);
		this.pojemnosc=pojemnosc;
	}
	
	public Motocykl(){
		super();
	}
	
	@Override
	public void DodajDane() {
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj pojemnosc silnika w cm3");
		this.pojemnosc=sc.nextInt();
	}

	public int getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(int pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	@Override
	public String toString() {
		return super.toString()+" Pojemnosc: "+pojemnosc;
	}
	

}
