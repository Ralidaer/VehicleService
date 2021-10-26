package projekt201805chw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Warsztat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Pracownicy> pracownicy = new ArrayList<Pracownicy>();
		pracownicy.add(new Pracownicy("Andrzej","Nowak",new Adres("ul. Miodowa 2","22-300","Kransystaw"),LocalDate.of(1980, 9, 7),"Mechanik"));
		pracownicy.add(new Pracownicy("Adam","Kowalski",new Adres("ul. èelazna 3","22-300","Kransystaw"),LocalDate.of(1981,10,6),"Mechanik"));
		pracownicy.add(new Pracownicy("Filip","Stachurski",new Adres("ul. Czarna 1","22-300","Kransystaw"),LocalDate.of(1982,11,5),"Sprzπtacz"));
		pracownicy.add(new Pracownicy("Andrzej","Nowak",new Adres("ul. Bia≥a 4","22-300","Kransystaw"),LocalDate.of(1983,12,4),"Pomocnik"));
		
		List <Zlecenie> zlecenia = new ArrayList<Zlecenie>();
		Zlecenie.setCountIdZlecenie(Zlecenie.getCountIdZlecenie()+1);
		zlecenia.add(new Zlecenie(Zlecenie.getCountIdZlecenie(),new Klient ("Andrzej","Nowak",new Adres("ul. Bia≥a 2","22-300","Kransystaw"),LocalDate.of(1999, 9, 7),20),new Motocykl("Suzuki","Swift",1999,"LKSABW",12,LocalDate.now(),500),new Badanie(2,"wyciek oleju",500),LocalDate.now(),LocalDate.now(),400));
		Zlecenie.setCountIdZlecenie(Zlecenie.getCountIdZlecenie()+1);
		zlecenia.add(new Zlecenie(Zlecenie.getCountIdZlecenie(),new Klient("Ma≥gorzata","Chwil",new Adres("ul. Czerwona 2","22-300","Kransystaw"),LocalDate.of(1999, 8, 13),10),new Samochod("Suzuki","Swift",1999,"LKSABW",12,LocalDate.now(),"benzyna"),new Naprawa(6,"blad komputera",500),LocalDate.now(),LocalDate.now(),450));
		Zlecenie.setCountIdZlecenie(Zlecenie.getCountIdZlecenie()+1);
		zlecenia.add(new Zlecenie(Zlecenie.getCountIdZlecenie(),new Klient("Andrzej","Nowak",new Adres("ul. Zielona 2","22-300","Kransystaw"),LocalDate.of(1980, 9, 7),30),new Ciagnik("Suzuki","Swift",1999,"LKSABW",12,LocalDate.now(),"brak tura"),new Konserwacja(3,"filr oleju",100),LocalDate.now(),LocalDate.now(),70));
		
		
		Okienko ok = new Okienko(pracownicy,zlecenia);
		OkienkoWitaj witaj= new OkienkoWitaj();

	}

}
