package tns_programs;

public class publicdemo {
		public int a=9;
		public String s = "Radha";
		void display() {
			System.out.println("Welcome");
}
		public static void main(String[]args) {
			publicdemo p=new publicdemo();
			System.out.println(p.a);
			System.out.println(p.s);
			p.display();
			}
}