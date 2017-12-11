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
		robot.flip();
		output.add(robot);
		robot.clear();
	}
	
	public void process() {
		Disk d;
		while(!input.isEmpty()) {
			d = input.remove();
			if(robot.isEmpty() || robot.top() >= d.getRadius()) {
				robot.add(d);
			}else{
				unloadRobot();
				robot.add(d);
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
		String s = "[";

		while(!output.isEmpty()) {
			s += (output.remove()) + " ";	
		}
		s += "]";
		
		return s;
	}

}
