package George_Rogava_v1.ge.edu.currency.service.impl;

import George_Rogava_v1.ge.edu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {

    double exchangeRate;

    @Override
    public double convert(int amount) {

        return (amount / exchangeRate);
    }

    @Override
    public double convert(double amount) {

        return (amount / exchangeRate);

    }

    @Override
    public void setExchangeRate(double value) {
        exchangeRate = value;
    }
}

