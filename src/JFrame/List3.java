package JFrame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.OrderList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class List3 extends JFrame {

	private JPanel contentPane;
	protected static int count;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		List3 frameWel = new List3();
		frameWel.setTitle("素食點餐系統-清單");
		frameWel.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public List3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/NCULogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JButton correctButton = new JButton("\u66F4\u63DB");
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton.setLocation(0, 421);
		correctButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count=1;
				dispose();
				JOptionPane.showMessageDialog(null,"將跳回主選單，請您對那筆重新選擇");
				Menu1.main(null);
			}
		});
		contentPane.add(correctButton);
		correctButton.setSize(271, 132);

		JLabel lblNewLabel = new JLabel("\u4F60\u8981\u5C0D\u9019\u7B46\u6E05\u55AE\u4F5C\u4F55\u9805\u52D5\u4F5C?");
		lblNewLabel.setBounds(0, 212, 588, 52);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 43));
		
		JButton correctButton_1 = new JButton("\u522A\u9664");
		correctButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderList.Remove(OrderList.getTempId());
				dispose();
				JOptionPane.showMessageDialog(null, "那筆已成功刪除");
				List1.main(null);
			}
		});
		correctButton_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton_1.setBounds(262, 421, 262, 132);
		contentPane.add(correctButton_1);
		
		JButton correctButton_2 = new JButton("<html>\u6C92\u4E8B<br>\u4E0D\u7528\u4E86<html>");
		correctButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				List4.main(null);
			}
		});
		correctButton_2.setFont(new Font("新細明體", Font.PLAIN, 30));
		correctButton_2.setBounds(520, 421, 262, 132);
		contentPane.add(correctButton_2);

	}
}
