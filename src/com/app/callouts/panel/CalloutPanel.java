/**
 * 
 */
package com.app.callouts.panel;

import java.awt.Color;

import javax.swing.JPanel;

import com.app.callout.Callout;
import com.app.callout.FilledLeftCallout;
import com.app.callout.FilledRightCallout;
import com.app.callout.ThinkingLeftCallout;
import com.app.callout.ThinkingRightCallout;

/**
 * @author prashant.joshi (198joshi@gmail.com)
 * @version 13-Sept-2017
 */
public class CalloutPanel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	private Callout callout;
	
	
	public CalloutPanel(String align, String text, boolean isthinking) {
		
		if(align.equals("left"))
		{
			if(isthinking) 
			{
				callout = new ThinkingLeftCallout(Color.pink);
			}
			else
			{
				callout = new FilledLeftCallout(Color.black, Color.cyan);
			}
		} 
		else if(align.equals("right"))
		{
			if(isthinking)
			{
				callout = new ThinkingRightCallout(Color.PINK);
			}
			else
			{
				callout = new FilledRightCallout(Color.black, Color.cyan);
			}
		}
		this.add(callout);
	}

	public Callout getCallout() {
		return callout;
	}
}
