package com.example.demo;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class AdminView extends VerticalLayout {

    public AdminView() {
        add(new H1("Admin view"));
    }
}
