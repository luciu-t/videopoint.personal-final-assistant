package technology.ipi.trainings.financeassistant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import technology.ipi.trainings.financeassistant.dao.CurrencyRateDao;
import technology.ipi.trainings.financeassistant.dto.CurrencyRate;

@Service
public class RateUpdateService {
	
	@Autowired
	CurrencyRateDao currencyRateDao;
	
	public void storeRate(CurrencyRate currencyRate){
		currencyRateDao.addRate(currencyRate);
	}
	
	public void storeManyRates(List<CurrencyRate> currencyRates){
		currencyRateDao.addManyRates(currencyRates);
	}
	
	public List<CurrencyRate> getAllRates(){
		return currencyRateDao.getAllRates();
	}
	
	
}
