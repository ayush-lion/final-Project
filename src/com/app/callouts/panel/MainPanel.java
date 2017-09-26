/**
 * 
 */
package com.app.callouts.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 * @author prashant.joshi (198joshi@gmail.com)
 * @version 13-Sept-2017
 */
public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private StudentPanel sPanel;
	private TeacherPanel tPanel;
	private CalloutsPanel cPanel;
	private List<String> data;
	private String stdalign;
	private String tuteralign;

	public String getStdalign() {
		return stdalign;
	} 

	public void setStdalign(String stdalign) {
		this.stdalign = stdalign;
	}

	public String getTuteralign() {
		return tuteralign;
	}

	public void setTuteralign(String tuteralign) {
		this.tuteralign = tuteralign;
	}

	/**
	 * @return the data
	 */
	public List<String> getData() {
		return data;
	}

	/**
	 * @param tosend
	 *            the data to set
	 */
	public void setData(List<String> tosend) {
		this.data = tosend;
	}

	public MainPanel() {
		this.setLayout(new GridBagLayout());

		sPanel = new StudentPanel();
		tPanel = new TeacherPanel();
		ArrayList<String> temp = new ArrayList<String>();temp.add("test");
		cPanel = new CalloutsPanel(temp, "right", "left", "");
		
		
		
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 0, 5);
        
       
       
        sPanel.setPreferredSize(new Dimension(sPanel.getPreferredSize().width, sPanel.getPreferredSize().height + 10));
        gbc.gridx = 0;
        gbc.weightx = 0.20;
        this.add(sPanel, gbc);
        
      
     
        cPanel.setPreferredSize(new Dimension(sPanel.getPreferredSize().width-10, sPanel.getPreferredSize().height + 200));
        gbc.weightx = 0.60;
        gbc.gridx = 1;
        this.add(cPanel, gbc);
        
       
        tPanel.setPreferredSize(new Dimension(sPanel.getPreferredSize().width, sPanel.getPreferredSize().height + 10));
        gbc.gridx = 2;
        gbc.weightx =0.20;
        this.add(tPanel, gbc);

	}

	public void ChangeInstructions(List<String> data, MainPanel main) {

		main.remove(cPanel);
		main.remove(tPanel);
		main.remove(sPanel);
		// cPanel = new CalloutsPanel(data); 
		System.out.println("" + data.size());

		sPanel = new StudentPanel();
		tPanel = new TeacherPanel();

		if (main.getTuteralign().equals("left")) {
			cPanel = new CalloutsPanel(data, main.getStdalign(), main.getTuteralign(), "");
		} else {
			cPanel = new CalloutsPanel(data, main.getStdalign(), main.getTuteralign());
		}

		main.setLayout(new GridBagLayout());
		// Add constraints
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 0, 5);
        
        
        if (main.getStdalign().equals("left")) {
			gbc.gridx = 0; 
		} else {
			gbc.gridx = 2;
		}
        sPanel.setPreferredSize(new Dimension(sPanel.getPreferredSize().width, sPanel.getPreferredSize().height + 10));
        gbc.weightx = 0.20;
        this.add(sPanel, gbc);
        
      
       
        cPanel.setPreferredSize(new Dimension(sPanel.getPreferredSize().width, sPanel.getPreferredSize().height + 200));
        gbc.weightx = 0.60;
        gbc.gridx = 1;
        this.add(cPanel, gbc);
        

		if (main.getTuteralign().equals("left")) {
			gbc.gridx = 0;
		} else {
			gbc.gridx = 2;
		}
       
        tPanel.setPreferredSize(new Dimension(sPanel.getPreferredSize().width, sPanel.getPreferredSize().height + 10));
        gbc.gridx = 2;
        gbc.weightx =0.20;
        this.add(tPanel, gbc);
	}
}
