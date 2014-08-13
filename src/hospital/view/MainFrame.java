package hospital.view;

import hospital.controller.HospitalAppController;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author XU YINGZHENG
 */

/*
 * The View extends JFrame Contains methods to setup components inside the
 * JFrame create a HospitalFrame object passing reference to the
 * HospitalAppController
 */

public class MainFrame extends JFrame implements ActionListener {

	public String frameTitle = "X.Y.Z Hospital Management System";
	private JPanel content;
	private PnlStart pnlStart;
	private PnlPatient pnlPatient;
	private PnlTreatment pnlTreatment;
	private CardLayout card;

	public MainFrame(HospitalAppController hospitalAppController) {

		content = new JPanel(card);
		pnlStart = new PnlStart(hospitalAppController);
		pnlStart.btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(content, "1");
			}
		});

		pnlStart.setBackground(Color.LIGHT_GRAY);
		pnlPatient = new PnlPatient(hospitalAppController);
		pnlTreatment = new PnlTreatment(hospitalAppController);
		card = new CardLayout();

		setupFrame();
	}

	private void setupFrame() {

		setTitle(frameTitle);
		this.setSize(800, 600);
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set frame position at center of screen
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int x = (d.width / 2) - (this.getWidth() / 2);
		int y = (d.height / 2) - (this.getHeight() / 2);
		this.setLocation(x, y);

		// pnlStart.setLayout(null);
		// pnlStart.setBounds(0, 0, 800, 600);
		// pnlPatient.setBounds(0, 0, 800, 600);
		// pnlTreatment.setBounds(0, 0, 800, 600);

		// setContentPane(content);

		content.setLayout(card);

		getContentPane().add(content);

		// content.add(pnlStart, "0");
		content.add(pnlPatient, "1");
		content.add(pnlTreatment, "2");

		// set pnlStart as the first screen when we load the program.n

		setVisible(true);

	}

	public void setupListener() {

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
