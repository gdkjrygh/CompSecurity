// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_AnonymousNumberBody

public abstract class AnonymousNumberBody
{

    public AnonymousNumberBody()
    {
    }

    public static AnonymousNumberBody create()
    {
        return new Shape_AnonymousNumberBody();
    }

    public abstract String getCallerPhoneNumber();

    public abstract String getCityName();

    public abstract Double getLatitude();

    public abstract String getLocale();

    public abstract Double getLongitude();

    public abstract String getUserType();

    public abstract AnonymousNumberBody setCallerPhoneNumber(String s);

    public abstract AnonymousNumberBody setCityName(String s);

    public abstract AnonymousNumberBody setLatitude(Double double1);

    public abstract AnonymousNumberBody setLocale(String s);

    public abstract AnonymousNumberBody setLongitude(Double double1);

    public abstract AnonymousNumberBody setUserType(String s);
}
