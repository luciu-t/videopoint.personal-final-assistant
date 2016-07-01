package technology.ipi.trainings.financeassistant.services;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class FileCurrencyRateProvider implements CurrencyRateProvider {
	
//	@Autowired
//	private Environment env;
	
	@Value("${filename:domyslny.xml}")
	private String fileName;

	public BigDecimal getRate(String currency, Date date) {
//		String fileName=env.getProperty("filename");
		System.out.println("Bean: "+hashCode());
		System.out.println("FileCurrencyRateProvider: Wczytano kursy z pliku lokalnego "+fileName);
		return BigDecimal.valueOf(4.25);
	}

}
