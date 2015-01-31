/**
 * Class: Home
 * Description: Holds the main vertical panel for the navigation elements
 * @author Russell
 */
package com.example.wireframe.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Home 
{
	private VerticalPanel pHome = new VerticalPanel();
	private HorizontalPanel pWelcome = new HorizontalPanel();
	private FlexTable ftHome = new FlexTable();
	private VerticalPanel pButton = new VerticalPanel();
	private Label lWelcomeMessage = new Label("Welcome to Web-Pharm!");
	private Button bNewPatient = new Button("New Patient");
	private Button bSearchPatients = new Button("Search Patients");
	private Button bSettings = new Button("Settings");
	private Button bLougout = new Button("Logout");
	private Image iLogo = new Image("repository_logo.png");

	/**
	 * Provides the panel for the home screen
	 * 
	 * @author Russell
	 * 
	 * @return Returns a vertical panel pHome to be added to the root panel
	 */
	public VerticalPanel getPanel()
	{
		lWelcomeMessage.addStyleName("loginText");
		pWelcome.add(lWelcomeMessage);
		
		pButton.add(bNewPatient);
		pButton.add(bSearchPatients);
		pButton.add(bSettings);
		pButton.add(bLougout);
		
		ftHome.setWidget(0, 0, iLogo);
		ftHome.setWidget(0, 1, pButton);
		pHome.add(pWelcome);
		pHome.add(ftHome);
		pHome.addStyleName("mainPanel");
		
		return pHome;
	}
}
