package ch02;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		String name = "김철수";
		System.out.println("당신의 이름은 "+name+" 입니다.");
		int age = 20;
		System.out.println(name+"님의 나이는 "+age+"세 입니다.");
		List<Member> list = new ArrayList<>();
		list.add(new Member(21,"john","man","010-2038-8392")) ;
		list.add(new Member(22,"maria","woman","010-4444-5555")) ;
		list.add(new Member(23,"harry","man","010-222-3333")) ;
		list.add(new Member(24,"jein","woman","010-5555-7777")) ;
		list.forEach(System.out::println);
		list.forEach(m  -> System.out.print("Age : "+m.getAge()+", Name : "+m.getName()+", Gender : "+m.getGender()+", Tel : "+m.getTel()+"\n"));
	}
}
