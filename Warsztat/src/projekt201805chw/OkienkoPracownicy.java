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

public class OkienkoPracownicy extends JFrame implements ActionListener {
	private JLabel labelTytul, labelUsun;
	private JTextArea textArea,textUsun;
	private JButton buttonZamknij,buttonUsun;
	private JScrollPane scrollpanel;
	
	public OkienkoPracownicy(List <Pracownicy> lista) {
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
		
		for(int i=0;i<lista.size();i++)
		textArea.append(lista.get(i)+"\r\n"+"\r\n"); 
		
		buttonZamknij = new JButton("Zamknij okno");
		buttonZamknij.setBounds(800,250, 170, 50);
		buttonZamknij.addActionListener(this);
		add(buttonZamknij);
		
		labelUsun = new JLabel("Numer pracownika do usuniecia");
		labelUsun.setHorizontalAlignment(JLabel.CENTER);
		labelUsun.setBounds(50, 260, 220, 30);
		labelUsun.setFont(new Font("Arial", Font.BOLD, 13));
		labelUsun.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		add(labelUsun);
		
		textUsun=new JTextArea();
		textUsun.setBounds(280, 260, 30, 30);
		textUsun.setFont(new Font("Arial", Font.BOLD, 13));
		textUsun.setEditable(true);
		textUsun.setLineWrap(true);
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
		
		buttonUsun = new JButton("Usun pracownika");
		buttonUsun.setBounds(350,260, 150, 30);
		buttonUsun.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(textUsun.getText().isEmpty()==true) 
					JOptionPane.showMessageDialog(null, "Podaj numer pracownika");
				else {
				if((Integer.parseInt(textUsun.getText())-1)<lista.size() || textUsun.getText()=="") {
					lista.remove(Integer.parseInt(textUsun.getText())-1);
					textArea.setText("");
					textUsun.setText("");
					for(int i=0;i<lista.size();i++)
						textArea.append(lista.get(i)+"\r\n"+"\r\n"); 
				
				}else
					JOptionPane.showMessageDialog(null, "Nie ma pracownika o takim numerze");
				}
		
			
		}});
		add(buttonUsun);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		setVisible(false);
		
	}
	

}


