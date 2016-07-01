package technology.ipi.trainings.financeassistant.services;

import org.springframework.stereotype.Service;

@Service
public class JpyPrecisionProvider implements RoundPrecisionProvider {

	public int getRoundPrecision(String currency) {
		return 0;
	}

	public boolean isSupportted(String currency) {
		return "JPY".equals(currency);
	}

}
