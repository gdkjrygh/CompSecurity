// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response.referrals;


public abstract class ReengagementCopy
{

    public ReengagementCopy()
    {
    }

    public abstract String getEmailBody();

    public abstract String getEmailSubject();

    public abstract String getMessageBody();

    public abstract String getSummaryCopy();

    abstract void setEmailBody(String s);

    abstract void setEmailSubject(String s);

    abstract void setMessageBody(String s);

    abstract void setSummaryCopy(String s);
}
