/**
 * Class: Settings
 * Description: Contains the panel for the settings tab
 * 
 * @author Russell
 */

package com.example.wireframe.client;

import com.google.gwt.user.client.ui.*;

public class Settings 
{
	VerticalPanel pSettingsMain = new VerticalPanel();
	HorizontalPanel pButtonContainer = new HorizontalPanel();
	FlexTable ftLabelsAndFields = new FlexTable();
	
	Button bSaveSettings = new Button("Save");
	Button bCancel= new Button("Cancel");
	
	Label lSettingsHeading = new Label("Settings");
	Label lChangeOrder = new Label("Change record display order:");
	Label lChangeNumOfRecords = new Label("Change number of records to display:");
	
	TextBox tbChangeOrder = new TextBox();
	TextBox tbChangeNumber = new TextBox();
	/**
	 * Provides the panel for the settings portion of the application
	 * 
	 * @author Russell
	 * @return Returns the vertical panel pSettingsMain to be placed in the root panel
	 */
	public VerticalPanel getPanel()
	{
		pSettingsMain.add(lSettingsHeading);
		ftLabelsAndFields.setWidget(0, 0, lChangeOrder);
		ftLabelsAndFields.setWidget(1, 0, lChangeNumOfRecords);
		ftLabelsAndFields.setWidget(0, 1, tbChangeOrder);
		ftLabelsAndFields.setWidget(1, 1, tbChangeNumber);
		
		pButtonContainer.add(bSaveSettings);
		pButtonContainer.add(bCancel);
		
		pSettingsMain.add(ftLabelsAndFields);
		pSettingsMain.add(pButtonContainer);
		
		return pSettingsMain;
	}

}
