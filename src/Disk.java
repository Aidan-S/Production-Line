
public class Disk implements Comparable{
	
	private int radius;
	
	public Disk(int num) {
		radius = num;
	}

	public int getRadius() {
		return radius;
	}

	
	@Override
	public int compareTo(Object o) {
		Disk d = (Disk) o;
		return this.radius - d.getRadius();
	}

}
