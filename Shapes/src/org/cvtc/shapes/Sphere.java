package org.cvtc.shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Sphere extends Shape {
	
	// instantiate radius variable
	private float radius = (float) 0.0;

	// constructor for Sphere class
	public Sphere(float radius) {
		super();
		this.radius = radius;
	}

	// getter for radius
	public float getRadius() {
		return radius;
	}

	// setter for radius
	public void setRadius(float radius) {
		this.radius = radius;
	}

	// inherited method to calculate surface area
	@Override
	public float surfaceArea() {
		float area = (float) (4 * Math.PI * Math.pow(this.radius, 2));
		return area;
	}

	// inherited method to calculate volume
	@Override
	public float volume() {
		float volume = (float) ((4/3) * Math.PI * Math.pow(this.radius, 3));
		return volume;
	}

	// inherited method to display results
	@Override
	public void render() {
		
		// make sure dimensions given are not negative
		if (this.radius < 0) {
			JOptionPane.showMessageDialog(frame, "Please enter valid parameters");
		} 
		else { 
			JOptionPane.showMessageDialog(frame, 
					"The radius of the Sphere is: " + this.radius + "; \n"
					+ "The volume of the Sphere is: " + volume() + "\n"
					+ "The surface area of the Sphere is: " + surfaceArea() + "\n");
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
