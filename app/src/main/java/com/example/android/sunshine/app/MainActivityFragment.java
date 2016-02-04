package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        String[] forecastArray={
                "LOL",
                "NOT SUNN",
                "DSDD",
                "fsfssf",
                "FSFSFFS",
                "fsfsfs",
                "FDDFS",
                "LOL",
                "NOT SUNN",
                "DSDD",
                "fsfssf",
                "FSFSFFS",
                "fsfsfs",
                "FDDFS"
        };
        ArrayList<String> weekForecast = new ArrayList<String> (Arrays.asList(forecastArray));
        View rootView=inflater.inflate(R.layout.fragment_main, container, false);
        ArrayAdapter<String> mForecastAdapter=new ArrayAdapter<>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast);
        ListView weatherList=(ListView)rootView.findViewById(R.id.listView_forecast);
        weatherList.setAdapter(mForecastAdapter);
        return rootView;
    }
}
