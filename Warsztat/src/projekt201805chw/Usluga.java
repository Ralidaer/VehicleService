package projekt201805chw;

import java.util.Scanner;

public abstract class Usluga implements DodawanieDanych, OperacjeFinansowe {
	private long dlugosc;
	
	public Usluga(long dlugosc) {
		this.dlugosc=dlugosc;
	}
	
	public Usluga() {
		DodajDane();
	}
	
	@Override
	public void DodajDane() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Podaj dlugosc uslugi w dniach");
		this.dlugosc=sc.nextLong();
	}

	public long getDlugosc() {
		return dlugosc;
	}

	public void setDlugosc(long dlugosc) {
		this.dlugosc = dlugosc;
	}
	
	@Override
	public String toString() {
		return " Dlugosc: "+dlugosc;
	}

}
