package hospital.view;

import hospital.controller.HospitalAppController;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * @author XU YINGZHENG
 */

/*
 * The View extends JFrame Contains methods to setup components inside the
 * JFrame create a HospitalFrame object passing reference to the
 * HospitalAppController
 */

public class HospitalFrame extends JFrame implements ActionListener {

	public String frameTitle = "X.Y.Z Hospital Management System";

	private PnlStart pnlStart;
	private PnlPatient pnlPatient;
	private PnlTreatment pnlTreat;

	public HospitalFrame(HospitalAppController hospitalAppController) {

		pnlStart = new PnlStart(hospitalAppController);
		pnlPatient = new PnlPatient(hospitalAppController);
		pnlTreat = new PnlTreatment(hospitalAppController);

		setupFrame();
	}

	private void setupFrame() {

		setTitle(frameTitle);
		this.setSize(800, 600);
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnlStart.btnTreatment.setBounds(250, 99, 150, 30);
		pnlStart.btnPatient.setBounds(50, 99, 150, 30);
		pnlStart.setLayout(null);

		// Set frame position at center of screen
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int x = (d.width / 2) - (this.getWidth() / 2);
		int y = (d.height / 2) - (this.getHeight() / 2);
		this.setLocation(x, y);
		// set pnlStart as the first screen when we load the program.n
		this.setContentPane(null);

		getContentPane().add(pnlStart, "0");
		getContentPane().add(pnlPatient, "1");
		// pnlPatient.add(pnlAddPatient,"1.1");
		// pnlPatient.add(pnlDisplayPatient,"1.2");

		getContentPane().add(pnlTreat, "2");
		// pnlTreat.add(pnlAddTreat,"2.1");
		// pnlTreat.add(pnlDisplayTreat,"2.2");

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout card = (CardLayout) (getContentPane().getLayout());
		if (e.getSource() == pnlStart.btnPatient) {
			card.show(getContentPane(), "1");
		} else {
			card.show(getContentPane(), "2");
		}

	};

}
