package JFrame;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.OrderList;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class List2 extends JFrame {

	private JPanel contentPane;
	private String[] option;
	private String selected;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		List2 list1 = new List2();
		list1.setTitle("素食點餐系統-清單");
		list1.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public List2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/NCULogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u8ACB\u554F\u54EA\u4E00\u7B46\u8981\u4FEE\u6539?");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel.setBounds(390, 141, 433, 52);
		contentPane.add(lblNewLabel);
		
		JButton correctButton = new JButton("\u78BA\u8A8D");
		correctButton.setIcon(new ImageIcon(this.getClass().getResource("/ok.png")));
		correctButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				selected = option[comboBox.getSelectedIndex()];
				OrderList.setTempId(selected);
				dispose();
				List3.main(null);
			}
		});
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 392, 132);
		contentPane.add(correctButton);
		
		JButton correctButton_1 = new JButton("\u56DE\u4E0A\u4E00\u9801");
		correctButton_1.setIcon(new ImageIcon(this.getClass().getResource("/go back.png")));
		correctButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				List1.main(null);
			}
		});
		correctButton_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);
		
		JLabel lblNewLabel_1 = new JLabel(OrderList.showAll());
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(46, 38, 280, 345);
		contentPane.add(lblNewLabel_1);
		
		option = new String[OrderList.FoodList.size()];
		for(int i=0;i<OrderList.FoodList.size();i++) {
			option[i]=OrderList.FoodList.get(i).getId();
		}
		comboBox = new JComboBox(option);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 27));
		comboBox.setBounds(393, 242, 267, 93);
		contentPane.add(comboBox);
	}
}
