package technology.ipi.trainings.financeassistant.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import technology.ipi.trainings.financeassistant.dto.CurrencyRate;

public interface CurrencyRateDao {
	BigDecimal getRate(String currency, Date rateDate);
	CurrencyRate getRateInfo(String currency, Date rateDate);
	void addRate(CurrencyRate currencyRate);
	void addManyRates(List<CurrencyRate> currencyRates);
	public List<CurrencyRate> getAllRates();
}
