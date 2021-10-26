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
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class OkienkoPracownicyPlik extends JFrame implements ActionListener {
	private JLabel labelTytul, labelUsun;
	private JTextArea textArea,textUsun;
	private JButton buttonZamknij,buttonUsun;
	private JScrollPane scrollpanel;
	
	public OkienkoPracownicyPlik() {
		setTitle("Pracownicy warsztatu");
		setSize(1000, 350);
		setLayout(null);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		
		Toolkit zdjecie = Toolkit.getDefaultToolkit(); 
		Image imag = zdjecie.getImage("ikona.jpg"); 
		setIconImage(imag);
		
		labelTytul = new JLabel("Nasi pracownicy");
		labelTytul.setHorizontalAlignment(JLabel.CENTER);
		labelTytul.setBounds(425, 30, 150, 30);
		labelTytul.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		add(labelTytul);
	
		textArea=new JTextArea("", 5, 50);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		add(textArea);
	
		scrollpanel = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollpanel.setBounds(100, 75, 800, 160);
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
		buttonZamknij.setBounds(800,250, 170, 50);
		buttonZamknij.addActionListener(this);
		add(buttonZamknij);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		setVisible(false);
		
	}
	

}


