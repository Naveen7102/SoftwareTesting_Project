package graph_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class Junit_test
{
	final static int INF = 9999;
	@Test
	void test1() 
	{	
//		[0,1,2,3,2,1,4]
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		int[][] out = new int[n][n];
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
				out[i][j] = INF;
			}
		}
		inp[0][0] = 0;
		out[0][0] = 0;
		
		
		int[][] out_test = test.getTranspose(inp, n);
		
		assertArrayEquals(out,out_test);
	}
	
	@Test
	void test2() 
	{	
//		[0,1,2,3,2,1,4]
		int n = 2;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		int[][] out = new int[n][n];
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
				out[i][j] = INF;
			}
		}
		inp[0][1] = 0;
		out[1][0] = 0;
		
		
		int[][] out_test = test.getTranspose(inp, n);
		
		assertArrayEquals(out,out_test);
	}
	
	@Test
	void test3() 
	{	
//		[0,1,2,3,2,1,4]
		int n = 0;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		int[][] out = new int[n][n];
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
				out[i][j] = INF;
			}
		}
		
		int[][] out_test = test.getTranspose(inp, n);
		
		assertArrayEquals(out,out_test);
	}
	
	
	// Floyd Warshall ***************************************************
	
	@Test
	void test4() 
	{	
		int n = 0;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		int[][] out = new int[n][n];
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
				out[i][j] = INF;
			}
		}
		
		int[][] out_test = test.floydWarshall(inp, n);
		
		assertArrayEquals(out,out_test);
	}
	
	@Test
	void test5() 
	{	
		int n = 2;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		int[][] out = new int[n][n];
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
				out[i][j] = INF;
			}
		}
		
		inp[0][0] = 1;
		out[0][0] = 1;
		
		int[][] out_test = test.floydWarshall(inp, n);
		
		assertArrayEquals(out,out_test);
	}
	
	@Test
	void test34() 
	{	
		int n = 4;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		int[][] out = new int[n][n];
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
				out[i][j] = INF;
			}
		}
		
		inp[0][1] = 10;
		inp[0][2] = 1;
		inp[2][3] = 2;
		inp[3][1] = 3;
		
		out[0][1] = 6;
		out[0][2] = 1;
		out[2][3] = 2;
		out[3][1] = 3;
		out[0][3] = 3;
		out[2][1] = 5;
				
		int[][] out_test = test.floydWarshall(inp, n);
		
		assertArrayEquals(out,out_test);
	}
	
	// BFS **************************************************************
	@Test
	void test6() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][0] = 1;
		
		int[] out = new int[]{0};
		Arrays.sort(out);
		
		List<Integer> out_lst = test.BFS(0,inp, n);
		
		int[] out_test = out_lst.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(out_test);
		assertArrayEquals(out,out_test);
	}
	
	@Test
	void test16() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		
		int[] out = new int[]{0};
		Arrays.sort(out);
		
		List<Integer> out_lst = test.BFS(0,inp, n);
		
		int[] out_test = out_lst.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(out_test);
		assertArrayEquals(out,out_test);
	}
	
	@Test
	void test7() 
	{	
		int n = 2;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		int[] out = new int[]{0};
		Arrays.sort(out);
		
		List<Integer> out_lst = test.BFS(0,inp, n);
		
		int[] out_test = out_lst.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(out_test);
		assertArrayEquals(out,out_test);
	}
	
	@Test
	void test35() 
	{	
		int n = 5;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][1] = 5;
		inp[1][2] = 6;
		inp[1][3] = 1;
		inp[0][4] = 3;
		inp[4][2] = 1;
		inp[4][3] = 1;
		inp[0][2] = 1;
		
		int[] out = new int[]{0,1,2,3,4};
		Arrays.sort(out);
		
		List<Integer> out_lst = test.BFS(0,inp, n);
		
		int[] out_test = out_lst.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(out_test);
		assertArrayEquals(out,out_test);
	}
	
	// DFS **************************************************************
	
	@Test
	void test8() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		inp[0][0] = 1;
		int[] out = new int[]{0};
		Arrays.sort(out);
		
		List<Integer> out_lst = test.DFS(0,inp, n);
		
		int[] out_test = out_lst.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(out_test);
		assertArrayEquals(out,out_test);
	}
	
	@Test
	void test9() 
	{	
		int n = 6;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][1] = 1;
		inp[1][2] = 1;
		inp[1][3] = 1;
		inp[1][4] = 1;
		inp[0][5] = 1;
		inp[5][2] = 1;
		inp[5][3] = 1;
		inp[5][4] = 1;
		
		int[] out = new int[]{0,1,2,3,4,5};
		Arrays.sort(out);
		
		List<Integer> out_lst = test.DFS(0,inp, n);
		
		int[] out_test = out_lst.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(out_test);
		assertArrayEquals(out,out_test);
	}
	
	@Test
	void test33() 
	{	
		int n = 6;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][1] = 1;
		inp[1][0] = 4;
		
		
		int[] out = new int[]{0,1};
		Arrays.sort(out);
		
		List<Integer> out_lst = test.DFS(0,inp, n);
		
		int[] out_test = out_lst.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(out_test);
		assertArrayEquals(out,out_test);
	}
	
	// IsReachable **************************************************************
	
	@Test
	void test10() 
	{	
		int n = 2;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][1] = 1;

		boolean ans = test.isReachable(0, 1, inp, n);
		
		assertEquals(true,ans);
	}
	
	@Test
	void test11() 
	{	
		int n = 2;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][1] = 1;
		inp[0][0] = 1;

		boolean ans = test.isReachable(0, 1, inp, n);
		
		assertEquals(true,ans);
	}
	
	@Test
	void test12() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][0] = 1;

		boolean ans = test.isReachable(0, 0, inp, n);
		
		assertEquals(true,ans);
	}
	
	@Test
	void test13() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		

		boolean ans = test.isReachable(0, 0, inp, n);
		
		assertEquals(false,ans);
	}
	
	@Test
	void test14() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		

		boolean ans = test.isReachable(0, 1, inp, n);
		
		assertEquals(false,ans);
	}
	
	@Test
	void test15() 
	{	
		int n = 3;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		inp[1][1] = 1;
		inp[1][0] = 1;
		inp[1][2] = 1;

		boolean ans = test.isReachable(1, 2, inp, n);
		
		assertEquals(true,ans);
	}
	
	@Test
	void test32() 
	{	
		int n = 5;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][1] = 4;
		inp[1][2] = 1;
		inp[0][2] = 1;
		inp[1][0] = 5;

		boolean ans = test.isReachable(0, 4, inp, n);
		
		assertEquals(false,ans);
	}
	
	// Bellman Ford **************************************************************
	
	@Test
	void test17() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][0] = 2;
		
		int[] out = new int[n];
		out[0] = 0;
		int[] ans = test.BellmanFord(0, inp, n);
		
		assertArrayEquals(out,ans);
	}
	
	@Test
	void test31() 
	{	
		int n = 3;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][1] = 2;
		inp[0][2] = 4;
		inp[1][2] = 3;
		
		int[] out = new int[]{0,2,4};
		int[] ans = test.BellmanFord(0, inp, n);
		
		assertArrayEquals(out,ans);
	}
	
	// Dijkstra **************************************************************
	
	@Test
	void test18() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][0] = 2;
		
		int[] out = new int[n];
		out[0] = 0;
		int[] ans = test.dijkstra(0, inp, n);
		
		assertArrayEquals(out,ans);
	}
	
	@Test
	void test19() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][0] = 5;
		
		int[] out = new int[n];
		out[0] = 0;
		int[] ans = test.dijkstra(0, inp, n);
		
		assertArrayEquals(out,ans);
	}
	
	@Test
	void test30() 
	{	
		int n = 3;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][1] = 2;
		inp[0][2] = 4;
		inp[1][2] = 3;
		
		int[] out = new int[]{0,2,4};
		int[] ans = test.dijkstra(0, inp, n);
		
		assertArrayEquals(out,ans);
	}
	
	// Prims Algorithm **************************************************************
	
	@Test
	void test20() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		int[][] out = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
				out[i][j] = INF;
			}
		}
		
		int[][] ans = test.primMST(inp, n);
		
		assertArrayEquals(out,ans);
	}
	
	@Test
	void test21() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		int[][] out = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
				out[i][j] = INF;
			}
		}
		
		int[][] ans = test.primMST(inp, n);
		
		assertArrayEquals(out,ans);
	}
	
	@Test
	void test29() 
	{	
		int n = 3;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		int[][] out = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
				out[i][j] = INF;
			}
		}
		
		inp[0][1] = 2;
		inp[0][2] = 4;
		inp[1][2] = 3;
		
		out[0][1] = 2;
		out[1][2] = 3;
		
		int[][] ans = test.primMST(inp, n);
		
		assertArrayEquals(out,ans);
	}
	
	// minEdgeBFS Algorithm **************************************************************
	
	@Test
	void test22() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}

		int ans = test.minEdgeBFS(inp, 0, 0, n);
		
		assertEquals(0,ans);
	}
	
	@Test
	void test23() 
	{	
		int n = 1;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}

		int ans = test.minEdgeBFS(inp, 0, 0, n);
		
		assertEquals(0,ans);
	}
	
	@Test
	void test24() 
	{	
		int n = 3;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][1] = 1;
		inp[1][2] = 2;
		
		int ans = test.minEdgeBFS(inp, 0, 2, n);
		
		assertEquals(2,ans);
	}
	
	@Test
	void test28() 
	{	
		int n = 5;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][1] = 5;
		inp[1][2] = 6;
		inp[1][3] = 1;
		inp[0][4] = 3;
		inp[4][2] = 1;
		inp[4][3] = 1;
		inp[0][2] = 1;
		
		int ans = test.minEdgeBFS(inp, 0, 2, n);
		
		assertEquals(1,ans);
	}
	
	// PrintLexoSmall Algorithm **************************************************************
	
	@Test
	void test25() 
	{	
		int n = 2;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[1][0] = 1;
		inp[1][1] = 1;
		
		int[] out = new int[]{1,0};
		
		List<Integer> out_lst = test.printLexoSmall(1, inp, n);
		
		int[] out_test = out_lst.stream().mapToInt(Integer::intValue).toArray();
		assertArrayEquals(out,out_test);
	}
	
	@Test
	void test26() 
	{	
		int n = 2;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		int[] out = new int[]{0};
		
		List<Integer> out_lst = test.printLexoSmall(0, inp, n);
		
		int[] out_test = out_lst.stream().mapToInt(Integer::intValue).toArray();
		assertArrayEquals(out,out_test);
	}
	
	@Test
	void test27() 
	{	
		int n = 5;
		Graph1 test= new Graph1(n);
		int[][] inp = new int[n][n];
		
		for (int i =0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				inp[i][j] = INF;
			}
		}
		
		inp[0][1] = 5;
		inp[1][2] = 6;
		inp[1][3] = 1;
		inp[0][4] = 3;
		inp[4][2] = 1;
		inp[4][3] = 1;
		
		
		int[] out = new int[]{0,1,2,3,4};
		
		List<Integer> out_lst = test.printLexoSmall(0, inp, n);
		
		int[] out_test = out_lst.stream().mapToInt(Integer::intValue).toArray();
		assertArrayEquals(out,out_test);
	}
	
}