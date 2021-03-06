package animationGame;

public class Vertex {

// Attribute
	public double x;
	public double y;

// Konstruktor
	public Vertex(double x, double y){
		
		this.x=x;
		this.y=y;
		
		}
	
// Mainmethode	
	public static void main(String[] args) {
	
		Vertex v1 = new Vertex(15,76);
		Vertex v2 = new Vertex(0,0);
		
		System.out.println("v1.x= "+v1.x);
		System.out.println("v2.x= "+v2.x);
		System.out.println("v1= "+v1);
		System.out.println(v1.length());
		System.out.println(v2.length());
 }
	
	public String toString() {return "("+x+", "+y+")" ;}
	
	public double length() {return Math.sqrt(x*x+y*y);}
}