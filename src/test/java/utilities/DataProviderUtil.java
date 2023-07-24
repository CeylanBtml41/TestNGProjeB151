package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
    @DataProvider
    public static Object[][] sehirVerileri() {
        return new Object[][]{{"ankara","icanadolu","06"},
                {"kocaeli","marmara","41"},
                {"diyarbakır","doğu","21"}};
    }


}
