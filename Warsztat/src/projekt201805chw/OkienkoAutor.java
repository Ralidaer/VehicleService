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


public class OkienkoAutor extends JFrame implements ActionListener{
	private JLabel labelTytul, labelImie, labelImie2, labelNazwisko,labelNazwisko2, 
	labelEmail, labelEmail2, labelUrodzenie, labelUrodzenie2, labelKlasa, labelKlasa2;
	private JButton buttonWroc;
	
	public OkienkoAutor() {
		setTitle("Dane firmy");
		setSize(550, 500);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		Toolkit zdjecie = Toolkit.getDefaultToolkit(); 
		Image imag = zdjecie.getImage("ikona.jpg"); 
		setIconImage(imag);
		
		labelTytul = new JLabel("Dane autora programu");
		labelTytul.setHorizontalAlignment(JLabel.CENTER);
		labelTytul.setBounds(125, 10, 300, 60);
		Font newFont1 = new Font("Calibri", Font.ITALIC, 25);
		labelTytul.setFont(newFont1);
		labelTytul.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelTytul);
		
		labelImie = new JLabel("Imie:");
		labelImie.setHorizontalAlignment(JLabel.CENTER);
		labelImie.setBounds(20, 100, 150, 50);
		Font newFont2 = new Font("Comic Sans MS", Font.PLAIN, 17);
		labelImie.setFont(newFont2);
		labelImie.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelImie);
		
		labelImie2 = new JLabel("Wojciech");
		labelImie2.setHorizontalAlignment(JLabel.CENTER);
		labelImie2.setBounds(200, 100, 300, 50);
		labelImie2.setFont(newFont2);
		labelImie2.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelImie2);
		
		labelNazwisko = new JLabel("Nazwisko:");
		labelNazwisko.setHorizontalAlignment(JLabel.CENTER);
		labelNazwisko.setBounds(20, 155, 150, 50);
		labelNazwisko.setFont(newFont2);
		labelNazwisko.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelNazwisko);
		
		labelNazwisko2 = new JLabel("Chruœciel");
		labelNazwisko2.setHorizontalAlignment(JLabel.CENTER);
		labelNazwisko2.setBounds(200, 155, 300, 50);
		labelNazwisko2.setFont(newFont2);
		labelNazwisko2.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelNazwisko2);
		
		labelEmail = new JLabel("E-mail:");
		labelEmail.setHorizontalAlignment(JLabel.CENTER);
		labelEmail.setBounds(20, 210, 150, 50);
		labelEmail.setFont(newFont2);
		labelEmail.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelEmail);
		
		labelEmail2 = new JLabel("chrusciel.wojtek@gmail.com");
		labelEmail2.setHorizontalAlignment(JLabel.CENTER);
		labelEmail2.setBounds(200, 210, 300, 50);
		labelEmail2.setFont(newFont2);
		labelEmail2.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelEmail2);
		
		labelUrodzenie = new JLabel("Data urodzenia:");
		labelUrodzenie.setHorizontalAlignment(JLabel.CENTER);
		labelUrodzenie.setBounds(20, 265, 150, 50);
		labelUrodzenie.setFont(newFont2);
		labelUrodzenie.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelUrodzenie);
		
		labelUrodzenie2 = new JLabel("1999-09-07");
		labelUrodzenie2.setHorizontalAlignment(JLabel.CENTER);
		labelUrodzenie2.setBounds(200, 265, 300, 50);
		labelUrodzenie2.setFont(newFont2);
		labelUrodzenie2.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelUrodzenie2);
		
		labelKlasa = new JLabel("Klasa:");
		labelKlasa.setHorizontalAlignment(JLabel.CENTER);
		labelKlasa.setBounds(20, 320, 150, 50);
		labelKlasa.setFont(newFont2);
		labelKlasa.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelKlasa);
		
		labelKlasa2 = new JLabel(" 3A ");
		labelKlasa2.setHorizontalAlignment(JLabel.CENTER);
		labelKlasa2.setBounds(200, 320, 300, 50);
		labelKlasa2.setFont(newFont2);
		labelKlasa2.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		add(labelKlasa2);

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
