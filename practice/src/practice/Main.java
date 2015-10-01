package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main (String[] args) throws IOException {
		
		System.out.println("名前を入力してください。");
		
		BufferedReader input= new BufferedReader(new InputStreamReader (System.in));
		
		String name = input.readLine();
		
		System.out.println("年齢を入力してください。");
		
		String i = input.readLine();
		int age = Integer.parseInt(i);
		
		
		User tomono = new User(name,age);
		
		tomono.self_introduce(tomono.getName(),tomono.getAge());
		
		
		
		
	}

}
