package logos.com.gradlelibrary;

import android.app.Activity;
import android.os.Bundle;

import logos.com.apiclientlibrary.PrintUtil;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrintUtil.printError("LibraryProject", 1);
    }
}
