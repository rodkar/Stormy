package com.cloudyun.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;

import com.cloudyun.stormy.R;
import com.cloudyun.stormy.adapters.DayAdapter;
import com.cloudyun.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

//        String[] daysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, daysOfTheWeek);
//        setListAdapter(adapter);

        DayAdapter adapter = new DayAdapter(this, mDays);
    }
}
