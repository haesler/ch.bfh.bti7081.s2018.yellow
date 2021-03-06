package ch.bfh.bti7081.s2018.yellow.health.ui.components.searchcontact;

import org.springframework.stereotype.Component;

import com.vaadin.data.ValueProvider;
import com.vaadin.ui.UI;

import ch.bfh.bti7081.s2018.yellow.health.models.Contact;
import ch.bfh.bti7081.s2018.yellow.health.models.Patient;
import ch.bfh.bti7081.s2018.yellow.health.ui.components.contact.AddContactViewImpl;
import ch.bfh.bti7081.s2018.yellow.health.ui.components.patient.AddPatientViewImpl;
import ch.bfh.bti7081.s2018.yellow.health.ui.components.tabcontrol.TabControlImpl;

public class SearchContactPresenter implements SearchContactView.SearchContactViewListener{

	SearchContactModel model;
	SearchContactViewImpl view;
	
	
	public SearchContactPresenter(SearchContactModel model,SearchContactViewImpl view) {
		this.model = model;
		this.view  = view;

		view.showContacts(model.contacts);
		view.addListener(this);
		view.grid.setDataProvider(model.dataProvider);
	}
	
	
	public void filter1(String text, ValueProvider<Contact, ?> valueProvider) {
		if (text != null) {
			model.dataProvider.setFilter(valueProvider, s -> caseInsensitiveContains(s.toString(), text));
    	  } else {
    		  model.dataProvider.clearFilters();
    	  }
	}
	
	public void refresh() {
		model.refresh();
		view.grid.setDataProvider(model.dataProvider);
	}
	
	public void editContact(Contact contact) { //Open Contact Window and load the current selected Contact.
		UI.getCurrent().getNavigator().navigateTo("EditContact");
		((AddContactViewImpl)UI.getCurrent().getNavigator().getCurrentView()).getPresenter().loadContact(contact);
	}
	
   private Boolean caseInsensitiveContains(String where, String what) { //for Validation
        return where.toLowerCase().contains(what.toLowerCase());
    }


@Override
public void addContactClicked() { //Open new empty Contact Window 
	UI.getCurrent().getNavigator().navigateTo("AddContact");
	((AddContactViewImpl)UI.getCurrent().getNavigator().getCurrentView()).getPresenter().loadContact(new Contact());	
}

}
