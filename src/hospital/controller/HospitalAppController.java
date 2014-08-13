package hospital.controller;

import hospital.model.MVCHospitalModel;
import hospital.view.MainFrame;
import hospital.view.MenuFrame;

/**
 * @author XU YINGZHENG
 * 
 */

/*
 * HospitalAppController class contains the Start method and shows the link
 * between view and model hospitalAppController create HospitalFrame object
 * passing a reference to the Controller for use by the HospitalFrame object.
 * hospitalController is the reference to HospitalAppController object
 */

public class HospitalAppController {

	private MenuFrame menuFrame;
	private MainFrame mainFrame;

	private MVCHospitalModel hospitalModel;

	public MVCHospitalModel getHospital() {
		return hospitalModel;
	}

	public void start() {
		menuFrame = new MenuFrame(this);
		// mainFrame = new MainFrame(this);
	}

}
