
public class Disk{
	
	private int radius;
	
	public Disk(int num) {
		radius = num;
	}

	public int getRadius() {
		return radius;
	}

	
	/*public int compareTo(Object o) {
		Disk d = (Disk) o;
		return this.radius - d.getRadius();
	}*/

	public String toString() {
		String s = "";
		for(int i = 0; i < radius; i++) {
			s += "=";
		}
		
		return s;
	}
}
