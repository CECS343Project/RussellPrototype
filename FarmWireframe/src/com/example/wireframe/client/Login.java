/**
 * Class: Login
 * Description: Contains the gui elements for the login screen and logout screen
 * 				Program decides which to display based on an overloaded method
 * @author Russell
 */

package com.example.wireframe.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Login 
{
		private TextBox tbUsername = new TextBox();
		private PasswordTextBox tbPassword = new PasswordTextBox();
		private Button bLoginSubmit = new Button("Login");
		private Label lLogin = new Label("Please Log In");		
		private Label lUsername = new Label("Usersname");
		private Label lPassword = new Label("password");
		private VerticalPanel pLoginMain = new VerticalPanel();
		private TabPanel pLoginTab = new TabPanel();
		private FlexTable ftLoginScreen = new FlexTable();
		private boolean isLoggedIn = false;
		
		/**
		 * Provides the panel portion for the login screen
		 * 
		 * @author Russell 
		 * @return Returns a tab panel pLoginTab to be added to the root panel
		 */
		public TabPanel getPanel()
		{
			ftLoginScreen.setWidget(0, 0, lUsername);
			ftLoginScreen.setWidget(0, 1, tbUsername);
			ftLoginScreen.setWidget(1, 0, lPassword);
			ftLoginScreen.setWidget(1, 1, tbPassword);
			ftLoginScreen.setWidget(2, 1, bLoginSubmit);
			
			lLogin.addStyleName("loginText");
			tbUsername.addStyleName("textFields");
			tbPassword.addStyleName("textFields");
			lUsername.addStyleName("loginLabels");
			lPassword.addStyleName("loginLabels");
			bLoginSubmit.addStyleName("loginButton");
			
			pLoginMain.add(lLogin);
			pLoginMain.add(ftLoginScreen);
			
			pLoginMain.addStyleName("mainPanel");
			pLoginTab.add(pLoginMain,"Login");
			
			ClickHandler chLoginSubmit = new ClickHandler()
			{
				public void onClick(ClickEvent event)
				{
					
					setIsLoggedIn(true);
					removePanel();
				}
			};
			
			KeyDownHandler khLoginSumbit = new KeyDownHandler()
			{

				@Override
				public void onKeyDown(KeyDownEvent event) 
				{
					if(event.getNativeKeyCode() == KeyCodes.KEY_ENTER)
					{
						removePanel();
					}
				}
			};
			tbPassword.addKeyDownHandler(khLoginSumbit);
			bLoginSubmit.addClickHandler(chLoginSubmit);
			
			return pLoginTab;
		}
		
		protected void removePanel() 
		{
			String sUsername = tbUsername.getText();
			MessagePane mpRemoveConfirm = new MessagePane();
			
			mpRemoveConfirm.showDialog("Welcome " + sUsername+"!");
			this.getPanel().removeFromParent();
		}

		/**
		 * Provides the logout panel to be added to the root panel
		 * If this panel is needed, use the overloaded method to provide the proper panel
		 * 
		 * @author Russell
		 * @param dummyVar
		 * @return Returns the logout panel if calling method provides an integer
		 */
		public VerticalPanel getPanel(int dummyVar)
		{
			VerticalPanel pLogoutLayout = new VerticalPanel();
			Label lLougoutMessage = new Label("You have successfully logged out!");
			Button bOK = new Button("OK");
			
			pLogoutLayout.add(lLougoutMessage);
			pLogoutLayout.add(bOK);
			this.setIsLoggedIn(false);
			
			return pLogoutLayout;
		}
		/**
		 *  Returns whether or not user is logged in
		 * @return Returns boolean isLoggedIn
		 */
		public boolean getIsLoggedIn() 
		{
			return isLoggedIn;
		}

		/**
		 *  Sets boolean isLoggedIn
		 * @param isLoggedIn 
		 */
		public void setIsLoggedIn(boolean isLoggedIn) 
		{
			this.isLoggedIn = isLoggedIn;
		}

}
