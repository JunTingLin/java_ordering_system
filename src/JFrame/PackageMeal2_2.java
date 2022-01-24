package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.OrderList;
import Data.SingleMealData;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PackageMeal2_2 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	String selected;
	String[] option;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PackageMeal2_2 singleMeal1 = new PackageMeal2_2();
		singleMeal1.setTitle("素食點餐系統-副餐選單");
		singleMeal1.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public PackageMeal2_2() {
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
				if (PackageMeal2_1.selected == null) // PackageMeal2_1沒進去，表副餐只有一個的時候
					OrderList.changePackageSide1Meal(selected);
				else {
					if (PackageMeal2_1.selected.equals(PackageMeal2_1.option[0]))
						OrderList.changePackageSide1Meal(selected); // 假如選擇改第一個副餐
					else
						OrderList.changePackageSide2Meal(selected); // 假如選擇改第二個副餐
				}

				if (OrderList.addMoney > 0)
					JOptionPane.showMessageDialog(null, "提醒您:\n須補差額$" + OrderList.addMoney);
				dispose();
				PackageMeal3_0.main(null);
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
				if (PackageMeal2_1.selected == null)
					PackageMeal2_0.main(null);
				else
					PackageMeal2_1.main(null);
			}
		});
		correctButton_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);

		JLabel lblNewLabel = new JLabel(SingleMealData.showSideMeal());
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel.setBounds(56, 28, 310, 364);
		contentPane.add(lblNewLabel);

		option = new String[] { "1", "5", "6", "8" };
		comboBox = new JComboBox(option);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 27));
		comboBox.setBounds(390, 243, 267, 93);
		contentPane.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("\u8ACB\u9078\u64C7\u4F60\u8981\u66F4\u6539\u7684\u526F\u9910?");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(390, 135, 350, 80);
		contentPane.add(lblNewLabel_1);
	}
}
