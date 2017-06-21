package com.jsyoon.badatepicker;

import android.databinding.BindingAdapter;
import android.widget.DatePicker;

public class AdapterDatePicker {
    @BindingAdapter({"android:year", "android:month", "android:day", "android:onDateChanged"})
    public static void setDate(DatePicker view, int year, int month, int day,
                               DatePicker.OnDateChangedListener listener) {
        view.init(year, month, day, listener);
    }

    @BindingAdapter(value = {"android:year", "android:day", "android:onDateChanged"},
            requireAll = false)
    public static void setYearDay(DatePicker view, int year, int day,
                                  DatePicker.OnDateChangedListener listener) {
        setDate(view, year, view.getMonth(), day, listener);
    }

    @BindingAdapter({"android:year", "android:month", "android:day"})
    public static void setDate(DatePicker view, int year, int month, int day) {
        view.updateDate(year, month, day);
    }
}
