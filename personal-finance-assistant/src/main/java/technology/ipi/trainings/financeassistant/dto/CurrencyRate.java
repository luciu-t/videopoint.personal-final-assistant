package technology.ipi.trainings.financeassistant.dto;

import java.math.BigDecimal;
import java.util.Date;

public class CurrencyRate {
	private String currency;
	private Date rateDate;
	private BigDecimal rate;

	public String getCurrency() {
		return currency;
	}

	@Override
	public String toString() {
		return "CurrencyRate [currency=" + currency + ", rateDate=" + rateDate + ", rate=" + rate + "]";
	}

	public CurrencyRate(String currency, Date rateDate, BigDecimal rate) {
		super();
		this.currency = currency;
		this.rateDate = rateDate;
		this.rate = rate;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getRateDate() {
		return rateDate;
	}

	public void setRateDate(Date rateDate) {
		this.rateDate = rateDate;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

}
