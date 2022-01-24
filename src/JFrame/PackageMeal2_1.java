package JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.OrderList;
import Data.PackageMealData;
import MealItem.PackageMeal;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PackageMeal2_1 extends JFrame {

	public  JPanel contentPane;
	public static String[] option;
	public static String selected;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PackageMeal2_1 packageMeal2_1 = new PackageMeal2_1();
		packageMeal2_1.setTitle("素食點餐系統-套餐選單");
		packageMeal2_1.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public PackageMeal2_1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/NCULogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("<html><body>\u60A8\u7684\u526F\u9910\u6709\u5169\u500B<br>\u8ACB\u554F\u662F\u54EA\u500B\u8981\u63DB\u5462?<body><html>");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(88, 279, 267, 80);
		contentPane.add(lblNewLabel_1);
		
		option = new String[2];
		if(OrderList.getTempId()!=null) {
			option[0]=((PackageMeal) OrderList.get(OrderList.getTempId())).getSide1().getId();
			option[1]=((PackageMeal) OrderList.get(OrderList.getTempId())).getSide2().getId();
		}
		JComboBox comboBox = new JComboBox(option);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 27));
		comboBox.setBounds(390, 262, 267, 93);
		contentPane.add(comboBox);
		
		JButton correctButton_1 = new JButton("\u56DE\u4E0A\u4E00\u9801");
		correctButton_1.setIcon(new ImageIcon(this.getClass().getResource("/go back.png")));
		correctButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PackageMeal2_0.main(null);
			}
		});
		correctButton_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);
		
		JButton correctButton = new JButton("\u78BA\u8A8D");
		correctButton.setIcon(new ImageIcon(this.getClass().getResource("/ok.png")));
		correctButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				selected=(String) comboBox.getSelectedItem();
				dispose();
				PackageMeal2_2.main(null);
				
			}
		});
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 392, 132);
		contentPane.add(correctButton);
		
		String message="";
		if(OrderList.getTempId()!=null) {
			message=OrderList.getTempId()+"套餐的副餐為:";
			message+=((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).getSide1();
			if(((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).getSide2()!=null)
				message+="  、"+((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).getSide2();
		}
		JLabel lblNewLabel = new JLabel(message);
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel.setBounds(55, 13, 648, 226);
		contentPane.add(lblNewLabel);
		
		
	}

}
