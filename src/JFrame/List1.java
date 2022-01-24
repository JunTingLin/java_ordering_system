package JFrame;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.OrderList;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class List1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		List1 list1 = new List1();
		list1.setTitle("素食點餐系統-清單");
		list1.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public List1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u8ACB\u554F\u662F\u5426\u8981\u4FEE\u6539\u6E05\u55AE?");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 43));
		lblNewLabel.setBounds(349, 161, 433, 52);
		contentPane.add(lblNewLabel);
		
		JButton correctButton = new JButton("\u8981");
		correctButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				List2.main(null);
			}
		});
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 392, 132);
		contentPane.add(correctButton);
		
		JButton correctButton_1 = new JButton("\u4E0D\u7528\u4E86");
		correctButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				List4.main(null);
			}
		});
		correctButton_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);
		
		JLabel lblNewLabel_1 = new JLabel(OrderList.showAll());
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(46, 38, 280, 345);
		contentPane.add(lblNewLabel_1);
	}

}
