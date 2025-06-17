package edu.iastate.cs228.hw4;

/**
 * 
 * @CalebMLemmons
 *
 */

import java.util.Stack;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.Set;

public class MsgTree {
	
	public char payloadChar;
	public MsgTree left;
	public MsgTree right;
	public String encodingString;
		
	private static String initPath; //Path for helper method

	//Constructor building the tree from a string
	public MsgTree(String encodingString) 
	{
		
		if (encodingString.length() < 2 || encodingString == null) 
		{
			return;
		}
		
		Stack<MsgTree> stack = new Stack<>();
		int i = 0;
		
		this.encodingString = encodingString;
		this.payloadChar = encodingString.charAt(i++);
		stack.push(this);
		
		MsgTree curr = this;
		String opt = "in";
		
		while (i < encodingString.length()) 
		{
			MsgTree next = new MsgTree(encodingString.charAt(i++));
			
			if (opt.equals("in")) 
			{
				curr.left = next;
				
				if (next.payloadChar == '^') 
				{
					curr = stack.push(next);
					opt = "in";
				} 
				else 
				{
					if (!stack.empty())
					{
						curr = stack.pop();
					}
					
					opt = "out";
				}
			} 
			else  
			{ 
				curr.right = next;
				
				if (next.payloadChar == '^') 
				{
					curr = stack.push(next);
					opt = "in";
				} 
				else 
				{
					if (!stack.empty())
					{
						curr = stack.pop();
					}
					
					opt = "out";
				}
			}
		}
	}

	//Constructor for a single node with null children
	public MsgTree(char payloadChar) 
	{
		this.payloadChar = payloadChar;
		this.left = null;
		this.right = null;
	}

	//Prints out characters and their binary codes
	public static void printCodes(MsgTree root, String code) 
	{
		System.out.println("character code\n-------------------------");
		
		for (char ch : code.toCharArray())
		{
			getCode(root, ch, initPath = "");
			
			System.out.println("    " + (ch == '\n' ? "\\n" : ch + " ") + "    " + initPath);
		}
	}


	//			HELPER METHOD
	//Gets code and recurrsivly calls itself setting the alphabet
	private static boolean getCode(MsgTree root, char ch, String path) 
	{
		if (root != null) 
		{
			if (root.payloadChar == ch) 
			{
				initPath = path;
				
				return true;
			}
			
			return getCode(root.left, ch, path + "0") || getCode(root.right, ch, path + "1");
		}
		
		return false;
	}

	////Decodes message and prints the message to console
	public void decode(MsgTree codes, String msg) 
	{
		MsgTree curr = codes;
		StringBuilder sb = new StringBuilder();
		
		System.out.println("MESSAGE:");
		
		for (int i = 0; i < msg.length(); i++) 
		{
			char ch = msg.charAt(i);
			
			curr = (ch == '0' ? curr.left : curr.right);
			
			if (curr.payloadChar != '^') 
			{
				getCode(codes, curr.payloadChar, initPath = "");
				sb.append(curr.payloadChar);
				
				curr = codes;
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Please enter filename to decode:");
		
		Scanner scnr = new Scanner(System.in);
		String file = scnr.nextLine();
		
		scnr.close();

		String data = new String(Files.readAllBytes(Paths.get(file))).trim();
		
		int index = data.lastIndexOf('\n');
		
		String simPat = data.substring(0, index); 
		String encCode = data.substring(index).trim(); 
		Set<Character> setChar = new HashSet<>();
		
		for (char c : simPat.toCharArray()) 
		{
			if (c != '^') 
			{
				setChar.add(c);
			}
		}
		
		MsgTree root = new MsgTree(simPat);
		String chardict = setChar.stream().map(String::valueOf).collect(Collectors.joining());
		
		MsgTree.printCodes(root, chardict);
		root.decode(root, encCode);
	}
}
