package com.openclassrooms.exemples;

public class SomeClass implements Cloneable {
	public int someField;
	public int someField2;

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (Exception e) {

		}
		return clone;
	}
}
