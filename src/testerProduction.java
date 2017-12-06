
public class testerProduction {

	public static void main(String[] args) {
		ProductionLine line = new ProductionLine();
		
		Disk a = new Disk(4);
		Disk b = new Disk(6);
		Disk c = new Disk(7);
		Disk d = new Disk(12);
		
		System.out.println(a);
		
		
		line.addDisk(a);
		line.addDisk(b);
		line.addDisk(c);
		line.addDisk(d);
		
		line.process();
		
		System.out.println(line);
		
	}

}
