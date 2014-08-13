package hospital.view;

import hospital.controller.HospitalAppController;
import hospital.model.Patient;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author XU YINGZHENG
 */

public class PnlPatient extends JPanel implements ActionListener, ItemListener {

	private JPanel pnlPatient;

	// MAIN PANEL
	private JPanel topPanel;
	private JPanel bottomPanel;

	// TOP PANEL
	private JLabel lblPatientTxt;
	private JButton btnAddPatient;
	private JButton btnDisplayPatient;
	private JButton btnExit;

	// BOTTOM PANEL: ADD PATIENT CARDLAYOUT 1.2
	private JPanel pnlAddPatient;
	private JPanel pnlDisplayPatient;

	private JLabel lblAddPatientTxt; // display "Add New Patient : " in the
										// first line
	private JLabel lblPatientName;
	private JLabel lblPatientID;
	private JLabel lblGender;
	private JLabel lblBirthday;
	private JLabel lblAddress;
	private JLabel lblPhone;

	private JTextField txtPatientName;
	private JTextField txtPatientID;

	private JRadioButton rdMale;
	private JRadioButton rdFemale;

	private JTextField txtBirthday;
	private JTextField txtAddress;
	private JTextField txtPhone;

	private JButton btnAdd; // save the patient details into record

	// BOTTOM PANEL: DISPLAY PATIENT CARDLAYOUT 1.2

	private JLabel lblDisplayPatient;
	private JScrollPane scrollPane;
	private JTable tblPatient; // Table inside the scroll pane

	private JLabel lblTotal;
	private JLabel lblNumber; // To display the derived number of patient in the
								// list
	private String[] patientHeader; // Header is an array of strings

	private CardLayout card = new CardLayout();
	private ButtonGroup sexGroup;

	// Constructor
	public PnlPatient(HospitalAppController hospitalAppController) {
		hospitalAppController = new HospitalAppController();
		// MAIN
		pnlPatient = new JPanel();
		topPanel = new JPanel();
		topPanel.setLocation(20, 26);
		bottomPanel = new JPanel();
		lblPatientTxt = new JLabel("Patient :");
		btnAddPatient = new JButton("ADD");
		btnDisplayPatient = new JButton("DISPLAY");
		btnExit = new JButton("EXIT");

		// BOTTOM PANEL
		pnlAddPatient = new JPanel();
		pnlDisplayPatient = new JPanel();

		lblAddPatientTxt = new JLabel("Add new patient : ");
		btnAdd = new JButton("ADD"); // SAVE DATA

		lblPatientName = new JLabel("Patient-Name");
		txtPatientName = new JTextField();
		lblPatientID = new JLabel("Patient-Registration-Number");
		txtPatientID = new JTextField();
		lblGender = new JLabel("Gender");

		rdMale = new JRadioButton("MALE"); // Check this by default
		rdFemale = new JRadioButton("FEMALE");
		sexGroup = new ButtonGroup();
		lblBirthday = new JLabel("Date-of-Birth");
		txtBirthday = new JTextField();
		lblAddress = new JLabel("Address");
		lblPhone = new JLabel("Contact-No");
		txtAddress = new JTextField();
		txtPhone = new JTextField();

		// BOTTOM PANEL : DISPLAY PATIENT
		lblDisplayPatient = new JLabel("All Patient details as shown below :");
		scrollPane = new JScrollPane();
		lblTotal = new JLabel("Total Number of Patients : ");
		lblNumber = new JLabel();
		tblPatient = new JTable();
		setupLayout();
		setupPanel();
	}

	/*
	 * private void setupTable() { JTable tblPatient; String[] patientHeader = {
	 * "Patient-Name", "Patient-Registration-Number", "Gender", "Date-of-Birth",
	 * "Address", "Phone" }; // the table has six columns /* String[][]
	 * patientData = { { "ANDREW", "S11111111", "MALE", "1970-01-01",
	 * "ANG MO KIO AVE 1", "91111111" }, { "BEN", "S2222222", "MALE",
	 * "1970-01-01", "TAMPINES AVE 8", "82222211" }, { "CINDY", "S11111111",
	 * "FEMALE", "1960-02-02", "BUKIT BATOK STREET 99", "91133333" }, {
	 * "DERRICK", "S111777711", "MALE", "1995-03-03", "GEYLANG LOR 1",
	 * "86321456" }, { "EMILY", "S16666111", "FEMALE", "1969-11-11",
	 * "ANG MO KIO AVE 1", "911665542" }, }; // initial sample data for testing
	 * /*
	 */
	/*
	 * tblPatient = new JTable(patientData, patientHeader) { public boolean
	 * isCellEditable(int paitentData, int patientHeader) { return false; } };
	 * // data // record // and // column // name
	 * 
	 * int number; if (patientData.length < 1) {
	 * System.out.println("There is not record."); number = 0; lblNumber = new
	 * JLabel("0"); if (patientData.length <= 1) number = patientData.length;
	 * lblNumber = new JLabel(Integer.toString(number)); }
	 * 
	 * tblPatient.setPreferredScrollableViewportSize(new Dimension(450, 200));
	 * // table // and // height tblPatient.setFillsViewportHeight(true);
	 * tblPatient.setBounds(10, 10, 680, 280);
	 * 
	 * JScrollPane scrollPane = new JScrollPane(tblPatient);
	 * 
	 * }
	 */
	private void setupLayout() {

		topPanel.setSize(760, 112);
		lblPatientTxt.setBounds(37, 20, 54, 15);
		btnAddPatient.setBounds(115, 47, 100, 30);
		btnDisplayPatient.setBounds(330, 47, 100, 30);
		btnExit.setBounds(545, 47, 100, 30);
		bottomPanel.setBounds(20, 148, 760, 420);
		bottomPanel.setLayout(new CardLayout(0, 0));
		lblAddPatientTxt.setBounds(38, 28, 108, 15);
		btnAdd.setBounds(621, 372, 100, 30);
		lblPatientName.setLocation(38, 71);
		lblPatientName.setSize(100, 30);
		txtPatientName.setLocation(204, 72);
		txtPatientName.setSize(180, 30);
		lblPatientID.setLocation(38, 129);
		lblPatientID.setSize(100, 30);
		txtPatientID.setLocation(204, 118);
		txtPatientID.setSize(180, 30);
		lblGender.setLocation(38, 187);
		lblGender.setSize(100, 30);
		rdMale.setLocation(204, 187);
		rdMale.setSize(100, 30);
		rdFemale.setLocation(284, 187);
		rdFemale.setSize(100, 30);
		sexGroup.add(rdMale);
		sexGroup.add(rdFemale);
		lblBirthday.setLocation(38, 245);
		lblBirthday.setSize(100, 30);
		txtBirthday.setLocation(204, 246);
		txtBirthday.setSize(180, 30);
		lblAddress.setLocation(38, 303);
		lblAddress.setSize(100, 30);
		txtAddress.setLocation(204, 304);
		txtAddress.setSize(180, 30);
		lblPhone.setLocation(38, 361);
		lblPhone.setSize(100, 30);
		txtPhone.setLocation(204, 362);
		txtPhone.setSize(180, 30);
		lblDisplayPatient.setBounds(37, 22, 216, 15);
		lblTotal.setBounds(37, 381, 162, 15);
		lblNumber.setLocation(265, 373);
		lblNumber.setSize(100, 30);
	}

	private void setupPanel() {
		// MAIN PANEL : add top add bottom
		setSize(800, 600);
		setLayout(null);
		add(topPanel);
		add(bottomPanel);

		// TOP PANEL
		topPanel.setLayout(null);
		topPanel.add(lblPatientTxt);
		topPanel.add(btnAddPatient); // SET COMMAND GO TO "ADD PATIENT" PANEL
		topPanel.add(btnDisplayPatient); // SET COMMAND GO TO "DISPLAY PATIENT"
											// PANEL
		topPanel.add(btnExit);

		// BOTTOM PANEL
		bottomPanel.add(pnlAddPatient, "1.1");
		bottomPanel.add(pnlDisplayPatient, "1.2");

		// BOTTOM PANEL: ADD PATIENT
		pnlAddPatient.setLayout(null);
		pnlAddPatient.add(lblAddPatientTxt);

		pnlAddPatient.add(lblPatientName);
		pnlAddPatient.add(lblGender);
		pnlAddPatient.add(lblPatientID);
		pnlAddPatient.add(lblBirthday);
		pnlAddPatient.add(lblAddress);
		pnlAddPatient.add(lblPhone);

		pnlAddPatient.add(txtPatientName);
		pnlAddPatient.add(txtPatientID);
		pnlAddPatient.add(txtBirthday);
		pnlAddPatient.add(txtAddress);
		pnlAddPatient.add(txtPhone);

		pnlAddPatient.add(rdMale);
		pnlAddPatient.add(rdFemale);

		pnlAddPatient.add(btnAdd);
		btnAdd.setToolTipText("Save new patient details");

		// LOOKS

		// DISPLAY PATIENT SECTION

		pnlDisplayPatient.setLayout(null);
		pnlDisplayPatient.add(scrollPane);
		pnlDisplayPatient.add(lblDisplayPatient);

		pnlDisplayPatient.add(lblTotal);
		pnlDisplayPatient.add(lblNumber);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 60, 720, 300);
		pnlDisplayPatient.add(scrollPane);
		scrollPane.add(tblPatient);
		scrollPane.setColumnHeaderView(tblPatient);

		setVisible(true);
	}

	// METHOD TO ADD PATIENT

	public void addPatientAction(ActionEvent add) throws Exception {
		// String[][] patientData;

		if (add.getSource() == btnAdd) {

			/*
			 * if (JOptionPane.showConfirmDialog(null,
			 * "Confirm to save new patient details?", "Confirm",
			 * JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
			 */

			String name = txtPatientName.getText();
			String id = txtPatientID.getText();
			String gender;
			if (rdMale.isSelected()) {
				gender = "MALE";
			} else {
				gender = "FEMALE";
			}
			;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthday = sdf.parse(txtBirthday.getText());
			String address = txtAddress.getText();
			String phone = txtPhone.getText();
			Patient currentPatient = new Patient(name, id, gender, birthday,
					address, phone);
			String[][] patientData = { { name }, { id }, { gender },
					{ (birthday).toString() }, { address }, { phone } };

			JTable tblPatient;
			String[] patientHeader = { "Patient-Name",
					"Patient-Registration-Number", "Gender", "Date-of-Birth",
					"Address", "Phone" };
			tblPatient = new JTable(patientData, patientHeader) {
				public boolean isCellEditable(int paitentData, int patientHeader) {
					return false;
				}
			}; // data
				// record
				// and
				// column
				// name

			int number;
			if (patientData.length < 1) {
				System.out.println("There is not record.");
				number = 0;
				lblNumber = new JLabel("0");
				if (patientData.length <= 1)
					number = patientData.length;
				lblNumber = new JLabel(Integer.toString(number));
			}

			tblPatient.setPreferredScrollableViewportSize(new Dimension(450,
					200)); // table
							// and
							// height
			tblPatient.setFillsViewportHeight(true);
			tblPatient.setBounds(10, 10, 680, 280);

			JScrollPane scrollPane = new JScrollPane(tblPatient);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
