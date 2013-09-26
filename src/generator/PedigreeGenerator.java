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
public class PedigreeGenerator {

	
	/* main function of pedigree generation: */
	public void Pedigenerate(int gCount, int pCount){
		// initialize the matrix:
		List<List<Integer>> allInfo = new ArrayList<List<Integer>> ();
		for(int i=0; i<gCount; i++){
			List<Integer> level = new ArrayList<Integer> ();
			allInfo.add(level);
			for(int j=0; j<pCount; j++){ // shuffle each level of population
				allInfo.get(i).add(j);
			}
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
