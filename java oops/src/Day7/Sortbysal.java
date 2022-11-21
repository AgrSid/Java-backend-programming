package Day7;

import java.util.Comparator;

import employee.Emp;

public abstract class Sortbysal implements Comparator <Emp>{
	public int compare(Emp e1, Emp e2) {
		if (e1.sal>e2.sal)
			return 1;
		else 
			return -1;
		
	}

}
