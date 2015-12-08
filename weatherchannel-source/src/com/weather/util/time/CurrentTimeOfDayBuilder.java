// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.time;

import java.util.Calendar;

// Referenced classes of package com.weather.util.time:
//            TimeOfDayBuilder, TimeOfDay

public class CurrentTimeOfDayBuilder
{

    public CurrentTimeOfDayBuilder()
    {
    }

    public TimeOfDay build()
    {
        Calendar calendar = Calendar.getInstance();
        TimeOfDayBuilder timeofdaybuilder = new TimeOfDayBuilder();
        timeofdaybuilder.setHours(calendar.get(11)).setMinutes(calendar.get(12)).setSeconds(calendar.get(13)).setMilliseconds(calendar.get(14));
        return timeofdaybuilder.build();
    }
}
