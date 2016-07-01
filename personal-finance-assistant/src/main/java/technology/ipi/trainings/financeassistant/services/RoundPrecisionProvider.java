package technology.ipi.trainings.financeassistant.services;

public interface RoundPrecisionProvider {
	int getRoundPrecision(String currency);
	boolean isSupportted(String currency);
}
