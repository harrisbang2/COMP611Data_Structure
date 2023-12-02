package com.mycompany.alogassignment;

/**
 *
 * @author harri
 */
public class CurrencyExchange {
private static final int INF = Integer.MAX_VALUE;
   public static void main(String[] args) {
// number of nodes will be 3 USD 0, NZD 1, AUD 2 
int N = 3;
// 2 dimention arracy(graph) for the cycle1 USD->NZD->AUD->USD
double [][] Cycle1 = new double[N][N];
// 2 dimention arracy(graph) for the cycle2 USD->AUD->NZD->USD
double [][] Cycle2 = new double[N][N];
// (preparation) setting both Cycle1 and Cycle2 empty array to set to INF
for (int i = 0; i < N; i++) {
for (int j = 0; j < N; j++) {    
Cycle1[i][j] = INF;
Cycle2[i][j] = INF;
}
}
// Adding edges for the Cycle 1
Cycle1[0][1] =  -0.225;
Cycle1[1][0] =  0.225;
Cycle1[1][2] = 0.027;
Cycle1[2][1] = -0.027;
Cycle1[2][0] = 0.194;
Cycle1[0][2] = 0.194;
// Adding edges for the Cycle 2
Cycle2[0][1] =  -0.222;
Cycle2[1][0] =  0.222;
Cycle2[1][2] = 0.029;
Cycle2[2][1] = -0.029;
Cycle2[2][0] = 0.196;
Cycle2[0][2] = -0.196;
//
// bellmanFord object created for the testings.
BellmanFord bf = new BellmanFord();
// bellmanFord for Cycle 1
double[] distances = bf.bellmanFord(Cycle1, 0);
// Print distances for Cycle 1
System.out.println("Printing out the Distance of Cycle 1");
for (int i = 0; i < N; i++){
System.out.println("Distance to node " + i + " is: " + distances[i]);
}
// bellmanFord for Cycle 2
distances = bf.bellmanFord(Cycle2, 0);
// Print distances for Cycle 2
System.out.println("Printing out the Distance of Cycle 2");
for (int i = 0; i < N; i++){
System.out.println("Distance to node " + i + " is: " + distances[i]);
}
}
}
