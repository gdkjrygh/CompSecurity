// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui.widgets;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import com.weather.commons.ui.widgets.listeners.OnTimeOfDayChangedListener;
import com.weather.dal2.data.TimeParseUtil;
import com.weather.util.time.CurrentTimeOfDayBuilder;
import com.weather.util.time.TimeOfDay;
import com.weather.util.time.TimeOfDayBuilder;

public class TimeOfDaySelector extends LinearLayout
    implements android.view.View.OnClickListener, android.app.TimePickerDialog.OnTimeSetListener
{

    private AttributeSet attributeSet;
    private final Context context;
    protected CurrentTimeOfDayBuilder currentTimeOfDayBuilder;
    private OnTimeOfDayChangedListener onTimeOfDayChangedListener;
    private TimeOfDay timeOfDay;
    private TextView titleTextView;
    private TextView valueTextView;

    public TimeOfDaySelector(Context context1)
    {
        super(context1);
        currentTimeOfDayBuilder = new CurrentTimeOfDayBuilder();
        timeOfDay = currentTimeOfDayBuilder.build();
        context = context1;
        init();
    }

    public TimeOfDaySelector(Context context1, AttributeSet attributeset)
    {
        super(context1, attributeset);
        currentTimeOfDayBuilder = new CurrentTimeOfDayBuilder();
        timeOfDay = currentTimeOfDayBuilder.build();
        attributeSet = attributeset;
        context = context1;
        init();
    }

    private TimeOfDay buildTimeOfTheDay(int i, int j)
    {
        TimeOfDayBuilder timeofdaybuilder = new TimeOfDayBuilder();
        timeofdaybuilder.setHours(i).setMinutes(j);
        return timeofdaybuilder.build();
    }

    private void buildTimePickerDialog()
    {
        int i = timeOfDay.getHours();
        int j = timeOfDay.getMinutes();
        boolean flag = DateFormat.is24HourFormat(context);
        (new TimePickerDialog(context, this, i, j, flag)).show();
    }

    private void findViews()
    {
        titleTextView = (TextView)findViewById(com.weather.commons.R.id.title_text_view);
        valueTextView = (TextView)findViewById(com.weather.commons.R.id.value_text_view);
    }

    private void inflateView()
    {
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(com.weather.commons.R.layout.time_of_day_selector, this, true);
    }

    private void init()
    {
        inflateView();
        setEventListeners();
        findViews();
        processCustomAttributes();
        initState();
    }

    private void initState()
    {
        setOrientation(1);
        setClickable(true);
        setBackgroundResource(com.weather.commons.R.drawable.location_manager_list_selector);
    }

    private void processCustomAttributes()
    {
        TypedArray typedarray;
        if (attributeSet != null)
        {
            if ((typedarray = context.obtainStyledAttributes(attributeSet, com.weather.commons.R.styleable.widget)) != null)
            {
                setTitle(typedarray.getString(com.weather.commons.R.styleable.widget_title_widget));
                typedarray.recycle();
                return;
            }
        }
    }

    private void setEventListeners()
    {
        setOnClickListener(this);
    }

    private void updateValueLabel(TimeOfDay timeofday)
    {
        timeofday = TimeParseUtil.convertTimeTwelveOrTwentyFourHourFormat(timeofday, context);
        valueTextView.setText(timeofday);
    }

    public TimeOfDay getTimeOfDay()
    {
        return timeOfDay;
    }

    public CharSequence getTitle()
    {
        return titleTextView.getText();
    }

    public void onClick(View view)
    {
        buildTimePickerDialog();
    }

    public void onTimeSet(TimePicker timepicker, int i, int j)
    {
        timepicker = buildTimeOfTheDay(i, j);
        setTimeOfDay(timepicker);
        if (onTimeOfDayChangedListener != null)
        {
            onTimeOfDayChangedListener.onTimeOfDayChanged(this, timepicker);
        }
    }

    public void setOnTimeOfDayChangedListener(OnTimeOfDayChangedListener ontimeofdaychangedlistener)
    {
        onTimeOfDayChangedListener = ontimeofdaychangedlistener;
    }

    public void setTimeOfDay(TimeOfDay timeofday)
    {
        updateValueLabel(timeofday);
        timeOfDay = timeofday;
    }

    public void setTitle(CharSequence charsequence)
    {
        titleTextView.setText(charsequence);
    }
}
