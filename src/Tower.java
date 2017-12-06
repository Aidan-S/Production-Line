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
		Tower t = new Tower();
		for(Disk d : plates) {
			t.add(d);
		}
		this.plates = t.plates;
		
	}

	
	public void add(Disk d) {
		this.plates.push(d);
	}
	
	public void clear() {
		plates.clear();
	}
	
	public String toString() {
		String s = "";
		Disk d;
		this.flip();
		
		while(!this.plates.isEmpty()) {
			d = plates.pop();
			s += d.getRadius() + "\n";
		}
		
		return s;
	}
	
}
