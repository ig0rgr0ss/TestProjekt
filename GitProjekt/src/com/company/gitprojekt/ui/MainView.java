
package com.company.gitprojekt.ui;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevVerticalLayout;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.table.XdevTable;

public class MainView extends XdevView {
	
	private boolean m=false;
	/**
	 * 
	 */
	public MainView() {
		super();
		this.initUI();
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated
	 * by the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.verticalLayout = new XdevVerticalLayout();
		this.button = new XdevButton();
		this.button2 = new XdevButton();
		this.table = new XdevTable<>();
	
		this.button.setCaption("Button");
		this.button2.setCaption("Button");
	
		this.button.setSizeUndefined();
		this.verticalLayout.addComponent(this.button);
		this.verticalLayout.setComponentAlignment(this.button, Alignment.MIDDLE_CENTER);
		this.button2.setSizeUndefined();
		this.verticalLayout.addComponent(this.button2);
		this.verticalLayout.setComponentAlignment(this.button2, Alignment.MIDDLE_CENTER);
		this.table.setSizeFull();
		this.verticalLayout.addComponent(this.table);
		this.verticalLayout.setComponentAlignment(this.table, Alignment.MIDDLE_CENTER);
		this.verticalLayout.setExpandRatio(this.table, 100.0F);
		this.verticalLayout.setSizeFull();
		this.setContent(this.verticalLayout);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton button, button2;
	private XdevTable<CustomComponent> table;
	private XdevVerticalLayout verticalLayout; // </generated-code>


}
