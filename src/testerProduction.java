
public class testerProduction {

	public static void main(String[] args) {
		ProductionLine line = new ProductionLine();
		
		Disk a = new Disk(4);
		Disk b = new Disk(6);
		Disk c = new Disk(7);
		Disk d = new Disk(12);
		
		
		
		
		line.addDisk(a);
		line.addDisk(b);
		line.addDisk(c);
		line.addDisk(d);
		
		Tower t = new Tower();
		t.add(a);
		t.add(b);
		t.add(c);
		t.add(d);
		t.flip();
		System.out.println(t);
		t.flip();
		System.out.println(t);
		//line.process();
		
		//System.out.println(line.toString());
		//System.out.println("a");
		
	}

}
