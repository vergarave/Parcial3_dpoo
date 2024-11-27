package presentacion;

import java.awt.Dimension;
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
	private JButton bCirculo;
	
	public PFormulario() {
		this.tR = new JTextField();
		this.tG = new JTextField();
		this.tB = new JTextField();
		this.bCuadrado = new JButton("cuadrado");
		this.bCirculo = new JButton("circulo");
		this.bCuadrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dibujarCuadrado();				
			}
		});		
		this.bCirculo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dibujarCirculo();				
			}
		});	
		this.setLayout(new GridLayout(6, 2, 5, 5));
		this.add(new JLabel("R"));
		this.add(this.tR);
		this.add(new JLabel("G"));
		this.add(this.tG);
		this.add(new JLabel("B"));
		this.add(this.tB);
		this.add(this.bCuadrado);
		this.add(this.bCirculo);

	}
	
	public void dibujarCuadrado() {
		new FPrincipal(1);
	}
	
	public void dibujarCirculo() {
		new FPrincipal(2);
	}
	
	public JTextField gettR() {
		return tR;
	}

	public void settR(JTextField tR) {
		this.tR = tR;
	}

	public JTextField gettG() {
		return tG;
	}

	public void settG(JTextField tG) {
		this.tG = tG;
	}

	public JTextField gettB() {
		return tB;
	}

	public void settB(JTextField tB) {
		this.tB = tB;
	}

	

}
