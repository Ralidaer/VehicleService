package projekt201805chw;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class OkienkoZlecenia extends JFrame implements ActionListener {
	private JLabel labelTytul, labelNumer,labelUsun, tlo;
	private JTextArea textArea , textNumer, textUsun;
	private JButton buttonZamknij, buttonNumer,buttonUsun, buttonLista;
	private JScrollPane scrollpanel;
	
	public OkienkoZlecenia(List <Zlecenie> lista) {
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
		
		for(int i=0;i<lista.size();i++)
		textArea.append(lista.get(i)+"\r\n"+"\r\n"); 
		
		buttonZamknij = new JButton("Zamknij okno");
		buttonZamknij.setBounds(1000,700, 170, 50);
		buttonZamknij.addActionListener(this);
		add(buttonZamknij);
		
		labelNumer = new JLabel("Podaj numer zlecenie do wyswietlenia");
		labelNumer.setHorizontalAlignment(JLabel.CENTER);
		labelNumer.setBounds(100, 690, 350, 60);
		labelNumer.setFont(new Font("Arial", Font.BOLD, 17));
		labelNumer.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		labelNumer.setForeground(Color.BLACK);
		add(labelNumer);
		
		textNumer=new JTextArea();
		textNumer.setBounds(480, 700, 30, 30);
		textNumer.setLineWrap(true);
		textNumer.setFont(new Font("Arial", Font.BOLD, 13));
		textNumer.setEditable(true);
		textNumer.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		add(textNumer);
		textNumer.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if((c<'0' || c>'9') && c!='\b') {
					e.consume();
				}
			}
		});
		
		buttonNumer = new JButton("Wyswietl zlecenie o wpisanym nr");
		buttonNumer.setBounds(560,690, 300, 50);
		buttonNumer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(textNumer.getText().isEmpty()==true) 
					JOptionPane.showMessageDialog(null, "Podaj numer zlecenia");
				else {
				if((Integer.parseInt(textNumer.getText())-1)<lista.size() || textNumer.getText()=="") {
					textArea.setText(lista.get(Integer.parseInt(textNumer.getText())-1).toString());
					buttonLista.setVisible(true);
				
				}else
					JOptionPane.showMessageDialog(null, "Nie ma zlecenie o takim numerze");
				}
		
			
		}});
		add(buttonNumer);
		
		labelUsun = new JLabel("Podaj numer zlecenie do usuniecia");
		labelUsun.setHorizontalAlignment(JLabel.CENTER);
		labelUsun.setBounds(100, 590, 350, 60);
		labelUsun.setFont(new Font("Arial", Font.BOLD, 17));
		labelUsun.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
		labelUsun.setForeground(Color.BLACK);
		add(labelUsun);
		
		textUsun=new JTextArea();
		textUsun.setBounds(480, 600, 30, 30);
		textUsun.setLineWrap(true);
		textUsun.setFont(new Font("Arial", Font.BOLD, 13));
		textUsun.setEditable(true);
		textUsun.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		add(textUsun);
		textUsun.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if((c<'0' || c>'9') && c!='\b') {
					e.consume();
				}
			}
		});
		
		buttonUsun = new JButton("Usun zlecenie o wpisanym nr");
		buttonUsun.setBounds(560,590, 300, 50);
		buttonUsun.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(textUsun.getText().isEmpty()==true) 
					JOptionPane.showMessageDialog(null, "Podaj numer pracownika");
				else {
				if((Integer.parseInt(textUsun.getText())-1)<lista.size() || textUsun.getText()=="") {
					lista.remove(Integer.parseInt(textUsun.getText())-1);
					Okienko.textID.setText(String.valueOf(Integer.parseInt(Okienko.textID.getText())-1));
					Zlecenie.setCountIdZlecenie(Zlecenie.getCountIdZlecenie()-1);
					textArea.setText("");
					textUsun.setText("");
					for(int i=0;i<lista.size();i++) {
						lista.get(i).setIdZlecenie(i+1);
						textArea.append(lista.get(i)+"\r\n"+"\r\n"); 
					}
				}else
					JOptionPane.showMessageDialog(null, "Nie ma pracownika o takim numerze");
				}
		
			
		}});
		add(buttonUsun);
		
		buttonLista = new JButton("Wróc do wszystkich zlecen");
		buttonLista.setBounds(950,600, 270, 50);
		buttonLista.setVisible(false);
		buttonLista.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.setText("");
				textNumer.setText("");
				buttonLista.setVisible(false);
				for(int i=0;i<lista.size();i++)
					textArea.append(lista.get(i)+"\r\n"+"\r\n"); 
			
		}});
		add(buttonLista);
		
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


