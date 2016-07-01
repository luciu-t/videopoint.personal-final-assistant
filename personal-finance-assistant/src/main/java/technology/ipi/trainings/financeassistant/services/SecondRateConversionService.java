package technology.ipi.trainings.financeassistant.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class SecondRateConversionService {
	
	private CurrencyRateProvider rateProvider;

	public void setRateProvider(CurrencyRateProvider rateProvider) {
		this.rateProvider = rateProvider;
	}
	
	public BigDecimal converAmount(BigDecimal amount,String currency){
		BigDecimal rate=rateProvider.getRate(currency,new Date());
		System.out.println("SecondRateConversionService: Obliczam kwotê");
		BigDecimal result=amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
		return result;
	}

}
