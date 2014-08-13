package hospital.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author XU YINGZHENG
 * 
 */

public class MVCHospitalModel {
	private Person patient;
	private ArrayList<Patient> patientData;
	private ArrayList<Treatment> treatmentData;
	private ArrayList<Doctor> doctorData;

	/*
	 * Check user input
	 * 
	 * Precondition: name not null Precondition: id cannot be null, id doesn't
	 * has same value existed in the system Precondition: birthday not null
	 * Precondition: phone not null Precondition: address not null
	 * 
	 * Postcondition: ensure new patient details added to the patient array
	 */

	public boolean addPatient(String name, String id, String gender,
			Date birthday, String address, String phone) throws Exception {

		boolean canAddPatient = false;

		if (name == null || name.isEmpty())
			throw new Exception(
					"Please enter correct value, name cannot be empty.");
		if (id == null || id.isEmpty())
			throw new Exception(
					"Please enter correct value, ID cannot be empty.");
		if (gender == null)
			try {
				throw new Exception(
						"Please choose Male or female, do not leave it empty.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		if (address == null)
			throw new Exception(
					"Please enter a valid date, it cannot be empty.");
		if (phone == null)
			throw new Exception(
					"Please enter a valid date, it cannot be empty.");
		else {
			Patient currentPatient = new Patient(name, id, gender, birthday,
					address, phone);
			patientData.add(currentPatient);
			return canAddPatient = true;
		}
	}

	/****************************************************************/
	// -----precondition:-----
	// treatmentName cannot be null
	// treatmentID cannot be null
	// docInCharge does has same value existed in the system
	// roomID cannot be null
	//
	// ------postcondition:-----
	//
	// ensure new treatment details added to the record
	/**
	 * @throws Exception
	 **************************************************************/

	public boolean addTreatment(String treatmentName, String treatmentID,
			String docInCharge, String roomID) throws Exception {

		boolean addTreatment = false;

		if (treatmentName == null || treatmentName.isEmpty())
			throw new Exception("Please enter valid treatment name.");

		if (treatmentID == null || treatmentID.isEmpty())
			throw new Exception("Please enter valid treatment number.");

		if (docInCharge == null || docInCharge.isEmpty())
			throw new Exception("Please enter valid doctor's name.");

		if (roomID == null || roomID.isEmpty())
			throw new Exception("Please enter a valid room number.");

		else {
			Treatment currentTreatment = new Treatment(treatmentName,
					treatmentID, docInCharge, roomID);
			treatmentData.add(currentTreatment);
			return addTreatment = true;
		}
	}

	public ArrayList<Patient> getPatientData() {
		return patientData;
	}

	public ArrayList<Treatment> getTreatmentData() {
		return treatmentData;
	}

	public ArrayList<Doctor> getDoctorData() {
		return doctorData;
	}

	public void setPatientData(ArrayList<Patient> patientData) {
		this.patientData = patientData;
	}

	public void setTreatmentData(ArrayList<Treatment> treatmentData) {
		this.treatmentData = treatmentData;
	}

	public void setDoctorData(ArrayList<Doctor> doctorData) {
		this.doctorData = doctorData;
	}

	public MVCHospitalModel() {
		patientData = new ArrayList<Patient>();
		treatmentData = new ArrayList<Treatment>();
		doctorData = new ArrayList<Doctor>();
	}

	public ArrayList<Patient> getPatientList() {
		return patientData;
	}

	public ArrayList<Treatment> getTreatList() {
		return treatmentData;
	}

	public void setPatientList(ArrayList<Patient> patientList) {
		this.patientData = patientList;
	}

	public void setTreatList(ArrayList<Treatment> treatList) {
		this.treatmentData = treatList;
	}

}
