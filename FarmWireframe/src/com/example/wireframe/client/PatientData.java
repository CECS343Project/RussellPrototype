/**
 * Class: PatientData
 * Description: Holds the Datagrid to display patient records
 * @author Russell
 */

package com.example.wireframe.client;

import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PatientData 
{
	VerticalPanel pMainTable = new VerticalPanel();
	HorizontalPanel pSearch = new HorizontalPanel();
	HorizontalPanel pModDelete = new HorizontalPanel();
	Label lMainTable = new Label("Patient Records");
	TextBox tbSearchPatients = new TextBox();
	Button bSearch = new Button("Search!");

	/**
	 * Provides the panel for the datagrid of the patient list
	 * 
	 * @author Russell
	 * 
	 * @return returns a vertical panel pMainTable to be added to the root panel
	 */
	public VerticalPanel getPanel()
	{
		pSearch.add(tbSearchPatients);
		pSearch.add(bSearch);
		
		Button modifyPatB = new Button("Modify");
		Button deletePatB = new Button("Delete");
		
		DataGrid<Integer> patientTableDG = new DataGrid<Integer>();
		patientTableDG.setHeight("500px");
		patientTableDG.setWidth("500px");
		
		lMainTable.addStyleName("loginText");
		pMainTable.add(lMainTable);
		pMainTable.add(pSearch);
		pMainTable.add(patientTableDG);
		
		pModDelete.add(deletePatB);
		pModDelete.add(modifyPatB);
		
		pMainTable.add(pModDelete);
		pMainTable.addStyleName("mainPanel");
		
		return pMainTable;
	}

}
