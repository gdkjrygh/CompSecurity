// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.ActionBar;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.common.base.Preconditions;
import com.weather.checkin.provider.CheckinHistoryRecord;
import com.weather.commons.facade.FormattedValue;
import com.weather.commons.facade.Temperature;
import com.weather.util.DataUnits;
import com.weather.util.UnitType;
import java.text.DateFormat;
import java.util.Locale;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinDisplayView, CheckinIcon, CheckinIconProvider, CheckinDisplayController

public class CheckinDisplayLayout extends LinearLayout
    implements CheckinDisplayView
{

    ActionBar actionBar;
    private TextView address;
    CheckinDisplayController controller;
    private TextView dateTime;
    private final DateFormat dateTimeFormatter;
    CheckinIconProvider iconProvider;
    private TextView temperature;
    private int titleResourceId;
    private ImageView weatherIcon;

    public CheckinDisplayLayout(Context context)
    {
        super(context);
        dateTimeFormatter = DateFormat.getDateTimeInstance(1, 3, Locale.getDefault());
        titleResourceId = 0x7f0700c2;
    }

    public CheckinDisplayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        dateTimeFormatter = DateFormat.getDateTimeInstance(1, 3, Locale.getDefault());
        titleResourceId = 0x7f0700c2;
    }

    public CheckinDisplayLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        dateTimeFormatter = DateFormat.getDateTimeInstance(1, 3, Locale.getDefault());
        titleResourceId = 0x7f0700c2;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        super.dispatchTouchEvent(motionevent);
        return true;
    }

    public void displayReport(CheckinHistoryRecord checkinhistoryrecord)
    {
        Preconditions.checkNotNull(checkinhistoryrecord);
        Object obj = new CheckinIcon(checkinhistoryrecord.getUserIconCode(), getContext());
        weatherIcon.setImageDrawable(iconProvider.getDrawable(getContext(), ((CheckinIcon) (obj)).getIconResourceId()));
        UnitType unittype = DataUnits.getCurrentUnitType();
        if (UnitType.ENGLISH == unittype)
        {
            obj = checkinhistoryrecord.getTemperatureFahrenheit();
        } else
        {
            obj = checkinhistoryrecord.getTemperatureCelsius();
        }
        obj = new Temperature(((Integer) (obj)), unittype);
        temperature.setText(((FormattedValue) (obj)).format());
        address.setText(checkinhistoryrecord.getLocationName());
        dateTime.setText(dateTimeFormatter.format(Long.valueOf(checkinhistoryrecord.getTimestamp())));
    }

    public void initialize()
    {
        if (actionBar != null)
        {
            actionBar.setTitle(titleResourceId);
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        weatherIcon = (ImageView)findViewById(0x7f0d00a2);
        temperature = (TextView)findViewById(0x7f0d00a3);
        address = (TextView)findViewById(0x7f0d00a4);
        dateTime = (TextView)findViewById(0x7f0d00a5);
        _cls1 _lcls1 = new _cls1();
        findViewById(0x7f0d00a6).setOnClickListener(_lcls1);
        findViewById(0x7f0d00a7).setOnClickListener(_lcls1);
    }

    public void showToast(String s)
    {
        Toast.makeText(getContext(), s, 0).show();
    }

    public void switchToHistoryDisplay()
    {
        findViewById(0x7f0d00a6).setVisibility(4);
        findViewById(0x7f0d00a7).setVisibility(4);
        ((TextView)findViewById(0x7f0d00a1)).setText(0x7f07009b);
        titleResourceId = 0x7f07009c;
    }

    /* member class not found */
    class _cls1 {}

}
