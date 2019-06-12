package com.revature.designpatterns;

/*
 * A Java Beans follows a more strict convention. Like a POJO, it
 * has fields (which are private), a constructor, getters, and
 * setters.
 * 
 * It also, however, must be serializable (which is often neglected),
 * must override the Object class's equals() method and the Object class's
 * toString() method (as well as the Object class's hashCode()
 * method.
 */
public class JavaBean {

	private int id;
	private String name;
	private String password;
	
	/*
	 * No argument constructor (no args constructor)
	 */
	public JavaBean() {
		super();
	}

	/*
	 * Constructor using fields
	 */
	public JavaBean(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaBean other = (JavaBean) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "JavaBean [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}
