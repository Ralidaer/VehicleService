package projekt201805chw;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class Pojazd implements DodawanieDanych {
	private String marka;
	private String model;
	private int rokprodukcji;
	private String nrrejestracyjny;
	private int przebieg;
	private LocalDate dataprzegladu;

	public Pojazd(String marka, String model, int rokprodukcji, String nrrejestracyjny, int przebieg, LocalDate dataprzegladu) {
		this.marka=marka;
		this.model=model;
		this.rokprodukcji=rokprodukcji;
		this.nrrejestracyjny=nrrejestracyjny;
		this.przebieg=przebieg;
		this.dataprzegladu=dataprzegladu;
	}
	
	public Pojazd() {
		DodajDane();
	}
	
	@Override
	public void DodajDane() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Podaj marke pojazdu");
		this.marka=sc.nextLine();
		System.out.println("Podaj model pojazdu");
		this.model=sc.nextLine();
		System.out.println("Podaj rok produkcji");
		this.rokprodukcji=sc.nextInt();
		System.out.println("Podaj numer rejestracyjny");
		this.nrrejestracyjny=sc.next();
		System.out.println("Podaj przebieg w kilometrach");
		this.przebieg=sc.nextInt();
		int a=1;
		do {
		System.out.println("Podaj date obowi¹zywania przegladu(wa¿noœæ) rrrr-mm-dd");
		String dataprzegladuString=sc.next();
		String arrayDate[]=dataprzegladuString.split("-");
		try {
		dataprzegladu=LocalDate.of(Integer.parseInt(arrayDate[0]), Integer.parseInt(arrayDate[1]), Integer.parseInt(arrayDate[2]));
		}catch(DateTimeException ex) {
			System.out.println("zly format daty");
			a=0;
		}}while(a==0);
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public int getRokprodukcji() {
		return rokprodukcji;
	}

	public void setRokprodukcji(int rokprodukcji) {
		this.rokprodukcji = rokprodukcji;
	}

	public String getNrrejestracyjny() {
		return nrrejestracyjny;
	}

	public void setNrrejestracyjny(String nrrejestracyjny) {
		this.nrrejestracyjny = nrrejestracyjny;
	}

	public LocalDate getDataprzegladu() {
		return dataprzegladu;
	}

	public void setDataprzegladu(LocalDate dataprzegladu) {
		this.dataprzegladu = dataprzegladu;
	}
	
	@Override
	public String toString() {
		return "Pojazd:"+marka+" "+model+" Rok produkcji: "+rokprodukcji+" Numer rejestracyjny: "
				+nrrejestracyjny+" Przebieg: "+przebieg+" Data przegladu: "+dataprzegladu;
	}
	
}

