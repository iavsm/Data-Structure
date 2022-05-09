package graph.disjoint_set;

public class QuickUnion {
	
	int[] root;
	
	QuickUnion(int length) {
		root = new int[length];
        for (int i = 0; i < root.length; i++) {
            root[i] = i;
        }
	}
	
	public int findRoot(int value) {
		while(value != root[value]) {
			value = root[value];
		}
		return value;
	}
	
	public void union(int x, int y) {
		int rootX = findRoot(x);
		int rootY = findRoot(y);
		if(rootX != rootY) {
			root[rootY] = rootX;
		}
	}
	
    public boolean connected(int x, int y) {
    	return findRoot(x) == findRoot(y);
    }
}
