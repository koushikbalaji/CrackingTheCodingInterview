package CrackingTheCodingInterview;

import java.util.*;
import java.io.*;

public class iFilesMap {

	public static void main(String[] args) throws IOException {
		
		StringBuilder currentPath = new StringBuilder();
		int directorydepth = 0;
		currentPath.append("");
		String extension = "jpeg";
		LinkedHashMap<Integer, ArrayList<String>> depthMap = new LinkedHashMap<>();
		LinkedHashMap<Integer, ArrayList<String>> hm = new LinkedHashMap<>();
		FileReader fr = new FileReader("D://files.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		StringBuilder prevPath = new StringBuilder();
		prevPath = prevPath.append("");
		ArrayList<String> folderList = new ArrayList<>();
		ArrayList<String> filesList = new ArrayList<>();
		HashMap<Integer, String> pathMap = new HashMap<>();
		HashMap<Integer, Integer> distanceMap = new HashMap<>();
		pathMap.put(line.trim().hashCode(), "\\" + line.trim() + "\\");
		distanceMap.put(line.trim().hashCode(), 0);
		while (line != null) {
			directorydepth = line.length() - line.trim().length();
			if (!line.trim().contains(".")) {
				if (directorydepth > 0) {
					ArrayList<String> list = new ArrayList<>();
					list = depthMap.get(directorydepth - 1);
					StringBuilder pathBuilder = new StringBuilder();

					pathBuilder.append(pathMap.get(list.get(list.size() - 1).hashCode()));
					pathBuilder.append(line.trim()).append("\\");
					distanceMap.put(line.trim().hashCode(), distanceMap.get(list.get(list.size() - 1).hashCode()) + 1);
					pathMap.put(line.trim().hashCode(), pathBuilder.toString());
				}
				if (depthMap.containsKey(directorydepth)) {
					depthMap.get(directorydepth).add(line.trim());

				}

				else {
					folderList = new ArrayList<>();
					folderList.add(line.trim());
					depthMap.put(directorydepth, folderList);
				}

			} else {
				if (hm.containsKey(directorydepth)) {
					hm.get(directorydepth).add(line.trim());
				} else {
					filesList = new ArrayList<>();
					filesList.add(line.trim());
					hm.put(directorydepth, filesList);
				}

				String[] split = line.trim().split("\\.");
				if (split[1].equals(extension)) {

					List<String> list = new ArrayList<>();
					list = depthMap.get(directorydepth - 1);
					if (list != null)
						System.out.println("file \"" + line.trim() + "\" is in path "
								+ pathMap.get((list.get(list.size() - 1)).hashCode()) + " w/ distance "
								+ distanceMap.get((list.get(list.size() - 1)).hashCode()));
					// System.out.print();
				}
			}

			line = br.readLine();
		}
		br.close();
	}
}
