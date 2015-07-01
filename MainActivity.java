package com.example.benjaminpatch.timer;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Set;


/**
 * The main class activity. Directs the user to the
 * many different places he can go
 */
public class MainActivity extends ActionBarActivity {

    TextView countNum;
    SharedPreferences savedCountData;
    String filename = "someFunFreekyFlyingFile";
    Set<String> userNames;
    Set<String> bookNames;
    Set<Integer> bookLengths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countNum = (TextView) findViewById(R.id.outputCount);
        savedCountData = getPreferences(MODE_PRIVATE);
//        loadCount();
//        if(loadedData.equals("Failure in Loading")){
//            loadedData = "0";
//        }
//            setCount(loadedData);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * sets the value in the textview box on the main page of the app
     * @param newCount the new value to be displayed
     */
    private void setCount(String newCount){
        countNum.setText(newCount);
    }

    /**
     * increase the number to be displayed in the textview
     * on the app page and set the textview to this new number.
     * @param v the View object
     */
    public void advanceCount(View v){
        String temp = (String) countNum.getText();
        Integer newNumber = Integer.valueOf(temp);
        newNumber += 1;
        temp = Integer.toString(newNumber);
        countNum.setText(temp);
    }

    /**
     * not working currently.
     * Will save the list of users and their information to the phone
     * @param v the View object
     */
    public void saveCount(View v){
//        SharedPreferences.Editor prefsEditor = savedCountData.edit();
//        Gson gson = new Gson();
//        SharedPreferences.Editor editStuff = savedCountData.edit();
//        editStuff.putStringSet("userNames", userNames);
//        editStuff.putStringSet("bookNames", bookNames);
//
//        editStuff.commit();
    }

//    public String loadCount(){
//        savedCountData = getSharedPreferences(filename, 0);
////        ArrayList<User> returnedDataMumboJumbo = savedCountData.getString("savedDataStuff", "Failure in Loading");
////        return returnedDataMumboJumbo;
//    }
}
