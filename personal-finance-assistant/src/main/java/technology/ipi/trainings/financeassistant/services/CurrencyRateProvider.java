package technology.ipi.trainings.financeassistant.services;

import java.math.BigDecimal;
import java.util.Date;

public interface CurrencyRateProvider {

	BigDecimal getRate(String currency, Date date);

}