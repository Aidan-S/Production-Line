import java.util.LinkedList;
import java.util.Queue;

public class ProductionLine {
	
	Queue input;
	Queue output;
	Tower robot;
	
	public ProductionLine() {
		input = new LinkedList<Disk>();
		input = new LinkedList<Tower>();
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
		for(int i = 0; i < input.size(); i++) {
			
		}
	}
	
	public Tower removeTower() {
		Tower t = new Tower();
		if(!output.isEmpty()) {
			if(output.remove() instanceof Disk) {
				t = (Tower) output.remove();
			}else {
				System.out.println("No more Towers");
			}	
		}
		return t;
	}
}
