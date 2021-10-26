package projekt201805chw;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Okienko extends JFrame implements ActionListener{
	private JLabel labelTytul;
	private JMenuBar pasek;
	private JMenu zlecenia, pracownicy, informacja;
	private JMenuItem dodajZ,zapisZ, odczytZ,odczytZzPliku, dodajP,zapisP, odczytP,odczytPzPliku, dane , autor;
	private JButton buttonDodajP, buttonWrocP,buttonDodajZ,buttonWrocZ;
	private JLabel labelDodajP,labelImieP,labelNazwiskoP, labelUlica, labelKod, labelMiejsc, labelDataUr, labelSpecjalizacjaP;
	private JTextField textImieP,textNazwiskoP,textUlica,textKod,textMiejsc,textSpecjalizacjaP;
	private JLabel labelDodajZ, labelID, labelKlient, labelImieK, labelNazwiskoK,labelAdresK,labelUlicaK,labelKodK,labelMiastoK,labelDataUrK,labelZnizkaK;
	static JTextField textID;
	private JTextField textImieK;
	private JTextField textNazwiskoK;
	private JTextField textUlicaK;
	private JTextField textKodK;
	private JTextField textMiastoK;
	private JTextField textZnizkaK;
	private JLabel labelPojazd, labelMarkaP, labelModelP, labelRokpP, labelNrrejP,labelPrzebiegP,labelDataprzegladuP,labelPaliwoP, labelPojemnoscP, labelTurP;
	private JTextField textMarkaP, textModelP, textRokpP, textNrrejP,textPrzebiegP;
	private JLabel labelUsluga, labelDlugoscU, labelOpisU, labelCenazRobU, labelCelU, labelCenaU, labelElementU,labelKosztkonsU;
	private JTextField textDlugoscU, textOpisU, textCenazRobU, textCelU, textCenaU, textElementU,textKosztkonsU;
	private ButtonGroup gUsluga, gPojazd;
	private JRadioButton rNaprawa, rBadanie, rKonserwacja, rSamochod, rMotocykl, rCiagnik;
	private JLabel labelRodzajP, labelRodzajU;
	private JComboBox<String> comboPaliwoP, comboTurP, comboPojemnoscP, comboDataUrRok,comboDataUrMiesiac,comboDataUrDzien, comboDataUrRokK,comboDataUrMiesiacK,comboDataUrDzienK,comboDataPrzeRok,comboDataPrzeMiesiac,comboDataPrzeDzien;
	private JLabel tlo;

	
	
	
	
	public Okienko(List <Pracownicy> pracownicyLista, List <Zlecenie> zleceniaLista) {
		setTitle("Warsztat");
		setSize(800, 800);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		Toolkit zdjecie = Toolkit.getDefaultToolkit(); 
		Image imag = zdjecie.getImage("ikona.jpg"); 
		setIconImage(imag);
		
		pasek = new JMenuBar();
		setJMenuBar(pasek);
		
		zlecenia = new JMenu("Zlecenia");
		pasek.add(zlecenia);
		
		pracownicy = new JMenu("Pracownicy");
		pasek.add(pracownicy);
		
		informacja = new JMenu("Informacja");
		pasek.add(informacja);
		
		dodajZ = new JMenuItem("Dodaj Zlecenie");
		zlecenia.add(dodajZ);
		dodajZ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setSize(1300, 800);
				labelTytul.setBounds(400, 20, 500, 50);
				labelDodajZ.setBounds(525, 90, 250, 50);
				buttonDodajZ.setBounds(575, 700, 150, 30);
				buttonWrocZ.setBounds(1000, 700, 150, 30);	
				
				rNaprawa.setVisible(true);
				rBadanie.setVisible(true);
				rKonserwacja.setVisible(true);
				rSamochod.setVisible(true);
				rMotocykl.setVisible(true);
				rCiagnik.setVisible(true);
				
				buttonDodajZ.setVisible(true);
				buttonWrocZ.setVisible(true);
				
				labelPaliwoP.setVisible(true);
				comboPaliwoP.setVisible(true);
				
				labelRodzajP.setVisible(true);
				labelRodzajU.setVisible(true);
				
				labelOpisU.setVisible(true);
				textOpisU.setVisible(true);
				labelCenazRobU.setVisible(true);
				textCenazRobU.setVisible(true);
				
				labelDodajZ.setVisible(true);
				labelID.setVisible(true);
				labelKlient.setVisible(true);
				labelImieK.setVisible(true);
				labelNazwiskoK.setVisible(true);
				labelAdresK.setVisible(true);
				labelUlicaK.setVisible(true);
				labelKodK.setVisible(true);
				labelMiastoK.setVisible(true);
				labelDataUrK.setVisible(true);
				labelZnizkaK.setVisible(true);
				labelPojazd.setVisible(true);
				labelMarkaP.setVisible(true);
				labelModelP.setVisible(true);
				labelRokpP.setVisible(true);
				labelNrrejP.setVisible(true);
				labelPrzebiegP.setVisible(true);
				labelDataprzegladuP.setVisible(true);
				labelUsluga.setVisible(true);
				labelDlugoscU.setVisible(true);
			
				textID.setVisible(true);
				textImieK.setVisible(true);
				textNazwiskoK.setVisible(true);
				textUlicaK.setVisible(true);
				textKodK.setVisible(true);
				textMiastoK.setVisible(true);
				comboDataUrRokK.setVisible(true);
				comboDataUrMiesiacK.setVisible(true);
				comboDataUrDzienK.setVisible(true);
				textZnizkaK.setVisible(true);
				textMarkaP.setVisible(true);
				textModelP.setVisible(true);
				textRokpP.setVisible(true);
				textNrrejP.setVisible(true);
				textPrzebiegP.setVisible(true);
				comboDataPrzeRok.setVisible(true);
				comboDataPrzeMiesiac.setVisible(true);
				comboDataPrzeDzien.setVisible(true);
				textDlugoscU.setVisible(true);
				
				labelDodajP.setVisible(false);
				labelImieP.setVisible(false);
				labelNazwiskoP.setVisible(false);
				labelUlica.setVisible(false);
				labelKod.setVisible(false);
				labelMiejsc.setVisible(false);
				labelDataUr.setVisible(false);
				labelSpecjalizacjaP.setVisible(false);
				textImieP.setVisible(false);
				textNazwiskoP.setVisible(false);
				textUlica.setVisible(false);
				textKod.setVisible(false);
				textMiejsc.setVisible(false);
				comboDataUrRok.setVisible(false);
				comboDataUrMiesiac.setVisible(false);
				comboDataUrDzien.setVisible(false);
				textSpecjalizacjaP.setVisible(false);
				buttonDodajP.setVisible(false);
				buttonWrocP.setVisible(false);
			
				if(rMotocykl.isSelected()==true) {
					labelPaliwoP.setVisible(false);
					comboPaliwoP.setVisible(false);
					labelTurP.setVisible(false);
					comboTurP.setVisible(false);
					labelPojemnoscP.setVisible(true);
					comboPojemnoscP.setVisible(true);
				}
				if(rCiagnik.isSelected()==true) {
					labelPaliwoP.setVisible(false);
					comboPaliwoP.setVisible(false);
					labelTurP.setVisible(true);
					comboTurP.setVisible(true);
					labelPojemnoscP.setVisible(false);
					comboPojemnoscP.setVisible(false);
				}
				if(rSamochod.isSelected()==true) {
					labelPaliwoP.setVisible(true);
					comboPaliwoP.setVisible(true);
					labelTurP.setVisible(false);
					comboTurP.setVisible(false);
					labelPojemnoscP.setVisible(false);
					comboPojemnoscP.setVisible(false);
				}
				
				if(rNaprawa.isSelected()==true) {
					labelOpisU.setVisible(true);
					textOpisU.setVisible(true);
					labelCenazRobU.setVisible(true);
					textCenazRobU.setVisible(true);
					labelCelU.setVisible(false);
					textCelU.setVisible(false);
					labelCenaU.setVisible(false);
					textCenaU.setVisible(false);
					labelElementU.setVisible(false);
					textElementU.setVisible(false);
					labelKosztkonsU.setVisible(false);
					textKosztkonsU.setVisible(false);
				}

				if(rBadanie.isSelected()==true ) {
					labelOpisU.setVisible(false);
					textOpisU.setVisible(false);
					labelCenazRobU.setVisible(false);
					textCenazRobU.setVisible(false);
					labelCelU.setVisible(true);
					textCelU.setVisible(true);
					labelCenaU.setVisible(true);
					textCenaU.setVisible(true);
					labelElementU.setVisible(false);
					textElementU.setVisible(false);
					labelKosztkonsU.setVisible(false);
					textKosztkonsU.setVisible(false);
				}
				if(rKonserwacja.isSelected()==true) {
					labelOpisU.setVisible(false);
					textOpisU.setVisible(false);
					labelCenazRobU.setVisible(false);
					textCenazRobU.setVisible(false);
					labelCelU.setVisible(false);
					textCelU.setVisible(false);
					labelCenaU.setVisible(false);
					textCenaU.setVisible(false);
					labelElementU.setVisible(true);
					textElementU.setVisible(true);
					labelKosztkonsU.setVisible(true);
					textKosztkonsU.setVisible(true);
				}
				
			}
			
		});
		
		zapisZ = new JMenuItem("Zapisanie zleceñ do pliku");
		zlecenia.add(zapisZ);
		zapisZ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JFileChooser fc= new JFileChooser();
				if(fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION);
				try {
				File h = fc.getSelectedFile();
				FileWriter zapis = new FileWriter(h);
				for(int i=0;i<zleceniaLista.size();i++)
					zapis.write(zleceniaLista.get(i)+"\r\n"+"\r\n");
				zapis.close();
				JOptionPane.showMessageDialog(null, "Uda³o siê zapisaæ liste zleceñ");
				}catch(FileNotFoundException e1){
					e1.printStackTrace();
				}catch(IOException ex) {
					System.out.println("b³ad wejscia-wyjœcia");
				}
				
			}
			});
		
		odczytZ = new JMenuItem("Lista Zlecen");
		zlecenia.add(odczytZ);
		odczytZ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				OkienkoZlecenia oz = new OkienkoZlecenia(zleceniaLista);
				if(zleceniaLista.isEmpty()==true)
						JOptionPane.showMessageDialog(null, "Brak zapisanych zlecen");
			}
		});
		
		odczytZzPliku = new JMenuItem("Lista Zlecen z pliku");
		zlecenia.add(odczytZzPliku);
		odczytZzPliku.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				OkienkoZleceniaPlik oz2 = new OkienkoZleceniaPlik();
			}
		});

		dodajP = new JMenuItem("Dodanie pracowników do programu");
		pracownicy.add(dodajP);
		dodajP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				labelDodajP.setVisible(true);
				labelImieP.setVisible(true);
				labelNazwiskoP.setVisible(true);
				labelUlica.setVisible(true);
				labelKod.setVisible(true);
				labelMiejsc.setVisible(true);
				labelDataUr.setVisible(true);
				labelSpecjalizacjaP.setVisible(true);
				
				textImieP.setVisible(true);
				textNazwiskoP.setVisible(true);
				textUlica.setVisible(true);
				textKod.setVisible(true);
				textMiejsc.setVisible(true);
				comboDataUrRok.setVisible(true);
				comboDataUrMiesiac.setVisible(true);
				comboDataUrDzien.setVisible(true);
				textSpecjalizacjaP.setVisible(true);
				
				buttonDodajP.setVisible(true);
				buttonWrocP.setVisible(true);
				
				setSize(800, 800);
				labelTytul.setBounds(150, 20, 500, 50);
				labelDodajZ.setBounds(225, 90, 250, 50);
				buttonDodajZ.setBounds(325, 700, 150, 30);
				buttonWrocZ.setBounds(325, 700, 150, 30);
				
				rNaprawa.setVisible(false);
				rBadanie.setVisible(false);
				rKonserwacja.setVisible(false);
				rSamochod.setVisible(false);
				rMotocykl.setVisible(false);
				rCiagnik.setVisible(false);
				
				buttonDodajZ.setVisible(false);
				buttonWrocZ.setVisible(false);
				
				labelRodzajP.setVisible(false);
				labelRodzajU.setVisible(false);
				
				labelPaliwoP.setVisible(false);
				comboPaliwoP.setVisible(false);
				labelPojemnoscP.setVisible(false);
				comboPojemnoscP.setVisible(false);
				labelTurP.setVisible(false);
				comboTurP.setVisible(false);
				
				
				
				labelDodajZ.setVisible(false);
				labelID.setVisible(false);
				labelKlient.setVisible(false);
				labelImieK.setVisible(false);
				labelNazwiskoK.setVisible(false);
				labelAdresK.setVisible(false);
				labelUlicaK.setVisible(false);
				labelKodK.setVisible(false);
				labelMiastoK.setVisible(false);
				labelDataUrK.setVisible(false);
				labelZnizkaK.setVisible(false);
				labelPojazd.setVisible(false);
				labelMarkaP.setVisible(false);
				labelModelP.setVisible(false);
				labelRokpP.setVisible(false);
				labelNrrejP.setVisible(false);
				labelPrzebiegP.setVisible(false);
				labelDataprzegladuP.setVisible(false);
				labelUsluga.setVisible(false);
				labelDlugoscU.setVisible(false);
			
				textID.setVisible(false);
				textImieK.setVisible(false);
				textNazwiskoK.setVisible(false);
				textUlicaK.setVisible(false);
				textKodK.setVisible(false);
				textMiastoK.setVisible(false);
				comboDataUrRokK.setVisible(false);
				comboDataUrMiesiacK.setVisible(false);
				comboDataUrDzienK.setVisible(false);
				textZnizkaK.setVisible(false);
				textMarkaP.setVisible(false);
				textModelP.setVisible(false);
				textRokpP.setVisible(false);
				textNrrejP.setVisible(false);
				textPrzebiegP.setVisible(false);
				comboDataPrzeRok.setVisible(false);
				comboDataPrzeMiesiac.setVisible(false);
				comboDataPrzeDzien.setVisible(false);
				textDlugoscU.setVisible(false);
				
				labelOpisU.setVisible(false);
				textOpisU.setVisible(false);
				labelCenazRobU.setVisible(false);
				textCenazRobU.setVisible(false);
				labelCelU.setVisible(false);
				textCelU.setVisible(false);
				labelCenaU.setVisible(false);
				textCenaU.setVisible(false);
				labelElementU.setVisible(false);
				textElementU.setVisible(false);
				labelKosztkonsU.setVisible(false);
				textKosztkonsU.setVisible(false);
				
				
			}});
		
		zapisP = new JMenuItem("Zapisanie pracowników do pliku");
		pracownicy.add(zapisP);
		zapisP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				JFileChooser fc= new JFileChooser();
				if(fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION);
				try {
				File h = fc.getSelectedFile();
				FileWriter zapis = new FileWriter(h);
				for(int i=0;i<pracownicyLista.size();i++)
					zapis.write(pracownicyLista.get(i)+"\r\n"+"\r\n");
				zapis.close();
				JOptionPane.showMessageDialog(null, "Uda³o siê zapisaæ liste pracowników");
				}catch(FileNotFoundException e1){
					e1.printStackTrace();
				}catch(IOException ex) {
					System.out.println("b³ad wejscia-wyjœcia");
				}
				
			}
			});
		
		odczytP = new JMenuItem("Odczytanie listy pracowników lub ich usuniecie");
		pracownicy.add(odczytP);
		odczytP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				OkienkoPracownicy op = new OkienkoPracownicy(pracownicyLista);
			}
		}
		
		);
		
		odczytPzPliku = new JMenuItem("Lista pracowników z pliku");
		pracownicy.add(odczytPzPliku);
		odczytPzPliku.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				OkienkoPracownicyPlik op2 = new OkienkoPracownicyPlik();
			}
		});
		
		dane = new JMenuItem("Dane firmy");
		informacja.add(dane);
		dane.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				OkienkoDane dane = new OkienkoDane();
			}
		}
		
		);
		
		autor = new JMenuItem("Autor programu");
		informacja.add(autor);
		autor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				OkienkoAutor autor = new OkienkoAutor();
			}
		}
		
		);
		
		labelTytul = new JLabel("WITAM W WARSZTACIE POJAZDÓW");
		labelTytul.setHorizontalAlignment(JLabel.CENTER);
		labelTytul.setBounds(150, 20, 500, 50);
		labelTytul.setForeground(Color.BLACK);
		labelTytul.setFont(new Font("Arial", Font.BOLD, 25));
		labelTytul.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100)));
		add(labelTytul);
		
		labelDodajP = new JLabel("DODAWANIE PRACOWNIKA");
		labelDodajP.setBounds(250, 90, 250, 50);
		labelDodajP.setForeground(Color.BLACK);
		labelDodajP.setHorizontalAlignment(JLabel.CENTER);
		labelDodajP.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100)));
		add(labelDodajP);
		labelDodajP.setVisible(false);
		
		labelImieP = new JLabel("Imie pracownika:");
		labelImieP.setBounds(50, 160, 150, 30);
		labelImieP.setForeground(Color.BLACK);
		add(labelImieP);
		labelImieP.setVisible(false);
		
		textImieP=new JTextField();
		textImieP.setBounds(190, 160, 180, 30);
		add(textImieP);
		textImieP.setVisible(false);
		
		labelNazwiskoP = new JLabel("Nazwisko pracownika:");
		labelNazwiskoP.setBounds(50, 200, 150, 30);
		labelNazwiskoP.setForeground(Color.BLACK);
		add(labelNazwiskoP);
		labelNazwiskoP.setVisible(false);
		
		textNazwiskoP=new JTextField();
		textNazwiskoP.setBounds(190, 200, 180, 30);
		add(textNazwiskoP);
		textNazwiskoP.setVisible(false);
		
		labelUlica = new JLabel("Ulica:");
		labelUlica.setBounds(50, 240, 150, 30);
		labelUlica.setForeground(Color.BLACK);
		add(labelUlica);
		labelUlica.setVisible(false);
		
		textUlica=new JTextField();
		textUlica.setBounds(190, 240, 180, 30);
		add(textUlica);
		textUlica.setVisible(false);
		
		labelKod = new JLabel("Kod:");
		labelKod.setBounds(50, 280, 150, 30);
		labelKod.setForeground(Color.BLACK);
		add(labelKod);
		labelKod.setVisible(false);
		
		textKod=new JTextField();
		textKod.setBounds(190, 280, 180, 30);
		add(textKod);
		textKod.setVisible(false);
		
		labelMiejsc = new JLabel("Miejscowoœæ: ");
		labelMiejsc.setBounds(50, 320, 150, 30);
		labelMiejsc.setForeground(Color.BLACK);
		add(labelMiejsc);
		labelMiejsc.setVisible(false);
		
		textMiejsc=new JTextField();
		textMiejsc.setBounds(190, 320, 180, 30);
		add(textMiejsc);
		textMiejsc.setVisible(false);
		
		labelDataUr = new JLabel("Data urodzenia:");
		labelDataUr.setBounds(50, 360, 150, 30);
		labelDataUr.setForeground(Color.BLACK);
		add(labelDataUr);
		labelDataUr.setVisible(false);
		
		String lata[]= {"1918","1919","1920","1921","1922","1923","1924","1925","1926","1927","1928",
				"1929","1930","1931","1932","1933","1934","1935","1936","1937","1938","1939","1940","1942",
				"1943","1944","1945","1946","1948","1949","1950","1951","1952","1953","1954","1955","1956",
				"1957","1958","1959","1960","1961","1962","1963","1964","1965","1966","1967","1968","1969",
				"1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982",
				"1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995",
				"1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008",
				"2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
		comboDataUrRok=new JComboBox<String>(lata);
		comboDataUrRok.setBounds(190, 360, 70, 30);
		add(comboDataUrRok);
		comboDataUrRok.setVisible(false);
		
		String miesiace[]= {"1","2","3","4","5","6","7","8",
				"9","10","11","12"};
		comboDataUrMiesiac=new JComboBox<String>(miesiace);
		comboDataUrMiesiac.setBounds(275, 360, 50, 30);
		add(comboDataUrMiesiac);
		comboDataUrMiesiac.setVisible(false);
		
		String dni[]= {"1","2","3","4","5","6","7","8",
				"9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26",
				"27","28","29","30","31"};
		comboDataUrDzien=new JComboBox<String>(dni);
		comboDataUrDzien.setBounds(335, 360, 70, 30);
		add(comboDataUrDzien);
		comboDataUrDzien.setVisible(false);
		
		labelSpecjalizacjaP = new JLabel("Specjalizacja:");
		labelSpecjalizacjaP.setBounds(50, 400, 150, 30);
		labelSpecjalizacjaP.setForeground(Color.BLACK);
		add(labelSpecjalizacjaP);
		labelSpecjalizacjaP.setVisible(false);
		
		textSpecjalizacjaP=new JTextField();
		textSpecjalizacjaP.setBounds(190, 400, 180, 30);
		add(textSpecjalizacjaP);
		textSpecjalizacjaP.setVisible(false);
		
		buttonWrocP = new JButton("Wroc");
		buttonWrocP.setBounds(525, 700, 150, 30);
		add(buttonWrocP);
		buttonWrocP.setVisible(false);
		buttonWrocP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				labelDodajP.setVisible(false);
				labelImieP.setVisible(false);
				labelNazwiskoP.setVisible(false);
				labelUlica.setVisible(false);
				labelKod.setVisible(false);
				labelMiejsc.setVisible(false);
				labelDataUr.setVisible(false);
				labelSpecjalizacjaP.setVisible(false);
				textImieP.setVisible(false);
				textNazwiskoP.setVisible(false);
				textUlica.setVisible(false);
				textKod.setVisible(false);
				textMiejsc.setVisible(false);
				comboDataUrRok.setVisible(false);
				comboDataUrMiesiac.setVisible(false);
				comboDataUrDzien.setVisible(false);
				textSpecjalizacjaP.setVisible(false);
				buttonDodajP.setVisible(false);
				buttonWrocP.setVisible(false);
				
				textImieP.setText("");
				textNazwiskoP.setText("");
				textUlica.setText("");
				textKod.setText("");
				textMiejsc.setText("");
				textSpecjalizacjaP.setText("");
				
	
		}
		}
		);
		
		buttonDodajP = new JButton("Dodaj pracownika");
		buttonDodajP.setBounds(325, 700, 150, 30);
		add(buttonDodajP);
		buttonDodajP.setVisible(false);
		buttonDodajP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(textImieP.getText().isEmpty()==true || textNazwiskoP.getText().isEmpty()==true || 
						textUlica.getText().isEmpty()==true ||
						textKod.getText().isEmpty()==true ||
						textMiejsc.getText().isEmpty()==true ||
						textSpecjalizacjaP.getText().isEmpty()==true )
				JOptionPane.showMessageDialog(null, "Podaj wszystkie dane");
				else {
				labelTytul.setBounds(150, 20, 500, 50);
				labelDodajZ.setBounds(225, 90, 250, 50);
				buttonDodajZ.setBounds(325, 700, 150, 30);
				buttonWrocZ.setBounds(325, 700, 150, 30);
				
				rNaprawa.setVisible(false);
				rBadanie.setVisible(false);
				rKonserwacja.setVisible(false);
				rSamochod.setVisible(false);
				rMotocykl.setVisible(false);
				rCiagnik.setVisible(false);
				
				buttonDodajZ.setVisible(false);
				buttonWrocZ.setVisible(false);
				
				labelRodzajP.setVisible(false);
				labelRodzajU.setVisible(false);
				
				labelPaliwoP.setVisible(false);
				comboPaliwoP.setVisible(false);
				labelPojemnoscP.setVisible(false);
				comboPojemnoscP.setVisible(false);
				labelTurP.setVisible(false);
				comboTurP.setVisible(false);
				
				labelOpisU.setVisible(false);
				textOpisU.setVisible(false);
				labelCenazRobU.setVisible(false);
				textCenazRobU.setVisible(false);
				labelCelU.setVisible(false);
				textCelU.setVisible(false);
				labelCenaU.setVisible(false);
				textCenaU.setVisible(false);
				labelElementU.setVisible(false);
				textElementU.setVisible(false);
				labelKosztkonsU.setVisible(false);
				textKosztkonsU.setVisible(false);
				
				labelDodajZ.setVisible(false);
				labelID.setVisible(false);
				labelKlient.setVisible(false);
				labelImieK.setVisible(false);
				labelNazwiskoK.setVisible(false);
				labelAdresK.setVisible(false);
				labelUlicaK.setVisible(false);
				labelKodK.setVisible(false);
				labelMiastoK.setVisible(false);
				labelDataUrK.setVisible(false);
				labelZnizkaK.setVisible(false);
				labelPojazd.setVisible(false);
				labelMarkaP.setVisible(false);
				labelModelP.setVisible(false);
				labelRokpP.setVisible(false);
				labelNrrejP.setVisible(false);
				labelPrzebiegP.setVisible(false);
				labelDataprzegladuP.setVisible(false);
				labelUsluga.setVisible(false);
				labelDlugoscU.setVisible(false);
			
				textID.setVisible(false);
				textImieK.setVisible(false);
				textNazwiskoK.setVisible(false);
				textUlicaK.setVisible(false);
				textKodK.setVisible(false);
				textMiastoK.setVisible(false);
				comboDataUrRokK.setVisible(false);
				comboDataUrMiesiacK.setVisible(false);
				comboDataUrDzienK.setVisible(false);
				textZnizkaK.setVisible(false);
				textMarkaP.setVisible(false);
				textModelP.setVisible(false);
				textRokpP.setVisible(false);
				textNrrejP.setVisible(false);
				textPrzebiegP.setVisible(false);
				comboDataPrzeRok.setVisible(false);
				comboDataPrzeMiesiac.setVisible(false);
				comboDataPrzeDzien.setVisible(false);
				textDlugoscU.setVisible(false);
				
				pracownicyLista.add(new Pracownicy(textImieP.getText(),textNazwiskoP.getText(),new Adres(textUlica.getText(),textKod.getText(),textMiejsc.getText()),LocalDate.of(Integer.parseInt(comboDataUrRok.getSelectedItem().toString()), Integer.parseInt(comboDataUrMiesiac.getSelectedItem().toString()), Integer.parseInt(comboDataUrDzien.getSelectedItem().toString())),textSpecjalizacjaP.getText()));
				
				textImieP.setText("");
				textNazwiskoP.setText("");
				textUlica.setText("");
				textKod.setText("");
				textMiejsc.setText("");

				textSpecjalizacjaP.setText("");
				
				}
		}
		}
		);
		
		buttonDodajZ = new JButton("Dodaj zlecenie");
		buttonDodajZ.setBounds(325, 700, 150, 30);
		add(buttonDodajZ);
		buttonDodajZ.setVisible(false);
		buttonDodajZ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(textImieK.getText().isEmpty()==true || 
						textNazwiskoK.getText().isEmpty()==true || 
						textUlicaK.getText().isEmpty()==true ||
						textKodK.getText().isEmpty()==true ||
						textMiastoK.getText().isEmpty()==true ||
						textZnizkaK.getText().isEmpty()==true ||
						textZnizkaK.getText().isEmpty()==true ||
						textMarkaP.getText().isEmpty()==true || 
						textModelP.getText().isEmpty()==true ||
						textRokpP.getText().isEmpty()==true ||
						textNrrejP.getText().isEmpty()==true ||
						textPrzebiegP.getText().isEmpty()==true ||
						textDlugoscU.getText().isEmpty()==true )
				JOptionPane.showMessageDialog(null, "Podaj wszystkie dane");
				else {
				
				if(rSamochod.isSelected()==true) {
				
				if(rNaprawa.isSelected()==true) {
					if(textOpisU.getText().isEmpty()==true || 
					   textCenazRobU.getText().isEmpty()==true)
					JOptionPane.showMessageDialog(null, "Podaj wszystkie dane");
					else {	
				zleceniaLista.add(new Zlecenie (Zlecenie.getCountIdZlecenie(),
						new Klient(textImieK.getText(),textNazwiskoK.getText(),new Adres(textUlicaK.getText(),textKodK.getText(),textMiastoK.getText()),LocalDate.of(Integer.parseInt(comboDataUrRokK.getSelectedItem().toString()),Integer.parseInt(comboDataUrMiesiacK.getSelectedItem().toString()),Integer.parseInt(comboDataUrDzienK.getSelectedItem().toString())),Integer.parseInt(textZnizkaK.getText())),
						new Samochod(textMarkaP.getText(),textModelP.getText(),Integer.parseInt(textRokpP.getText()),textNrrejP.getText(),Integer.parseInt(textPrzebiegP.getText()),LocalDate.of(Integer.parseInt(comboDataPrzeRok.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeMiesiac.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeDzien.getSelectedItem().toString())),comboPaliwoP.getSelectedItem().toString()),
						new Naprawa(Integer.parseInt(textDlugoscU.getText()),textOpisU.getText(),Double.parseDouble(textCenazRobU.getText())), 
						LocalDate.now(), 
						LocalDate.now().plusDays(Long.parseLong(textDlugoscU.getText())),
						Double.parseDouble(textCenazRobU.getText())-Double.parseDouble(textCenazRobU.getText())*(Double.parseDouble(textZnizkaK.getText())/100)));
				textImieK.setText("");
				textNazwiskoK.setText("");
				textUlicaK.setText("");
				textKodK.setText("");
				textMiastoK.setText("");
				textZnizkaK.setText("");
				textMarkaP.setText("");
				textModelP.setText("");
				textRokpP.setText("");
				textNrrejP.setText("");
				textPrzebiegP.setText("");
				textDlugoscU.setText("");
				textOpisU.setText("");
				textCenazRobU.setText("");
				textCelU.setText("");
				textCenaU.setText("");
				textElementU.setText("");
				textKosztkonsU.setText("");
				
				}
				}
				if(rBadanie.isSelected()==true) {
					
					if(textCelU.getText().isEmpty()==true || 
							textCenaU.getText().isEmpty()==true)
							JOptionPane.showMessageDialog(null, "Podaj wszystkie dane");
							else {
				zleceniaLista.add(new Zlecenie (Zlecenie.getCountIdZlecenie(),
						new Klient(textImieK.getText(),textNazwiskoK.getText(),new Adres(textUlicaK.getText(),textKodK.getText(),textMiastoK.getText()),LocalDate.of(Integer.parseInt(comboDataUrRokK.getSelectedItem().toString()),Integer.parseInt(comboDataUrMiesiacK.getSelectedItem().toString()),Integer.parseInt(comboDataUrDzienK.getSelectedItem().toString())),Integer.parseInt(textZnizkaK.getText())),
						new Samochod(textMarkaP.getText(),textModelP.getText(),Integer.parseInt(textRokpP.getText()),textNrrejP.getText(),Integer.parseInt(textPrzebiegP.getText()),LocalDate.of(Integer.parseInt(comboDataPrzeRok.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeMiesiac.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeDzien.getSelectedItem().toString())),comboPaliwoP.getSelectedItem().toString()),
						new Badanie(Integer.parseInt(textDlugoscU.getText()),textCelU.getText(),Double.parseDouble(textCenaU.getText())), 
						LocalDate.now(), 
						LocalDate.now().plusDays(Long.parseLong(textDlugoscU.getText())),
						(Double.parseDouble(textCenaU.getText())-Double.parseDouble(textCenaU.getText())*Double.parseDouble(textZnizkaK.getText())/100)
						));
				textImieK.setText("");
				textNazwiskoK.setText("");
				textUlicaK.setText("");
				textKodK.setText("");
				textMiastoK.setText("");
				textZnizkaK.setText("");
				textMarkaP.setText("");
				textModelP.setText("");
				textRokpP.setText("");
				textNrrejP.setText("");
				textPrzebiegP.setText("");
				textDlugoscU.setText("");
				textOpisU.setText("");
				textCenazRobU.setText("");
				textCelU.setText("");
				textCenaU.setText("");
				textElementU.setText("");
				textKosztkonsU.setText("");
				
				}
				}
				
				
				if(rKonserwacja.isSelected()==true) {
					if(textElementU.getText().isEmpty()==true || 
							textKosztkonsU.getText().isEmpty()==true)
							JOptionPane.showMessageDialog(null, "Podaj wszystkie dane");
							else {
				zleceniaLista.add(new Zlecenie (Zlecenie.getCountIdZlecenie(),
						new Klient(textImieK.getText(),textNazwiskoK.getText(),new Adres(textUlicaK.getText(),textKodK.getText(),textMiastoK.getText()),LocalDate.of(Integer.parseInt(comboDataUrRokK.getSelectedItem().toString()),Integer.parseInt(comboDataUrMiesiacK.getSelectedItem().toString()),Integer.parseInt(comboDataUrDzienK.getSelectedItem().toString())),Integer.parseInt(textZnizkaK.getText())),
						new Samochod(textMarkaP.getText(),textModelP.getText(),Integer.parseInt(textRokpP.getText()),textNrrejP.getText(),Integer.parseInt(textPrzebiegP.getText()),LocalDate.of(Integer.parseInt(comboDataPrzeRok.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeMiesiac.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeDzien.getSelectedItem().toString())),comboPaliwoP.getSelectedItem().toString()),
						new Konserwacja(Integer.parseInt(textDlugoscU.getText()),textElementU.getText(),Double.parseDouble(textKosztkonsU.getText())), 
						LocalDate.now(), 
						LocalDate.now().plusDays(Long.parseLong(textDlugoscU.getText())),
						(Double.parseDouble(textKosztkonsU.getText())-Double.parseDouble(textKosztkonsU.getText())*Double.parseDouble(textZnizkaK.getText())/100)
						));
				textImieK.setText("");
				textNazwiskoK.setText("");
				textUlicaK.setText("");
				textKodK.setText("");
				textMiastoK.setText("");
				textZnizkaK.setText("");
				textMarkaP.setText("");
				textModelP.setText("");
				textRokpP.setText("");
				textNrrejP.setText("");
				textPrzebiegP.setText("");
				textDlugoscU.setText("");
				textOpisU.setText("");
				textCenazRobU.setText("");
				textCelU.setText("");
				textCenaU.setText("");
				textElementU.setText("");
				textKosztkonsU.setText("");
					
				}
					}
				}
				
				if(rMotocykl.isSelected()==true) {
					
					if(rNaprawa.isSelected()==true) {
						if(textOpisU.getText().isEmpty()==true || 
								   textCenazRobU.getText().isEmpty()==true)
								JOptionPane.showMessageDialog(null, "Podaj wszystkie dane");
								else {
				zleceniaLista.add(new Zlecenie (Zlecenie.getCountIdZlecenie(),
						new Klient(textImieK.getText(),textNazwiskoK.getText(),new Adres(textUlicaK.getText(),textKodK.getText(),textMiastoK.getText()),LocalDate.of(Integer.parseInt(comboDataUrRokK.getSelectedItem().toString()),Integer.parseInt(comboDataUrMiesiacK.getSelectedItem().toString()),Integer.parseInt(comboDataUrDzienK.getSelectedItem().toString())),Integer.parseInt(textZnizkaK.getText())),
						new Motocykl(textMarkaP.getText(),textModelP.getText(),Integer.parseInt(textRokpP.getText()),textNrrejP.getText(),Integer.parseInt(textPrzebiegP.getText()),LocalDate.of(Integer.parseInt(comboDataPrzeRok.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeMiesiac.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeDzien.getSelectedItem().toString())),Integer.parseInt(comboPojemnoscP.getSelectedItem().toString())),
						new Naprawa(Integer.parseInt(textDlugoscU.getText()),textOpisU.getText(),Double.parseDouble(textCenazRobU.getText())), 
						LocalDate.now(), 
						LocalDate.now().plusDays(Long.parseLong(textDlugoscU.getText())),
						(Double.parseDouble(textCenazRobU.getText())-Double.parseDouble(textCenazRobU.getText())*Double.parseDouble(textZnizkaK.getText())/100)
						));
				textImieK.setText("");
				textNazwiskoK.setText("");
				textUlicaK.setText("");
				textKodK.setText("");
				textMiastoK.setText("");
				textZnizkaK.setText("");
				textMarkaP.setText("");
				textModelP.setText("");
				textRokpP.setText("");
				textNrrejP.setText("");
				textPrzebiegP.setText("");
				textDlugoscU.setText("");
				textOpisU.setText("");
				textCenazRobU.setText("");
				textCelU.setText("");
				textCenaU.setText("");
				textElementU.setText("");
				textKosztkonsU.setText("");
						
						}}
					if(rBadanie.isSelected()==true) {
						if(textCelU.getText().isEmpty()==true || 
								textCenaU.getText().isEmpty()==true)
								JOptionPane.showMessageDialog(null, "Podaj wszystkie dane");
								else {
				zleceniaLista.add(new Zlecenie (Zlecenie.getCountIdZlecenie(),
						new Klient(textImieK.getText(),textNazwiskoK.getText(),new Adres(textUlicaK.getText(),textKodK.getText(),textMiastoK.getText()),LocalDate.of(Integer.parseInt(comboDataUrRokK.getSelectedItem().toString()),Integer.parseInt(comboDataUrMiesiacK.getSelectedItem().toString()),Integer.parseInt(comboDataUrDzienK.getSelectedItem().toString())),Integer.parseInt(textZnizkaK.getText())),
						new Motocykl(textMarkaP.getText(),textModelP.getText(),Integer.parseInt(textRokpP.getText()),textNrrejP.getText(),Integer.parseInt(textPrzebiegP.getText()),LocalDate.of(Integer.parseInt(comboDataPrzeRok.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeMiesiac.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeDzien.getSelectedItem().toString())),Integer.parseInt(comboPojemnoscP.getSelectedItem().toString())),
						new Badanie(Integer.parseInt(textDlugoscU.getText()),textCelU.getText(),Double.parseDouble(textCenaU.getText())), 
						LocalDate.now(), 
						LocalDate.now().plusDays(Long.parseLong(textDlugoscU.getText())),
						(Double.parseDouble(textCenaU.getText())-Double.parseDouble(textCenaU.getText())*Double.parseDouble(textZnizkaK.getText())/100)							
						));
				textImieK.setText("");
				textNazwiskoK.setText("");
				textUlicaK.setText("");
				textKodK.setText("");
				textMiastoK.setText("");
				textZnizkaK.setText("");
				textMarkaP.setText("");
				textModelP.setText("");
				textRokpP.setText("");
				textNrrejP.setText("");
				textPrzebiegP.setText("");
				textDlugoscU.setText("");
				textOpisU.setText("");
				textCenazRobU.setText("");
				textCelU.setText("");
				textCenaU.setText("");
				textElementU.setText("");
				textKosztkonsU.setText("");
				}}
						
						if(rKonserwacja.isSelected()==true) {
							if(textElementU.getText().isEmpty()==true || 
									textKosztkonsU.getText().isEmpty()==true)
									JOptionPane.showMessageDialog(null, "Podaj wszystkie dane");
									else {
				zleceniaLista.add(new Zlecenie (Zlecenie.getCountIdZlecenie(),
						new Klient(textImieK.getText(),textNazwiskoK.getText(),new Adres(textUlicaK.getText(),textKodK.getText(),textMiastoK.getText()),LocalDate.of(Integer.parseInt(comboDataUrRokK.getSelectedItem().toString()),Integer.parseInt(comboDataUrMiesiacK.getSelectedItem().toString()),Integer.parseInt(comboDataUrDzienK.getSelectedItem().toString())),Integer.parseInt(textZnizkaK.getText())),
						new Motocykl(textMarkaP.getText(),textModelP.getText(),Integer.parseInt(textRokpP.getText()),textNrrejP.getText(),Integer.parseInt(textPrzebiegP.getText()),LocalDate.of(Integer.parseInt(comboDataPrzeRok.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeMiesiac.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeDzien.getSelectedItem().toString())),Integer.parseInt(comboPojemnoscP.getSelectedItem().toString())),
						new Konserwacja(Integer.parseInt(textDlugoscU.getText()),textElementU.getText(),Double.parseDouble(textKosztkonsU.getText())), 
						LocalDate.now(), 
						LocalDate.now().plusDays(Long.parseLong(textDlugoscU.getText())),
						(Double.parseDouble(textKosztkonsU.getText())-Double.parseDouble(textKosztkonsU.getText())*Double.parseDouble(textZnizkaK.getText())/100)
						));
				textImieK.setText("");
				textNazwiskoK.setText("");
				textUlicaK.setText("");
				textKodK.setText("");
				textMiastoK.setText("");
				textZnizkaK.setText("");
				textMarkaP.setText("");
				textModelP.setText("");
				textRokpP.setText("");
				textNrrejP.setText("");
				textPrzebiegP.setText("");
				textDlugoscU.setText("");
				textOpisU.setText("");
				textCenazRobU.setText("");
				textCelU.setText("");
				textCenaU.setText("");
				textElementU.setText("");
				textKosztkonsU.setText("");
									}}
					
					
				}
				
				if(rCiagnik.isSelected()==true) {
					
					if(rNaprawa.isSelected()==true) {
						if(textOpisU.getText().isEmpty()==true || 
								   textCenazRobU.getText().isEmpty()==true)
								JOptionPane.showMessageDialog(null, "Podaj wszystkie dane");
								else {
						zleceniaLista.add(new Zlecenie (Zlecenie.getCountIdZlecenie(),
							  new Klient(textImieK.getText(),textNazwiskoK.getText(),new Adres(textUlicaK.getText(),textKodK.getText(),textMiastoK.getText()),LocalDate.of(Integer.parseInt(comboDataUrRokK.getSelectedItem().toString()),Integer.parseInt(comboDataUrMiesiacK.getSelectedItem().toString()),Integer.parseInt(comboDataUrDzienK.getSelectedItem().toString())),Integer.parseInt(textZnizkaK.getText())),
							  new Ciagnik(textMarkaP.getText(),textModelP.getText(),Integer.parseInt(textRokpP.getText()),textNrrejP.getText(),Integer.parseInt(textPrzebiegP.getText()),LocalDate.of(Integer.parseInt(comboDataPrzeRok.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeMiesiac.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeDzien.getSelectedItem().toString())),comboTurP.getSelectedItem().toString()),
							  new Naprawa(Integer.parseInt(textDlugoscU.getText()),textOpisU.getText(),Double.parseDouble(textCenazRobU.getText())), 
							  LocalDate.now(), 
							  LocalDate.now().plusDays(Long.parseLong(textDlugoscU.getText())),
							  (Double.parseDouble(textCenazRobU.getText())-Double.parseDouble(textCenazRobU.getText())*Double.parseDouble(textZnizkaK.getText())/100)
							  ));
						textImieK.setText("");
						textNazwiskoK.setText("");
						textUlicaK.setText("");
						textKodK.setText("");
						textMiastoK.setText("");
						textZnizkaK.setText("");
						textMarkaP.setText("");
						textModelP.setText("");
						textRokpP.setText("");
						textNrrejP.setText("");
						textPrzebiegP.setText("");
						textDlugoscU.setText("");
						textOpisU.setText("");
						textCenazRobU.setText("");
						textCelU.setText("");
						textCenaU.setText("");
						textElementU.setText("");
						textKosztkonsU.setText("");
						
						}}
						if(rBadanie.isSelected()==true) {
							if(textCelU.getText().isEmpty()==true || 
									textCenaU.getText().isEmpty()==true)
									JOptionPane.showMessageDialog(null, "Podaj wszystkie dane");
									else {
							zleceniaLista.add(new Zlecenie (Zlecenie.getCountIdZlecenie(),
									  new Klient(textImieK.getText(),textNazwiskoK.getText(),new Adres(textUlicaK.getText(),textKodK.getText(),textMiastoK.getText()),LocalDate.of(Integer.parseInt(comboDataUrRokK.getSelectedItem().toString()),Integer.parseInt(comboDataUrMiesiacK.getSelectedItem().toString()),Integer.parseInt(comboDataUrDzienK.getSelectedItem().toString())),Integer.parseInt(textZnizkaK.getText())),
									  new Ciagnik(textMarkaP.getText(),textModelP.getText(),Integer.parseInt(textRokpP.getText()),textNrrejP.getText(),Integer.parseInt(textPrzebiegP.getText()),LocalDate.of(Integer.parseInt(comboDataPrzeRok.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeMiesiac.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeDzien.getSelectedItem().toString())),comboTurP.getSelectedItem().toString()),
									  new Badanie(Integer.parseInt(textDlugoscU.getText()),textCelU.getText(),Double.parseDouble(textCenaU.getText())), 
									  LocalDate.now(), 
									  LocalDate.now().plusDays(Long.parseLong(textDlugoscU.getText())),
									  (Double.parseDouble(textCenaU.getText())-Double.parseDouble(textCenaU.getText())*Double.parseDouble(textZnizkaK.getText()))/100
									  ));
							textImieK.setText("");
							textNazwiskoK.setText("");
							textUlicaK.setText("");
							textKodK.setText("");
							textMiastoK.setText("");
							textZnizkaK.setText("");
							textMarkaP.setText("");
							textModelP.setText("");
							textRokpP.setText("");
							textNrrejP.setText("");
							textPrzebiegP.setText("");
							textDlugoscU.setText("");
							textOpisU.setText("");
							textCenazRobU.setText("");
							textCelU.setText("");
							textCenaU.setText("");
							textElementU.setText("");
							textKosztkonsU.setText("");
						
						}}
						
						if(rKonserwacja.isSelected()==true) {
							if(textElementU.getText().isEmpty()==true || 
									textKosztkonsU.getText().isEmpty()==true)
									JOptionPane.showMessageDialog(null, "Podaj wszystkie dane");
									else {
							zleceniaLista.add(new Zlecenie (Zlecenie.getCountIdZlecenie(),
									  new Klient(textImieK.getText(),textNazwiskoK.getText(),new Adres(textUlicaK.getText(),textKodK.getText(),textMiastoK.getText()),LocalDate.of(Integer.parseInt(comboDataUrRokK.getSelectedItem().toString()),Integer.parseInt(comboDataUrMiesiacK.getSelectedItem().toString()),Integer.parseInt(comboDataUrDzienK.getSelectedItem().toString())),Integer.parseInt(textZnizkaK.getText())),
									  new Ciagnik(textMarkaP.getText(),textModelP.getText(),Integer.parseInt(textRokpP.getText()),textNrrejP.getText(),Integer.parseInt(textPrzebiegP.getText()),LocalDate.of(Integer.parseInt(comboDataPrzeRok.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeMiesiac.getSelectedItem().toString()),Integer.parseInt(comboDataPrzeDzien.getSelectedItem().toString())),comboTurP.getSelectedItem().toString()),
									  new Konserwacja(Integer.parseInt(textDlugoscU.getText()),textElementU.getText(),Double.parseDouble(textKosztkonsU.getText())), 
									  LocalDate.now(), 
									  LocalDate.now().plusDays(Long.parseLong(textDlugoscU.getText())),
									  (Double.parseDouble(textKosztkonsU.getText())-Double.parseDouble(textKosztkonsU.getText())*Double.parseDouble(textZnizkaK.getText()))/100
									  ));
							textImieK.setText("");
							textNazwiskoK.setText("");
							textUlicaK.setText("");
							textKodK.setText("");
							textMiastoK.setText("");
							textZnizkaK.setText("");
							textMarkaP.setText("");
							textModelP.setText("");
							textRokpP.setText("");
							textNrrejP.setText("");
							textPrzebiegP.setText("");
							textDlugoscU.setText("");
							textOpisU.setText("");
							textCenazRobU.setText("");
							textCelU.setText("");
							textCenaU.setText("");
							textElementU.setText("");
							textKosztkonsU.setText("");
									}
						}
					
				}
				
				
				if(zleceniaLista.size()<=Zlecenie.getCountIdZlecenie()) {
					Zlecenie.setCountIdZlecenie(Zlecenie.getCountIdZlecenie()+1);
					textID.setText(String.valueOf(Zlecenie.getCountIdZlecenie()));
				}
				
				
				
		}
		}	
		}
		
		);
		
		buttonWrocZ = new JButton("Wroc");
		buttonWrocZ.setBounds(525, 700, 150, 30);
		add(buttonWrocZ);
		buttonWrocZ.setVisible(false);
		buttonWrocZ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setSize(800, 800);
				labelTytul.setBounds(150, 20, 500, 50);
				labelDodajZ.setBounds(225, 90, 250, 50);
				buttonDodajZ.setBounds(325, 700, 150, 30);
				buttonWrocZ.setBounds(325, 700, 150, 30);
				
				rNaprawa.setVisible(false);
				rBadanie.setVisible(false);
				rKonserwacja.setVisible(false);
				rSamochod.setVisible(false);
				rMotocykl.setVisible(false);
				rCiagnik.setVisible(false);
				
				buttonDodajZ.setVisible(false);
				buttonWrocZ.setVisible(false);
				
				labelRodzajP.setVisible(false);
				labelRodzajU.setVisible(false);
				
				labelPaliwoP.setVisible(false);
				comboPaliwoP.setVisible(false);
				labelPojemnoscP.setVisible(false);
				comboPojemnoscP.setVisible(false);
				labelTurP.setVisible(false);
				comboTurP.setVisible(false);
				
				labelOpisU.setVisible(false);
				textOpisU.setVisible(false);
				labelCenazRobU.setVisible(false);
				textCenazRobU.setVisible(false);
				labelCelU.setVisible(false);
				textCelU.setVisible(false);
				labelCenaU.setVisible(false);
				textCenaU.setVisible(false);
				labelElementU.setVisible(false);
				textElementU.setVisible(false);
				labelKosztkonsU.setVisible(false);
				textKosztkonsU.setVisible(false);
				
				labelDodajZ.setVisible(false);
				labelID.setVisible(false);
				labelKlient.setVisible(false);
				labelImieK.setVisible(false);
				labelNazwiskoK.setVisible(false);
				labelAdresK.setVisible(false);
				labelUlicaK.setVisible(false);
				labelKodK.setVisible(false);
				labelMiastoK.setVisible(false);
				labelDataUrK.setVisible(false);
				labelZnizkaK.setVisible(false);
				labelPojazd.setVisible(false);
				labelMarkaP.setVisible(false);
				labelModelP.setVisible(false);
				labelRokpP.setVisible(false);
				labelNrrejP.setVisible(false);
				labelPrzebiegP.setVisible(false);
				labelDataprzegladuP.setVisible(false);
				labelUsluga.setVisible(false);
				labelDlugoscU.setVisible(false);
			
				textID.setVisible(false);
				textImieK.setVisible(false);
				textNazwiskoK.setVisible(false);
				textUlicaK.setVisible(false);
				textKodK.setVisible(false);
				textMiastoK.setVisible(false);
				comboDataUrRokK.setVisible(false);
				comboDataUrMiesiacK.setVisible(false);
				comboDataUrDzienK.setVisible(false);
				textZnizkaK.setVisible(false);
				textMarkaP.setVisible(false);
				textModelP.setVisible(false);
				textRokpP.setVisible(false);
				textNrrejP.setVisible(false);
				textPrzebiegP.setVisible(false);
				comboDataPrzeRok.setVisible(false);
				comboDataPrzeMiesiac.setVisible(false);
				comboDataPrzeDzien.setVisible(false);
				textDlugoscU.setVisible(false);
				
				textImieK.setText("");
				textNazwiskoK.setText("");
				textUlicaK.setText("");
				textKodK.setText("");
				textMiastoK.setText("");
				textZnizkaK.setText("");
				textMarkaP.setText("");
				textModelP.setText("");
				textRokpP.setText("");
				textNrrejP.setText("");
				textPrzebiegP.setText("");
				textDlugoscU.setText("");
				textOpisU.setText("");
				textCenazRobU.setText("");
				textCelU.setText("");
				textCenaU.setText("");
				textElementU.setText("");
				textKosztkonsU.setText("");
			
			
			
		}
		}
		);
		labelDodajZ = new JLabel("DODAWANIE ZLECEN");
		labelDodajZ.setBounds(250, 90, 250, 50);
		labelDodajZ.setForeground(Color.BLACK);
		labelDodajZ.setHorizontalAlignment(JLabel.CENTER);
		labelDodajZ.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100)));
		add(labelDodajZ);
		labelDodajZ.setVisible(false);
		
		labelID = new JLabel("ID zlecenia:");
		labelID.setBounds(50, 160, 150, 30);
		labelID.setForeground(Color.BLACK);
		add(labelID);
		labelID.setVisible(false);
		
		textID=new JTextField();
		Zlecenie.setCountIdZlecenie(Zlecenie.getCountIdZlecenie()+1);
		int k=Zlecenie.getCountIdZlecenie();
		textID.setText(String.valueOf(k));
		textID.setBounds(190, 160, 180, 30);
		add(textID);
		textID.setEditable(false);
		textID.setVisible(false);
		
		labelKlient = new JLabel("Klient");
		labelKlient.setBounds(50, 200, 150, 30);
		labelKlient.setForeground(Color.BLACK);
		add(labelKlient);
		labelKlient.setVisible(false);
		
		labelImieK = new JLabel("Imie klienta:");
		labelImieK.setBounds(50, 240, 150, 30);
		labelImieK.setForeground(Color.BLACK);
		add(labelImieK);
		labelImieK.setVisible(false);
		
		textImieK=new JTextField();
		textImieK.setBounds(190, 240, 180, 30);
		add(textImieK);
		textImieK.setVisible(false);
		
		labelNazwiskoK = new JLabel("Nazwisko klienta:");
		labelNazwiskoK.setBounds(50, 280, 150, 30);
		labelNazwiskoK.setForeground(Color.BLACK);
		add(labelNazwiskoK);
		labelNazwiskoK.setVisible(false);
		
		textNazwiskoK=new JTextField();
		textNazwiskoK.setBounds(190, 280, 180, 30);
		add(textNazwiskoK);
		textNazwiskoK.setVisible(false);
		
		labelAdresK = new JLabel("Adres klienta");
		labelAdresK.setBounds(50, 320, 150, 30);
		labelAdresK.setForeground(Color.BLACK);
		add(labelAdresK);
		labelAdresK.setVisible(false);
		
		labelUlicaK = new JLabel("Ulica: ");
		labelUlicaK.setBounds(50, 360, 150, 30);
		labelUlicaK.setForeground(Color.BLACK);
		add(labelUlicaK);
		labelUlicaK.setVisible(false);
		
		textUlicaK=new JTextField();
		textUlicaK.setBounds(190, 360, 180, 30);
		add(textUlicaK);
		textUlicaK.setVisible(false);
		
		labelKodK = new JLabel("Kod:");
		labelKodK.setBounds(50, 400, 150, 30);
		labelKodK.setForeground(Color.BLACK);
		add(labelKodK);
		labelKodK.setVisible(false);
		
		textKodK=new JTextField();
		textKodK.setBounds(190, 400, 180, 30);
		add(textKodK);
		textKodK.setVisible(false);
		
		labelMiastoK = new JLabel("Miasto:");
		labelMiastoK.setBounds(50, 440, 150, 30);
		labelMiastoK.setForeground(Color.BLACK);
		add(labelMiastoK);
		labelMiastoK.setVisible(false);
		
		textMiastoK=new JTextField();
		textMiastoK.setBounds(190, 440, 180, 30);
		add(textMiastoK);
		textMiastoK.setVisible(false);
		
		labelDataUrK = new JLabel("Data urodzenia:");
		labelDataUrK.setBounds(50, 480, 150, 30);
		labelDataUrK.setForeground(Color.BLACK);
		add(labelDataUrK);
		labelDataUrK.setVisible(false);

		comboDataUrRokK=new JComboBox<String>(lata);
		comboDataUrRokK.setBounds(190, 480, 70, 30);
		add(comboDataUrRokK);
		comboDataUrRokK.setVisible(false);
		
		comboDataUrMiesiacK=new JComboBox<String>(miesiace);
		comboDataUrMiesiacK.setBounds(275, 480, 50, 30);
		add(comboDataUrMiesiacK);
		comboDataUrMiesiacK.setVisible(false);
		
		comboDataUrDzienK=new JComboBox<String>(dni);
		comboDataUrDzienK.setBounds(335, 480, 70, 30);
		add(comboDataUrDzienK);
		comboDataUrDzienK.setVisible(false);
		
		labelZnizkaK = new JLabel("Znizka w %:");
		labelZnizkaK.setBounds(50, 520, 150, 30);
		labelZnizkaK.setForeground(Color.BLACK);
		add(labelZnizkaK);
		labelZnizkaK.setVisible(false);
		
		textZnizkaK=new JTextField();
		textZnizkaK.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if((c<'0' || c>'9') && c!='\b' ||textZnizkaK.getText().length()>1) {
					e.consume();
				}
				
			}
		});
		textZnizkaK.setBounds(190, 520, 180, 30);
		add(textZnizkaK);
		textZnizkaK.setVisible(false);
		
		
		labelPojazd = new JLabel("Pojazd");
		labelPojazd.setBounds(450, 160, 150, 30);
		labelPojazd.setForeground(Color.BLACK);
		add(labelPojazd);
		labelPojazd.setVisible(false);
		
		labelMarkaP = new JLabel("Marka:");
		labelMarkaP.setBounds(450, 200, 150, 30);
		labelMarkaP.setForeground(Color.BLACK);
		add(labelMarkaP);
		labelMarkaP.setVisible(false);
		
		textMarkaP=new JTextField();
		textMarkaP.setBounds(590, 200, 180, 30);
		add(textMarkaP);
		textMarkaP.setVisible(false);
		
		labelModelP = new JLabel("Model:");
		labelModelP.setBounds(450, 240, 150, 30);
		labelModelP.setForeground(Color.BLACK);
		add(labelModelP);
		labelModelP.setVisible(false);
		
		textModelP=new JTextField();
		textModelP.setBounds(590, 240, 180, 30);
		add(textModelP);
		textModelP.setVisible(false);
		
		labelRokpP = new JLabel("Rok produkcji:");
		labelRokpP.setBounds(450, 280, 150, 30);
		labelRokpP.setForeground(Color.BLACK);
		add(labelRokpP);
		labelRokpP.setVisible(false);
		
		textRokpP=new JTextField();
		textRokpP.setBounds(590, 280, 180, 30);
		add(textRokpP);
		textRokpP.setVisible(false);
		textRokpP.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if((c<'0' || c>'9') && c!='\b'|| textRokpP.getText().length()>3) {
					e.consume();
				}
				
			}
		});
		
		labelNrrejP = new JLabel("Nr. rejestracyjny:");
		labelNrrejP.setBounds(450, 320, 150, 30);
		labelNrrejP.setForeground(Color.BLACK);
		add(labelNrrejP);
		labelNrrejP.setVisible(false);
		
		textNrrejP=new JTextField();
		textNrrejP.setBounds(590, 320, 180, 30);
		add(textNrrejP);
		textNrrejP.setVisible(false);
		
		labelPrzebiegP = new JLabel("Przebieg w km:");
		labelPrzebiegP.setBounds(450, 360, 150, 30);
		labelPrzebiegP.setForeground(Color.BLACK);
		add(labelPrzebiegP);
		labelPrzebiegP.setVisible(false);
		
		textPrzebiegP=new JTextField();
		textPrzebiegP.setBounds(590, 360, 180, 30);
		add(textPrzebiegP);
		textPrzebiegP.setVisible(false);
		textPrzebiegP.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if((c<'0' || c>'9') && c!='\b' || textPrzebiegP.getText().length()>9) {
					e.consume();
				}
			}
		});
		
		labelDataprzegladuP = new JLabel("Data przegladu:");
		labelDataprzegladuP.setBounds(450, 400, 150, 30);
		labelDataprzegladuP.setForeground(Color.BLACK);
		add(labelDataprzegladuP);
		labelDataprzegladuP.setVisible(false);
		
		comboDataPrzeRok=new JComboBox<String>(lata);
		comboDataPrzeRok.setBounds(590, 400, 70, 30);
		add(comboDataPrzeRok);
		comboDataPrzeRok.setSelectedItem("2018");
		comboDataPrzeRok.setVisible(false);
		
		comboDataPrzeMiesiac=new JComboBox<String>(miesiace);
		comboDataPrzeMiesiac.setBounds(675, 400, 50, 30);
		add(comboDataPrzeMiesiac);
		comboDataPrzeMiesiac.setSelectedItem("3");
		comboDataPrzeMiesiac.setVisible(false);
		
		comboDataPrzeDzien=new JComboBox<String>(dni);
		comboDataPrzeDzien.setBounds(735, 400, 70, 30);
		add(comboDataPrzeDzien);
		comboDataPrzeDzien.setSelectedItem("26");
		comboDataPrzeDzien.setVisible(false);
		
		comboPaliwoP = new JComboBox<String>();
		comboPaliwoP.setBounds(590, 440, 180, 30);
		add(comboPaliwoP);
		comboPaliwoP.addItem("benzyna");
		comboPaliwoP.addItem("benzyna+gaz");
		comboPaliwoP.addItem("olej napêdowy");
		comboPaliwoP.setVisible(false);
		
		comboTurP = new JComboBox<String>();
		comboTurP.setBounds(590, 440, 180, 30);
		add(comboTurP);
		comboTurP.addItem("wyposazony");
		comboTurP.addItem("niewyposazony");
		comboTurP.setVisible(false);
		
		comboPojemnoscP = new JComboBox<String>();
		comboPojemnoscP.setBounds(590, 440, 180, 30);
		add(comboPojemnoscP);
		comboPojemnoscP.addItem("50");
		comboPojemnoscP.addItem("80");
		comboPojemnoscP.addItem("110");
		comboPojemnoscP.addItem("125");
		comboPojemnoscP.addItem("150");
		comboPojemnoscP.addItem("250");
		comboPojemnoscP.addItem("500");
		comboPojemnoscP.addItem("700");
		comboPojemnoscP.addItem("1000");
		comboPojemnoscP.setVisible(false);

		
		labelPaliwoP = new JLabel("Paliwo:");
		labelPaliwoP.setBounds(450, 440, 150, 30);
		labelPaliwoP.setForeground(Color.BLACK);
		add(labelPaliwoP);
		labelPaliwoP.setVisible(false);
		
		labelPojemnoscP = new JLabel("Pojemnosc:");
		labelPojemnoscP.setBounds(450, 440, 150, 30);
		labelPojemnoscP.setForeground(Color.BLACK);
		add(labelPojemnoscP);
		labelPojemnoscP.setVisible(false);
		
		labelTurP = new JLabel("Tur:");
		labelTurP.setBounds(450, 440, 150, 30);
		labelTurP.setForeground(Color.BLACK);
		add(labelTurP);
		labelTurP.setVisible(false);
		
		labelUsluga = new JLabel("Usluga");
		labelUsluga.setBounds(850, 160, 150, 30);
		labelUsluga.setForeground(Color.BLACK);
		add(labelUsluga);
		labelUsluga.setVisible(false);
		
		labelDlugoscU = new JLabel("Dlugosc w dniach:");
		labelDlugoscU.setBounds(850, 200, 150, 30);
		labelDlugoscU.setForeground(Color.BLACK);
		add(labelDlugoscU);
		labelDlugoscU.setVisible(false);
		
		textDlugoscU=new JTextField();
		textDlugoscU.setBounds(990, 200, 180, 30);
		add(textDlugoscU);
		textDlugoscU.setVisible(false);
		textDlugoscU.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if((c<'0' || c>'9') && c!='\b' || textDlugoscU.getText().length()>1) {
					e.consume();
				}
			}
		});
		
		labelOpisU = new JLabel("Opis awarii:");
		labelOpisU.setBounds(850, 240, 150, 30);
		labelOpisU.setForeground(Color.BLACK);
		add(labelOpisU);
		labelOpisU.setVisible(false);
		
		textOpisU=new JTextField();
		textOpisU.setBounds(990, 240, 180, 30);
		add(textOpisU);
		textOpisU.setVisible(false);
		
		labelCenazRobU = new JLabel("Cena z robocizna:");
		labelCenazRobU.setBounds(850, 280, 150, 30);
		labelCenazRobU.setForeground(Color.BLACK);
		add(labelCenazRobU);
		labelCenazRobU.setVisible(false);
		
		textCenazRobU=new JTextField();
		textCenazRobU.setBounds(990, 280, 180, 30);
		add(textCenazRobU);
		textCenazRobU.setVisible(false);
		textCenazRobU.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if((c<'0' || c>'9') && c!='\b'|| textCenazRobU.getText().length()>4) {
					e.consume();
				}
			}
		});
		
		labelCelU = new JLabel("Cel badania:");
		labelCelU.setBounds(850, 240, 150, 30);
		labelCelU.setForeground(Color.BLACK);
		add(labelCelU);
		labelCelU.setVisible(false);
		
		textCelU=new JTextField();
		textCelU.setBounds(990, 240, 180, 30);
		add(textCelU);
		textCelU.setVisible(false);
		
		labelCenaU = new JLabel("Cena badania:");
		labelCenaU.setBounds(850, 280, 150, 30);
		labelCenaU.setForeground(Color.BLACK);
		add(labelCenaU);
		labelCenaU.setVisible(false);
		
		textCenaU=new JTextField();
		textCenaU.setBounds(990, 280, 180, 30);
		add(textCenaU);
		textCenaU.setVisible(false);
		textCenaU.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if((c<'0' || c>'9') && c!='\b' || textCenaU.getText().length()>4) {
					e.consume();
				}
			}
		});
		
		labelElementU = new JLabel("Wymieniany element:");
		labelElementU.setBounds(850, 240, 150, 30);
		labelElementU.setForeground(Color.BLACK);
		add(labelElementU);
		labelElementU.setVisible(false);
		
		textElementU=new JTextField();
		textElementU.setBounds(990, 240, 180, 30);
		add(textElementU);
		textElementU.setVisible(false);
		
		labelKosztkonsU = new JLabel("Koszt konserwacji:");
		labelKosztkonsU.setBounds(850, 280, 150, 30);
		labelKosztkonsU.setForeground(Color.BLACK);
		add(labelKosztkonsU);
		labelKosztkonsU.setVisible(false);
		
		textKosztkonsU=new JTextField();
		textKosztkonsU.setBounds(990, 280, 180, 30);
		add(textKosztkonsU);
		textKosztkonsU.setVisible(false);
		textKosztkonsU.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if((c<'0' || c>'9') && c!='\b' || textKosztkonsU.getText().length()>4) {
					e.consume();
				}
			}
		});
		
		gPojazd = new ButtonGroup();
		gUsluga = new ButtonGroup();
		
		rSamochod = new JRadioButton("Samochod",true);
		rSamochod.setBounds(170, 620, 100 ,30);
		gPojazd.add(rSamochod);
		rSamochod.setVisible(false);
		add(rSamochod);
		rSamochod.addActionListener(this);
		
		rCiagnik = new JRadioButton("Ciagnik",true);
		rCiagnik.setBounds(270, 620, 100 ,30);
		gPojazd.add(rCiagnik);
		rCiagnik.setVisible(false);
		add(rCiagnik);
		rCiagnik.addActionListener(this);
		
		rMotocykl = new JRadioButton("Motocykl",true);
		rMotocykl.setBounds(370, 620, 100 ,30);
		gPojazd.add(rMotocykl);
		rMotocykl.setVisible(false);
		add(rMotocykl);
		rMotocykl.addActionListener(this);
		
		rNaprawa = new JRadioButton("Naprawa",true);
		rNaprawa.setBounds(770, 620, 100 ,30);
		gUsluga.add(rNaprawa);
		rNaprawa.setVisible(false);
		add(rNaprawa);
		rNaprawa.addActionListener(this);
		
		rBadanie = new JRadioButton("Badanie",true);
		rBadanie.setBounds(870, 620, 100 ,30);
		gUsluga.add(rBadanie);
		rBadanie.setVisible(false);
		add(rBadanie);
		rBadanie.addActionListener(this);
		
		rKonserwacja = new JRadioButton("Konserwacja",true);
		rKonserwacja.setBounds(970, 620, 100 ,30);
		gUsluga.add(rKonserwacja);
		rKonserwacja.setVisible(false);
		add(rKonserwacja);
		rKonserwacja.addActionListener(this);
		
		labelRodzajP = new JLabel("Rodzaj pojazdu:");
		labelRodzajP.setBounds(50, 620, 150, 30);
		labelRodzajP.setForeground(Color.BLACK);
		add(labelRodzajP);
		labelRodzajP.setVisible(false);
		
		
		labelRodzajU = new JLabel("Rodzaj uslugi:");
		labelRodzajU.setBounds(600, 620, 150, 30);
		labelRodzajU.setForeground(Color.BLACK);
		add(labelRodzajU);
		labelRodzajU.setVisible(false);
		
		tlo = new JLabel(new ImageIcon("tlo2.jpg"));
		tlo.setOpaque(true);
		tlo.setBounds(0, 0, 1300, 800);
		add(tlo);

		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent a) {
		Object o = a.getSource();
		if(rSamochod.isSelected()==true) {
			labelPaliwoP.setVisible(true);
			comboPaliwoP.setVisible(true);
			labelPojemnoscP.setVisible(false);
			comboPojemnoscP.setVisible(false);
			labelTurP.setVisible(false);
			comboTurP.setVisible(false);
		}
		if(rMotocykl.isSelected()==true) {
			labelPaliwoP.setVisible(false);
			comboPaliwoP.setVisible(false);
			labelPojemnoscP.setVisible(true);
			comboPojemnoscP.setVisible(true);
			labelTurP.setVisible(false);
			comboTurP.setVisible(false);
		}
		if(rCiagnik.isSelected()==true) {
			labelPaliwoP.setVisible(false);
			comboPaliwoP.setVisible(false);
			labelPojemnoscP.setVisible(false);
			comboPojemnoscP.setVisible(false);
			labelTurP.setVisible(true);
			comboTurP.setVisible(true);
		}
		if(rNaprawa.isSelected()==true) {
			labelOpisU.setVisible(true);
			textOpisU.setVisible(true);
			labelCenazRobU.setVisible(true);
			textCenazRobU.setVisible(true);
			labelCelU.setVisible(false);
			textCelU.setVisible(false);
			labelCenaU.setVisible(false);
			textCenaU.setVisible(false);
			labelElementU.setVisible(false);
			textElementU.setVisible(false);
			labelKosztkonsU.setVisible(false);
			textKosztkonsU.setVisible(false);
		}
		if(rBadanie.isSelected()==true) {
			labelOpisU.setVisible(false);
			textOpisU.setVisible(false);
			labelCenazRobU.setVisible(false);
			textCenazRobU.setVisible(false);
			labelCelU.setVisible(true);
			textCelU.setVisible(true);
			labelCenaU.setVisible(true);
			textCenaU.setVisible(true);
			labelElementU.setVisible(false);
			textElementU.setVisible(false);
			labelKosztkonsU.setVisible(false);
			textKosztkonsU.setVisible(false);
		}
		if(rKonserwacja.isSelected()==true) {
			labelOpisU.setVisible(false);
			textOpisU.setVisible(false);
			labelCenazRobU.setVisible(false);
			textCenazRobU.setVisible(false);
			labelCelU.setVisible(false);
			textCelU.setVisible(false);
			labelCenaU.setVisible(false);
			textCenaU.setVisible(false);
			labelElementU.setVisible(true);
			textElementU.setVisible(true);
			labelKosztkonsU.setVisible(true);
			textKosztkonsU.setVisible(true);
		}
		
		
			
		
	}
}

