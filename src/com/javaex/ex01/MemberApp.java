package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member[] member = new Member[3];
		
		Member member1 = new Member("jws","정우성",5000);
		Member member2 = new Member("yjs","유재석",3000);
		Member member3 = new Member("lhr","이효리",4000);
		
		member[0] = member1;
		member[1] = member2;
		member[2] = member3;
		
		for(int i = 0; i<member.length; i++) {
			member[i].showinfo();
		}
		
		
	}

}
