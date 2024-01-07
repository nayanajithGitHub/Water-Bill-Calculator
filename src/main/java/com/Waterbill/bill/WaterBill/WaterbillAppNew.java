package com.Waterbill.bill.WaterBill;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaterbillAppNew {
	
	@GetMapping("/bill/{value}")
	public int billCalculator(@PathVariable("value")int BillValue) {
		
		Integer TotValue=0;
		
		
		if(BillValue>0 && BillValue<=50) {
			 TotValue=BillValue*10;
		}else if(BillValue >50 && BillValue<=100) {
			 TotValue=(50*10)+((BillValue-50)*20);
		}else if(BillValue >100 && BillValue<=200) {
			 TotValue=(50*10)+(50*20)+((BillValue-100)*50);
		}else if(BillValue >200) {
			 TotValue=(50*10)+(50*20)+(100*50)+((BillValue-200)*100);
		}
		
		return TotValue; 
		} 
	

}
