package JFrame_Old;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SingleMeal1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingleMeal1 frame = new SingleMeal1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SingleMeal1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u4EE5\u4E0B\u662F\u55AE\u9EDE\u7684\u9078\u9805");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("\u4E3B\u9910");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("02\u9EA5\u9999\u96DE  $44");
		
		JLabel lblNewLabel_1_2 = new JLabel("07\u6EFF\u798F\u5821  $48");
		
		JLabel lblNewLabel_1_2_1 = new JLabel("09\u5927\u9EA5\u514B  $72");
		
		JLabel lblNewLabel_2 = new JLabel("\u526F\u9910");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_3 = new JLabel("01\u85AF\u689D(\u5C0F)  $33\r\n");
		
		JLabel lblNewLabel_1_2_2 = new JLabel("05\u85AF\u689D(\u4E2D)  $44\r\n\r\n");
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("06\u85AF\u9905        $30\r\n");
		
		JLabel lblNewLabel_2_1 = new JLabel("\u98F2\u6599");
		lblNewLabel_2_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_3_1 = new JLabel("03\u53EF\u6A02(\u5C0F)  $28\r\n\r\n");
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("04\t\u96EA\u78A7(\u5C0F)  $28\r\n");
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("10\u7389\u7C73\u6FC3\u6E6F  $40\r\n");
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("08\u85AF\u689D(\u5927)  $55\r\n\r\n");
		
		JLabel lblNewLabel_1_4 = new JLabel("\u8ACB\u8F38\u5165\u6E05\u55AE\u524D\u7684\u865F\u78BC(\u4F8B\u5982:02)");
		lblNewLabel_1_4.setFont(new Font("新細明體", Font.PLAIN, 20));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u78BA\u8A8D");
		
		JButton btnNewButton = new JButton("\u53D6\u6D88");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1_4, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(lblNewLabel_1)
											.addComponent(lblNewLabel_1_2, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
											.addComponent(lblNewLabel_1_2_1)))
									.addGap(28)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(lblNewLabel_1_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblNewLabel_1_2_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblNewLabel_1_2_2_2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_1_2_1_1))))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1_2_1_1_1)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblNewLabel_1_2_2_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
												.addComponent(lblNewLabel_1_3_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(122)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
					.addGap(51))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1_2_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1_3_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1_2_2_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1_2_1_1_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1_2_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1_2_1_1)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1_2_2_2)))
					.addGap(18)
					.addComponent(lblNewLabel_1_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
