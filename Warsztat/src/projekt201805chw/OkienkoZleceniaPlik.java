package projekt201805chw;

import javax.swing.JLabel;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class OkienkoZleceniaPlik extends JFrame implements ActionListener {
	private JLabel labelTytul, labelNumer, tlo;
	private JTextArea textArea , textNumer;
	private JButton buttonZamknij, buttonNumer, buttonLista;
	private JScrollPane scrollpanel;
	
	public OkienkoZleceniaPlik() {
		setTitle("Zlecenia w warsztacie");
		setSize(1300, 800);
		setLayout(null);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		
		Toolkit zdjecie = Toolkit.getDefaultToolkit(); 
		Image imag = zdjecie.getImage("ikona.jpg"); 
		setIconImage(imag);
		
		labelTytul = new JLabel("Zlecenia");
		labelTytul.setHorizontalAlignment(JLabel.CENTER);
		labelTytul.setBounds(525, 30, 250, 60);
		labelTytul.setFont(new Font("Arial", Font.BOLD, 25));
		labelTytul.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		add(labelTytul);
		
		textArea=new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		add(textArea);
		
		scrollpanel = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollpanel.setBounds(50, 120, 1200, 400);
		add(scrollpanel);
		
		JFileChooser fc= new JFileChooser();
		if(fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION);
		try {
		File h = fc.getSelectedFile();
		FileInputStream f = new FileInputStream(h);
		textArea.read( new FileReader( h.getAbsolutePath() ), null );
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException ex) {
			System.out.println("b³ad wejscia-wyjœcia");
		}
		
		
		buttonZamknij = new JButton("Zamknij okno");
		buttonZamknij.setBounds(1000,700, 170, 50);
		buttonZamknij.addActionListener(this);
		add(buttonZamknij);
		
		
		tlo = new JLabel(new ImageIcon("D:\\tlo2.jpg"));
		tlo.setOpaque(true);
		tlo.setBounds(0, 0, 1300, 800);
		add(tlo);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		setVisible(false);
		
		
	}
	

}


