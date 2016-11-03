package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Trie {

//	Dictionary to store lower case English words
	static TrieNode root;
	static int size;
	
	public boolean contains(String word)
	{
		TrieNode temp=root;
		int num;
		for(int i=0;i<word.length()-1;i++)
		{
			num=word.charAt(i)-'a';
			
			if(temp.nodes[num]==null)
				return false;
			
			temp=temp.nodes[num];
			
		}
		
		
		num=word.charAt(word.length()-1)-'a';
		if(temp.nodes[num]!=null)
		{
			if(temp.nodes[num].isLeaf==false)
				return false;
		}
		else
			return false;
				
		
		
		return true;
	}
	
	public void add(String word)
	{
		if(contains(word))
			return;
		
		size++;
		TrieNode temp=root;
		for(int i=0;i<word.length();i++)
		{
			int num=word.charAt(i)-'a';
			
			if(temp.nodes[num]==null)
			{
				temp.nodes[num]=new TrieNode();
				temp.nodes[num].curr.append(temp.curr).append(word.charAt(i));
			}
			
			temp.depth++;
			temp=temp.nodes[num];
			
		}
		
		temp.depth++;
		temp.isLeaf=true;
		
	}
	
	public int findPartial(String word)
	{
		
		TrieNode temp=root;
		int num;
		for(int i=0;i<word.length();i++)
		{
			num=word.charAt(i)-'a';
			
			if(temp.nodes[num]==null)
				return 0;
			
			temp=temp.nodes[num];
			
		}
		
		if(temp==null)
			return 0;
		
		return  temp.depth;
	}
	
	public List<String> suggestNext(String prefix)
	{
		List<String> suggestions=new ArrayList<>();
		
		TrieNode temp=root;
		int num;
		for(int i=0;i<prefix.length();i++)
		{
			num=prefix.charAt(i)-'a';
			
			if(temp.nodes[num]==null)
				return new ArrayList<>();
			
			temp=temp.nodes[num];
			
		}
		
		if(temp==null)
			return new ArrayList<>();
		
		Queue<TrieNode> queue=new LinkedList<>();
		queue.add(temp);
		
		while(!queue.isEmpty())
		{
			TrieNode node=queue.remove();
			if(node.isLeaf)
				suggestions.add(node.curr.toString());
			
			for(int i=0;i<26;i++)
				if(node.nodes[i]!=null)
					queue.add(node.nodes[i]);
				
			
		}
		
		
		return suggestions;
	}
	
	static class TrieNode
	{
		boolean isLeaf;
		TrieNode[] nodes;
		int depth;
		StringBuilder curr;
		TrieNode()
		{
			nodes=new TrieNode[26];
			for(int i=0;i<26;i++)
				nodes[i]=null;
			curr= new StringBuilder();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		root=new TrieNode();
		Trie trie=new Trie();
		trie.add("hac");
		trie.add("hackerrank");
		trie.add("hat");
		trie.add("hackit");
		trie.add("haccc");
		trie.add("hacathon");
		trie.add("ham");
		
		/*System.out.println(trie.contains("amd"));
		System.out.println(trie.contains("hello"));*/
		System.out.println(trie.findPartial("hac"));
		System.out.println(trie.findPartial("hak"));
		System.out.println(trie.suggestNext("hac"));
	}

}
