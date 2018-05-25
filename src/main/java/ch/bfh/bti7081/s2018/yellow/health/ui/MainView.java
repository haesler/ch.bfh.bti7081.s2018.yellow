package ch.bfh.bti7081.s2018.yellow.health.ui;

import org.springframework.context.ApplicationContext;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.declarative.Design;

import ch.bfh.bti7081.s2018.yellow.health.ui.components.patient.PatientViewImpl;
import ch.bfh.bti7081.s2018.yellow.health.ui.components.sidebar.SideBarViewImpl;
import ch.bfh.bti7081.s2018.yellow.health.ui.navigation.AppNavigator;


@SuppressWarnings("serial")
public class MainView extends HorizontalLayout {

    public MainView(ApplicationContext context) {
        setSizeFull();
        addStyleName("mainview");
        setSpacing(false);

        addComponent(new SideBarViewImpl());

        ComponentContainer content = new CssLayout();
        content.addStyleName("view-content");
        content.setSizeFull();
        addComponent(content);
        setExpandRatio(content, 1.0f);
        
        //content.addComponent(new PatientViewImpl());

        new AppNavigator(content, context);
    }
}

