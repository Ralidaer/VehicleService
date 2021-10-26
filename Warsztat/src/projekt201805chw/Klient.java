package projekt201805chw;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Klient implements DodawanieDanych{
	private String imie;
	private String nazwisko;
	private Adres adres;
	private LocalDate dataurodzenia;
	private double znizka;
	
	public Klient(String imie, String nazwisko, Adres adres, LocalDate dataurodzenia, double znizka) {
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.adres=adres;
		this.dataurodzenia=dataurodzenia;
		this.znizka=znizka;
	}
	
	public Klient() {
		DodajDane();
	}
	
	@Override
	public void DodajDane() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj imie");
		this.imie=sc.nextLine();
		System.out.println("Podaj nazwisko");
		this.nazwisko=sc.nextLine();
		String arrayAddress[]=new String[3];
		System.out.println("Podaj adres: ");
		System.out.println("Podaj ulice");
		arrayAddress[0]=sc.nextLine();
		System.out.println("Podaj kod pocztowy [__-___]");
		arrayAddress[1]=sc.nextLine();
		System.out.println("Podaj miejscowosc");
		arrayAddress[2]=sc.nextLine();
		this.adres=new Adres(arrayAddress[0],arrayAddress[1],arrayAddress[2]);
		int a=1;
		do {
		System.out.println("podaj date urodzenia rrrr-mm-dd");
		String dataurodzeniaString=sc.nextLine();
		String arrayData[]=dataurodzeniaString.split("-");
		try {
			this.dataurodzenia=LocalDate.of(Integer.parseInt(arrayData[0]), Integer.parseInt(arrayData[1]), Integer.parseInt(arrayData[2]));
		}catch(DateTimeException ex) {
			System.out.println("zly format daty");
			a=0;
		}}while(a==0);
		System.out.println("podaj wysokosc znizki ");
		this.znizka=sc.nextDouble();
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public LocalDate getDataurodzenia() {
		return dataurodzenia;
	}

	public void setDataurodzenia(LocalDate dataurodzenia) {
		this.dataurodzenia = dataurodzenia;
	}

	public double getZnizka() {
		return znizka;
	}

	public void setZnizka(int znizka) {
		this.znizka = znizka;
	}

	@Override
	public String toString() {
		return "Klient Imie: "+imie+" Nazwisko: "+nazwisko+" Adres: "+adres+" Data urodzenia: "
				+dataurodzenia+" Znizka: "+znizka;
	}
	
}
