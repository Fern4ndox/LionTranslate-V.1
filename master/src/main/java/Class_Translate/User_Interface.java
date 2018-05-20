package Class_Translate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class User_Interface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Interface frame = new User_Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User_Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane TP_English = new JTextPane();
		TP_English.setBounds(12, 95, 112, 22);
		contentPane.add(TP_English);
		
		JLabel LB_ViewTranslate = new JLabel("New label");
		LB_ViewTranslate.setBounds(305, 95, 56, 16);
		contentPane.add(LB_ViewTranslate);
		
		JButton btnTraducir = new JButton("Traducir");
		btnTraducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		btnTraducir.setBounds(116, 192, 97, 25);
		contentPane.add(btnTraducir);
	}
}
