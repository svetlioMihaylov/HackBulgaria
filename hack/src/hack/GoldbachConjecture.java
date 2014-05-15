package hack;



import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class GoldbachConjecture {
private int number;
private boolean [] sieve;
private SortedMap<Integer,Integer> result;
public GoldbachConjecture(int arg)
{
	number=arg;
}
public int getNumber()
{
	return number;
}
public boolean [] getSieve() 
{
	return this.sieve;
}
private boolean[] sieveOfEratosthenes(int max){

   boolean[] primeCandidates = new boolean[max]; 
   for(int i=2; i<max; i++ ){primeCandidates[i]=true;}

   for(int i=2; i<Math.sqrt(max);i++){
       if(primeCandidates[i] == true){
          
           for(int j = i + i; j<max; j=j+i){
               primeCandidates[j]=false;
           }
       }

   }
  
   return primeCandidates;
}
public SortedMap<Integer, Integer> getResult()
{
	return this.result;
}
public void cuple()
{
	 sieve=sieveOfEratosthenes(number);
	result=new TreeMap<Integer,Integer> ();
	for(int i=0;i<number;i++)
	{
		if(sieve[i]&&sieve[number-i]&&i<number/2+1)
		{
			result.put(i, number-i);
		}
	}
}
public static void main(String [] args)
{
	GoldbachConjecture test=new GoldbachConjecture(100);
	test.cuple();
	for (Map.Entry<Integer,Integer> entry : test.getResult().entrySet()) {
	     System.out.println( "("+entry.getKey()+ ":" + entry.getValue()+")");
	}
}
}

