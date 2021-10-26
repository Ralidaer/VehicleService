package projekt201805chw;

import java.util.Scanner;

public class Naprawa extends Usluga implements DodawanieDanych, OperacjeFinansowe{
	private String opis;
	private double cenazrobocizna;
	
	public Naprawa(int dlugosc, String opis, double cenazrobocizna) {
		super(dlugosc);
		this.opis=opis;
		this.cenazrobocizna=cenazrobocizna;
	}
	
	@Override
	public double Zaplata(Klient k) {
		return (cenazrobocizna)-k.getZnizka()*(cenazrobocizna)/100;
	}
	
	public Naprawa(){
		super();
	}	
	
	@Override
	public void DodajDane() {
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj rodzaj awari (co siê zepsu³o)");
		this.opis=sc.nextLine();
		System.out.println("Podaj cene robocizny i czesci");
		this.cenazrobocizna=sc.nextDouble();
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public double getRobocizna() {
		return cenazrobocizna;
	}

	public void setRobocizna(double cenazrobocizna) {
		this.cenazrobocizna = cenazrobocizna;
	}

	@Override
	public String toString() {
		return " Naprawa "+super.toString()+" Opis: "+opis+" Robocizna i czesci=" + cenazrobocizna;
	}
	
	
}
