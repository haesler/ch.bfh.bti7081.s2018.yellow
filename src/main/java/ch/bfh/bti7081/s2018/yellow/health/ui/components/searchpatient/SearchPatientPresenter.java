package ch.bfh.bti7081.s2018.yellow.health.ui.components.searchpatient;

import org.springframework.stereotype.Component;

import com.vaadin.data.ValueProvider;
import com.vaadin.ui.UI;

import ch.bfh.bti7081.s2018.yellow.health.models.Contact;
import ch.bfh.bti7081.s2018.yellow.health.models.Patient;
import ch.bfh.bti7081.s2018.yellow.health.ui.components.patient.AddPatientViewImpl;
import ch.bfh.bti7081.s2018.yellow.health.ui.components.tabcontrol.TabControlImpl;

public class SearchPatientPresenter implements SearchPatientView.SearchPatientViewListener{

	SearchPatientModel model;
	SearchPatientViewImpl view;
	
	
	public SearchPatientPresenter(SearchPatientModel model,SearchPatientViewImpl view) {
		this.model = model;
		this.view  = view;

		view.showPatients(model.patients);
		view.addListener(this);
		view.grid.setDataProvider(model.dataProvider);
	}
	
	
	public void filter1(String text, ValueProvider<Patient, ?> valueProvider) {
		if (text != null) {
			model.dataProvider.setFilter(valueProvider, s -> caseInsensitiveContains(s.toString(), text));
    	  } else {
    		  model.dataProvider.clearFilters();
    	  }
	}

	public void editPatient(Patient patient) {  //open Patient Window with the current selected Patient
		UI.getCurrent().getNavigator().navigateTo("EditPatient");
		((TabControlImpl)UI.getCurrent().getNavigator().getCurrentView()).getPresenter().loadPatient(patient);
	}
	
   private Boolean caseInsensitiveContains(String where, String what) {
        return where.toLowerCase().contains(what.toLowerCase());
    }


	@Override
	public void addPatientClicked() { //Open new empty Patient Window
		UI.getCurrent().getNavigator().navigateTo("AddPatient");
		((TabControlImpl)UI.getCurrent().getNavigator().getCurrentView()).getPresenter().loadPatient(new Patient());
	}
	
	public void refresh() {
		model.refresh();
		view.grid.setDataProvider(model.dataProvider);
	}

}
