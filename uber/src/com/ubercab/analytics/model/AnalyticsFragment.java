// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.analytics.model;


// Referenced classes of package com.ubercab.analytics.model:
//            Shape_AnalyticsFragment

public abstract class AnalyticsFragment
{

    public AnalyticsFragment()
    {
    }

    public static AnalyticsFragment create(String s, long l)
    {
        return (new Shape_AnalyticsFragment()).setFormattedName(s).setCounterValue(l);
    }

    public abstract long getCounterValue();

    public abstract String getFormattedName();

    abstract AnalyticsFragment setCounterValue(long l);

    abstract AnalyticsFragment setFormattedName(String s);

    public String toString()
    {
        return (new StringBuilder()).append(getFormattedName()).append(":").append(getCounterValue()).toString();
    }
}
