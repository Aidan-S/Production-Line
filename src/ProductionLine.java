
import java.util.LinkedList;
import java.util.Queue;

//Aidan Scannell
public class ProductionLine {
	
	Queue<Disk> input;
	Queue<Tower> output;
	Tower robot;
	
	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: constructor, creates a ProductionLine with an input line, an output line, and a Robot(Tower) 
	 * return: none
	 */
	public ProductionLine() {
		input = new LinkedList<Disk>();
		output = new LinkedList<Tower>();
		robot = new Tower();
	}

	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: add a Disk to the input queue
	 * @param piece: disk to be added
	 * return: none
	 */
	public void addDisk(Disk piece) {
		input.add(piece);
	}
	
	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: flip and move the robot tower to the output queue
	 * param args: none
	 * return: none
	 */
	public void unloadRobot() {
		output.add(robot.flip());
		robot.clear();
	}
	
	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: go through the input queue, turning all the disks into towers where they progressively get bigger as you go down each tower 
	 * param args: none
	 * return: none
	 */
	public void process() {
		Disk temp;
		while(!input.isEmpty()) {
			temp = input.remove();
			if(robot.isEmpty() || robot.peek().compareTo(temp) < 0) {
				robot.push(temp);
			}else{
				unloadRobot();
				robot.push(temp);
			}	
		}
		if(!robot.isEmpty()) {
			unloadRobot();
		}
	}
	
	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: remove a tower from the output queue
	 * param args: none
	 * @return Tower: the removed tower
	 */
	public Tower removeTower() {
		if(!output.isEmpty()) {
			return output.remove();
		}else {
			System.out.println("No more Towers");
			return null;
		}
	}
	/**
	 * @author Aidan-S
	 * date: December 14th, 2017
	 * method: translate a production line's output line into a String
	 * param args: none
	 * return: a string representation of a production line's output line made up of Tower.toString() methods
	 */
	public String toString() {
		String s = "";
		Queue<Tower> temp = output;
		while(!output.isEmpty()) {
			s += (output.remove().toString()) + " ";	
		}
		output = temp;
		return s;
	}

}


