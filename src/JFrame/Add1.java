package JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		if(List3.count==1) {  //���p�O"��"���ܴN�������M�歶��
			List1 list1 = new List1();
			list1.setTitle("�����I�\�t��-�M��");
			list1.setVisible(true);
		}
		else {
			Add1 add1 = new Add1();
			add1.setTitle("�����I�\�t��-�[�ﭶ��");
			add1.setVisible(true);
		}
	}

	/**
	 * Create the frame.
	 */
	public Add1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u8ACB\u554F\u662F\u5426\u8981\u518D\u52A0\u9EDE?");
		lblNewLabel.setFont(new Font("�s�ө���", Font.PLAIN, 43));
		lblNewLabel.setBounds(0, 210, 588, 52);
		contentPane.add(lblNewLabel);
		
		JButton correctButton = new JButton("\u8981");
		correctButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Menu1.main(null);
			}
		});
		correctButton.setFont(new Font("�s�ө���", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 392, 132);
		contentPane.add(correctButton);
		
		JButton correctButton_1 = new JButton("\u4E0D\u7528\u4E86");
		correctButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				List1.main(null);
			}
		});
		correctButton_1.setFont(new Font("�s�ө���", Font.PLAIN, 30));
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);
	}
}
