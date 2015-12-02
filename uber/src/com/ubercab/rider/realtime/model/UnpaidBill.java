// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;


public interface UnpaidBill
{

    public abstract String getAmount();

    public abstract String getAmountString();

    public abstract String getCreatedAt();

    public abstract String getUuid();
}
