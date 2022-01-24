package JFrame;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.OrderList;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class List4 extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		List4 list1 = new List4();
		list1.setTitle("素食點餐系統-清單");
		list1.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public List4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u671F\u5F85\u60A8\u4E0B\u6B21\u5149\u81E8");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 52));
		lblNewLabel.setBounds(200, 260, 392, 52);
		contentPane.add(lblNewLabel);
		
		JButton correctButton = new JButton("\u78BA\u8A8D");
		correctButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 782, 132);
		contentPane.add(correctButton);
		
		JLabel lblNewLabel_1 = new JLabel("金額一共是:"+OrderList.Calculate());
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 43));
		lblNewLabel_1.setBounds(115, 147, 588, 52);
		contentPane.add(lblNewLabel_1);
		
		
		
	}
}
