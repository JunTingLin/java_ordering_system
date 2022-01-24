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
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PackageMeal2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PackageMeal2 packageMeal2 = new PackageMeal2();
		packageMeal2.setTitle("素食點餐系統-套餐選單");
		packageMeal2.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public PackageMeal2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("\u8ACB\u554F\u662F\u5426\u9700\u8981\u66F4\u63DB:");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(45, 288, 267, 80);
		contentPane.add(lblNewLabel_1);
		
		
		JButton correctButton_1 = new JButton("\u53D6\u6D88");
		correctButton_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);
		
		JButton correctButton = new JButton("\u78BA\u8A8D");
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 392, 132);
		contentPane.add(correctButton);
		
		String message=OrderList.getTempId()+"套餐的副餐為:";
		message+=((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).getSide1();
		if(((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).getSide2()!=null)
			message+="  、"+((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).getSide2();
		JLabel lblNewLabel = new JLabel(message);
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel.setBounds(45, 30, 648, 226);
		contentPane.add(lblNewLabel);
	}

}
