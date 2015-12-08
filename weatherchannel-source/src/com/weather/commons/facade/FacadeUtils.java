// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import java.util.concurrent.TimeUnit;

public final class FacadeUtils
{

    public static final long ONE_DAY_MS;
    public static final float SUN_IS_DOWN = 1F;
    public static final float SUN_IS_UP = 0F;

    private FacadeUtils()
    {
    }

    public static float howMuchDayGone(Long long1, Long long2)
    {
        return howMuchDayGone(long1, long2, System.currentTimeMillis());
    }

    public static float howMuchDayGone(Long long1, Long long2, long l)
    {
        if (long1 == null || long2 == null)
        {
            return 0.0F;
        }
        if (long1.longValue() < long2.longValue())
        {
            if (l < long1.longValue())
            {
                return 1.0F;
            }
            if (l >= long2.longValue())
            {
                return 1.0F;
            } else
            {
                return Math.max(0.0F, Math.min(1.0F, (float)((double)(l - long1.longValue()) / (double)(long2.longValue() - long1.longValue()))));
            }
        }
        if (long1.longValue() > long2.longValue())
        {
            long l1 = long1.longValue();
            long l2 = long2.longValue();
            l1 = ONE_DAY_MS - (l1 - l2);
            if (l >= long1.longValue())
            {
                l -= long1.longValue();
            } else
            if (l < long2.longValue())
            {
                l = l1 - long2.longValue() - l;
            } else
            {
                return 1.0F;
            }
            return Math.max(0.0F, Math.min(1.0F, (float)((double)l / (double)l1)));
        } else
        {
            return 0.0F;
        }
    }

    public static boolean isDay(Long long1, Long long2)
    {
        return isDay(long1, long2, System.currentTimeMillis());
    }

    public static boolean isDay(Long long1, Long long2, long l)
    {
        boolean flag = false;
        if (long1 != null && long2 != null)
        {
            if (long1.longValue() < long2.longValue())
            {
                if (l < long1.longValue() || l >= long2.longValue())
                {
                    return false;
                }
            } else
            {
                if (l >= long1.longValue() || l < long2.longValue())
                {
                    flag = true;
                }
                return flag;
            }
        }
        return true;
    }

    public static boolean isNight(Long long1, Long long2)
    {
        return isNight(long1, long2, System.currentTimeMillis());
    }

    public static boolean isNight(Long long1, Long long2, long l)
    {
        boolean flag = false;
        if (long1 != null && long2 != null)
        {
            if (long1.longValue() < long2.longValue())
            {
                if (l < long1.longValue() || l >= long2.longValue())
                {
                    flag = true;
                }
                return flag;
            }
            if (l >= long1.longValue() || l < long2.longValue())
            {
                return false;
            }
        }
        return true;
    }

    static 
    {
        ONE_DAY_MS = TimeUnit.DAYS.toMillis(1L);
    }
}
