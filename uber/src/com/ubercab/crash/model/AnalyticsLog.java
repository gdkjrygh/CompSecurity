// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.model;


// Referenced classes of package com.ubercab.crash.model:
//            Shape_AnalyticsLog

public abstract class AnalyticsLog
{

    public AnalyticsLog()
    {
    }

    public static AnalyticsLog create(long l, String s, String s1, Double double1, Double double2, String s2)
    {
        return (new Shape_AnalyticsLog()).setTime(l).setType(s).setName(s1).setLat(double1).setLng(double2).setValue(s2);
    }

    public abstract Double getLat();

    public abstract Double getLng();

    public abstract String getName();

    public abstract long getTime();

    public abstract String getType();

    public abstract String getValue();

    abstract AnalyticsLog setLat(Double double1);

    abstract AnalyticsLog setLng(Double double1);

    abstract AnalyticsLog setName(String s);

    abstract AnalyticsLog setTime(long l);

    abstract AnalyticsLog setType(String s);

    abstract AnalyticsLog setValue(String s);
}
