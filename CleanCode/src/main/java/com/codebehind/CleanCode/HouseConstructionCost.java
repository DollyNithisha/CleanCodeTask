package com.codebehind.CleanCode;

import java.util.*;
import java.io.*;
public class HouseConstructionCost {

	BufferedWriter out;
    Scanner s;
    int material_standard;
    double total_area_of_the_house;
    boolean fully_automated;
    public void readData() throws IOException
    {
    	s=new Scanner(System.in);
	    out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out),"ASCII"),512);
        out.write("Enter material standard:\n1.Standard material\n2.Above standard material\n3.High standard material\n");
        out.flush();
        material_standard=s.nextInt();
        out.write("Enter total area of the house : ");
        out.flush();
        total_area_of_the_house=s.nextDouble();
        out.write("Enter True/False for fully automated home : ");
        out.flush();
        fully_automated=s.nextBoolean();
    }
    public void calculateHouseConstructionCost() throws IOException
    {
    	double total_cost = 0;
    	switch(material_standard) {
    	case 1 : total_cost=1200*total_area_of_the_house;
    	         break;
    	case 2 : total_cost=1500*total_area_of_the_house;
                 break;     
    	case 3 : if(fully_automated)  
    		         total_cost=2500*total_area_of_the_house;
    	         else
    	        	 total_cost=1800*total_area_of_the_house;
    	         break;
    	default: out.write("Enter valid input");
    	out.flush();
    	        	 
    	}
    	out.write("Total construction cost of the house is Rs."+total_cost);
    	out.flush();
    }
}
