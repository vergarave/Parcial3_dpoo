package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class PFormulario extends JPanel{
	private JTextField tR;
	private JTextField tG;
	private JTextField tB;
	private JButton bCuadrado;
	private JButton bTriangulo;
	
	public PFormulario() {
		this.tR = new JTextField();
		this.tG = new JTextField();
		this.tB = new JTextField();
		this.bCuadrado = new JButton("cuadrado");
		this.bTriangulo = new JButton("traingulo");
		this.bCuadrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dibujarCuadrado();				
			}
		});		
		this.bTriangulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dibujarTriangulo();				
			}
		});		
	}
	
	

}
