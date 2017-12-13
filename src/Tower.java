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
	
	public Tower(Stack<Disk> stuff) {
		plates = new Stack<Disk>();
		this.plates = stuff;
	}
	
	public void flip() {
		Stack<Disk> temp = new Stack<Disk>();
		
		while(!plates.isEmpty()) {
			temp.push(this.plates.pop());
		}
		
		this.plates = temp;	
	}
	
	public int top() {
		return plates.peek().getRadius();
	}
	
	public void add(Disk d) {
		plates.push(d);
	}
	
	public Disk pop() {
		return plates.pop();
	}
	
	public boolean isEmpty() {
		return plates.size() == 0;
	}
	
	public void clear() {
		plates.clear();
	}
	
	public String toString() {
		String s = "";
		Tower temp = new Tower(plates);

		temp.flip();
		System.out.println("kk");
		while(!temp.isEmpty()) {
			s += temp.pop().toString() + ", ";
		}
		
		
		return s;
	}
	
}
