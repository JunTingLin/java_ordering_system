package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.OrderList;
import Data.SingleMealData;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SingleMeal1 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	String selected;
	String[] option;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SingleMeal1 singleMeal1 = new SingleMeal1();
		singleMeal1.setTitle("素食點餐系統-單點選單");
		singleMeal1.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public SingleMeal1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton correctButton = new JButton("\u78BA\u8A8D");
		correctButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected = option[comboBox.getSelectedIndex()];
				OrderList.SingleAdd(selected);
				dispose();
				Add1.main(null);
			}
		});
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 392, 132);
		contentPane.add(correctButton);
		
		JButton correctButton_1 = new JButton("\u53D6\u6D88");
		correctButton_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);
		
		
		JLabel lblNewLabel = new JLabel(SingleMealData.showAll());
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel.setBounds(56, 28, 310, 364);
		contentPane.add(lblNewLabel);
		
		option = new String[]{"1","2","3","4","5","6","7","8","9","10"};
		comboBox = new JComboBox(option);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 27));
		comboBox.setBounds(390, 243, 267, 93);
		contentPane.add(comboBox);

		
		JLabel lblNewLabel_1 = new JLabel("\u8ACB\u9078\u64C7\u60A8\u8981\u7684\u55AE\u9EDE:");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(390, 135, 267, 80);
		contentPane.add(lblNewLabel_1);
	}
}
