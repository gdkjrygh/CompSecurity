// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;

import gju;

public class TimeWindow
    implements Comparable
{

    public static final TimeWindow TIME_WINDOW_ALWAYS_OPEN = new TimeWindow(Long.valueOf(0L), Long.valueOf(0L));
    gju mClock;
    private long mEpochTimeClose;
    private long mEpochTimeOpen;

    public TimeWindow(Long long1, Long long2)
    {
        long l1 = 0L;
        super();
        mClock = new gju();
        long l;
        if (long1 != null)
        {
            l = long1.longValue() * 1000L;
        } else
        {
            l = 0L;
        }
        mEpochTimeOpen = l;
        l = l1;
        if (long2 != null)
        {
            l = long2.longValue() * 1000L;
        }
        mEpochTimeClose = l;
    }

    public int compareTo(TimeWindow timewindow)
    {
        long l = mEpochTimeOpen - timewindow.getEpochTimeOpen();
        if (l < 0L)
        {
            return -1;
        }
        return l != 0L ? 1 : 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((TimeWindow)obj);
    }

    public boolean containsTime(long l)
    {
        return mEpochTimeOpen <= l && l <= mEpochTimeClose;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TimeWindow)obj;
            if (mEpochTimeClose != ((TimeWindow) (obj)).mEpochTimeClose)
            {
                return false;
            }
            if (mEpochTimeOpen != ((TimeWindow) (obj)).mEpochTimeOpen)
            {
                return false;
            }
        }
        return true;
    }

    public long getEpochTimeClose()
    {
        return mEpochTimeClose;
    }

    public long getEpochTimeOpen()
    {
        return mEpochTimeOpen;
    }

    public int hashCode()
    {
        return (int)(mEpochTimeClose ^ mEpochTimeClose >>> 32) * 31 + (int)(mEpochTimeOpen ^ mEpochTimeOpen >>> 32);
    }

    public boolean isOpen()
    {
        if (mEpochTimeOpen == 0L && mEpochTimeClose == 0L)
        {
            return true;
        } else
        {
            return containsTime(gju.a());
        }
    }

    public boolean isOpenAfterTime(long l)
    {
        return l < mEpochTimeOpen;
    }

}
