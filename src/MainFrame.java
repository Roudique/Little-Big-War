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
import com.roudique.lbw.units.*;
import com.roudique.lbw.utils.Utilities;
import javax.swing.JList;
import javax.swing.JLabel;

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
	@SuppressWarnings("unused")
	public MainFrame() {
		setMinimumSize(new Dimension(620, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 717);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] data = {"Warrior", "Berserk", };
		JList<String> list = new JList<String>();
		list.setListData(data);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setBounds(6, 428, 400, 200);
		contentPane.add(list);
		
		JLabel lblSelectUnitAnd = new JLabel("Select unit and put it on the board:");
		lblSelectUnitAnd.setBounds(6, 400, 224, 16);
		contentPane.add(lblSelectUnitAnd);
		
		
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
		
		int HORIZONTAL_BUTTONS = 6;
		int VERTICAL_BUTTONS = 4;
		int BUTTON_WIDTH = 100;
		int BUTTON_HEIGHT = 100;
		
		JButton[][] buttons = new JButton[HORIZONTAL_BUTTONS][VERTICAL_BUTTONS];
		
		int x = 0, y = 0;
		for ( int j = 0; j < VERTICAL_BUTTONS; j++, y += 100 ) {
			x = 0;
			for ( int i = 0; i < HORIZONTAL_BUTTONS; i++, x += 100 ) {
				buttons[i][j] = new JButton();
				buttons[i][j].setBounds(x, y, BUTTON_WIDTH, BUTTON_HEIGHT);
				contentPane.add(buttons[i][j]);
			}
		}
		
		buttons[0][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(list.getSelectedIndex());
			}
		});
	}
}

