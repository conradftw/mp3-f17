package ca.ubc.ece.cpen221.mp3.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
	
	public static void main(String args[]) throws FileNotFoundException {
		File file = new File("C:/Users/conra/eclipse-workspace/mp3-f17/datasets/enron.txt");
		//taken from https://stackoverflow.com/questions/1473155/how-to-get-data-between-quotes-in-java
		//and https://stackoverflow.com/questions/12360694/java-scanner-delimit-by-spaces-unless-quotation-marks-are-present
		//Pattern p = Pattern.compile("\"([^\"]*)\"");
		ArrayList<String> eachLine = new ArrayList<String>();
		ArrayList<String> vertexList = new ArrayList<String>();
		ArrayList<String> edgeList = new ArrayList<String>();
		
		//dont separate only on one space
		Scanner sc = new Scanner(file);//.useDelimiter("  ");
		
		//uses regex: "([^\"]\\S*|\".+?\")\\s*" to keep words inside quotes together
		//while a line has more phrases, add them to eachLine array
		//then move on to next line of input
		while (sc.hasNextLine()) {
			//taken from https://stackoverflow.com/questions/7804335/split-string-on-spaces-in-java-except-if-between-quotes-i-e-treat-hello-wor
			Matcher m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(sc.nextLine());
			while(m.find())
				eachLine.add(m.group(1).replaceAll("\"", ""));
			
		}
		sc.close();
		
		//for(int k=0;k<eachLine.size();++k)
		//System.out.println(eachLine);//.get(193331));
		
		//put vertices in their own list
		for(int k=0;k<eachLine.size();k+=2)
			vertexList.add(eachLine.get(k));
		
		//put edges in their own list
		//now indices correspond to each other
		for(int k=1;k<eachLine.size();k+=2)
			edgeList.add(eachLine.get(k));
		
		System.out.println(eachLine.size());
		System.out.println(vertexList);

		//System.out.println(eachLine.size());

		//System.out.println(vertexList.size());
		//System.out.println(vertexList.get(1));
		//System.out.println(vertexList.get(vertexList.size()-1));
		//System.out.println(edgeList.size());
		//System.out.println(edgeList.get(1));

		//System.out.println(edgeList.get(edgeList.size()-1));
	
		
		if (vertexList.size()!=edgeList.size())
			System.out.println("NOT EQUAL WAA");
		else
			System.out.println("EQUAL, SIZE OF BOTH IS "+edgeList.size());
	}

}
