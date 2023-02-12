#include<iostream>
#include <list>
#include <stack>
using namespace std;
#include <time.h>

class Graph
{
    int V;
    list<int> *adj;
    void topologicalSortUtil(int v, bool visited[], stack<int> &Stack);
public:
    Graph(int V);
    void addEdge(int v, int w);
    void topologicalSort();
};

Graph::Graph(int V)
{
    this->V = V;
    adj = new list<int>[V];
}

void Graph::addEdge(int v, int w)
{
    adj[v].push_back(w); // Add w to v’s list.
}

void Graph::topologicalSortUtil(int v, bool visited[],
                                stack<int> &Stack)
{
    visited[v] = true;
    list<int>::iterator i;
    for (i = adj[v].begin(); i != adj[v].end(); ++i)
        if (!visited[*i])
            topologicalSortUtil(*i, visited, Stack);
    Stack.push(v);
}

void Graph::topologicalSort()
{
    stack <int> Stack;
    bool *visited = new bool[V];
    for (int i = 0; i < V; i++) {
        visited[i] = false;
    }
    for (int i = 0; i < V; i++) {
        if (visited[i] == false)
            topologicalSortUtil(i, visited, Stack);
    }
    while (Stack.empty() == false)
    {
       // cout << Stack.top() << " ";
        Stack.pop();
    }
}

int main()
{

    Graph g(6);
    g.addEdge(0, 5);
    g.addEdge(0, 2);
    g.addEdge(1, 0);
    g.addEdge(1, 4);
    g.addEdge(2, 3);
    g.addEdge(4, 0);
    g.addEdge(4, 5);
    g.addEdge(4, 5);
    g.addEdge(5, 2);
    g.addEdge(5, 3);
    g.topologicalSort();

    Graph gg(1500);
    for (int i = 0; i <= 1500; i++)
        for (int j = i; j < 1500; j++)
            gg.addEdge(i, j);
    clock_t start = clock();
    gg.topologicalSort();
    clock_t end = clock();
    double seconds = (double)(end - start) / CLOCKS_PER_SEC;
    cout << "\n";
    cout << "Spend Time: " << seconds << " ";
    return 0;
}
