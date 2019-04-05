import java.util.*;

class dijakstraAlgorithm{
	public Map<Vertex<Integer>, Integer> dijakstraShortestPath(Graph<Vertex<Integer>> graph, Vertex<Integer> source)
	{
		BinaryMinHeapMap<Vertex<Integer>> minHeap = new BinaryMinHeapMap<>();

		Map<Vertex<Integer>, Integer> distance = new HashMap<>();

		Map<Vertex<Integer>, Vertex<Integer>> parent = new HashMap<>();

		for(Vertex<Integer> vertex: graph.getAllVertex())
		{
			minHeap.add(Integer.MAX_VALUE, vertex);
		}

		minHeap.decrease(source, 0);

		distance.put(source, 0);

		parent.put(source, null);

		while(!minHeap.isEmpty())
		{
			BinaryMinHeapMap<Vertex> heapNode = minHeap.extractMin();

			Vertex<Integer> current = heapNode.key;

			distance.put(current, heapNode.weight);

			for(Edge<Integer> edge : current.getEdges())
			{
				Vertex<Integer> adjacent = getVertexForEdge(current, edge);

				if(!minHeap.containsData(adjacent))
				{
					continue;
				}

				int newDistance = distance.get(adjacent) + edge.getWeight();

				if(minHeap.getWeight(adjacent) > newDistance)
				{
					minHeap.decrease(adjacent, newDistance);
					parent.put(adjacent, current);
				}
			}			
		}
		return distance;
	}
}