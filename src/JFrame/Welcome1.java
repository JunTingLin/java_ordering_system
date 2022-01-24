package JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;

public class Welcome1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Welcome1 frameWel = new Welcome1();
		frameWel.setTitle("素食點餐系統-歡迎頁面");
		frameWel.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public Welcome1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/NCULogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/fast-food2.png"));
		
		JPanel panel = new JPanel();
		panel.setBounds(14, 13, 754, 527);
		contentPane.add(panel);
				
						JButton correctButton = new JButton("\u9032\u5165\u9EDE\u9910\u7CFB\u7D71");
						correctButton.setIcon(new ImageIcon(this.getClass().getResource("/enter.png")));
						correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
						
								JLabel lblNewLabel = new JLabel("歡迎來到 第7組 素食點餐系統");
								lblNewLabel.setFont(new Font("標楷體", Font.BOLD, 43));
						
						JLabel lblNewLabel_1 = new JLabel("New label");
						lblNewLabel_1.setIcon(new ImageIcon(this.getClass().getResource("/fast-food2.png")));
						GroupLayout gl_panel = new GroupLayout(panel);
						gl_panel.setHorizontalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(correctButton, GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 754, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addContainerGap(87, Short.MAX_VALUE)
									.addComponent(lblNewLabel)
									.addGap(79))
						);
						gl_panel.setVerticalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 360, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(correctButton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
						);
						panel.setLayout(gl_panel);
				correctButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						Menu1.main(null);
					}
				});

		

	}
}
