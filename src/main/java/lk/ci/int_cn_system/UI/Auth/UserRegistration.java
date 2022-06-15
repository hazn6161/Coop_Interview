package lk.ci.int_cn_system.UI.Auth;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Upload;
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
public class UserRegistration extends Panel {
	protected AbsoluteLayout panal;
	protected TextField nic;
	protected TextField fullnm;
	protected TextField email;
	protected Button button_save;
	protected TextField namewinti;
	protected TextField tp;
	protected ComboBox gender;
	protected Table table1;
	protected Label label_cVno;
	protected TextField address;
	protected TextField requestingPossition;
	protected TextField salary;
	protected ComboBox comboBox_company;
	protected TextField textField_introduceBy;
	protected ComboBox comboBox_empCategory;
	protected ComboBox comboBox_titel;
	protected TextField textField_landline;
	protected TextArea textArea_remark;
	protected DateField dateField_dob;
	protected ComboBox comboBox_civilstate;
	protected ComboBox comboBox_empmode;
	protected TextField textField_cv_no;
	protected Button button_serch;
	protected ComboBox comboBox_religion;
	protected ComboBox comboBox_highestqualification;
	protected Button button_update;
	protected Button button_clear;
	protected TextField textField_company;
	protected TextField textField_designation;
	protected TextField textField_no_of_years;
	protected Upload file_upload;
	protected Button button_ATT;
	protected ComboBox comboBox_uploadcv;

	public UserRegistration() {
		Design.read(this);
	}
}