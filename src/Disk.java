
//Aidan Scannell
public class Disk{
	
	private int radius;
	
	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: constructor, making a Disk of radius size num
	 * @param num: the radius we want for the disk
	 * return: none
	 */
	public Disk(int num) {
		if(num > 0) {
			radius = num;
		}else {
			System.out.println("Inappropriate radius given");
		}	
	}

	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: return radius
	 * param args: none
	 * @return int: radius as an int
	 */
	public int getRadius() {
		return radius;
	}
	
	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: compare 2 disks' size
	 * @param o : The other disk that is being compared
	 * @return int: an int that defines whether one disk is bigger than another, +1-Greater than, 0-Equal, -1-Less than 
	 */
	public int compareTo(Object o) {
		Disk d = (Disk) o;
		return this.radius - d.getRadius();
	}

	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: translate this object into a String
	 * param args: none
	 * @return String: A string made of = signs that's equivalent to how large the disk is(1= is equal to .5 units of measurement)
	 */
	public String toString() {
		String s = "";
		for(int i = 0; i < radius; i++) {
			s += "=";
		}
		return s;
	}
}