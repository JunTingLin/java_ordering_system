package JFrame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class Add1 extends JFrame {  //林俊霆、洪琬哲

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		if(List3.count==1) {  //假如是"更換"的話就直接跳清單頁面
			List1 list1 = new List1();
			list1.setTitle("速食點餐系統-清單");
			list1.setVisible(true);
		}
		else {
			Add1 add1 = new Add1();
			add1.setTitle("速食點餐系統-加選頁面");
			add1.setVisible(true);
		}
	}

	/**
	 * Create the frame.
	 */
	public Add1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/NCULogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(14, 23, 754, 517);
		contentPane.add(panel);
		
		JButton correctButton = new JButton("\u8981");
		correctButton.setIcon(new ImageIcon(this.getClass().getResource("/ok.png")));
		correctButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Menu1.main(null);
			}
		});
		correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
		
		JButton correctButton_1 = new JButton("\u4E0D\u7528\u4E86");
		correctButton_1.setIcon(new ImageIcon(this.getClass().getResource("/cancel.png")));
		correctButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				List1.main(null);
			}
		});
		correctButton_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		
		JLabel lblNewLabel = new JLabel("\u8ACB\u554F\u662F\u5426\u8981\u518D\u52A0\u9EDE?");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 43));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(this.getClass().getResource("/menu.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(correctButton, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(correctButton_1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(correctButton_1, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
						.addComponent(correctButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
		);
		panel.setLayout(gl_panel);
	}
}
