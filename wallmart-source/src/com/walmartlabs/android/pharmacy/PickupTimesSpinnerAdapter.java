// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.widget.ArrayAdapter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.lang3.time.DateUtils;

public class PickupTimesSpinnerAdapter extends ArrayAdapter
{
    public class PickupItem
    {

        String mDate;
        String mDateFormatted;
        String mTime;
        final PickupTimesSpinnerAdapter this$0;

        public String getDate()
        {
            return mDateFormatted;
        }

        public String getTime()
        {
            return mTime;
        }

        public String toString()
        {
            return getDateTimeString(mDateFormatted, mTime);
        }

        public PickupItem(String s, String s1, String s2)
        {
            this$0 = PickupTimesSpinnerAdapter.this;
            super();
            mDate = s;
            mDateFormatted = s1;
            mTime = s2;
        }
    }


    private static final String TAG = com/walmartlabs/android/pharmacy/PickupTimesSpinnerAdapter.getSimpleName();
    private static final DateFormat sDateFormat;
    private static final SimpleDateFormat sDayOfWeekFormat;
    private static final SimpleDateFormat sFormattedDate;
    private static final SimpleDateFormat sHourOfDayFormat;
    private static final SimpleDateFormat sTimeOfDayFormat;
    private Activity mActivity;

    public PickupTimesSpinnerAdapter(Activity activity)
    {
        super(activity, R.layout.pharmacy_pickup_date_spinner);
        setDropDownViewResource(0x1090009);
        mActivity = activity;
    }

    private String getDateString(Date date)
    {
        return sFormattedDate.format(date);
    }

    private String getDateTimeString(String s, String s1)
    {
        String s2;
        Object obj;
        s2 = null;
        obj = null;
        s = sDateFormat.parse(s);
        s2 = s;
        try
        {
            s1 = sTimeOfDayFormat.parse(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            s = s2;
            s1 = obj;
        }
        if (s != null && s1 != null)
        {
            s2 = getDayOfWeekString(s);
            s = getDateString(s);
            s1 = getTimeOfDayString(s1);
            return mActivity.getString(R.string.pharmacy_pickup_time_spinner_date_time_formatter, new Object[] {
                s2, s, s1
            });
        } else
        {
            return "";
        }
    }

    private String getDayOfWeekString(Date date)
    {
        Date date1 = new Date();
        if (DateUtils.isSameDay(date1, date))
        {
            return mActivity.getString(R.string.pharmacy_today);
        }
        if (DateUtils.isSameDay(DateUtils.addDays(date1, 1), date))
        {
            return mActivity.getString(R.string.pharmacy_tomorrow);
        } else
        {
            return sDayOfWeekFormat.format(date);
        }
    }

    private String getTimeOfDayString(Date date)
    {
        if (hasMinutes(date))
        {
            return sTimeOfDayFormat.format(date);
        } else
        {
            return sHourOfDayFormat.format(date);
        }
    }

    private boolean hasMinutes(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(12) > 0;
    }

    public void setItems(com.walmartlabs.android.pharmacy.service.PickupTime.Day aday[])
    {
        clear();
        if (aday != null)
        {
            int k = aday.length;
            for (int i = 0; i < k; i++)
            {
                com.walmartlabs.android.pharmacy.service.PickupTime.Day day = aday[i];
                String s = day.date;
                String s1 = day.dateFormatted;
                if (day.timeList == null)
                {
                    continue;
                }
                String as[] = day.timeList;
                int l = as.length;
                for (int j = 0; j < l; j++)
                {
                    add(new PickupItem(s, s1, as[j]));
                }

            }

        }
        notifyDataSetChanged();
    }

    static 
    {
        sDateFormat = new SimpleDateFormat("MMddyyyy", Locale.US);
        sFormattedDate = new SimpleDateFormat("MMM dd", Locale.US);
        sDayOfWeekFormat = new SimpleDateFormat("EEEE", Locale.US);
        sTimeOfDayFormat = new SimpleDateFormat("h:mm a", Locale.US);
        sHourOfDayFormat = new SimpleDateFormat("h a", Locale.US);
    }

}
