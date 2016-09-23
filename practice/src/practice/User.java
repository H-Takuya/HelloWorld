package practice;

public class User {


	private String name;

	private int age;


	public User(String string, int i) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void self_introduce(String name1, int age1){

		System.out.println("私の名前は" + name1 + ",年齢は" + age1 + "です。");
	}





}
