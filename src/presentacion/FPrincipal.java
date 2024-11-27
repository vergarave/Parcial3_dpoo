package presentacion;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class FPrincipal extends JFrame{
	
	private PFormulario pFormulario;
	
	
	public FPrincipal() {
		this.setTitle("Lista Doble");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLayout(new BorderLayout());
		this.pFormulario = new PFormulario();
		this.add(this.pFormulario, BorderLayout.WEST);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FPrincipal();
	}

}