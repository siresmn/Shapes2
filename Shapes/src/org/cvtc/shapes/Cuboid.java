package org.cvtc.shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cuboid extends Shape {

	// instantiate variables
	private float width = (float) 0.0;
	private float height = (float) 0.0;
	private float depth = (float) 0.0;
	
	// constructor for Cuboid class
	public Cuboid(float width, float height, float depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// getter for width
	public float getWidth() {
		return width;
	}

	// setter for width
	public void setWidth(float width) {
		this.width = width;
	}

	// getter for height
	public float getHeight() {
		return height;
	}

	// setter for height
	public void setHeight(float height) {
		this.height = height;
	}

	// getter for depth
	public float getDepth() {
		return depth;
	}

	// setter for depth
	public void setDepth(float depth) {
		this.depth = depth;
	}

	// inherited method to calculate surface area
	@Override
	public float surfaceArea() {
		float area = this.height * 6;
		return area;
	}

	// inherited method to calculate volume
	@Override
	public float volume() {
		float volume = this.depth * this.height * this.width;
		return volume;
	}

	// inherited method to display results
	@Override
	public void render() {
		
		// make sure dimensions given are not negative
		if (this.width < 0 || this.height < 0 || this.depth < 0) {
			JOptionPane.showMessageDialog(frame, "Please enter valid parameters");
		} else {
			JOptionPane.showMessageDialog(frame, 
					"The dimensions of the Cuboid are as follows: Width = " + this.width + "; Height = " + this.height + "; Depth = " + this.depth + "; \n"
					+ "The volume of the Cuboid is: " + volume() + "\n"
					+ "The surface area of the Cuboid is: " + surfaceArea() + "\n");
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
