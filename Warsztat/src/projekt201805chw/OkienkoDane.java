package projekt201805chw;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OkienkoDane extends JFrame implements ActionListener{
	private JLabel labelTytul, labelNazwa, labelNazwa2, labelWlasciciel,labelWlasciciel2, labelAdres, labelAdres2, labelRok, labelRok2, labelRodzaj,labelRodzaj2;
	private JButton buttonWroc;
	
	public OkienkoDane() {
		setTitle("Dane firmy");
		setSize(550, 500);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		Toolkit zdjecie = Toolkit.getDefaultToolkit(); 
		Image imag = zdjecie.getImage("ikona.jpg"); 
		setIconImage(imag);
		
		labelTytul = new JLabel("Dane firmy (warsztatu)");
		labelTytul.setHorizontalAlignment(JLabel.CENTER);
		labelTytul.setBounds(125, 10, 300, 60);
		Font newFont1 = new Font("Calibri", Font.ITALIC, 25);
		labelTytul.setFont(newFont1);
		labelTytul.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelTytul);
		
		labelNazwa = new JLabel("Pe³na nazwa firmy:");
		labelNazwa.setHorizontalAlignment(JLabel.CENTER);
		labelNazwa.setBounds(20, 100, 150, 50);
		Font newFont2 = new Font("Comic Sans MS", Font.ROMAN_BASELINE, 15);
		labelNazwa.setFont(newFont2);
		labelNazwa.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelNazwa);
		
		labelNazwa2 = new JLabel("Warsztat Pojazdów Silnikowych 'Z³omex'");
		labelNazwa2.setHorizontalAlignment(JLabel.CENTER);
		labelNazwa2.setBounds(200, 100, 300, 50);
		labelNazwa2.setFont(newFont2);
		labelNazwa2.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelNazwa2);
		
		labelWlasciciel = new JLabel("W³aœciciel:");
		labelWlasciciel.setHorizontalAlignment(JLabel.CENTER);
		labelWlasciciel.setBounds(20, 155, 150, 50);
		labelWlasciciel.setFont(newFont2);
		labelWlasciciel.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelWlasciciel);
		
		labelWlasciciel2 = new JLabel("Pe³na nazwa firmy");
		labelWlasciciel2.setHorizontalAlignment(JLabel.CENTER);
		labelWlasciciel2.setBounds(200, 155, 300, 50);
		labelWlasciciel2.setFont(newFont2);
		labelWlasciciel2.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelWlasciciel2);
		
		labelAdres = new JLabel("Adres:");
		labelAdres.setHorizontalAlignment(JLabel.CENTER);
		labelAdres.setBounds(20, 210, 150, 50);
		labelAdres.setFont(newFont2);
		labelAdres.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelAdres);
		
		labelAdres2 = new JLabel("ul. Miodowa 4, 22-300 Krasnystaw");
		labelAdres2.setHorizontalAlignment(JLabel.CENTER);
		labelAdres2.setBounds(200, 210, 300, 50);
		labelAdres2.setFont(newFont2);
		labelAdres2.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelAdres2);
		
		labelRok = new JLabel("Rok powstania:");
		labelRok.setHorizontalAlignment(JLabel.CENTER);
		labelRok.setBounds(20, 265, 150, 50);
		labelRok.setFont(newFont2);
		labelRok.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelRok);
		
		labelRok2 = new JLabel("2005");
		labelRok2.setHorizontalAlignment(JLabel.CENTER);
		labelRok2.setBounds(200, 265, 300, 50);
		labelRok2.setFont(newFont2);
		labelRok2.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelRok2);
		
		labelRodzaj = new JLabel("Rodzaj firmy:");
		labelRodzaj.setHorizontalAlignment(JLabel.CENTER);
		labelRodzaj.setBounds(20, 320, 150, 50);
		labelRodzaj.setFont(newFont2);
		labelRodzaj.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelRodzaj);
		
		labelRodzaj2 = new JLabel("Spó³ka z ograniczon¹ odpowiedzialnoœci¹");
		labelRodzaj2.setHorizontalAlignment(JLabel.CENTER);
		labelRodzaj2.setBounds(200, 320, 300, 50);
		labelRodzaj2.setFont(newFont2);
		labelRodzaj2.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelRodzaj2);
		

		buttonWroc = new JButton("Zamknij okno");
		buttonWroc.setBounds(190,400, 170, 50);
		buttonWroc.addActionListener(this);
		add(buttonWroc);
	
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		setVisible(false);
		
	}
}
