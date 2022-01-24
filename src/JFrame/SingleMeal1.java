package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.OrderList;
import Data.SingleMealData;
import MealItem.SingleMeal;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SingleMeal1 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	String selected;
	String[] option = new String[SingleMealData.FoodList.size()];
	

	/**
	 * Launch the application.
	 * 
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		SingleMeal1 singleMeal1 = new SingleMeal1();
		singleMeal1.setTitle("素食點餐系統-單點選單");
		singleMeal1.setVisible(true);
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */
	public SingleMeal1() throws ParseException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/NCULogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JButton correctButton = new JButton("\u78BA\u8A8D");
		correctButton.setIcon(new ImageIcon(this.getClass().getResource("/ok.png")));
		correctButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected = option[comboBox.getSelectedIndex()];
				if(selected.equals("暫停供應")) {
					JOptionPane.showMessageDialog(null, "已不供應了");
				}
				else {
					OrderList.SingleAdd(selected);
					dispose();
					Add1.main(null);
				}
				
			}
		});
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 392, 132);
		contentPane.add(correctButton);

		JButton correctButton_1 = new JButton("\u56DE\u4E3B\u9078\u55AE");
		correctButton_1.setIcon(new ImageIcon(this.getClass().getResource("/menu_click.png")));
		correctButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Menu1.main(null);
			}
		});
		correctButton_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);

	 
		for (int i = 0; i < SingleMealData.FoodList.size(); i++) {
			if (SingleMealData.noBreakfast() && SingleMealData.FoodList.get(i).isBreakfast()) {
				option[i]="暫停供應";
				continue;
			}
//			option.add(SingleMealData.FoodList.get(i).getId());
			option[i]=SingleMealData.FoodList.get(i).getId();
		}
		

		//option = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		comboBox = new JComboBox(option);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 27));
		comboBox.setBounds(421, 333, 283, 62);
		contentPane.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("\u8ACB\u9078\u64C7\u60A8\u8981\u7684\u55AE\u9EDE:");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(83, 324, 267, 80);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel(SingleMealData.showMainMeal());
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 23));
		lblNewLabel.setBounds(30, 33, 190, 278);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel(SingleMealData.showSideMeal());
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(292, 66, 190, 241);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(SingleMealData.showDrink());
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 23));
		lblNewLabel_3.setBounds(550, 52, 190, 241);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_1_1 = new JLabel("所有的單點:");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(0, -23, 267, 80);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("主餐:");
		lblNewLabel_4.setFont(new Font("新細明體", Font.PLAIN, 27));
		lblNewLabel_4.setIcon(new ImageIcon(this.getClass().getResource("/main meal.png")));
		lblNewLabel_4.setBounds(30, 46, 177, 80);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("副餐:");
		lblNewLabel_4_1.setIcon(new ImageIcon(this.getClass().getResource("/side meal.png")));
		lblNewLabel_4_1.setFont(new Font("新細明體", Font.PLAIN, 27));
		lblNewLabel_4_1.setBounds(282, 46, 177, 80);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("飲料:");
		lblNewLabel_4_1_1.setIcon(new ImageIcon(this.getClass().getResource("/drinks.png")));
		lblNewLabel_4_1_1.setFont(new Font("新細明體", Font.PLAIN, 27));
		lblNewLabel_4_1_1.setBounds(520, 46, 177, 80);
		contentPane.add(lblNewLabel_4_1_1);
	}
}
