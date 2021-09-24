package object_into_file;

import java.io.Serializable;

public class Student implements Serializable 
{
	private static final long serialVersionUID = 1L;
	String name;
	int roll_num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_num=" + roll_num + "]";
	}
}
