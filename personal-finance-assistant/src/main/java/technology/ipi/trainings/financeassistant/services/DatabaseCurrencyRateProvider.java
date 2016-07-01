package technology.ipi.trainings.financeassistant.services;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import technology.ipi.trainings.financeassistant.dao.CurrencyRateDao;
import technology.ipi.trainings.financeassistant.dto.CurrencyRate;

public class DatabaseCurrencyRateProvider implements CurrencyRateProvider {
	
	@Autowired
	private CurrencyRateDao currencyRateDao;

	public BigDecimal getRate(String currency, Date date) {
		BigDecimal rate=currencyRateDao.getRate(currency, date);
		
		CurrencyRate currencyRate=currencyRateDao.getRateInfo(currency, date);
		System.out.println("currencyRate: "+currencyRate);
		System.out.println("DatabaseCurrencyRateProvider: Wczytano kursy z bazy danych, kurs = "+rate);
		return rate;
	}
	
}
