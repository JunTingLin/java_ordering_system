package JFrame;

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

public class PackageMeal3_0 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PackageMeal3_0 packageMeal2 = new PackageMeal3_0();
		packageMeal2.setTitle("�����I�\�t��-�M�\���");
		packageMeal2.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public PackageMeal3_0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("\u8ACB\u554F\u662F\u5426\u9700\u8981\u66F4\u63DB:");
		lblNewLabel_1.setFont(new Font("�s�ө���", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(45, 288, 267, 80);
		contentPane.add(lblNewLabel_1);
		
		
		JButton correctButton_1 = new JButton("\u56DE\u4E0A\u4E00\u9801");
		correctButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PackageMeal2_2.main(null);
			}
		});
		correctButton_1.setFont(new Font("�s�ө���", Font.PLAIN, 30));
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);
		
		JButton correctButton = new JButton("\u78BA\u8A8D");
		correctButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				PackageMeal3_1.main(null);
			}
		});
		correctButton.setFont(new Font("�s�ө���", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 392, 132);
		contentPane.add(correctButton);
		
		String message="";
		if(OrderList.getTempId()!=null) {
			message=OrderList.getTempId()+"�M�\�����Ƭ�:";
			message+=((PackageMeal) OrderList.FoodList.get(OrderList.FoodList.size()-1)).getDrinks();
		}
		JLabel lblNewLabel = new JLabel(message);
		lblNewLabel.setFont(new Font("�s�ө���", Font.PLAIN, 26));
		lblNewLabel.setBounds(45, 30, 648, 226);
		contentPane.add(lblNewLabel);
	}

}
