import javax.swing.*;
import jdk.jfr.Name;

import java.awt.*;
import java.awt.event.*;


@Name("𝔸𝕕𝕣𝕚𝕒𝕟_𝔾𝕦𝕤𝕥𝕒𝕧𝕠_ℙ𝕠𝕣𝕥𝕠")



public class Main { // Objeto Janela
	



@SuppressWarnings("deprecation")
public static void main(String args[]) {
	 

  
 JFrame janela = new JFrame("Jagua");
 JPanel escritas = new JPanel();
 JTextField Text = new JTextField();
 
 	janela.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
 	
    

 JButton buttons[];

		 
 janela.setBounds(500,120, 650, 600); // Seta posicao e tamanho
 janela.setLayout(null);
 janela.getContentPane().setBackground(Color.blue);
 janela.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
 

 


 
 
 buttons = new JButton[ 5 ];


   Text.setBounds(200,100,100,100);
     Text.setPreferredSize(new Dimension(120, 35));
  

     escritas.setBounds(200,100,100,100);
     escritas.setPreferredSize(new Dimension(120, 35));
 

 buttons[0] = new JButton("Inicio");


 

 buttons[1] = new JButton("Cadastrar");
 	buttons[1].addActionListener( new ActionListener() {	
 		 
	public void actionPerformed(ActionEvent e) {
	Cadastros.CadastrosM();
	janela.show(false);
	}
	
   }
 	 );
 	
 buttons[ 2 ] = new JButton("Procurar");
 
// buttons[0].setPreferredSize(new Dimension(120, 35));
// buttons[1].setPreferredSize(new Dimensionj(120, 35));
// buttons[2].setPreferredSize(new Dimension(120, 35));
 
 buttons[ 3 ] = new JButton("Configurações");

 
 buttons[0].setBounds(10,500,100,50);
 buttons[1].setBounds(130,500,100,50);
 buttons[2].setBounds(250,500,100,50);
 buttons[3].setBounds(370,500,120,50);

 janela.add(buttons[0]);
 janela.add(buttons[1]);
 janela.add(buttons[2]);
 janela.add(buttons[3]);
 
 
 janela.show(true);
 
       }
     }
     