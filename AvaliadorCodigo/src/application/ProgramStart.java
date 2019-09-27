package application;

import java.awt.EventQueue;

import utilitarios.LayoutPersonalizado;
import view.ViewLogin;

public class ProgramStart {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		LayoutPersonalizado.determinarLayoutPersonalizado("Nimbus");

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
