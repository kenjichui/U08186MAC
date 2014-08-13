package hospital.view;

import hospital.controller.HospitalAppController;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author XU YINGZHENG
 */

public class PnlStart extends JPanel {

	// START SCREEN : contents two button

	private HospitalAppController hospitalAppController;
	private JLabel lblHMStxt;
	public JButton btnPatient;
	public JButton btnTreatment;
	private CardLayout card;

	public PnlStart(HospitalAppController hospitalAppController) {
		setBackground(Color.GRAY);

		card = new CardLayout();
		hospitalAppController = new HospitalAppController();

		lblHMStxt = new JLabel("Please click the button to use the functions.");
		btnPatient = new JButton("PATIENT");

		btnTreatment = new JButton("TREATMENT");
		btnTreatment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});

		setupLayout();
		setupPanel();
		setupListener();
	}

	private void setupLayout() {

		setLayout(null);

		lblHMStxt.setBounds(38, 27, 300, 30);
		btnPatient.setBounds(85, 67, 150, 40);
		btnTreatment.setBounds(334, 67, 150, 40);
	}

	private void setupPanel() {
		setSize(800, 130);
		add(lblHMStxt);
		add(btnPatient);
		add(btnTreatment);

		setVisible(true);
	}

	private void setupListener() {

	}
}
