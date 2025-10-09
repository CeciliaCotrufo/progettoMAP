package mining;

import data.*;
public class QTMiner {

    ClusterSet C;
    double radius;

    public QTMiner(double radius){
        this.C =new ClusterSet();
        this.radius = radius;
    }

    public ClusterSet getC() {
        return C;
    }

    public int compute(Data data){
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

    public Cluster buildCandidateCluster(Data data, boolean isClustered[]){


        ClusterSet CS = new ClusterSet();
        int countClusterset = 0;
        for (int i =0; i<data.getNumberOfExamples(); i++){
            if(isClustered[i]==false){
                Cluster cl = new Cluster(data.getItemSet(i));
                for(int j=0; j<data.getNumberOfExamples(); j++) {
                    if(isClustered[j] == false) {
                        double d=data.getItemSet(i).getDistance(data.getItemSet(j));
                        if(d <= radius){
                            cl.addData(j);
                        }
                    }
                }
                CS.add(cl);
                countClusterset = countClusterset + 1;
            }
        }

        double max = 0;
        int pos = 0;
        for(int i=0; i<countClusterset; i++){
             if(max < CS.get(i).getSize()) {
                 max = CS.get(i).getSize();
                 pos = i;
             }
        } return CS.get(pos);

    }














}
