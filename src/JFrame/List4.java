package JFrame;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.OrderList;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class List4 extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		List4 list1 = new List4();
		list1.setTitle("素食點餐系統-清單");
		list1.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public List4() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/NCULogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u671F\u5F85\u60A8\u4E0B\u6B21\u5149\u81E8");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 52));
		lblNewLabel.setBounds(192, 13, 392, 52);
		contentPane.add(lblNewLabel);
		
		JButton correctButton = new JButton("確認，並匯出收據");
		correctButton.setIcon(new ImageIcon(this.getClass().getResource("/confirm.png")));
		correctButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				dispose();
				try {
					OrderList.receipt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton.setBounds(0, 421, 782, 132);
		contentPane.add(correctButton);
		
		JLabel lblNewLabel_1 = new JLabel("金額一共是:$"+OrderList.Calculate());
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 43));
		lblNewLabel_1.setBounds(254, 370, 330, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/Thanks for coming.jpg")));
		lblNewLabel_2.setBounds(53, 98, 672, 259);
		contentPane.add(lblNewLabel_2);
		
		
		
	}
}
