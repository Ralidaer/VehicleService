package projekt201805chw;

import java.util.Scanner;

public class Badanie extends Usluga implements DodawanieDanych,OperacjeFinansowe{
	private String cel;
	private double cena;
	
	public Badanie(int dlugosc, String cel, double cena) {
		super(dlugosc);
		this.cel=cel;
		this.cena=cena;
	}
	
	public Badanie() {
		super();
	}
	
	@Override
	public void DodajDane() {
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj cel uslugi");
		this.cel=sc.nextLine();
		System.out.println("Podaj cene badania");
		this.cena=sc.nextDouble();
	}
	
	@Override
	public double Zaplata(Klient k) {
		return cena-k.getZnizka()*cena/100;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public double getCena() {
		return cena;
	}
	
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	@Override
	public String toString() {
		return "Badanie "+super.toString()+" Cel: "+cel+" Cena badania: "+cena;
	}
	
	
	
}
