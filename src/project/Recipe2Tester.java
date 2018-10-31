package project;

public class Recipe2Tester {
	public static void main(String[] args) {
		Recipe2Star2 medium = new Recipe2Star2("butter", "flour", "sugar", "eggs", "milk", "chocolate chips");
		System.out.println(medium.getIng1() + " " + medium.getIng2() + " " + medium.getIng3() + " " + medium.getIng4() + " " + medium.ing5 + " " + medium.ing6);
	}
}
