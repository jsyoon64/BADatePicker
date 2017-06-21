package com.jsyoon.badatepicker;

import android.databinding.ObservableInt;
import android.widget.DatePicker;
import java.util.Calendar;

public class modelPickedData {
    public final ObservableInt year = new ObservableInt();
    public final ObservableInt month = new ObservableInt();
    public final ObservableInt day = new ObservableInt();

    public modelPickedData() {
        Calendar calendar = Calendar.getInstance();
        year.set(calendar.get(Calendar.YEAR));
        month.set(calendar.get(Calendar.MONTH));
        day.set(calendar.get(Calendar.DAY_OF_MONTH));
    }

    public void dateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        this.year.set(year);
        this.month.set(monthOfYear);
        this.day.set(dayOfMonth);
    }
}
