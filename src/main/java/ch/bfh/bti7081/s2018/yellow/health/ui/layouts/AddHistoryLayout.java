package ch.bfh.bti7081.s2018.yellow.health.ui.layouts;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Upload;
import com.vaadin.ui.VerticalLayout;
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
public class AddHistoryLayout extends VerticalLayout {
	private Label lbl_title;
	private Label lbl_DateNew;
	private DateField dt_DateNew;
	private Label lbl_TitleNew;
	private TextField txt_TitleNew;
	private Upload upl_UploadNew;
	private Label lbl_DescriptionNew;
	private TextArea txt_DescNew;
	private Label lbl_Notify;

	public AddHistoryLayout() {
		Design.read(this);
	}

	public Label getLbl_title() {
		return lbl_title;
	}

	public Label getLbl_DateNew() {
		return lbl_DateNew;
	}

	public DateField getDt_DateNew() {
		return dt_DateNew;
	}

	public Label getLbl_TitleNew() {
		return lbl_TitleNew;
	}

	public TextField getTxt_TitleNew() {
		return txt_TitleNew;
	}

	public Upload getUpl_UploadNew() {
		return upl_UploadNew;
	}

	public Label getLbl_DescriptionNew() {
		return lbl_DescriptionNew;
	}

	public TextArea getTxt_DescNew() {
		return txt_DescNew;
	}

	public Label getLbl_Notify() {
		return lbl_Notify;
	}
}
