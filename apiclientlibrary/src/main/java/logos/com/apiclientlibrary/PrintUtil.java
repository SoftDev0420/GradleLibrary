package logos.com.apiclientlibrary;

import android.util.Log;

public class PrintUtil {
    public void printError(String tag, int number) {
        Log.e(tag, number + "");
    }

    public void printError(String tag, Integer number) {
        Log.e(tag, number + "");
    }
}
