package JFrame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

import Data.*;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Menu1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Menu1 menue1 = new Menu1();
		menue1.setTitle("素食點餐系統-主選單");
		menue1.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public Menu1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/NCULogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(14, 13, 754, 527);
		contentPane.add(panel);
		
				JButton correctButton = new JButton("\u55AE\u9EDE");
				correctButton.setBounds(0, 450, 379, 77);
				correctButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						try {
							SingleMeal1.main(null);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				correctButton.setFont(new Font("新細明體", Font.PLAIN, 30));
				
						JButton correctButton_1 = new JButton("\u5957\u9910");
						correctButton_1.setBounds(381, 450, 373, 77);
						correctButton_1.addAncestorListener(new AncestorListener() {
							public void ancestorAdded(AncestorEvent arg0) {
							}

							public void ancestorMoved(AncestorEvent arg0) {
							}

							public void ancestorRemoved(AncestorEvent arg0) {
							}
						});
						correctButton_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								dispose();
								PackageMeal1.main(null);
							}
						});
						correctButton_1.setFont(new Font("新細明體", Font.PLAIN, 30));
				
						JLabel lblNewLabel = new JLabel("\u8ACB\u9078\u64C7\u8981\u9EDE\u5957\u9910\u9084\u662F\u55AE\u9EDE:");
						lblNewLabel.setBounds(0, 0, 588, 52);
						lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 43));
				panel.setLayout(null);
				panel.add(correctButton);
				panel.add(correctButton_1);
				panel.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon(this.getClass().getResource("/menu2.png")));
				lblNewLabel_1.setBounds(0, 65, 754, 372);
				panel.add(lblNewLabel_1);
	}
}
