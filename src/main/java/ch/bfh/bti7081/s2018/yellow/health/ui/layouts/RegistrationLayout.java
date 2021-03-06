package ch.bfh.bti7081.s2018.yellow.health.ui.layouts;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class RegistrationLayout extends AbsoluteLayout {
	private Label lbl_Name;
	private TextField txt_Name;
	private Label lbl_Password1;
	private PasswordField pwd_Password1;
	private Label lbl_Password2;
	private PasswordField pwd_Password2;
	private Button btn_Submit;
	private Label lbl_Title;
	private Label lbl_Error;

	public RegistrationLayout() {
		Design.read(this);
	}

	public Label getLbl_Name() {
		return lbl_Name;
	}

	public TextField getTxt_Name() {
		return txt_Name;
	}

	public Label getLbl_Password1() {
		return lbl_Password1;
	}

	public PasswordField getPwd_Password1() {
		return pwd_Password1;
	}

	public Label getLbl_Password2() {
		return lbl_Password2;
	}

	public PasswordField getPwd_Password2() {
		return pwd_Password2;
	}

	public Button getBtn_Submit() {
		return btn_Submit;
	}

	public Label getLbl_Title() {
		return lbl_Title;
	}

	public Label getLbl_Error() {
		return lbl_Error;
	}
}
