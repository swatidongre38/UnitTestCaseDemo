package com.example.org.unittestcasedemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
    @BindView(R.id.tvTimeStamp)
    TextView tvTimeStamp;

    @BindView(R.id.tvFormattedTime)
    TextView tvFomattedTime;
    private String date;
    private String formattedDate;
    private long timeStamp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getSystemTime();
        tvTimeStamp.setText(getString(R.string.tv_time_stamp_format) + date);
    }

    /**
     * Function used to get system time
     */
    private void getSystemTime() {
        Calendar cal = Calendar.getInstance();
        date = String.valueOf(cal.getTime());
        timeStamp = cal.getTimeInMillis();
    }

    @OnClick(R.id.btnConvertTime)
    public void convertTime(View view){
        formattedDate = DateTimeConverter.convertTime(timeStamp);
        tvFomattedTime.setText(getString(R.string.tv_formatted_time) + formattedDate);
    }
}
