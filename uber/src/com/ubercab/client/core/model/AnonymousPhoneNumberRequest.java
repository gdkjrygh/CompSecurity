// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_AnonymousPhoneNumberRequest

public abstract class AnonymousPhoneNumberRequest
    implements Parcelable
{

    public AnonymousPhoneNumberRequest()
    {
    }

    public static AnonymousPhoneNumberRequest create(String s, String s1, String s2, Double double1, Double double2)
    {
        return (new Shape_AnonymousPhoneNumberRequest()).setCityName(s).setLocale(s1).setUserType(s2).setLatitude(double1).setLongitude(double2);
    }

    public static AnonymousPhoneNumberRequest create(String s, String s1, String s2, String s3, Double double1, Double double2)
    {
        return (new Shape_AnonymousPhoneNumberRequest()).setCallerPhoneNumber(s).setCityName(s1).setLocale(s2).setUserType(s3).setLatitude(double1).setLongitude(double2);
    }

    public abstract String getCallerPhoneNumber();

    public abstract String getCityName();

    public abstract Double getLatitude();

    public abstract String getLocale();

    public abstract Double getLongitude();

    public abstract String getUserType();

    abstract AnonymousPhoneNumberRequest setCallerPhoneNumber(String s);

    abstract AnonymousPhoneNumberRequest setCityName(String s);

    abstract AnonymousPhoneNumberRequest setLatitude(Double double1);

    abstract AnonymousPhoneNumberRequest setLocale(String s);

    abstract AnonymousPhoneNumberRequest setLongitude(Double double1);

    abstract AnonymousPhoneNumberRequest setUserType(String s);
}
