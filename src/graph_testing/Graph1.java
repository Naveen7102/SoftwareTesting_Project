package graph_testing;

import java.util.*;

public class Graph1 {
    
    public int Ver;   // No. of vertices
    public int[][] gph; //Adjacency Lists
  	final static int INF = 9999;

    // Constructor
    Graph1(int v)
    {
        Ver = v;
        gph = new int[Ver][Ver];
        for(int i=0;i<Ver;i++)
        {
            for(int j=0;j<Ver;j++)
            {
                gph[i][j] = INF;
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welecome!!!. Wanna Play with Graphs, found the best Platform.\nChoose the number of vertices the graph has.");
        int num_v = sc.nextInt();
        
        Graph1 g = new Graph1(num_v);
        System.out.println("Number of vertices chosen is - " + num_v);
        System.out.println("Choose the number of Edges in the graph - ");
        int num_e = sc.nextInt();
        System.out.println("Number of edges in the graph is - " + num_e);
        System.out.println("Now, provide the edge details with each vertex ranging from 1 to number of vertices-1.\nThe format is 'vertex1 vertex2 weight of the edge'");
        for(int i=0;i<num_e;i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int wt = sc.nextInt();
            g.addEdge(v1, v2, wt);
        }
        
        System.out.println("Congratulations you have created the graph successfully");
        while(true)
        {
            int option;
            System.out.println("\n\nChoose a number from the following options to run a specific graph algorithm.\n");

            System.out.println("1: Create a transpose the graph");
            
            System.out.println("2: Perform BFS traversal on the graph");
            
            System.out.println("3: Perform DFS traversal on the graph");
            
            System.out.println("4: Perform Dijkstra algorithm on the graph");
            
            System.out.println("5: Perform Bellman Ford algorithm on the graph");
            
            System.out.println("6: Perform Floyd Warshall algorithm on the graph");
            
            System.out.println("7: Perform Prims algorithm on the graph");

            System.out.println("8: Check If two Nodes are connected");

            System.out.println("9: Check the minimum no. of edges between two vertices");
            
            System.out.println("10: Get Lexicographically small BFS");

            System.out.println("11: Exit");
            
            System.out.println("\n\nChoose an Option");
            
            option = sc.nextInt();

            if(option == 11)
            {
                System.out.println("You have decidded to Exit. Thanks for your time");
                break;
            }

            else if(option == 1)
            {
                int[][] ans = g.getTranspose(g.gph,g.Ver);
                System.out.println("You have chosen to transpose the graph.");
                System.out.println("The transpose of the given graph is - \n");
                
                for(int i=0;i<num_v;i++)
                {
                    for(int j=0;j<num_v;j++)
                    {
                        if(ans[i][j] != INF)
                        {
                            System.out.println("vertex from " + i + " to vertex " + j + " weight is " + ans[i][j]);
                        }
                    }
                }

            }
            else if(option == 2)
            {
                int start;
                System.out.println("You have chosen to run a BFS traversal.");
                System.out.println("Enter the starting node - ");
               
                start = sc.nextInt();
                List<Integer> ans = g.BFS(start,g.gph,g.Ver);
                System.out.println("The BFS traversal of the given graph is - \n");
                
                for(int i : ans)
                {
                    System.out.print(i + " ");
                }

            }

            else if(option == 3)
            {
                int start;
                System.out.println("You have chosen to run a DFS traversal.");
                System.out.println("Enter the starting node - ");
                
                start = sc.nextInt();
                List<Integer> ans = g.DFS(start,g.gph,g.Ver);
                System.out.println("The DFS traversal of the given graph is - \n");
                
                for(int i : ans)
                {
                    System.out.print(i + " ");
                }

            }

            else if(option == 4)
            {
                int start;
                System.out.println("You have chosen to run Dijkstra algorithm.");
                System.out.println("Enter the Source node - ");
                
                start = sc.nextInt();
                int[] ans = g.dijkstra(start,g.gph,g.Ver);
                System.out.println("The shortest distances from " + start + " is - \n");
                
                for(int i =0;i<num_v;i++)
                {
                    System.out.println("Distance from " + start +" and "+ i +" is -" + ans[i]);
                }

            }

            else if(option == 5)
            {
                int start;
                System.out.println("You have chosen to run Bellman Ford algorithm.");
                System.out.println("Enter the Source node - ");
                
                start = sc.nextInt();
                int[] ans = g.BellmanFord(start,g.gph,g.Ver);
                System.out.println("The shortest distances from " + start + " is - \n");
                
                for(int i =0;i<num_v;i++)
                {
                    System.out.print("Distance from " + start +" and "+ i +" is -" + ans[i]);
                }

            }

            else if(option == 6)
            {
                System.out.println("You have chosen to run Floyd Warshall algorithm.");
                int[][] ans = g.floydWarshall(g.gph,g.Ver);
                
                for(int i=0;i<num_v;i++)
                {
                    for(int j=0;j<num_v;j++)
                    {
                        if(ans[i][j] != INF)
                        {
                            System.out.println("Shortest distance from "+ i + " to " + j + " is " + ans[i][j]);
                        }
                    }
                }

            }

            else if(option == 7)
            {
                System.out.println("You have chosen to run Prims algorithm.");
                int[][] ans = g.primMST(g.gph,g.Ver);
                System.out.println("The minimum spanning tree is -");
                
                for(int i=0;i<num_v;i++)
                {
                    for(int j=0;j<num_v;j++)
                    {
                        if(ans[i][j] != INF)
                        {
                            System.out.println("distance from "+ i + " to " + j + " is " + ans[i][j]);
                        }
                    }
                }

            }

            else if(option == 8)
            {
                System.out.println("You have check if two vertices are connected.");
                
                System.out.println("Enter the First vertex - ");
                int n1 = sc.nextInt();
                
                System.out.println("Enter the Second vertex - ");
                int n2 = sc.nextInt();
                
                Boolean ans = g.isReachable(n1,n2,g.gph,g.Ver);
                
                if(ans)
                {
                    System.out.println("The vertices " + n1 + " and " + n2 + " are connected");
                }
                
                else
                {
                    System.out.println("The vertices " + n1 + " and " + n2 + " are not connected");
                }

            }

            else if(option == 9)
            {
                System.out.println("You wanted to have the minimun number of vertices between two vertices.");
                
                System.out.println("Enter the First vertex - ");
                int n1 = sc.nextInt();
                
                System.out.println("Enter the Second vertex - ");
                int n2 = sc.nextInt();
                
                int ans = g.minEdgeBFS(g.gph,n1,n2,g.Ver);
                
                if(ans > 0)
                {
                    System.out.println("The minimum edges between " + n1 + " and " + n2 + " is " + ans);
                }
                
                else
                {
                    System.out.println("The vertices " + n1 + " and " + n2 + " are not connected");
                }

            }

            else if(option == 10)
            {
                System.out.println("You wanted to get the Lexicographyically smallest BFS.");
                
                System.out.println("Enter the Start vertex - ");
                int n = sc.nextInt();
                
                // int ans = g.minEdgeBFS(g.gph,n1,n2,g.Ver);
                List<Integer> ans = g.printLexoSmall(n,g.gph , g.Ver);
                
                System.out.println("The lexicographically smallest BFS from "+ n + " is -");

                for(int i: ans)
                {
                    System.out.print(i + " ");
                }

            }

        }
        sc.close();

    }

    // Function to add an edge into the graph
    void addEdge(int v,int w,int wt)
    {
        gph[v][w] = wt;
    }

    void printMatrix(int matrix[][], int V) 
    {
        for (int i = 0; i < V; ++i) 
        {
            for (int j = 0; j < V; ++j) 
            {
                
                if (matrix[i][j] == INF)
                {
                    System.out.print("INF ");
                }
                
                else
                {
                    System.out.print(matrix[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    int[][] getTranspose(int[][] adj, int V)
    {

        // Traverse the graph and for each edge u, v
        // in graph add the edge v, u in transpose
        int[][] transpose = new int[V][V];
        
        for (int i = 0;i < V;i++)
        {
          
            for (int j = 0;j < V;j++)
            {
                transpose[i][j] = adj[j][i];
            }

        }
        return transpose;
    }

    List<Integer> BFS(int start, int[][] adj, int V)
    {

        // Visited vector to so that
        // a vertex is not visited more than once
        // Initializing the vector to false as no
        // vertex is visited at the beginning
        List<Integer> ans = new ArrayList<Integer>();
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        List<Integer> q = new ArrayList<>();
        q.add(start);

        // Set source as visited
        visited[start] = true;

        int vis;
        while (!q.isEmpty())
        {
            
            vis = q.get(0);

            // Print the current node
            ans.add(vis);
            q.remove(q.get(0));

            // For every adjacent vertex to
            // the current vertex
            for(int i = 0; i < V; i++)
            {
                
                if (adj[vis][i] != INF && (!visited[i]))
                {

                    // Push the adjacent node to
                    // the queue
                    q.add(i);

                    // Set
                    visited[i] = true;
                }

            }

        }
        return ans;
    }

    List<Integer> DFS(int s, int[][] adj, int V)
    {
        // Initially mark all vertices as not visited
        List<Integer> ans = new ArrayList<Integer>();
        Vector<Boolean> visited = new Vector<Boolean>(V);
        
        for (int i = 0; i < V; i++)
        {
            visited.add(false);
        }
        

        // Create a stack for DFS
        Stack<Integer> stack = new Stack<>();
        
        // Push the current source node
        stack.push(s);
        
        while(stack.empty() == false)
        {
            // Pop a vertex from stack and print it
            s = stack.peek();
            // System.out.println(s + "skjrgbte ");
            stack.pop();
            
            // Stack may contain same vertex twice. So
            // we need to print the popped item only
            // if it is not visited.
            
            if(visited.get(s) == false)
            {
                ans.add(s);
                visited.set(s, true);
            }
            
            // Get all adjacent vertices of the popped vertex s
            // If a adjacent has not been visited, then push it
            // to the stack.
            
            for(int i=0;i<V;i++)
            {
                
                if(adj[s][i] != INF)
                {
                    int v = i;
        
                    if(!visited.get(v))
                    {
                        stack.push(v);  
                    }

                }
                    
            }
        }
        return ans;
    }

    int[][] floydWarshall(int[][] adj, int V) 
    {
        int matrix[][] = new int[V][V];
        int i, j, k;

        for (i = 0; i < V; i++)
        {
            
            for (j = 0; j < V; j++)
            {
                matrix[i][j] = adj[i][j];
            }

        }
        

        // Adding vertices individually
        for(k = 0; k < V; k++) 
        {
            
            for(i = 0; i < V; i++) 
            {
                
                for(j = 0; j < V; j++) 
                {
                    
                    if(matrix[i][k] + matrix[k][j] < matrix[i][j])
                    {
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }

                }

            }

        }
        return matrix;
    }

    public int[] BellmanFord(int source,int[][] adj, int V)
    {
        int[] distances = new int[V];
        
        for (int node = 0; node < V; node++)
        {
            distances[node] = Integer.MAX_VALUE;
        }

        distances[source] = 0;

        for (int node = 0; node < V - 1; node++)
        {
            for (int sourcenode = 0; sourcenode < V; sourcenode++)
            {
                for (int destinationnode = 0; destinationnode < V; destinationnode++)
                {
                    if (adj[sourcenode][destinationnode] != Integer.MAX_VALUE)
                    {
                        if (distances[destinationnode] > distances[sourcenode] + adj[sourcenode][destinationnode])
                        {
                            distances[destinationnode] = distances[sourcenode] + adj[sourcenode][destinationnode];
                        }
                    }

                }

            }

        }

        for (int sourcenode = 0; sourcenode < V; sourcenode++)
        {
            for (int destinationnode = 0; destinationnode < V; destinationnode++)
            {
                if (adj[sourcenode][destinationnode] != Integer.MAX_VALUE)
                {
                    if (distances[destinationnode] > distances[sourcenode] + adj[sourcenode][destinationnode])
                    {
                        System.out.println("The Graph contains negative egde cycle");
                    }
                }
            }
        }

        return distances;
    }

    int[] dijkstra(int src,int[][] adj, int V)
    {
        int[] dist = new int[V]; // The output array.
        // dist[i] will hold
        // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in
        // shortest path tree or shortest distance from src
        // to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and stpSet[]
        // as false
        
        for (int i = 0; i < V; i++) 
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) 
        {
            // Pick the minimum distance vertex from the set
            // of vertices not yet processed. u is always
            // equal to src in first iteration.
            int u;
          	int min = Integer.MAX_VALUE, min_index = -1;

          	for (int v = 0; v < V; v++)
            {
                if (sptSet[v] == false && dist[v] <= min) 
                {
                    min = dist[v];
                    min_index = v;
                }
            }

          	u = min_index;

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of
            // the picked vertex.
            for (int v = 0; v < V; v++)
            {
                
                // Update dist[v] only if is not in sptSet,
                // there is an edge from u to v, and total
                // weight of path from src to v through u is
                // smaller than current value of dist[v]
                if (!sptSet[v] && adj[u][v] != INF && dist[u] != Integer.MAX_VALUE && dist[u] + adj[u][v] < dist[v])
                {
                    dist[v] = dist[u] + adj[u][v];
                }

            }
        }

        // print the constructed distance array
		return dist;
    }

    int[][] primMST(int[][] adj, int V)
    {
        boolean []inMST = new boolean[V];
        int[][] mst = new int[V][V];
        
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                mst[i][j] = INF;
            }
        }

        // Include first vertex in MST
        inMST[0] = true;

        // Keep adding edges while number of included
        // edges does not become V-1.
        int edge_count = 0, mincost = 0;
       
        while (edge_count < V - 1)
        {

            // Find minimum weight valid edge.
            int min = INF, a = -1, b = -1;
            for (int i = 0; i < V; i++)
            {
                for (int j = 0; j < V; j++)
                {
                    if (adj[i][j] < min)
                    {
                        // System.out.println(i + " df " + j);
                        boolean nas;    
                        
                        if (i == j)
                        {
                            nas = false;
                        }
                        
                        if (inMST[i] == false && inMST[j] == false)
                        {
                            nas = false;
                        }

                        else if (inMST[i] == true && inMST[j] == true)
                        {
                            nas = false;
                        }
                        else
                        {
                            nas = true;
                        }
                        

                        if (nas)
                        {
                            min = adj[i][j];
                            a = i;
                            b = j;
                        }
                    }
                }
            }
            
            if (a != -1 && b != -1)
            {
                mst[a][b] = min;
                mincost = mincost + min;
                edge_count += 1;
                inMST[b] = inMST[a] = true;
                // System.out.println(a + " " + b);
            }

        }

        return mst;
    }

    Boolean isReachable(int s, int d,int[][] adj, int V)
    {
        // LinkedList<Integer>temp;

        // Mark all the vertices as not visited(By default set
        // as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while (queue.size()!=0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();

            int n;

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for(int j=0;j<V;j++)
            {   
                
                if(adj[s][j] != INF)
                {
                    n = j;

                    // If this adjacent node is the destination node,
                    // then return true
                    if (n==d)
                    {
                        return true;
                    }

                    // Else, continue to do BFS
                    if (!visited[n])
                    {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
                
            }
        }

        // If BFS is complete without visited d
        return false;
    }


    int minEdgeBFS(int[][] edges, int u,int v, int V)
    {
        // visited[n] for keeping track of visited
        // node in BFS
        Vector<Boolean> visited = new Vector<Boolean>(V);

        for (int i = 0; i < V; i++) 
        {
            visited.addElement(false);
        }

        // Initialize distances as 0
        Vector<Integer> distance = new Vector<Integer>(V);

        for (int i = 0; i < V; i++) 
        {
            distance.addElement(0);
        }

        // queue to do BFS.
        Queue<Integer> Q = new LinkedList<>();
        distance.setElementAt(0, u);

        Q.add(u);
        visited.setElementAt(true, u);
        
        while (!Q.isEmpty())
        {
            int x = Q.peek();
            Q.poll();

            for (int i=0; i<V; i++)
            {
                if(edges[x][i] != INF)
                {
                    int node = i;
                    if (visited.elementAt(node))
                    {
                        continue;
                    }
                    // update distance for i
                    distance.setElementAt(distance.get(x) + 1,node);
                    Q.add(node);
                    visited.setElementAt(true,node);
                }
                
            }

        }
        
        return distance.get(v);
    }

    List<Integer> printLexoSmall(int start, int[][] adj, int n)
    {
        // Visited array
        boolean[] vis = new boolean[n];

        List<Integer> ans = new ArrayList<>();

        // Minimum Heap
        Vector<Integer> Q = new Vector<Integer>();

        // First one visited
        vis[start] = true;
        Q.add(start);

        // Iterate till all nodes are visited
        while (Q.size() > 0) 
        {

            // Get the top element
            int now = Q.get(0);

            // Pop the element
            Q.remove(0);

            // Save the current node
            ans.add(now);

            // Find adjacent nodes

            for(int i=0;i<n;i++)
            {
                if(adj[now][i] != INF)
                {
                    int p = i;
                    if (!vis[p]) 
                    {

                        // Push
                        Q.add(p);
                        Collections.sort(Q);

                        // Mark as visited
                        vis[p] = true;
                    }
                }
            }
        }

        return ans;

    }

}
