// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_InboundCallBody

public abstract class InboundCallBody
{

    public InboundCallBody()
    {
    }

    public static InboundCallBody create()
    {
        return new Shape_InboundCallBody();
    }

    public abstract String getCallerPhoneNumber();

    public abstract String getCityName();

    public abstract Double getLatitude();

    public abstract String getLocale();

    public abstract Double getLongitude();

    public abstract String getUserType();

    public abstract InboundCallBody setCallerPhoneNumber(String s);

    public abstract InboundCallBody setCityName(String s);

    public abstract InboundCallBody setLatitude(Double double1);

    public abstract InboundCallBody setLocale(String s);

    public abstract InboundCallBody setLongitude(Double double1);

    public abstract InboundCallBody setUserType(String s);
}
