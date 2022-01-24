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
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PackageMeal3_1 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	String selected;
	String[] option;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PackageMeal3_1 singleMeal1 = new PackageMeal3_1();
		singleMeal1.setTitle("�����I�\�t��-���I���");
		singleMeal1.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public PackageMeal3_1() {
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
				OrderList.changePackageDrinks(selected);
				if (OrderList.addMoney > 0)
					JOptionPane.showMessageDialog(null, "�����z:\n���ɮt�B$" + OrderList.addMoney);
				dispose();
				Add1.main(null);
			}
		});
		correctButton.setFont(new Font("�s�ө���", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 392, 132);
		contentPane.add(correctButton);

		JButton correctButton_1 = new JButton("\u56DE\u4E0A\u4E00\u9801");
		correctButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PackageMeal3_0.main(null);
			}
		});
		correctButton_1.setFont(new Font("�s�ө���", Font.PLAIN, 30));
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);

		JLabel lblNewLabel = new JLabel(SingleMealData.showDrink());
		lblNewLabel.setFont(new Font("�s�ө���", Font.PLAIN, 26));
		lblNewLabel.setBounds(56, 28, 310, 364);
		contentPane.add(lblNewLabel);

		option = new String[] { "3", "4", "10" };
		comboBox = new JComboBox(option);
		comboBox.setFont(new Font("�s�ө���", Font.PLAIN, 27));
		comboBox.setBounds(390, 243, 267, 93);
		contentPane.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("\u8ACB\u9078\u64C7\u4F60\u8981\u66F4\u6539\u7684\u98F2\u6599?");
		lblNewLabel_1.setFont(new Font("�s�ө���", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(390, 135, 350, 80);
		contentPane.add(lblNewLabel_1);
	}
}
