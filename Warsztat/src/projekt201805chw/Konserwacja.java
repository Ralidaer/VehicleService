package projekt201805chw;

import java.util.Scanner;

public class Konserwacja extends Usluga implements DodawanieDanych,OperacjeFinansowe{
	private String element;
	private double kosztkonserwacji;
	
	public Konserwacja(int dlugosc,String element, double kosztkonserwacji) {
		super(dlugosc);
		this.element=element;
		this.kosztkonserwacji=kosztkonserwacji;
	}
	
	public Konserwacja() {
		super();
	}
	
	@Override
	public void DodajDane() {
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj wymieniany element");
		this.element=sc.nextLine();
		System.out.println("Podaj cene czesci");
		this.kosztkonserwacji=sc.nextDouble();
	}
	
	@Override
	public double Zaplata(Klient k) {
		return kosztkonserwacji-k.getZnizka()*kosztkonserwacji/100;
	}
	
	public String getElement() {
		return element;
	}
	
	public void setElement(String element) {
		this.element = element;
	}
	
	public double getKosztkonserwacji() {
		return kosztkonserwacji;
	}
	
	public void setKosztkonserwacji(double kosztkonserwacji) {
		this.kosztkonserwacji = kosztkonserwacji;
	}
	
	@Override
	public String toString() {
		return "Wymiana "+super.toString()+" Element: "+element+" Koszt konserwacji: "+kosztkonserwacji;
	}
}
