package technology.ipi.trainings.financeassistant;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ResourceBundleMessageSource;

import technology.ipi.trainings.financeassistant.services.CurrencyRateProvider;
import technology.ipi.trainings.financeassistant.services.DatabaseCurrencyRateProvider;
import technology.ipi.trainings.financeassistant.services.FileCurrencyRateProvider;
import technology.ipi.trainings.financeassistant.services.FixedPrecisionProvider;
import technology.ipi.trainings.financeassistant.services.JpyPrecisionProvider;
import technology.ipi.trainings.financeassistant.services.RateConversionService;
import technology.ipi.trainings.financeassistant.services.RoundPrecisionProvider;

@Configuration
@PropertySource(value="classpath:app.properties", ignoreResourceNotFound=true)
@Import(DatabaseConfig.class)
/*@ComponentScan(basePackages={"technology.ipi.trainings.financeassistant.services"}, 
excludeFilters={
	@Filter(type=FilterType.ASSIGNABLE_TYPE, classes=CurrencyRateProvider.class),
	@Filter(type=FilterType.REGEX, pattern=".*Service")	
})*/
public class AppConfig {
	
	@Bean
	public ResourceBundleMessageSource messageSource(){
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("i18n/messages");
		return source;
	}

	
	@Bean
	@Profile({"dev","test"})
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public CurrencyRateProvider fileCurrencyRateProvider(){
		return new FileCurrencyRateProvider();
	}
	
	@Bean
//	@Primary
	@Profile("prod")
	public CurrencyRateProvider databaseCurrencyRateProvider(){
		return new DatabaseCurrencyRateProvider();
	}
	
	@Bean
	public RateConversionService rateConversionService(){
		RateConversionService rateConversionService = new RateConversionService();
		return rateConversionService;
	}
	
	@Bean
	public RoundPrecisionProvider roundPrecisionProvider(){
		return new FixedPrecisionProvider();
	}
	@Bean(name={"anotherPrecisionProvider","secondPrecisionProvider"})
	public RoundPrecisionProvider roundJpyPrecisionProvider(){
		return new JpyPrecisionProvider();
	}
	
}
