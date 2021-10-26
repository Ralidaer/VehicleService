package projekt201805chw;

import java.time.LocalDate;
import java.util.Scanner;

public class Ciagnik extends Pojazd implements DodawanieDanych{
	private String tur;
	
	public Ciagnik(String marka,String model, int rokprodukcji, String nrrejestracyjny, int przebieg, LocalDate dataprzegladu, String tur) {
		super(marka, model, rokprodukcji, nrrejestracyjny, przebieg, dataprzegladu);
		this.tur=tur;
	}
	
	public Ciagnik(){
		super();
	}
	
	@Override
	public void DodajDane() {
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		String temp;
		do{
		System.out.println("Czy ci¹gnik posiada tura [TAK/NIE]");
		temp=sc.next();
		}while(temp!="tak"&& temp!="TAK"&& temp!="nie"&& temp!="NIE");
		this.tur=temp;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	@Override
	public String toString() {
		return super.toString()+" Tur: "+tur;
	}
	
	 

}
