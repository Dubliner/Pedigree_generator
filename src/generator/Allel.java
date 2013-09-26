/**
 * 
 */
package generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zhenchengwang
 *
 */
public class Allel {

	/* Generate a random integer from [lower, upper] */
	public static int getRandom(int lower, int upper){
		Random rand = new Random();
		int randomNumb = rand.nextInt(upper-lower+1)+lower;
		return randomNumb;
	}
	
	public static void generate(int population, int generation){
		List<Integer> a1 = new ArrayList<Integer>();
		List<Integer> a2 = new ArrayList<Integer>();
		List<Integer> b1 = new ArrayList<Integer>();
		List<Integer> b2 = new ArrayList<Integer>();
		
		a1.add(Allel.getRandom(0, population/2));
		b1.add(Allel.getRandom(0, population/2));
		a2.add(Allel.getRandom(population/2, population));
		b2.add(Allel.getRandom(population/2, population));
		
		

		for(int i=0; i<generation; i++){
			a1.add(Allel.getRandom(0, population));
			a2.add(Allel.getRandom(0, population));
			b1.add(Allel.getRandom(0, population));			
			b2.add(Allel.getRandom(0, population));
		}
		
		
		int[] graph = new int[6];
		for(int i=0; i<6; i++){
			graph[i] = 0;
		}
		if(same(a1,a2)){
			graph[0] = 1;
		}
		if(same(a2,b2)){
			graph[1] = 1;
		}
		if(same(b1,b2)){
			graph[2] = 1;
		}
		if(same(a1,b1)){
			graph[3] = 1;
		}
		if(same(a2,b1)){
			graph[4] = 1;
		}
		if(same(a1,b2)){
			graph[5] = 1;
		}

	}
	
	public static boolean same(List<Integer> a, List<Integer> b){
		for(int i=0; i<a.size(); i++){
			if(a.get(i)==b.get(i))
				return true;
		}
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
