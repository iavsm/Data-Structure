package graph.disjoint_set;

public class UnionFind {

	int[] root;
	
	UnionFind(int x) {
		// Initialize array to size of graph
		root = new int[x];
		// Initialize index as root node to each element
		for(int i = 0; i < x ; i++) {
			root[i] = i;
		}
	}
	
	// Connect the two element if their root are different
	public void union(int x, int y) {
		int rootX = find(x);
		int rootY = find(y);
		// Check if both element has the same root means they already connected
		if(rootX == rootY) return;
		// If they not connected then replace the root of y with root of x
		for(int a = 0; a < root.length; a++) {
			if(root[a] == rootY) {
				root[a] = rootX;
			}
		}		
	}
	
	// Find the root node for element
	public int find(int element) {
		return root[element];
	}
	
	// Check if two nodes are connected or not
	public boolean connected(int x, int y) {
		return root[x] == root[y];
	}
	
}