package dBHotelReservation;

import java.awt.EventQueue;
//import org.jdesktop.swingx.JXDatePicker;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class HotelReservationGUI {

	private JFrame mainFrame;
	
	private JLabel txtGiantForestInn;
	private JLabel txtFirstName;
	private JLabel txtLastName;
	private JLabel txtMailingAddress;
	private JLabel txtRoomType;
	private JLabel txtRoomType_1;
	private JLabel txtPatioOrForest;
	private JLabel txtAvailability;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblCheckinDate;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelReservationGUI window = new HotelReservationGUI();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public HotelReservationGUI() {
		initialize();
	}

	
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setBounds(500, 500, 500, 700);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.GRAY);
		mainFrame.getContentPane().add(panel, BorderLayout.CENTER);
		
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 249, 464, 401);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtFirstName = new JLabel();
		txtFirstName.setBackground(Color.WHITE);
		txtFirstName.setForeground(Color.WHITE);
		txtFirstName.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(10, 11, 172, 25);
		panel_1.add(txtFirstName);
		
		txtLastName = new JLabel();
		txtLastName.setForeground(Color.WHITE);
		txtLastName.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtLastName.setText("Last Name");
		txtLastName.setBounds(10, 47, 172, 25);
		panel_1.add(txtLastName);
		
		txtMailingAddress = new JLabel();
		txtMailingAddress.setForeground(Color.WHITE);
		txtMailingAddress.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtMailingAddress.setText("Mailing Address");
		txtMailingAddress.setBounds(10, 80, 172, 31);
		panel_1.add(txtMailingAddress);
		
		txtRoomType = new JLabel();
		txtRoomType.setForeground(Color.WHITE);
		txtRoomType.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtRoomType.setText("Luxury or Cottage");
		txtRoomType.setBounds(10, 122, 172, 31);
		panel_1.add(txtRoomType);
		
		txtRoomType_1 = new JLabel();
		txtRoomType_1.setForeground(Color.WHITE);
		txtRoomType_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtRoomType_1.setText("Room Type");
		txtRoomType_1.setBounds(10, 164, 172, 31);
		panel_1.add(txtRoomType_1);
		
		txtPatioOrForest = new JLabel();
		txtPatioOrForest.setForeground(Color.WHITE);
		txtPatioOrForest.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtPatioOrForest.setText("Patio or Forest");
		txtPatioOrForest.setBounds(10, 206, 172, 31);
		panel_1.add(txtPatioOrForest);
		
		txtAvailability = new JLabel();
		txtAvailability.setForeground(Color.WHITE);
		txtAvailability.setFont(new Font("Tahoma", Font.ITALIC, 20));
		txtAvailability.setText("Availability");
		txtAvailability.setBounds(10, 245, 172, 31);
		panel_1.add(txtAvailability);
		
		textField = new JTextField();
		textField.setBounds(234, 11, 194, 25);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(234, 45, 194, 25);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(234, 80, 194, 29);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(234, 131, 194, 20);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(234, 173, 194, 20);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(234, 215, 194, 20);
		panel_1.add(comboBox_2);
		
		JCheckBox chckbxYesno = new JCheckBox("Yes/No");
		chckbxYesno.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxYesno.setBounds(236, 253, 97, 23);
		panel_1.add(chckbxYesno);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConfirm.setForeground(new Color(0, 0, 0));
		btnConfirm.setBounds(164, 350, 124, 40);
		panel_1.add(btnConfirm);
		
		lblCheckinDate = new JLabel("Check-In Date");
		lblCheckinDate.setForeground(Color.WHITE);
		lblCheckinDate.setBackground(Color.BLACK);
		lblCheckinDate.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblCheckinDate.setBounds(10, 287, 172, 25);
		panel_1.add(lblCheckinDate);
		panel_1.setVisible(false);
		
		
		JButton btnNewButton_2 = new JButton("     Details  ");
		btnNewButton_2.setBounds(179, 100, 100, 82);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel_1.setVisible(true);
				
			}
		});
		
		JButton btnNewButton = new JButton("Check-In");
		btnNewButton.setBounds(25, 100, 107, 82);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_1.setVisible(true);
				
				
			}
		});
		panel.setLayout(null);
		btnNewButton.setForeground(Color.BLUE);
		panel.add(btnNewButton);
		btnNewButton_2.setForeground(Color.GRAY);
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Check-Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(false);
				
				
			}
		});
		btnNewButton_1.setBounds(327, 100, 119, 82);
		btnNewButton_1.setForeground(Color.RED);
		panel.add(btnNewButton_1);
		
		txtGiantForestInn = new JLabel();
		txtGiantForestInn.setBackground(SystemColor.textHighlight);
		txtGiantForestInn.setForeground(SystemColor.desktop);
		txtGiantForestInn.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 26));
		txtGiantForestInn.setText("Giant Forest Inn Guest Log ");
		txtGiantForestInn.setBounds(85, 23, 301, 52);
		panel.add(txtGiantForestInn);
		
		
	}
}
