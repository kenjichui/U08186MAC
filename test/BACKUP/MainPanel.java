package hospital.view;

import hospital.controller.HospitalAppController;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

/**
 * @author XU YINGZHENG
 */

/*
 * The View extends JFrame Contains methods to setup components inside the
 * JFrame create a HospitalFrame object passing reference to the
 * HospitalAppController
 */

public class MainPanel extends JPanel implements ActionListener {

	private PnlStart pnlStart;
	private PnlPatient pnlPatient;
	private PnlTreatment pnlTreat;

	private HospitalAppController hospitalAppController;

	public MainPanel(HospitalAppController hospitalAppController) {

		this.hospitalAppController = hospitalAppController;

		pnlStart = new PnlStart();
		pnlPatient = new PnlPatient();
		pnlTreat = new PnlTreatment();

		setupPanel();
	}

	private void setupPanel() {

		this.setSize(800, 600);
		pnlStart.btnTreatment.setBounds(250, 99, 150, 30);
		pnlStart.btnPatient.setBounds(50, 99, 150, 30);
		pnlStart.setLayout(null);

		add(pnlStart, "0");
		add(pnlPatient, "1");
		add(pnlTreat, "2");
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout card = (CardLayout) (this.getLayout());
		if (e.getSource() == pnlStart.btnPatient) {
			card.show(this, "1");
		} else {
			card.show(this, "2");
		}

	};

}
