package interfaces;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class TesteMouseMotionListener extends JFrame implements MouseMotionListener {

	public TesteMouseMotionListener () {
		setTitle("TesteMouseMotionListener");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label1 = new JLabel("Teste 1");
		add(label1);
		addMouseMotionListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TesteMouseMotionListener();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse arrastado: " + e.getX() + ", " + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Mouse movido: " + e.getX() + ", " + e.getY());
	}
}