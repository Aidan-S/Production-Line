
import java.util.LinkedList;
import java.util.Queue;

public class ProductionLine {
	
	Queue<Disk> input;
	Queue<Tower> output;
	Tower robot;
	
	public ProductionLine() {
		input = new LinkedList<Disk>();
		output = new LinkedList<Tower>();
		robot = new Tower();
	}

	public void addDisk(Disk piece) {
		input.add(piece);
	}
	
	public void unloadRobot() {
		output.add(robot.flip());
		robot.clear();
	}
	
	public void process() {
		Disk temp;
		while(!input.isEmpty()) {
			temp = input.remove();
			if(robot.isEmpty() || robot.peek().compareTo(temp) <= 0) {
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
	
	public Tower removeTower() {
		if(!output.isEmpty()) {
			return output.remove();
		}else {
			System.out.println("No more Towers");
			return null;
		}
	}
	
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


