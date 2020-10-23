package com.in28minutes.rest.webservices.restfulwebservices.versioning;

// But Some customers wants person name should be separate, so we have taken 'Class type name' in second version of Person.
public class PersonV2 {
	private Name name;

	public PersonV2() {
		super();
	}

	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

}
