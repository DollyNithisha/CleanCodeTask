package com.codebehind.CleanCode;

import java.util.*;
import java.io.*;
import java.lang.Math;
public class Simple_Compound_Interest {
	
    double principal_amount;
    double rate_of_interest;
    double time_in_years;
    BufferedWriter out;
    Scanner s;
	public void readData() throws IOException
	{
		    s=new Scanner(System.in);
		    out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out),"ASCII"),512);
			out.write("Enter principal amount : ");
			out.flush();
			principal_amount=s.nextDouble();
			out.write("Enter rate of interest per annum : ");
			out.flush();
			rate_of_interest=s.nextDouble();
			out.write("Enter time in years : ");
			out.flush();
			time_in_years=s.nextDouble();
	}
	
	public void calculateSimpleInterest() throws IOException
	{
		    double simple_interest=(principal_amount*time_in_years*rate_of_interest)/100;
		    out.write("Simple interest = "+simple_interest+"\n");
		    out.flush();
		    out.write("-----------------------------------------------------\n");
		    out.flush();
	}
	
	public void calculateCompoundInterest() throws IOException
	{
			out.write("Enter number of times interest applied per time period : ");
			out.flush();
			int no_of_times_interest_applied=s.nextInt();
			double final_amount=principal_amount*(Math.pow(1+rate_of_interest/(no_of_times_interest_applied*100),no_of_times_interest_applied*time_in_years));
			out.write("Compound interest = "+(final_amount-principal_amount)+"\n");
			out.flush();
			out.write("-----------------------------------------------------\n");
		    out.flush();
	}
	
}
