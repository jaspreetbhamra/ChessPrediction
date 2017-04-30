package DecisionTreePackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NaiveBayesClassifier {
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int TOTAL_ROWS_IN_DATASET = 28056;
		ArrayList<String[]> data = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("chessDataSet.csv"));
		    String line = null;
		    data = new ArrayList<>();
		    while ((line = br.readLine()) != null) {
		      String[] values = line.split(",");
		    }
		    br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("The .csv file was not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("An I/O exception occurred");
		}
		Map<String, Integer> classLabelCount = new TreeMap<>();
		classLabelCount.put("draw", 0);
		classLabelCount.put("zero", 0);
		classLabelCount.put("one", 0);
		classLabelCount.put("two", 0);
		classLabelCount.put("three", 0);
		classLabelCount.put("four", 0);
		classLabelCount.put("five", 0);
		classLabelCount.put("six", 0);
		classLabelCount.put("seven", 0);
		classLabelCount.put("eight", 0);
		classLabelCount.put("nine", 0);
		classLabelCount.put("ten", 0);
		classLabelCount.put("eleven", 0);
		classLabelCount.put("twelve", 0);
		classLabelCount.put("thirteen", 0);
		classLabelCount.put("fourteen", 0);
		classLabelCount.put("fifteen", 0);
		classLabelCount.put("sixteen", 0);
		String []classVar = {"draw", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen"};
	    Iterator it = data.iterator();
	    
	    //Array to store counts in the switch case
	    int draw[] = new int[6];
	    int zero[] = new int[6];
	    int one[] = new int[6];
	    int two[] = new int[6];
	    int three[] = new int[6];
	    int four[] = new int[6];
	    int five[] = new int[6];
	    int six[] = new int[6];
	    int seven[] = new int[6];
	    int eight[] = new int[6];
	    int nine[] = new int[6];
	    int ten[] = new int[6];
	    int eleven[] = new int[6];
	    int twelve[] = new int[6];
	    int thirteen[] = new int[6];
	    int fourteen[] = new int[6];
	    int fifteen[] = new int[6];
	    int sixteen[] = new int[6];
	    
	    double[] resultingProbabilityOfClassVar = new double[18];
	    int abc = 0;
	    while(it.hasNext()){
	    	String[] oneRow = (String[]) it.next();
	    	int t = classLabelCount.get(oneRow[6]);
	    	classLabelCount.put(oneRow[6], ++t);
	    }
	    System.out.println("Enter the unknown tuple for prediction");
	    System.out.println("The positions to be given are as follows:");
	    System.out.println("White King Row, White King Column, White Rook Row, White Rook Column, Black King Row, Black King Column");
	    String[] unknownData = new String[6];
	    for(int i=0; i<6; ++i)
	    	unknownData[i] = sc.next();
	    it = data.iterator();
	    while(it.hasNext()){
	    	String[] oneRow = (String[]) it.next();
	    	switch(oneRow[6]){
	    		case "draw":
	    			if(oneRow[0].equals(unknownData[0]))draw[0]++;
	    			if(oneRow[1].equals(unknownData[1]))draw[1]++;
	    			if(oneRow[2].equals(unknownData[2]))draw[2]++;
	    			if(oneRow[3].equals(unknownData[3]))draw[3]++;
	    			if(oneRow[4].equals(unknownData[4]))draw[4]++;
	    			if(oneRow[5].equals(unknownData[5]))draw[5]++;
	    			break;
	    		case "one":
	    			if(oneRow[0].equals(unknownData[0]))one[0]++;
	    			if(oneRow[1].equals(unknownData[1]))one[1]++;
	    			if(oneRow[2].equals(unknownData[2]))one[2]++;
	    			if(oneRow[3].equals(unknownData[3]))one[3]++;
	    			if(oneRow[4].equals(unknownData[4]))one[4]++;
	    			if(oneRow[5].equals(unknownData[5]))one[5]++;
	    			break;
	    		case "two":
	    			if(oneRow[0].equals(unknownData[0]))two[0]++;
	    			if(oneRow[1].equals(unknownData[1]))two[1]++;
	    			if(oneRow[2].equals(unknownData[2]))two[2]++;
	    			if(oneRow[3].equals(unknownData[3]))two[3]++;
	    			if(oneRow[4].equals(unknownData[4]))two[4]++;
	    			if(oneRow[5].equals(unknownData[5]))two[5]++;
	    			break;
	    		case "three":
	    			if(oneRow[0].equals(unknownData[0]))three[0]++;
	    			if(oneRow[1].equals(unknownData[1]))three[1]++;
	    			if(oneRow[2].equals(unknownData[2]))three[2]++;
	    			if(oneRow[3].equals(unknownData[3]))three[3]++;
	    			if(oneRow[4].equals(unknownData[4]))three[4]++;
	    			if(oneRow[5].equals(unknownData[5]))three[5]++;
	    			break;
	    		case "four":
	    			if(oneRow[0].equals(unknownData[0]))four[0]++;
	    			if(oneRow[1].equals(unknownData[1]))four[1]++;
	    			if(oneRow[2].equals(unknownData[2]))four[2]++;
	    			if(oneRow[3].equals(unknownData[3]))four[3]++;
	    			if(oneRow[4].equals(unknownData[4]))four[4]++;
	    			if(oneRow[5].equals(unknownData[5]))four[5]++;
	    			break;
	    		case "five":
	    			if(oneRow[0].equals(unknownData[0]))five[0]++;
	    			if(oneRow[0].equals(unknownData[0]))five[0]++;
	    			if(oneRow[0].equals(unknownData[0]))five[0]++;
	    			if(oneRow[0].equals(unknownData[0]))five[0]++;
	    			if(oneRow[0].equals(unknownData[0]))five[0]++;
	    			if(oneRow[0].equals(unknownData[0]))five[0]++;
	    			break;
	    		case "six":
	    			if(oneRow[0].equals(unknownData[0]))six[0]++;
	    			if(oneRow[1].equals(unknownData[1]))six[1]++;
	    			if(oneRow[2].equals(unknownData[2]))six[2]++;
	    			if(oneRow[3].equals(unknownData[3]))six[3]++;
	    			if(oneRow[4].equals(unknownData[4]))six[4]++;
	    			if(oneRow[5].equals(unknownData[5]))six[5]++;
	    			break;
	    		case "seven":
	    			if(oneRow[0].equals(unknownData[0]))seven[0]++;
	    			if(oneRow[1].equals(unknownData[1]))seven[1]++;
	    			if(oneRow[2].equals(unknownData[2]))seven[2]++;
	    			if(oneRow[3].equals(unknownData[3]))seven[3]++;
	    			if(oneRow[4].equals(unknownData[4]))seven[4]++;
	    			if(oneRow[5].equals(unknownData[5]))seven[5]++;
	    			break;
	    		case "eight":
	    			if(oneRow[0].equals(unknownData[0]))eight[0]++;
	    			if(oneRow[1].equals(unknownData[1]))eight[1]++;
	    			if(oneRow[2].equals(unknownData[2]))eight[2]++;
	    			if(oneRow[3].equals(unknownData[3]))eight[3]++;
	    			if(oneRow[4].equals(unknownData[4]))eight[4]++;
	    			if(oneRow[5].equals(unknownData[5]))eight[5]++;
	    			break;
	    		case "nine":
	    			if(oneRow[0].equals(unknownData[0]))nine[0]++;
	    			if(oneRow[1].equals(unknownData[1]))nine[1]++;
	    			if(oneRow[2].equals(unknownData[2]))nine[2]++;
	    			if(oneRow[3].equals(unknownData[3]))nine[3]++;
	    			if(oneRow[4].equals(unknownData[4]))nine[4]++;
	    			if(oneRow[5].equals(unknownData[5]))nine[5]++;
	    			break;
	    		case "ten":
	    			if(oneRow[0].equals(unknownData[0]))ten[0]++;
	    			if(oneRow[1].equals(unknownData[1]))ten[1]++;
	    			if(oneRow[2].equals(unknownData[2]))ten[2]++;
	    			if(oneRow[3].equals(unknownData[3]))ten[3]++;
	    			if(oneRow[4].equals(unknownData[4]))ten[4]++;
	    			if(oneRow[5].equals(unknownData[5]))ten[5]++;
	    			break;
	    		case "eleven":
	    			if(oneRow[0].equals(unknownData[0]))eleven[0]++;
	    			if(oneRow[1].equals(unknownData[1]))eleven[1]++;
	    			if(oneRow[2].equals(unknownData[2]))eleven[2]++;
	    			if(oneRow[3].equals(unknownData[3]))eleven[3]++;
	    			if(oneRow[4].equals(unknownData[4]))eleven[4]++;
	    			if(oneRow[5].equals(unknownData[5]))eleven[5]++;
	    			break;
	    		case "twelve":
	    			if(oneRow[0].equals(unknownData[0]))twelve[0]++;
	    			if(oneRow[1].equals(unknownData[1]))twelve[1]++;
	    			if(oneRow[2].equals(unknownData[2]))twelve[2]++;
	    			if(oneRow[3].equals(unknownData[3]))twelve[3]++;
	    			if(oneRow[4].equals(unknownData[4]))twelve[4]++;
	    			if(oneRow[5].equals(unknownData[5]))twelve[5]++;
	    			break;
	    		case "thirteen":
	    			if(oneRow[0].equals(unknownData[0]))thirteen[0]++;
	    			if(oneRow[1].equals(unknownData[1]))thirteen[1]++;
	    			if(oneRow[2].equals(unknownData[2]))thirteen[2]++;
	    			if(oneRow[3].equals(unknownData[3]))thirteen[3]++;
	    			if(oneRow[4].equals(unknownData[4]))thirteen[4]++;
	    			if(oneRow[5].equals(unknownData[5]))thirteen[5]++;
	    			break;
	    		case "fourteen":
	    			if(oneRow[0].equals(unknownData[0]))fourteen[0]++;
	    			if(oneRow[1].equals(unknownData[1]))fourteen[1]++;
	    			if(oneRow[2].equals(unknownData[2]))fourteen[2]++;
	    			if(oneRow[3].equals(unknownData[3]))fourteen[3]++;
	    			if(oneRow[4].equals(unknownData[4]))fourteen[4]++;
	    			if(oneRow[5].equals(unknownData[5]))fourteen[5]++;
	    			break;
	    		case "fifteen":
	    			if(oneRow[0].equals(unknownData[0]))fifteen[0]++;
	    			if(oneRow[1].equals(unknownData[1]))fifteen[1]++;
	    			if(oneRow[2].equals(unknownData[2]))fifteen[2]++;
	    			if(oneRow[3].equals(unknownData[3]))fifteen[3]++;
	    			if(oneRow[4].equals(unknownData[4]))fifteen[4]++;
	    			if(oneRow[5].equals(unknownData[5]))fifteen[5]++;
	    			break;
	    		case "sixteen":
	    			if(oneRow[0].equals(unknownData[0]))sixteen[0]++;
	    			if(oneRow[1].equals(unknownData[1]))sixteen[1]++;
	    			if(oneRow[2].equals(unknownData[2]))sixteen[2]++;
	    			if(oneRow[3].equals(unknownData[3]))sixteen[3]++;
	    			if(oneRow[4].equals(unknownData[4]))sixteen[4]++;
	    			if(oneRow[5].equals(unknownData[5]))sixteen[5]++;
	    			break;
	    	}
	    }
	    double noOfValues;
	    noOfValues = (double)classLabelCount.get("draw");
	    resultingProbabilityOfClassVar[0] = ((double)draw[0]/noOfValues)*((double)draw[1]/noOfValues)*((double)draw[2]/noOfValues)*((double)draw[3]/noOfValues)*((double)draw[4]/noOfValues)*((double)draw[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("zero");
	    resultingProbabilityOfClassVar[1] = ((double)zero[0]/noOfValues)*((double)zero[1]/noOfValues)*((double)zero[2]/noOfValues)*((double)zero[3]/noOfValues)*((double)zero[4]/noOfValues)*((double)zero[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("one");
	    resultingProbabilityOfClassVar[2] = ((double)one[0]/noOfValues)*((double)one[1]/noOfValues)*((double)one[2]/noOfValues)*((double)one[3]/noOfValues)*((double)one[4]/noOfValues)*((double)one[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("two");
	    resultingProbabilityOfClassVar[3] = ((double)two[0]/noOfValues)*((double)two[1]/noOfValues)*((double)two[2]/noOfValues)*((double)two[3]/noOfValues)*((double)two[4]/noOfValues)*((double)two[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("three");
	    resultingProbabilityOfClassVar[4] = ((double)three[0]/noOfValues)*((double)three[1]/noOfValues)*((double)three[2]/noOfValues)*((double)three[3]/noOfValues)*((double)three[4]/noOfValues)*((double)three[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("four");
	    resultingProbabilityOfClassVar[5] = ((double)four[0]/noOfValues)*((double)four[1]/noOfValues)*((double)four[2]/noOfValues)*((double)four[3]/noOfValues)*((double)four[4]/noOfValues)*((double)four[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("five");
	    resultingProbabilityOfClassVar[6] = ((double)five[0]/noOfValues)*((double)five[1]/noOfValues)*((double)five[2]/noOfValues)*((double)five[3]/noOfValues)*((double)five[4]/noOfValues)*((double)five[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("six");
	    resultingProbabilityOfClassVar[7] = ((double)six[0]/noOfValues)*((double)six[1]/noOfValues)*((double)six[2]/noOfValues)*((double)six[3]/noOfValues)*((double)six[4]/noOfValues)*((double)six[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("seven");
	    resultingProbabilityOfClassVar[8] = ((double)seven[0]/noOfValues)*((double)seven[1]/noOfValues)*((double)seven[2]/noOfValues)*((double)seven[3]/noOfValues)*((double)seven[4]/noOfValues)*((double)seven[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("eight");
	    resultingProbabilityOfClassVar[9] = ((double)eight[0]/noOfValues)*((double)eight[1]/noOfValues)*((double)eight[2]/noOfValues)*((double)eight[3]/noOfValues)*((double)eight[4]/noOfValues)*((double)eight[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("nine");
	    resultingProbabilityOfClassVar[10] = ((double)nine[0]/noOfValues)*((double)nine[1]/noOfValues)*((double)nine[2]/noOfValues)*((double)nine[3]/noOfValues)*((double)nine[4]/noOfValues)*((double)nine[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("ten");
	    resultingProbabilityOfClassVar[11] = ((double)ten[0]/noOfValues)*((double)ten[1]/noOfValues)*((double)ten[2]/noOfValues)*((double)ten[3]/noOfValues)*((double)ten[4]/noOfValues)*((double)ten[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("eleven");
	    resultingProbabilityOfClassVar[12] = ((double)eleven[0]/noOfValues)*((double)eleven[1]/noOfValues)*((double)eleven[2]/noOfValues)*((double)eleven[3]/noOfValues)*((double)eleven[4]/noOfValues)*((double)eleven[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("twelve");
	    resultingProbabilityOfClassVar[13] = ((double)twelve[0]/noOfValues)*((double)twelve[1]/noOfValues)*((double)twelve[2]/noOfValues)*((double)twelve[3]/noOfValues)*((double)twelve[4]/noOfValues)*((double)twelve[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("thirteen");
	    resultingProbabilityOfClassVar[14] = ((double)thirteen[0]/noOfValues)*((double)thirteen[1]/noOfValues)*((double)thirteen[2]/noOfValues)*((double)thirteen[3]/noOfValues)*((double)thirteen[4]/noOfValues)*((double)thirteen[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("fourteen");
	    resultingProbabilityOfClassVar[15] = ((double)fourteen[0]/noOfValues)*((double)fourteen[1]/noOfValues)*((double)fourteen[2]/noOfValues)*((double)fourteen[3]/noOfValues)*((double)fourteen[4]/noOfValues)*((double)fourteen[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("fifteen");
	    resultingProbabilityOfClassVar[16] = ((double)fifteen[0]/noOfValues)*((double)fifteen[1]/noOfValues)*((double)fifteen[2]/noOfValues)*((double)fifteen[3]/noOfValues)*((double)fifteen[4]/noOfValues)*((double)fifteen[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    noOfValues = (double)classLabelCount.get("sixteen");
	    resultingProbabilityOfClassVar[17] = ((double)sixteen[0]/noOfValues)*((double)sixteen[1]/noOfValues)*((double)sixteen[2]/noOfValues)*((double)sixteen[3]/noOfValues)*((double)sixteen[4]/noOfValues)*((double)sixteen[5]/noOfValues)*(noOfValues/(double)TOTAL_ROWS_IN_DATASET);
	    
	    int indexOfMaxProbability = 0;
	    for(int i=0; i<resultingProbabilityOfClassVar.length; ++i){
	    	if(resultingProbabilityOfClassVar[i]>indexOfMaxProbability)
	    		indexOfMaxProbability = i;
	    }
	    System.out.println("The class variable that was predicted for the given data is: "+classVar[indexOfMaxProbability]);
	}
}
