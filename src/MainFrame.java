import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

import com.roudique.lbw.utils.UnitImageIcons;


public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setMinimumSize(new Dimension(620, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 717);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon warIcon = UnitImageIcons.warriorImg100x100;
		ImageIcon bersIcon = UnitImageIcons.berserkImg100x100;
		ImageIcon demonIcon = UnitImageIcons.demonImg100x100;
		ImageIcon healIcon = UnitImageIcons.healerImg100x100;
		ImageIcon necrIcon = UnitImageIcons.necromancerImg100x100;
		ImageIcon priestIcon = UnitImageIcons.priestImg100x100;
		ImageIcon rogIcon = UnitImageIcons.rogueImg100x100;
		ImageIcon vampIcon = UnitImageIcons.vampireImg100x100;
		ImageIcon warlIcon = UnitImageIcons.warlockImg100x100;
		ImageIcon werIcon = UnitImageIcons.werewolfImg100x100;
		ImageIcon wizIcon = UnitImageIcons.wizardImg100x100;
		
		JButton btn_1_1 = new JButton();
		btn_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_1_1.setIcon(wizIcon);
			}
		});
		btn_1_1.setBounds(0, 0, 100, 100);
		contentPane.add(btn_1_1);
		
		JButton btn_1_2 = new JButton();
		btn_1_2.setBounds(100, 0, 100, 100);
		contentPane.add(btn_1_2);
		
		JButton btn_1_3 = new JButton();
		btn_1_3.setBounds(200, 0, 100, 100);
		contentPane.add(btn_1_3);
		
		JButton btn_2_1 = new JButton();
		btn_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_2_1.setIcon(priestIcon);
			}
		});
		btn_2_1.setBounds(0, 100, 100, 100);
		contentPane.add(btn_2_1);
		
		JButton btn_2_2 = new JButton();
		btn_2_2.setBounds(100, 100, 100, 100);
		contentPane.add(btn_2_2);
		
		JButton btn_2_3 = new JButton();
		btn_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_2_3.setIcon(warIcon);
			}
		});
		btn_2_3.setBounds(200, 100, 100, 100);
		contentPane.add(btn_2_3);
		
		JButton btn_1_4 = new JButton();
		btn_1_4.setBounds(300, 0, 100, 100);
		contentPane.add(btn_1_4);
		
		JButton btn_1_5 = new JButton();
		btn_1_5.setBounds(400, 0, 100, 100);
		contentPane.add(btn_1_5);
		
		JButton btn_2_4 = new JButton();
		btn_2_4.setBounds(300, 100, 100, 100);
		contentPane.add(btn_2_4);
		
		JButton btn_2_5 = new JButton();
		btn_2_5.setBounds(400, 100, 100, 100);
		contentPane.add(btn_2_5);
		
		JButton btn_3_1 = new JButton();
		btn_3_1.setBounds(0, 200, 100, 100);
		contentPane.add(btn_3_1);
		
		JButton btn_3_2 = new JButton();
		btn_3_2.setBounds(100, 200, 100, 100);
		contentPane.add(btn_3_2);
		
		JButton btn_3_3 = new JButton();
		btn_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_3_3.setIcon(demonIcon);
			}
		});
		btn_3_3.setBounds(200, 200, 100, 100);
		contentPane.add(btn_3_3);
		
		JButton btn_3_4 = new JButton();
		btn_3_4.setBounds(300, 200, 100, 100);
		contentPane.add(btn_3_4);
		
		JButton btn_3_5 = new JButton();
		btn_3_5.setBounds(400, 200, 100, 100);
		contentPane.add(btn_3_5);
		
		JButton btn_4_1 = new JButton();
		btn_4_1.setBounds(0, 300, 100, 100);
		contentPane.add(btn_4_1);
		
		JButton btn_4_2 = new JButton();
		btn_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_4_2.setIcon(vampIcon);
			}
		});
		btn_4_2.setBounds(100, 300, 100, 100);
		contentPane.add(btn_4_2);
		
		JButton btn_4_3 = new JButton();
		btn_4_3.setBounds(200, 300, 100, 100);
		contentPane.add(btn_4_3);
		
		JButton btn_4_4 = new JButton();
		btn_4_4.setBounds(300, 300, 100, 100);
		contentPane.add(btn_4_4);
		
		JButton btn_4_5 = new JButton();
		btn_4_5.setBounds(400, 300, 100, 100);
		contentPane.add(btn_4_5);
		
		JButton btn_1_6 = new JButton();
		btn_1_6.setBounds(500, 0, 100, 100);
		contentPane.add(btn_1_6);
		
		JButton btn_2_6 = new JButton();
		btn_2_6.setBounds(500, 101, 100, 100);
		contentPane.add(btn_2_6);
		
		JButton btn_3_6 = new JButton();
		btn_3_6.setBounds(500, 200, 100, 100);
		contentPane.add(btn_3_6);
		
		JButton btn_4_6 = new JButton();
		btn_4_6.setBounds(500, 300, 100, 100);
		contentPane.add(btn_4_6);
	}
	
}
