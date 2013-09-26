/**
 * 
 */
package generator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhenchengwang
 *
 */
public class Individual {

	public String myName;
	public List<Integer> myParents;
	public String myEqual;
	
	public Individual(String name){
		this.myName = name;
		this.myParents = new ArrayList<Integer>();
		this.myEqual = "no";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
