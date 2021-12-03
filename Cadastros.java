import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

import com.sun.jdi.Method;

public class Cadastros{
	
	public static void CadastrosM() {

		JFrame Cadastros1 = new JFrame("Cadastros - Jaguara");
		
		  Cadastros1.getContentPane().setLayout(new BorderLayout());

			Cadastros1.setBounds(500, 120, 650, 600); // Seta posicao e tamanho
			Cadastros1.setVisible(true);
			
			JPanel Panel = new JPanel();
			JTextField Text = new JTextField();
			
			Panel.setLayout(null);
			Panel.setPreferredSize(new Dimension(80,150));
			Panel.setBackground(Color.GRAY);
			Text.setSize(300, 450);
			
			 Cadastros1.getContentPane().add(Panel , BorderLayout.CENTER);
			 
			 
			 Cadastros1.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
			 
			 
			 
		
	}
}
