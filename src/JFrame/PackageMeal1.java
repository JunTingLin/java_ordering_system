package JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.OrderList;
import Data.PackageMealData;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PackageMeal1 extends JFrame {

	private JPanel contentPane;
	private String[] option;
	private String selected;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PackageMeal1 packageMeal1 = new PackageMeal1();
		packageMeal1.setTitle("素食點餐系統-套餐選單");
		packageMeal1.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public PackageMeal1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/NCULogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblNewLabel_1 = new JLabel("\u8ACB\u9078\u64C7\u60A8\u8981\u7684\u5957\u9910:");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(390, 135, 267, 80);
		contentPane.add(lblNewLabel_1);

		option = new String[] { "A", "B", "C" };
		JComboBox comboBox = new JComboBox(option);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 27));
		comboBox.setBounds(390, 243, 267, 93);
		contentPane.add(comboBox);

		JButton correctButton_1 = new JButton("\u56DE\u4E3B\u9078\u55AE");
		correctButton_1.setIcon(new ImageIcon(this.getClass().getResource("/menu_click.png")));
		correctButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Menu1.main(null);
			}
		});
		correctButton_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);

		JButton correctButton = new JButton("\u78BA\u8A8D");
		correctButton.setIcon(new ImageIcon(this.getClass().getResource("/ok.png")));
		correctButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				selected = option[comboBox.getSelectedIndex()];
				OrderList.PackageAdd(selected);
				OrderList.setTempId(selected);
				dispose();
				PackageMeal2_0.main(null);
			}
		});
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 392, 132);
		contentPane.add(correctButton);

		JLabel lblNewLabel = new JLabel(PackageMealData.showAll());
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 26));
		lblNewLabel.setBounds(45, 13, 310, 408);
		contentPane.add(lblNewLabel);
	}

}
