import java.util.ArrayList;

import org.testng.annotations.Test;

public class streamtest {

	@Test
	public void sortList() {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Vipul");
		names.add("Vishal");
		names.add("Nirmal");
		names.add("Sai");
		
		Long c=names.stream().filter(s->s.startsWith("V")).count();
		System.out.println(c);
		
	}
	
}
