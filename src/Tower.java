import java.util.Stack;

public class Tower extends Stack<Disk> {
	
	Tower(){
		super();
	}
	
	public Tower flip(){
		Tower temp = new Tower();
		
		while(!this.isEmpty()) {
			temp.push(this.pop());
		}
		
		return temp;
	}
	
	
	public String toString() {
		String s = "Tower: \n";
		Tower t = this;
		while(!t.isEmpty()) {
			s += t.pop().toString() + "\n";
		}
		return s;
	}


	
}