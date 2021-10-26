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
import javax.swing.JTextArea;

public class OkienkoWitaj extends JFrame implements ActionListener{
	private JLabel labelTytul;
	private JTextArea tekst;
	private JButton buttonWroc;
	
	public OkienkoWitaj() {
		setTitle("Witaj w warsztacie!!!");
		setSize(400, 320);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		Toolkit zdjecie = Toolkit.getDefaultToolkit(); 
		Image imag = zdjecie.getImage("ikona.jpg"); 
		setIconImage(imag);
		
		labelTytul = new JLabel("WITAM W WARSZTACIE POJAZDÓW");
		labelTytul.setHorizontalAlignment(JLabel.CENTER);
		labelTytul.setBounds(50, 10, 300, 30);
		Font newFont2 = new Font("Comic Sans MS", Font.BOLD, 15);
		labelTytul.setFont(newFont2);
		labelTytul.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		add(labelTytul);
		
		tekst = new JTextArea("Serdecznie witamy w systemie wspomagaj¹cym prace warsztatu pojadów. "
				+ "Program zosta³ stworzony, aby pomóc pracownikom oraz kilientom operowaæ danymi, zleceniami, us³ugami"
				+ " oraz ca³ym warsztatem");
		tekst.setBounds(25, 70, 350, 100);
		tekst.setLineWrap(true);
		Font newFont1 = new Font("Calibri", Font.ITALIC, 15);
		tekst.setFont(newFont1);
		tekst.setBackground(Color.YELLOW);
		tekst.setEditable(false);
		tekst.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		add(tekst);
		
		buttonWroc = new JButton("Zamknij okno startowe");
		buttonWroc.setBounds(100,200, 170, 50);
		buttonWroc.addActionListener(this);
		add(buttonWroc);
	
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		setVisible(false);
		
		
	}
}
