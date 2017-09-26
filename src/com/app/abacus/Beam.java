/**
 * 
 */
package com.app.abacus;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

/**
 * @author prashant.joshi (198joshi@gmail.com)
 * @version 10-Aug-2017
 */
public class Beam {

	private int posX;
	private int posY;
	private int width;
	private int height;
	private Image image;
	private boolean switchable;
	private boolean beamlabel;
	private boolean showdots;
	private int numofrods;
	private int counterx;
	private  int rodwidth;
	/**
	 * @return the numofrods
	 */
	public int getNumofrods() {
		return numofrods;
	}

	/**
	 * @return the counterx
	 */
	public int getCounterx() {
		return counterx;
	}

	/**
	 * @param counterx the counterx to set
	 */
	public void setCounterx(int counterx) {
		this.counterx = counterx;
	}

	/**
	 * @return the rodwidth
	 */
	public int getRodwidth() {
		return rodwidth;
	}

	/**
	 * @param rodwidth the rodwidth to set
	 */
	public void setRodwidth(int rodwidth) {
		this.rodwidth = rodwidth;
	}

	/**
	 * @param numofrods the numofrods to set
	 */
	public void setNumofrods(int numofrods) {
		this.numofrods = numofrods;
	}

	/**
	 * @return the showdots
	 */
	public boolean isShowdots() {
		return showdots;
	}

	/**
	 * @param showdots the showdots to set
	 */
	public void setShowdots(boolean showdots) {
		this.showdots = showdots;
	}

	/**
	 * @return the beamlabel
	 */
	public boolean isBeamlabel() {
		return beamlabel;
	}

	/**
	 * @param beamlabel the beamlabel to set
	 */
	public void setBeamlabel(boolean beamlabel) {
		this.beamlabel = beamlabel;
	}

	public Beam() {
		switchable = Boolean.FALSE;
	}
	
	public Beam(int posX, int posY, int width, int height) {
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
	}
	
	public void drawBeam(Graphics g) {
		if(!isSwitchable())
			{
			g.drawImage(image, this.posX, this.posY+this.getHeight()/10, this.getWidth(), this.getHeight(), null);
			
			}
		if(isBeamlabel())
		{
			g.setColor(Color.BLACK);
			g.setFont(new Font("TimesRoman", Font.BOLD,15)); 
			g.drawString("Beam", this.getPosX()+25, this.posY+this.getHeight()/10);
		}
		if(isShowdots())
		{
			for(int i=0;i<numofrods;i++)
			{
				//System.out.println(""+i);
				if(i % 3 == 0) {
					g.setColor(Color.CYAN);
					g.fillOval(counterx, this.posY+this.getHeight()/10, 10, 10);
				}
				counterx += getRodwidth();
			}
		}
	}
	
	public void highlight(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(posX, posY, width, height);
	}
	
	public void drawDots(Graphics g)
	{
		
	}
	
	/**
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}
	/**
	 * @param posX the posX to set
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}
	/**
	 * @param posY the posY to set
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * @return the switchable
	 */
	public boolean isSwitchable() {
		return switchable;
	}

	/**
	 * @param switchable the switchable to set
	 */
	public void setSwitchable(boolean switchable) {
		this.switchable = switchable;
	}
	
}
