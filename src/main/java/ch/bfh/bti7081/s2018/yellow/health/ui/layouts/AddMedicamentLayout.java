package ch.bfh.bti7081.s2018.yellow.health.ui.layouts;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
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
public class AddMedicamentLayout extends AbsoluteLayout {
	private Label lbl_Message;
	private Button bu_save;
	private Label lbl_Name;
	private TextField txt_Name;
	private Label lbl_Description;
	private TextArea txt_Description;
	private Grid gr_Medicaments;

	public AddMedicamentLayout() {
		Design.read(this);
	}

	public Label getLbl_Message() {
		return lbl_Message;
	}

	public Button getBu_save() {
		return bu_save;
	}

	public Label getLbl_Name() {
		return lbl_Name;
	}

	public TextField getTxt_Name() {
		return txt_Name;
	}

	public Label getLbl_Description() {
		return lbl_Description;
	}

	public TextArea getTxt_Description() {
		return txt_Description;
	}

	public Grid getGr_Medicaments() {
		return gr_Medicaments;
	}
}
