package de.ruv.graphs;

public class Vertex {
	
	private String value;
	private boolean active;
	
	public Vertex(String value) {
		this.value = value;
		active = true;
	}
	
	public Vertex(String value, boolean active) {
		this.value = value;
		this.active = active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		String act = null;
		if(this.active) {
			act = "active";
		} else {
			act = "unactive";
		}
		return String.format("Vertex [%s, %s]", value, act);
	}

}
