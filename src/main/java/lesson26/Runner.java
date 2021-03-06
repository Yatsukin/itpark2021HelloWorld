package lesson26;

import lesson26.config.SpringConfig;
import lesson26.dto.CurrencyCache;
import lesson26.service.cache.CacheProvider;
import lesson26.service.cbr.CbrInfoProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.text.ParseException;

public class Runner {
    public static void main(String[] args) throws ParseException, IOException, IllegalAccessException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        CbrInfoProvider service = context.getBean(CbrInfoProvider.class);
        CacheProvider cacheProvider = context.getBean(CacheProvider.class);
        CurrencyCache currencyCache = cacheProvider.getCurrencyCache(service.getCbrDailyInfo());
        System.out.println(currencyCache.printСurrencyInfo("USD"));
        System.out.println(currencyCache.printСurrencyInfo("GbP"));
        System.out.println(currencyCache.printСurrencyInfo("eur"));
        System.out.println(currencyCache.printСurrencyInfo("UAH"));
        System.out.println(currencyCache.printСurrencyInfo("BYN"));
    }
}
