public class QTMiner {

    ClusterSet C;
    double radius;

    QTMiner(double radius){
        this.C =new ClusterSet();
        this.radius = radius;
    }

    ClusterSet getC() {
        return C;
    }

    int compute(Data data){
        int numclusters=0;
        boolean isClustered[]=new boolean[data.getNumberOfExamples()];
        for(int i=0; i<isClustered.length; i++)
            isClustered[i]=false;
        int countClustered=0;
        while(countClustered!=data.getNumberOfExamples())
        {
            //Ricerca cluster più popoloso
            Cluster c=buildCandidateCluster(data, isClustered);
            C.add(c);
            numclusters++;
            //Rimuovo le tuple clusterizzate da dataset
            int clusteredTupleId[]=c.iterator();
            for(int i=0; i<clusteredTupleId.length; i++){
                isClustered[clusteredTupleId[i]]=true;
            }
            countClustered+=c.getSize();
        }
        return numclusters;
    }

    Cluster buildCandidateCluster(Data data, boolean isClustered[]){

        countclusterset=0;
        clusterset
        for (....){
            if non clusterizzata

                distance
                        if radio
                        aggiunge al cluster le tuple
                    C.add(c)
                            countclusterset++
                    else

        }

        for (...){
            max =0;
            pos =0;
            for cluster i
             if max<del cluster.size
                max = cluster;
                pos = i
                cluster[i]
        } return cluster[pos]
ciao katia
        ciaoo
                return cluster popoloso

    }














}
