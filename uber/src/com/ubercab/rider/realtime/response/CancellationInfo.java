// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import java.util.List;

public abstract class CancellationInfo
{

    public CancellationInfo()
    {
    }

    public abstract String getAcceptButtonTitle();

    public abstract String getAnalyticMetrics();

    public abstract String getCancelButtonTitle();

    public abstract boolean getChargeFee();

    public abstract List getMessages();

    public abstract String getTitle();

    abstract CancellationInfo setAcceptButtonTitle(String s);

    abstract CancellationInfo setAnalyticMetrics(String s);

    abstract CancellationInfo setCancelButtonTitle(String s);

    abstract CancellationInfo setChargeFee(boolean flag);

    abstract CancellationInfo setMessages(List list);

    abstract CancellationInfo setTitle(String s);
}
