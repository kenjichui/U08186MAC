import java.awt.List;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


public class PatientTableModel extends AbstractTableModel {

    ArrayList<Patient> patientData;
    String [] patHeader = {"Patient-Name",
		"Patient-Registration-Number",
		"Gender",
		"Date-of-Birth",
		"Address",
		"Contact-No"};

    public  PatientTableModel() {
        patientData = new ArrayList<Patient>();

        patientData.add(new Patient(txtPatientName.getText(), 1));
		patientData.add(new Patient(txtPatientID.getText(), 2));
		patientData.add(new Patient(sexGroup.isSelected.getText(), 3));
		patientData.add(new Patient(txtBirthday.getText(), 4));
		patientData.add(new Patient(txtAddress.getText(), 5));
		patientData.add(new Patient(txtPhone.getText(), 6));
    }

    public int getRowCount() {
        return patientData.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Patient pat = patientData.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return pat.getName();
        case 1:
            return pat.getID();
		case 2:
            return pat.getGender();
		case 3:
            return pat.getBirthday();
		case 4:
            return pat.getAddress();
		case 5:
            return pat.getPhone();
		default:
            return null;
        }
    }

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}