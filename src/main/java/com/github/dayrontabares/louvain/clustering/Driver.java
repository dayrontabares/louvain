package com.github.dayrontabares.louvain.clustering;

import com.github.dayrontabares.louvain.graph.Graph;
import com.github.dayrontabares.louvain.graph.GraphBuilder;
import com.github.dayrontabares.louvain.nmi.NMI;


public class Driver {

    public static void main(String[] args) {

        final Graph g = new GraphBuilder().erdosRenyi(1000, 0.1);

        final LouvainSelector ls = new LouvainSelector("C:\\Users\\Dayron Tabares\\Desktop\\Cap 2 project" +
                "\\Java Louvian\\louvain\\src\\test\\resources\\graphs\\30-cliques.csv", "output.csv");

        //Run the Louvain community detection 10 times,
        // and write the clustering with the best modularity to a file and print max modularity to console
        final LayeredCommunityStructure cs = ls.cluster(10);
    }
}
