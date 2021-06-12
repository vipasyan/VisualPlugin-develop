package com.example.helloworld.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public abstract class SampleView extends ViewPart {

	public SampleView() {
		// TODO Auto-generated constructor stub

		Composite parent = null;
		Label label = new Label( parent, SWT.LEFT ); 
		label.setText( "Hello, Eclipse world!" ); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
