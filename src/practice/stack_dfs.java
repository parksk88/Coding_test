package practice;
import java.util.*;

public class stack_dfs {
	
	static final int MAX_N = 10;
	static int N, E;
	static int[][] graph = new int[MAX_N][MAX_N];
	static boolean[] visited = new boolean[MAX_N];
	
	
	static void dfs(int node) {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		E = sc.nextInt();
		
		for(int i=0; i<E; ++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			graph[u][v] = graph[v][u] = 1;
		}
		dfs(0);
	}

}
