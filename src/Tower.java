import java.util.Stack;

public class Tower extends Stack<Disk> {
	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: constructor, calls the super class
	 * param args: none
	 * return: none
	 */
	Tower(){
		super();
	}
	
	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: flip over a tower
	 * param args: none
	 * @return Tower: A tower in reverse order
	 */
	public Tower flip(){
		Tower temp = new Tower();
		while(!this.isEmpty()) {
			temp.push(this.pop());
		}
		return temp;
	}
	
	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: translate a tower into a String
	 * param args: none
	 * return: a string representation of a tower made up of Disk.toString() methods
	 */
	public String toString() {
		String s = "Tower: \n";
		Tower t = this;
		while(!t.isEmpty()) {
			s += t.pop().toString() + "\n";
		}
		return s;
	}


	
}