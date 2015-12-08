// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;


// Referenced classes of package com.weather.dal2.data:
//            WeatherAlertsRecord

public static interface 
{

    public abstract String getDescription();

    public abstract String getEndTimeISO();

    public abstract String getEventTrackingNumber();

    public abstract String getIssuingOfficeCode();

    public abstract String getPhenomenaCode();

    public abstract Integer getSeverity();

    public abstract String getSignificance();

    public abstract String getStartTimeISO();

    public abstract Integer getTwcInternalId();
}
