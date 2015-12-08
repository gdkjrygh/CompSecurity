// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts.donotdisturb;

import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.time.TimeOfDay;
import java.util.concurrent.TimeUnit;

public class DoNotDisturbModel
{

    private boolean changed;
    protected final TimeOfDay defaultEndTime;
    protected final TimeOfDay defaultStartTime;
    protected final com.weather.util.prefs.TwcPrefs.Keys doNotDisturbEndTime;
    protected final com.weather.util.prefs.TwcPrefs.Keys doNotDisturbStartTime;
    protected final com.weather.util.prefs.TwcPrefs.Keys isDoNotDisturbEnable;
    protected final int sixAm = 6;
    protected final int tenPm = 22;
    protected final Prefs twcPrefs = TwcPrefs.getInstance();

    public DoNotDisturbModel()
    {
        isDoNotDisturbEnable = com.weather.util.prefs.TwcPrefs.Keys.IS_DO_NOT_DISTURB_ENABLED;
        doNotDisturbStartTime = com.weather.util.prefs.TwcPrefs.Keys.DO_NOT_DISTURB_START_TIME;
        doNotDisturbEndTime = com.weather.util.prefs.TwcPrefs.Keys.DO_NOT_DISTURB_END_TIME;
        defaultStartTime = TimeOfDay.valueOf(22, TimeUnit.HOURS);
        defaultEndTime = TimeOfDay.valueOf(6, TimeUnit.HOURS);
    }

    public TimeOfDay getEndTimeOfDay()
    {
        return twcPrefs.getTimeOfDay(doNotDisturbEndTime, defaultEndTime);
    }

    public TimeOfDay getStartTimeOfDay()
    {
        return twcPrefs.getTimeOfDay(doNotDisturbStartTime, defaultStartTime);
    }

    public boolean isChanged()
    {
        return changed;
    }

    public boolean isEnabled()
    {
        return twcPrefs.getBoolean(isDoNotDisturbEnable, false);
    }

    public void setEnabled(boolean flag)
    {
        twcPrefs.putBoolean(isDoNotDisturbEnable, flag);
        changed = true;
    }

    public void setEndTimeOfDay(TimeOfDay timeofday)
    {
        twcPrefs.putTimeOfDay(doNotDisturbEndTime, timeofday);
        changed = true;
    }

    public void setStartTimeOfDay(TimeOfDay timeofday)
    {
        twcPrefs.putTimeOfDay(doNotDisturbStartTime, timeofday);
        changed = true;
    }
}
