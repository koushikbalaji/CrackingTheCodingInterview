package CrackingTheCodingInterview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DirectoryHierarchy {

	public  int solution(String S) {
		// write your code in Java
		int ans = 0;
		String[] words = S.split("\n");
		int i = checkJpeg(words);
		if (i == -1) {
			ans = 0;
		} else {
			int ans1 = findLength(i, words);
			if (ans1 > ans) {
				ans = ans1;
			}
		}

		return ans;
	}

	public int countLength(String s) {
		return s.length();
	}

	public int findSpace(String t) {
		int val = 0;
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == ' ') {
				val++;
			}
		}
		return val;
	}

	public int findLength(int i, String[] words) {

		int len = 0;

		len = words[i].length() + 1;

		for (int j = i - 1; j > 0; j--) {
			int space = findSpace(words[j]);
			len = len + words[j].length() + 1;
			int space1 = findSpace(words[j - 1]);
			if (space == space1) {
				j--;
			}
		}
		len = len + 2;
		return len;

	}

	public int checkJpeg(String[] words) {
		for (int i = 0; i < words.length; i++) {
			String wrd = words[i];
			if (wrd.contains(".jpeg") || wrd.contains(".png") || wrd.contains(".gif")) {
				return i;
			}

		}
		return -1;
	}
	public static void main(String ar[]) throws IOException
	{
		
		FileReader fr = new FileReader("D://files.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		StringBuilder builder=new StringBuilder();
		while((line = br.readLine())!=null)
		{
			
		}
		System.out.println(new DirectoryHierarchy().solution(line));
		
	}
}
