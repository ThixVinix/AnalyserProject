package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import utilitarios.LayoutPersonalizado;

public class ViewPrimeiraTela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3853225810857525841L;

	private JPanel contentPane;
	private JFileChooser openFileChooser;
	private BufferedReader leitor;

	/**
	 * Create the frame.
	 */
	public ViewPrimeiraTela() {
		configurateJFileChooser();
		createFirstWindowInterface();
		createJLabelSearch();
		createJSeparator();
		createJButtonSearch();

	}

	

	private void configurateJFileChooser() {
		openFileChooser = new JFileChooser();
		openFileChooser.setCurrentDirectory(new File("c:\\documents"));
		openFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//		openFileChooser.setFileFilter(new FileNameExtensionFilter("jar file", "jar"));
	}

	private void createFirstWindowInterface() {
		LayoutPersonalizado.determinarLayoutPersonalizado("Nimbus");

		setTitle("T\u00EDtulo\r\n");
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	private void createJLabelSearch() {
		JLabel lblNome = new JLabel("Buscar diret\u00F3rio:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(137, 105, 165, 25);
		contentPane.add(lblNome);
	}
	
	private void createJButtonSearch() {
		JButton btnBuscarDiretorio = new JButton("Buscar");
		contentPane.add(btnBuscarDiretorio);

		createActionBtnBuscarDiretorio(btnBuscarDiretorio);

	}

	private void createJSeparator() {
		JSeparator separator = new JSeparator();
		separator.setBounds(58, 128, 276, 15);
		contentPane.add(separator);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(376, 0, 17, 239);
		contentPane.add(scrollBar);
	}

	private void createActionBtnBuscarDiretorio(JButton btnBuscarDiretorio) {
		btnBuscarDiretorio.setBounds(126, 141, 119, 36);
		btnBuscarDiretorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openFileButtonActionPerformed();
			}
		});
	}

	private void openFileButtonActionPerformed() {
		int returnValue = openFileChooser.showOpenDialog(this);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
//			contador(openFileChooser.getSelectedFile().getName());

		} else if (returnValue == JFileChooser.CANCEL_OPTION) {
			openFileChooser.setVisible(false);

		} else {
			openFileChooser.setVisible(false);
			JOptionPane.showMessageDialog(null, "Selecione um arquivo permitido", "Escolha negada",
					JOptionPane.ERROR_MESSAGE);
		}

	}

//	public void contador(String path) {
//
//		File diretorios = openFileChooser.getSelectedFile();
//		File[] files = diretorios.listFiles();
//		try {
//			leitor = new BufferedReader(new FileReader(diretorios));
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//			JOptionPane.showMessageDialog(null, "Erro na leitura do arquivo.", "Arquivo não encontrado",
//					JOptionPane.ERROR_MESSAGE);
//			System.exit(0);
//		}

//	}

//	public void gravaArquivoTxt(String path) {
//
//		try {
//
//			/**
//			 * Grava no arquivo
//			 */
//			File file = new File(path + "/Restult.txt");
//			FileWriter fw = new FileWriter(file, true);
//			PrintWriter ps = new PrintWriter(fw, true);
//			ps.println(this.getOut());
//
//			JOptionPane.showMessageDialog(null, "Um arquivo com os resultados foi gerado no diretório do seu projeto!",
//					"Informação", JOptionPane.INFORMATION_MESSAGE);
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//
//	}

}
