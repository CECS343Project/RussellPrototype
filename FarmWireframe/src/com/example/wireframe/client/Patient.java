/**
 * Class: Patient
 * Description: Contains the gui elements for the new patient screen
 * @author Russell
 */

package com.example.wireframe.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Patient 
{
	VerticalPanel pNewPatient = new VerticalPanel();
	HorizontalPanel pPatientInfo = new HorizontalPanel();
	HorizontalPanel pSaveSend = new HorizontalPanel();
	FlexTable ftPatientData = new FlexTable();
	FlexTable ftDocData = new FlexTable();
	
	Label lNewPatTitle = new Label("Add New Patient");		
	Label lPatName = new Label("Name:");
	Label lPatDOB = new Label("Date of Birth:");
	Label lPatAddr = new Label("Address:");
	Label lPatPharm = new Label("Pharmacy:");
	Label lDocNotes = new Label("Notes:");
	Label lDocPrescrip = new Label("Prescription:");
	Label lDocSig = new Label("E-Signature:");
	
	TextBox tbPatName = new TextBox();
	TextBox tbPatDOB = new TextBox();
	TextBox tbPatAddr = new TextBox();
	TextArea taDocNotes = new TextArea();
	TextBox tbDocPrescrip = new TextBox();
	TextBox tbDocSig = new TextBox();
	
	ListBox lbPatPharm = new ListBox();
	
	Button bAddPrescript = new Button("Add Prescription");
	Button bSavePatient = new Button("Save");
	Button bSendPrescrip = new Button("Send Prescription");
	
	/**
	 * Provides the panel for the new or modify patient screen
	 * 
	 * @author Russell
	 * 
	 * @return Returns a vertical panel pNewPatient to be added to the root panel
	 */
	public VerticalPanel getPanel()
	{
		lNewPatTitle.addStyleName("loginText");
		pNewPatient.add(lNewPatTitle);
		
		lbPatPharm.addItem("CVS Pharmacy");
		
		ftPatientData.setWidget(0, 0, lPatName);
		ftPatientData.setWidget(0, 1, tbPatName);
		ftPatientData.setWidget(1, 0, lPatDOB);
		ftPatientData.setWidget(1, 1, tbPatDOB);
		ftPatientData.setWidget(2, 0, lPatAddr);
		ftPatientData.setWidget(2, 1, tbPatAddr);		
		ftPatientData.setWidget(3, 0, lPatPharm);
		ftPatientData.setWidget(3, 1, lbPatPharm);
		
		pPatientInfo.add(ftPatientData);
		
		pNewPatient.add(pPatientInfo);
		
		ftDocData.setWidget(0, 0, lDocNotes);
		ftDocData.setWidget(0, 1, taDocNotes);
		ftDocData.setWidget(1, 0, lDocPrescrip);
		ftDocData.setWidget(1, 1, tbDocPrescrip);
		
		pNewPatient.add(ftDocData);
		
		pSaveSend.add(bSavePatient);
		pSaveSend.add(bSendPrescrip);
		
		pNewPatient.add(pSaveSend);
		
		pNewPatient.addStyleName("mainPanel");
		
		return pNewPatient;
	}
}
