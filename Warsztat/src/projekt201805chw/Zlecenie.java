package projekt201805chw;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Zlecenie implements DodawanieDanych {
	private int idZlecenie;
	private Klient klient;
	private Pojazd pojazd;
	private Usluga usluga;
	private LocalDate dataprzyjecia;
	private LocalDate datarealizacji;
	private double zaplata;
	private static int countIdZlecenie=0;
	
	public Zlecenie(int idZlecenie,Klient klient, Pojazd pojazd, Usluga usluga, LocalDate dataprzyjecia , LocalDate datarealizacji, double zaplata) {
		this.idZlecenie=idZlecenie;
		this.klient=klient;
		this.pojazd=pojazd;
		this.usluga=usluga;
		this.dataprzyjecia=LocalDate.now();
		this.datarealizacji=LocalDate.now();
		this.zaplata=zaplata;
		
	}
	
	public Zlecenie() {
		DodajDane();
	}
	
	@Override
	public void DodajDane() {
		Scanner sc=new Scanner(System.in);
		countIdZlecenie++;
		this.idZlecenie=countIdZlecenie;
		this.dataprzyjecia=LocalDate.now();
		System.out.println("dodaj nowego klienta");
		this.klient=new Klient();
		System.out.println("dodaj nowy pojazd [1.Ciagnik 2.Samochod 3.Motocykl]");
		int a;
		do {
		System.out.println("podaj liczbe odpowiadajaca rodzajowi uslugi");
		a=sc.nextInt();
		}while(a!=1 && a!=2 && a!=3);
		if(a==1)
		this.pojazd=new Ciagnik();
		else {
		if(a==2)
			this.pojazd=new Samochod();
		else
			this.pojazd=new Motocykl();
		}
		System.out.println("dodaj nowa usluge [1.Badanie 2.Naprawa 3.Konserwacja]");
		do {
		System.out.println("podaj liczbe odpowiadajaca rodzajowi uslugi");
		a=sc.nextInt();
		}while(a!=1 && a!=2 && a!=3);
		if(a==1)
		this.usluga=new Badanie();
		else {
		if(a==2)
			this.usluga=new Naprawa();
		else
			this.usluga=new Konserwacja();
		}
		this.zaplata=usluga.Zaplata(klient);
		this.datarealizacji=dataprzyjecia.plusDays(usluga.getDlugosc());
	}
	
	public int getIdZlecenie() {
		return idZlecenie;
	}

	public void setIdZlecenie(int idZlecenie) {
		this.idZlecenie = idZlecenie;
	}

	public static void setCountIdZlecenie(int countIdZlecenie) {
		Zlecenie.countIdZlecenie = countIdZlecenie;
	}
	public static int getCountIdZlecenie() {
		return countIdZlecenie;
	}
	

	@Override
	public String toString() {
		return "Id: "+idZlecenie+" Klient: "+this.klient.toString() + " Pojazd: "+this.pojazd.toString() +  " Usluga: "+ this.usluga.toString() +" Data przyjecia: "+dataprzyjecia+" Data realizacji: "+datarealizacji+" "+usluga+" Koszt: "+zaplata;
	}

	
	
}
