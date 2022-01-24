package JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Welcome1 frameWel = new Welcome1();
		frameWel.setTitle("素食點餐系統-歡迎頁面");
		frameWel.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public Welcome1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JButton correctButton = new JButton("\u9032\u5165\u9EDE\u9910\u7CFB\u7D71");
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton.setLocation(0, 421);
		correctButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Menu1.main(null);
			}
		});
		contentPane.add(correctButton);
		correctButton.setSize(782, 132);

		JLabel lblNewLabel = new JLabel("歡迎來到 第7組 素食點餐系統");
		lblNewLabel.setBounds(100, 198, 588, 52);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 43));

	}
}
