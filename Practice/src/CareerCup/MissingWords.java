package CareerCup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MissingWords {

	public String[] missingWords(String s, String t) {
		HashMap<String, Integer> mapWithIndex = new HashMap<String, Integer>();
		HashMap<String, Integer> mapWithCount = new HashMap<String, Integer>();
		List<String> missing = new ArrayList<String>();

		String[] partS = s.split(" ");
		for (int i = 0; i < partS.length; i++) {
			if (!mapWithIndex.containsKey(partS[i])) {
				mapWithIndex.put(partS[i], i);
				mapWithCount.put(partS[i], 1);
			} else
				mapWithCount.put(partS[i], mapWithCount.get(partS[i]) + 1);
		}

		String[] partT = t.split(" ");
		for (int i = 0; i < partT.length; i++) {
			if (mapWithCount.containsKey(partT[i])) {
				mapWithCount.put(partT[i], mapWithCount.get(partT[i]) - 1);
			}
		}

		Iterator it1 = mapWithCount.entrySet().iterator();
		while (it1.hasNext()) {
			Map.Entry pair = (Map.Entry) it1.next();
			if ((int) pair.getValue() == 0)
				it1.remove();
		}

		TreeMap<Integer, String> sortedTree = new TreeMap<Integer, String>();
		Iterator it2 = mapWithCount.entrySet().iterator();
		while (it2.hasNext()) {
			Map.Entry pair = (Map.Entry) it2.next();
			sortedTree.put((Integer) pair.getValue(), (String) pair.getKey());
		}

		Iterator it3 = sortedTree.entrySet().iterator();
		while (it3.hasNext()) {
			Map.Entry pair = (Map.Entry) it3.next();

		}

		System.out.println(mapWithCount);
		return new String[] {};
	}

	public static void main(String args[]) {
		MissingWords obj = new MissingWords();
		obj.missingWords("I am using hackerrank to improve programming", "am hackerrank to programming");
	}

}
