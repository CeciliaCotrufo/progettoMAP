package mining;
import data.*;
import utility.*;
import java.util.*;
class Cluster {

	private Tuple centroid;

	private Set<Integer> clusteredData =  new HashSet();
	
	Cluster(){
		this.centroid = centroid;
        this.clusteredData = clusteredData;
	}


	Cluster(Tuple centroid){
		this.centroid=centroid;
		clusteredData=new HashSet();
		
	}

		
	Tuple getCentroid(){
		return centroid;
	}
	
	//return true if the tuple is changing cluster
	boolean addData(int id){
		return clusteredData.add(id);
		
	}
	
	//verifica se una transazione � clusterizzata nell'array corrente
	/*boolean contain(int id){
		return clusteredData.(id);
	}
	*/

	//remove the tuple that has changed the cluster
	/*void removeTuple(int id){
		clusteredData.delete(id);
		
	}*/
	
	int  getSize(){
		return clusteredData.size();
	}
	
	/*
    Object[] iterator(){
		return clusteredData.toArray();
	}*/

    public Iterator<Integer> iterator(){
        return clusteredData.iterator();
    }

	
	public String toString(){
		String str="Centroid=(";
		for(int i=0;i<centroid.getLenght();i++)
			str+=centroid.get(i);
		str+=")";
		return str;
		
	}
	


	
	public String toString(Data data){
		String str="Centroid=(";
		for(int i=0;i<centroid.getLenght();i++)
			str+=centroid.get(i)+ " ";
		str+=")\nExamples:\n";
		Set<Integer> = new HashSet<>(clusteredData);
		for(){
			str+="[";
			for(int j=0;j<data.getNumberOfAttributes();j++)
				str+=data.getAttributeValue((int)array[i], j)+" ";
			str+="] dist="+getCentroid().getDistance(data.getItemSet((int)array[i]))+"\n";
			
		}
		str+="\nAvgDistance="+getCentroid().avgDistance(data, array);
		return str;
		
	}

}
