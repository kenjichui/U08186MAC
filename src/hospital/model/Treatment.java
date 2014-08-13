package hospital.model;

import java.util.ArrayList;

public class Treatment {

	public String treatmentID;
	public String treatmentName;
	public String docInCharge;
	public String roomID;

	public Treatment(String treatmentID, String treatmentName,
			String docInCharge, String roomID) throws Exception {

		this.treatmentID = treatmentID;
		this.treatmentName = treatmentName;
		this.docInCharge = docInCharge;
		this.roomID = roomID;
	}

	private String getTreatmentID() {
		return treatmentID;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public ArrayList<Treatment> addTreatment() throws Exception {

		/****************************************************************/
		// Create ArrayList to store the treatment record
		/****************************************************************/

		ArrayList<Treatment> treatmentData = new ArrayList<Treatment>();

		int j = 0;

		boolean isExist = false;

		// Require there are no two treatment have the same ID.

		for (Treatment tre : treatmentData) {
			if (tre.getTreatmentID().equals(this.treatmentID)) {
				isExist = true;

				// System.out.println("The Treatment ID you entered is already existed.");

				break;
			}

			if (!isExist) {
				treatmentData.add(new Treatment(treatmentID, docInCharge,
						docInCharge, docInCharge));
				j++;
			}

		}
		return tl;

	}
}
