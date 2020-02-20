package com.codebehind.CleanCode;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Simple_Compound_Interest interest = new Simple_Compound_Interest();
		interest.readData();
		interest.calculateSimpleInterest();
		interest.calculateCompoundInterest();
		HouseConstructionCost cost = new HouseConstructionCost();
		cost.readData();
		cost.calculateHouseConstructionCost();
	}

}
