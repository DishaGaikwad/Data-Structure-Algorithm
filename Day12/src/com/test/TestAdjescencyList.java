package com.test;

import java.util.Scanner;

import com.list.MyGraph;

public class TestAdjescencyList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		MyGraph g=new MyGraph(v);
		storeGraph(g,v);
		g.printGraph();
		g.printGraph();
		g.dfsTraversal(0);
		g.bfsTraversal(0);
	}

	private static void storeGraph(MyGraph g, int v) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.println("is there a edge between "+i+"----"+j);
				int val=sc.nextInt();
				if(val>0) {
					g.addEdge(i, j);
				}
			}
			
		}
		
		
	}
	
}
