package com.github.dayrontabares.louvain.clustering;

public class Driver {

    public static void main(String[] args) {

        final LouvainSelector ls = new LouvainSelector("C:\\Users\\Dayron Tabares\\Desktop\\Cap 2 project" +
                "\\Java Louvian\\louvain\\src\\test\\resources\\graphs\\30-cliques.csv", "output.csv");

        /*
        Run the Louvain community detection 10 times,
         and write the clustering with the best modularity to a file and print max modularity to console
        */
        ls.cluster(10);
    }
}
