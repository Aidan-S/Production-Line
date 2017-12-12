import java.util.Stack;

public class Tower {
	
	Stack<Disk> plates;
	
	public Tower() {
		plates = new Stack<Disk>();
	}
	
	public Tower(boolean t) {
		plates = new Stack<Disk>();
		if(t) {
			plates.push(new Disk(10));
			plates.push(new Disk(8));
			plates.push(new Disk(8));
			plates.push(new Disk(5));
			plates.push(new Disk(4));
											
		}
	}
	
	public void flip() {
		Stack<Disk> temp = new Stack<Disk>();
		
		while(!plates.isEmpty()) {
			temp.push(plates.pop());
		}
		
		plates = temp;	
	}
	
	public int top() {
		return plates.peek().getRadius();
	}
	
	public void add(Disk d) {
		plates.push(d);
	}
	
	public boolean isEmpty() {
		return plates.size() == 0;
	}
	
	public void clear() {
		plates.clear();
	}
	
	public String toString() {
		String s = "";
		Tower tem;
		Disk d;
		flip();
		
		while(!plates.isEmpty()) {
			d = plates.pop();
			s += d.toString() + ", ";
		}
		
		return s;
	}
	
}
