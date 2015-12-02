// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response.referrals;


public abstract class Invitee
{

    public Invitee()
    {
    }

    public abstract String getCityName();

    public abstract Integer getCountryId();

    public abstract String getEmail();

    public abstract String getFirstName();

    public abstract Integer getLanguageId();

    public abstract String getLastName();

    public abstract String getMobile();

    abstract void setCityName(String s);

    abstract void setCountryId(Integer integer);

    abstract void setEmail(String s);

    abstract void setFirstName(String s);

    abstract void setLanguageId(Integer integer);

    abstract void setLastName(String s);

    abstract void setMobile(String s);
}
