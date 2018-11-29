package com.android.calendar.year;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.calendar.CalendarController;
import com.github.ik024.calendar_lib.custom.YearView;
import com.github.ik024.calendar_lib.listeners.YearViewClickListeners;

import ws.xsoh.etar.R;

public class YearFragment extends Fragment implements CalendarController.EventHandler {
    YearView yearView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        yearView = (YearView) inflater.inflate(R.layout.year_layout, container).findViewById(R.id.calendar_year_view);

        yearView.registerYearViewClickListener(new YearViewClickListeners() {
            @Override
            public void dateClicked(int year, int month, int day) {
                System.out.println(year + " " + month + " " + day);
            }
        });

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public long getSupportedEventTypes() {
        return 0;
    }


//    @Override
//    public void onDestroyView() {
//        View view = yearView.findViewById(R.id.calendar_year_view);
//        view.setVisibility(View.GONE);
//        view.invalidate();
//        super.onDestroyView();
//    }

    @Override
    public void handleEvent(CalendarController.EventInfo event) {

    }

    @Override
    public void eventsChanged() {
        if (yearView != null) {
            //todo:
        }

    }


}
