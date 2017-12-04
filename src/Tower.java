import java.util.Stack;

public class Tower {
	
	Stack<Disk> plates;
	
	public Tower() {
		plates = new Stack<Disk>();
	}
	
	public Tower(Disk d) {
		plates = new Stack<Disk>();
		plates.add(d);
	}
	
	public void flip() {
		Stack<Disk> flipped = new Stack<Disk>();
		for(int i = 0; i < plates.size(); i++) {
			flipped.add(plates.pop());
		}
		plates = flipped;
	}

	
	public void clear() {
		plates.clear();
	}
	
}
