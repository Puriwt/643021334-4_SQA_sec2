package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Income;

class IncomeTest {
	
	private Income income;
	Double result = -1.0;
	String MoreResult = "Unable to produce the required am";
	Double equipment;

	@BeforeEach
	@DisplayName("SID 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec 2")
	public void setup() {
		income = new Income();
		
	}
	
	@Test
	@DisplayName("TC001 : Impeller less Than Standart 500_500_800")
	public void ImlessThanStandart500_500_800() {
		income = new Income();
		equipment = income.calculateIncome(500,500,800);
		assertEquals(result,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC002 : Impeller less Than Standart 2700_200_800")
	public void MolessThanStandart2700_200_800() {
		income = new Income();
		equipment = income.calculateIncome(2700,200,800);
		assertEquals(result,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC003 : Impeller less Than Standart 2700_500_300")
	public void ColessThanStandart2700_500_300() {
		income = new Income();
		equipment = income.calculateIncome(2700,500,300);
		assertEquals(result,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC004 : Impeller less Than Standart 500_200_800")
	public void ImAndMolessThanStandart500_200_800() {
		income = new Income();
		equipment = income.calculateIncome(500,200,800);
		assertEquals(result,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC005 : Impeller less Than Standart 2700_200_300")
	public void MoAndColessThanStandart2700_200_300() {
		income = new Income();
		equipment = income.calculateIncome(2700,200,300);
		assertEquals(result,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC006 : Impeller less Than Standart 500_500_300")
	public void ImAndColessThanStandart500_500_300() {
		income = new Income();
		equipment = income.calculateIncome(500,500,300);
		assertEquals(result,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC007 : Impeller less Than Standart 500_200_300")
	public void AlllessThanStandart500_200_300() {
		income = new Income();
		equipment = income.calculateIncome(500,200,300);
		assertEquals(result,equipment);
	}
	//---------------------------------------------------------------------
	
	
	
	
	@Test
	@DisplayName("TC008 : Impeller More Than Standart 6000_500_800")
	public void ImMoreThanStandart6000_500_800() {
		income = new Income();
		equipment = income.calculateIncome(6000,500,800);
		assertEquals(MoreResult,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC009 : Impeller More Than Standart 2700_1500_800")
	public void MoMoreThanStandart2700_1500_800() {
		income = new Income();
		equipment = income.calculateIncome(2700,1500,800);
		assertEquals(MoreResult,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC010 : Impeller More Than Standart 2700_500_3500")
	public void CoMoreThanStandart2700_500_3500() {
		income = new Income();
		equipment = income.calculateIncome(2700,500,3500);
		assertEquals(MoreResult,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC011 : Impeller More Than Standart 6000_1500_800")
	public void ImAndMoMoreThanStandart6000_1500_800() {
		income = new Income();
		equipment = income.calculateIncome(6000,1500,800);
		assertEquals(MoreResult,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC012 : Impeller More Than Standart 2700_1500_3500")
	public void MoAndCoMoreThanStandart2700_1500_3500() {
		income = new Income();
		equipment = income.calculateIncome(2700,1500,3500);
		assertEquals(MoreResult,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC013 : Impeller More Than Standart 6000_500_3500")
	public void ImAndCoMoreThanStandart6000_500_3500() {
		income = new Income();
		equipment = income.calculateIncome(6000,500,3500);
		assertEquals(MoreResult,equipment);
	}
	//---------------------------------------------------------------------
	@Test
	@DisplayName("TC014 : Impeller More Than Standart 6000_1500_3500")
	public void AllMoreThanStandart6000_1500_3500() {
		income = new Income();
		equipment = income.calculateIncome(6000,1500,3500);
		assertEquals(MoreResult,equipment);
	}
	//---------------------------------------------------------------------

}
