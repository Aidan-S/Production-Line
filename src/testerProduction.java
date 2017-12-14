public class testerProduction {

	public static void main(String[] args) {
		ProductionLine line = new ProductionLine();
		
		Disk a = new Disk(4);
		Disk b = new Disk(6);
		Disk c = new Disk(7);
		Disk d = new Disk(12);
		Disk a2 = new Disk(4);
		Disk b2 = new Disk(3);
		Disk c2 = new Disk(5);
		Disk d2 = new Disk(1);
		
		
		
		
		line.addDisk(a);
		line.addDisk(b);
		line.addDisk(c);
		line.addDisk(d);
		line.addDisk(a2);
		line.addDisk(b2);
		line.addDisk(c2);
		line.addDisk(d2);

		line.process();
		
		System.out.println(line.toString());
		//System.out.println("a");
		
	}

}
