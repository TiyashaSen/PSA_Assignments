package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class UnionFindClient {


	 public static int count(int n){
	       
	        int countTotal = 0;
	        for(int i = 0; i<1000; i++){
	            UF_HWQUPC unionFind = new UF_HWQUPC(n, true);
	            int pairsCount = 0;
	            Random r = new Random();
	            while(unionFind.components() != 1){
	                
	    	        int a = r.nextInt(n);
	    	        int b = r.nextInt(n);
	    	        
	    	        while(a == b)
	    	            b = r.nextInt(n);
	    	        int[] pairVal = {a,b};
	                pairsCount++;
	                if(!unionFind.connected(pairVal[0], pairVal[1]))
	                	unionFind.union(pairVal[0], pairVal[1]);
	            }
	            countTotal += pairsCount;
	        }
	        return (countTotal/1000);
	    }
	    
	    
	    
	 
	    public static void main(String[] args) {
	        int[] objectsCount = {100, 200, 400, 800, 1600, 3200, 6400, 12800, 25600, 51200, 102400, 204800};
	        for(int n : objectsCount){
	            int genPairs = count(n);
	            System.out.println("Number of objects(n): " + n + ", Generated pairs(m): " + genPairs);
	        }
	    }
    }


