

import java.util.Scanner;

public class Google1 {

	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	class Solution {
	   	public int solution(String S) {

	        // write your code in Java

	int AnsLength = 0;

	String [] paths = S.split("\n");

	int i = findImg(paths);

	if (i== -1){

	AnsLength = 0;

	}

	else{

	int AnsLength1 = findLength(i,paths);

	if(AnsLength1>AnsLength){

	AnsLength = AnsLength1;

	}

	}

	        return AnsLength;

	    }
	   	
	   	
	   	
	    public int findLength(int i, String[] paths){

	int len = 0;

	len = 0;


	for(int j = i-1; j>0 ; j--){

	int space = countSpace(paths[j]);



	int space1 = countSpace(paths[j-1]);

	if(space != space1){

	len = len + paths[j].length() + 1;

	}

	}

	len = len +2;

	return len;



	}



	public int findImg(String[] paths){

	for(int i=0 ; i<paths.length;i++){

	        String tempWord = paths[i];
	        if(tempWord.contains(".jpeg") || tempWord.contains(".png") || tempWord.contains(".gif")){
	        return i;
	        }
	        }

			return -1;

	}

	public int countSpace(String t){

	int val = 0;

	for(int i=0;i<t.length();i++){

	if(t.charAt(i) == ' '){

	val ++;

	}

	}

	return val;

	}
	}

	
}
