
package com.company.gitprojekt.ui;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevVerticalLayout;
import com.xdev.ui.XdevView;

public class MainView extends XdevView {

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
	
		this.button.setCaption("Button");
	
		this.button.setSizeUndefined();
		this.verticalLayout.addComponent(this.button);
		this.verticalLayout.setComponentAlignment(this.button, Alignment.MIDDLE_CENTER);
		CustomComponent verticalLayout_spacer = new CustomComponent();
		verticalLayout_spacer.setSizeFull();
		this.verticalLayout.addComponent(verticalLayout_spacer);
		this.verticalLayout.setExpandRatio(verticalLayout_spacer, 1.0F);
		this.verticalLayout.setSizeFull();
		this.setContent(this.verticalLayout);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton button;
	private XdevVerticalLayout verticalLayout; // </generated-code>


}
