package George_Rogava_v1.ge.edu.currency.service;

public interface CurrencyService {

    double convert(int amount);


    double convert(double amount);


    void setExchangeRate(double value);

}
