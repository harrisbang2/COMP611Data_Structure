/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alogassignment;

/**
 *
 * @author harri
 */
public class BellmanFord  {
   private static final int INF = Integer.MAX_VALUE;
   public double[] bellmanFord(double[][] graph, int s)
{
int N = graph.length;
// Initialize distances, Base Case
double[] d = new double[N];
for (int i = 0; i < N; i++) {
d[i] = INF;
}
d[s] = 0;
// Recurrence
double[] d_prime = new double[N];
for (int i = 1; i < N; i++) // Loop N-1 times for the case of no negative cycles
{
System.arraycopy(d, 0, d_prime, 0, N);
for (int u = 0; u < N; u++)
{
for (int v = 0; v < N; v++)
{
// Ensure we have an edge from v to u and ensure we aren't
//overflowing integer values
if (graph[v][u] != INF && d[v] != INF && d[v] + graph[v][u] <
d_prime[u])
{
d_prime[u] = d[v] + graph[v][u];
}
}
}
System.arraycopy(d_prime, 0, d, 0, N);
}
// Return the distance array
return d;
}
}
