// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android.time;

import java.util.Calendar;

public class Clock
{

    private static Clock instance;
    protected Calendar calendarInstance;

    public Clock()
    {
    }

    private Calendar _calendarInstance()
    {
        if (calendarInstance != null)
        {
            return (Calendar)calendarInstance.clone();
        } else
        {
            return Calendar.getInstance();
        }
    }

    public static Calendar getCalendarInstance()
    {
        return getInstance()._calendarInstance();
    }

    protected static Clock getInstance()
    {
        if (instance == null)
        {
            instance = new Clock();
        }
        return instance;
    }
}
