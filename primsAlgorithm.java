import java.util.*;

class primsAlgorithm{

	public List<Edge<Integer>> primMst(Graph<Integer> graph)
	{
		MinHeapMap<Vertex<Integer>> heapMap = new MinHeapMap<>();
		Map<Vertex<Integer>, Edge<Integer>> vertexToEdge = new HashMap<>();
		List<Edge<Integer>> result = new ArrayList<>();
		for(Vertex<Integer> v: graph.getAllVertex())
		{
			heapMap.add(v, Integer.MAX_VALUE);
		}
		Vertex<Integer> startVertex = graph.getAllVertex().iterator().next();
		heapMap.decrease(startVertex, 0);
		while(!heapMap.isEmpty())
		{
			Vertex<Integer> current = heapMap.extractMin();
			Edge<Integer> spanningTreeEdge = vertexToEdge.get(current);
			if(spanningTreeEdge != null)
			{
				result.add(spanningTreeEdge);
			}
			for(Edge<Integer> e:current.getEdges())
			{
				Vertex<Integer> adjacent = getVertexForEdge(current);
				if(heapMap.containsData(adjacent) && heapMap.getWeight(adjacent) > e.getWeight())
				{
					heapMap.decrease(e, e.getWeight());
					vertexToEdge.put(adjacent, e);
				}
			}
		}
		return result;
	}
}