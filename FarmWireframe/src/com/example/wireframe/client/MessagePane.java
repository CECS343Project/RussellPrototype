/**
 * Class: MessagePane
 * Description: Holds the window to display custom messages; similar to JOptionPane
 * @author Russell
 */

package com.example.wireframe.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;

public class MessagePane extends DialogBox
{
	MessagePane(){}
	
	private VerticalPanel pMainMessagePanel = new VerticalPanel();
	private HorizontalPanel pButtonPanel = new HorizontalPanel();
	
	/**
	 *  Shows a given dialog message in a popup box
	 * @author Russell  
	 * @param message
	 */
	public void showDialog(String message)
	{
		Label lMessage = new Label(message);
		Button bOk = new Button("OK");
		
		ClickHandler chOkButton = new ClickHandler()
		{

			@Override
			public void onClick(ClickEvent event) 
			{
				hide();				
			}
		};
		bOk.addClickHandler(chOkButton);
		
		pMainMessagePanel.add(lMessage);
		pButtonPanel.add(bOk);
		pMainMessagePanel.add(pButtonPanel);
		setWidget(pMainMessagePanel);
		this.center();
		this.show();
	}
	
	
	

}
