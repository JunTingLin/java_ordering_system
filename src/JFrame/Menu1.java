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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JButton correctButton = new JButton("\u55AE\u9EDE");
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
		correctButton.setBounds(0, 421, 392, 132);
		contentPane.add(correctButton);

		JButton correctButton_1 = new JButton("\u5957\u9910");
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
		correctButton_1.setBounds(390, 421, 392, 132);
		contentPane.add(correctButton_1);

		JLabel lblNewLabel = new JLabel("\u8ACB\u9078\u64C7\u8981\u9EDE\u5957\u9910\u9084\u662F\u55AE\u9EDE:");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 43));
		lblNewLabel.setBounds(0, 210, 588, 52);
		contentPane.add(lblNewLabel);
	}
}
