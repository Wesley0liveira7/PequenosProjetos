package cotacaoDolar;

public class CurrencyConverter {

	public static double dollarConverter;
	
	public static double converter (double dolar, double qttDolar) {
		return qttDolar * dolar + ((qttDolar * dolar) * 6 / 100);
	}
}
