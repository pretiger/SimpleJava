package ch02;

public class Member {
	private int age;
	private String name;
	private String gender;
	private String tel;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Member(int age, String name, String gender, String tel) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Member [age=" + age + ", name=" + name + ", gender=" + gender + ", tel=" + tel + "]";
	}
	
}
