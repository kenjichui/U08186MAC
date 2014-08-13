/**
 * 
 */
package hospital.view;

import hospital.controller.HospitalAppController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * @author XU YINGZHENG
 * 
 */
public class MenuFrame extends JFrame implements ActionListener {

	public String frameTitle = "X.Y.Z Hospital Management System";
	public static MainFrame mainFrame;
	public static JFrame menuFrame;
	private PnlStart pnlStart;
	private PnlPatient pnlPatient;

	public MenuFrame(HospitalAppController hospitalAppController) {

		// content = new JPanel(card);
		pnlStart = new PnlStart(hospitalAppController);
		pnlPatient = new PnlPatient(hospitalAppController);
		pnlStart.btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlPatient.setVisible(true);
			}
		});
		pnlStart.setBackground(Color.LIGHT_GRAY);

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

		getContentPane().add(pnlStart);

		// set pnlStart as the first screen when we load the program.n

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent a) {

	}
}
