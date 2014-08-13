package hospital.view;

import hospital.controller.HospitalAppController;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author XU YINGZHENG
 */
public class PnlTreatment extends JPanel {

	private JPanel pnlTreatment;

	// MAIN PANEL
	private JPanel topPanel;
	private JPanel bottomPanel;

	// TOP PANEL
	private JLabel lblTreatmentTxt;
	private JButton btnAddTreatment;
	private JButton btnDisplayTreatment;
	private JButton btnExit;

	// BOTTOM PANEL: ADD PATIENT CARDLAYOUT 2.2
	private JPanel pnlAddTreatment;
	private JPanel pnlDisplayTreatment;

	private JLabel lblAddTreatmentTxt; // display "Add New Treatment : " in the
										// first line
	private JLabel lblTreatmentName;
	private JLabel lblTreatmentID;

	private JLabel lblDocInCharge;
	private JLabel lblRoomID;

	private JTextField txtTreatmentName;
	private JTextField txtTreatmentID;
	private JTextField txtDocInCharge;
	private JTextField txtRoomID;

	private JButton btnAdd; // save the treatment details into record

	// BOTTOM PANEL: DISPLAY PATIENT CARDLAYOUT 2.2

	private JLabel lblDisplayTreatment;
	private JScrollPane scrollPane;
	private JTable tblTreatment; // Table inside the scroll pane

	private JLabel lblTotal;
	private JLabel lblNumber; // To display the derived number of treatment in
								// the
								// list
	private String[] treatmentHeader;

	private CardLayout card = new CardLayout();

	public PnlTreatment(HospitalAppController hospitalAppController) {

		// MAIN
		pnlTreatment = new JPanel();
		topPanel = new JPanel();

		bottomPanel = new JPanel();

		lblTreatmentTxt = new JLabel("Treatment :");

		btnAddTreatment = new JButton("ADD");

		btnDisplayTreatment = new JButton("DISPLAY");

		btnExit = new JButton("EXIT");

		// BOTTOM PANEL
		pnlAddTreatment = new JPanel();
		pnlDisplayTreatment = new JPanel();

		lblAddTreatmentTxt = new JLabel("Add new treatment : ");
		btnAdd = new JButton("ADD"); // SAVE DATA

		lblTreatmentName = new JLabel("Treatment-Name");
		txtTreatmentName = new JTextField();
		lblTreatmentID = new JLabel("Treatment-Registration-Number");
		txtTreatmentID = new JTextField();
		lblDocInCharge = new JLabel("Date-of-Birth");
		txtDocInCharge = new JTextField();
		lblRoomID = new JLabel("RoomID");
		txtRoomID = new JTextField();
		lblDisplayTreatment = new JLabel(
				"All Treatment details as shown below :");
		lblNumber = new JLabel();
		setupTable();

		setupPanel();
		setupLayout();
	}

	private void setupLayout() {
		setSize(800, 600);

		lblAddTreatmentTxt.setBounds(38, 18, 200, 15);
		pnlAddTreatment.setLayout(null);
		scrollPane.setBounds(30, 51, 700, 300);
		lblDisplayTreatment.setBounds(38, 28, 180, 15);
		lblNumber.setBounds(283, 361, 100, 30);
		lblNumber.setBackground(SystemColor.activeCaption);
		topPanel.setBounds(20, 26, 760, 112);
		bottomPanel.setBounds(20, 148, 760, 420);
		lblTreatmentTxt.setBounds(37, 20, 100, 30);
		btnAddTreatment.setBounds(115, 47, 100, 30);
		btnDisplayTreatment.setBounds(330, 47, 100, 30);
		btnExit.setBounds(545, 47, 100, 30);
	}

	private void setupPanel() {
		setLayout(null);

		// TOP
		add(topPanel);
		topPanel.setLayout(null);
		topPanel.add(lblTreatmentTxt);
		topPanel.add(btnAddTreatment);
		topPanel.add(btnDisplayTreatment);
		topPanel.add(btnExit);

		// BOTTOM
		add(bottomPanel);
		bottomPanel.setLayout(new CardLayout(0, 0));

		// ADD TREATMENT SECTION
		pnlAddTreatment = new JPanel();
		bottomPanel.add(pnlAddTreatment, "name_216129036483376");
		lblAddTreatmentTxt = new JLabel("Add new treatment : ");
		lblAddTreatmentTxt.setBounds(38, 28, 120, 15);
		btnAdd = new JButton("ADD");
		btnAdd.setLocation(621, 372);
		btnAdd.setSize(100, 30);
		pnlAddTreatment.setLayout(null);

		// ADDTREATMENT SECTION
		pnlAddTreatment.add(lblAddTreatmentTxt); // "Add new Treatment : "
		lblTreatmentName = new JLabel("Treatment-Name");
		lblTreatmentName.setBounds(38, 104, 84, 15);
		pnlAddTreatment.add(lblTreatmentName);
		lblTreatmentID = new JLabel("Treament-Number");
		lblTreatmentID.setBounds(38, 176, 90, 15);
		pnlAddTreatment.add(lblTreatmentID);
		lblDocInCharge = new JLabel("Doctor-in-charge");
		lblDocInCharge.setBounds(38, 248, 96, 15);
		pnlAddTreatment.add(lblDocInCharge);
		lblRoomID = new JLabel("Room-No");
		lblRoomID.setBounds(38, 320, 42, 15);
		pnlAddTreatment.add(lblRoomID);
		txtTreatmentName = new JTextField();
		txtTreatmentName.setBounds(224, 101, 260, 21);
		pnlAddTreatment.add(txtTreatmentName);

		txtTreatmentID = new JTextField();
		txtTreatmentID.setBounds(224, 173, 260, 21);
		pnlAddTreatment.add(txtTreatmentID);
		txtDocInCharge = new JTextField();
		txtDocInCharge.setBounds(224, 245, 260, 21);
		pnlAddTreatment.add(txtDocInCharge);
		txtRoomID = new JTextField();
		txtRoomID.setBounds(224, 317, 260, 21);
		pnlAddTreatment.add(txtRoomID);

		pnlAddTreatment.add(btnAdd);

		// BOTTOM PANEL : DISPLAY PATIENT
		// ArrayList<Treatment> treatmentData = new ArrayList<>();
		tblTreatment = new JTable();
		scrollPane = new JScrollPane();
		pnlDisplayTreatment = new JPanel();
		bottomPanel.add(pnlDisplayTreatment, "name_216129006968397");

		// DISPLAY TREATMENT SECTION
		lblDisplayTreatment = new JLabel("All treatment details : ");

		pnlDisplayTreatment.setLayout(null);

		// DISPLAY TREATMENT SECTION
		pnlDisplayTreatment.add(lblDisplayTreatment);
		pnlDisplayTreatment.add(scrollPane);
		scrollPane.add(tblTreatment);
		lblTotal = new JLabel("Total Number of Treatments : ");
		lblTotal.setBounds(40, 369, 162, 15);
		lblNumber = new JLabel(Integer.toString(tblTreatment.getRowCount())); // Calculate
		// how
		// many
		// existing
		// rows
		// of
		// data
		// in
		// the
		// table
		pnlDisplayTreatment.add(lblTotal);
		pnlDisplayTreatment.add(lblNumber);
		pnlDisplayTreatment.add(scrollPane);
		scrollPane.add(tblTreatment);

		setVisible(true);

	}

	private void setupListener() {

		// BUTTON ON THE TOP PANEL
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent addOrDisplay) {
				if (addOrDisplay.getSource() == btnAddTreatment) {
					card.show(bottomPanel, "2.1");
				}
				if (addOrDisplay.getSource() == btnDisplayTreatment) {
					card.show(bottomPanel, "2.2");
				}
			}
		});

		btnAddTreatment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent add) {
				if (add.getSource() == btnExit)
					System.exit(0);
			}
		});

	}

	private void setupTable() {
		JTable tblTreatment;
		String[] treatmentHeader = { "Treatment-Number", "Treatment-Name",
				"Doctor-in-charge", "Room-No" }; // the table has four columns

		String[][] treatmentData = {
				{ "T0001", "HEART TREAMENT", "JOHNSON WILLIAM", "RM001" },
				{ "T0002", "BRAIN TREAMENT", "ANDY LIM", "RM003" },
				{ "T0003", "LUNG TREAMENT", "ROGER TAN", "RM006" },
				{ "T0004", "BONE TREAMENT", "ALICE TEO", "RM051" },
				{ "T0005", " SKIN TREAMENTT", "KELLY LEK", "RM321" } }; // initial
																		// sample
																		// data
																		// for
																		// testing

		tblTreatment = new JTable(treatmentData, treatmentHeader); // data
																	// record
																	// and
																	// column
																	// name
		tblTreatment
				.setPreferredScrollableViewportSize(new Dimension(450, 200)); // table
																				// and
																				// height
		tblTreatment.setFillsViewportHeight(true);
		tblTreatment.setBounds(10, 10, 680, 280);

		JScrollPane scrollPane = new JScrollPane(tblTreatment);
	}

	public void getTextValue(ActionEvent txt) {
		if (txt.getSource() == txtTreatmentID) {
			String id = txtTreatmentID.getText();
		}
		if (txt.getSource() == txtTreatmentName) {
			String name = txtTreatmentName.getText();
		}
		if (txt.getSource() == txtDocInCharge) {
			String docInCharge = txtDocInCharge.getText();
		}
		if (txt.getSource() == txtRoomID) {
			String roomID = txtTreatmentID.getText();
		}
	}
	/*
	 * @Override public String getColumnName(int col) { return
	 * treatmentHeader[col]; }
	 * 
	 * class tableStructure{ private String x; private String y;
	 * 
	 * public tableStructure(String x, String y){ this.x=x; this.y=y; }
	 * 
	 * public String getX() { return x; }
	 * 
	 * public String getY() { return y; }
	 * 
	 * public void setX(String x) { this.x = x; }
	 * 
	 * public void setY(String y) { this.y = y; } }
	 * 
	 * @Override public int getColumnCount() { // TODO Auto-generated method
	 * stub return 4; }
	 * 
	 * @Override public int getRowCount() { // TODO Auto-generated method stub
	 * return patientList.size(); }
	 * 
	 * @Override public Object getValueAt(int rowIndex, int columnIndex) {
	 * ArrayList<Patient> patientList; if(columnIndex==1){ return
	 * patientList.get(rowIndex).getX(); } else if (columnIndex ==1){ return
	 * patientList.get(rowIndex.getY();) } return null; } }
	 */
}
