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
		for(Disk disk : input){
			
			if(disk.getRadius() > robot.plates.peek().getRadius() || robot.plates.isEmpty()) {
				robot.plates.push(disk);
				input.remove(disk);
			}else{
				robot.flip();
				output.add(robot);
				robot.plates.clear();
				robot.plates.push(disk);
				input.remove(disk);
			}
		}
		if(!robot.plates.isEmpty()) {
			output.add(robot);
			robot.plates.clear();
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
		for(Tower t : output){
			s += t.toString() + "\n \n";
		}
		return s;
	}

}
