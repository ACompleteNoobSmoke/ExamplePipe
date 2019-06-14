package com.revature.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * When a class implements the Serializable interface, we can
 * write an instance of this class as byte code. We can also 
 * deserialize objects by reading them from files and storing
 * them in instances of the class that is serializable.
 */
public class Serialization implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int userId;
	private String username;
	private String userPassword;
	
	public Serialization() {
		super();
	}

	public Serialization(int userId, String username, String userPassword) {
		super();
		this.userId = userId;
		this.username = username;
		this.userPassword = userPassword;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Serialization other = (Serialization) obj;
		if (userId != other.userId)
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Serialization [userId=" + userId + ", username=" + username + ", userPassword=" + userPassword + "]";
	}
	
	public static void main(String[] args) {
		
		FileOutputStream fos;
		
		try {
			fos = new FileOutputStream(new File("serialize.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new Serialization(1, "Christina", "pass"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("===Now let's read that object back out from the file!");
		
		/*
		 * This is called a try with resources. If we use a try
		 * with resources, our streams will be auto closed (IF
		 * they're autoclosable). In order to be autoclosable,
		 * a class must implement AutoClosable.
		 */
		try(FileInputStream fis = new FileInputStream(new File("serialize.txt"))){
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				System.out.println(ois.readObject());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}finally {
				ois.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
