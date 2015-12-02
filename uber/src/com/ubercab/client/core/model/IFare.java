// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


interface IFare
{

    public abstract String getBase();

    public abstract String getDistanceUnit();

    public abstract String getMinimum();

    public abstract String getPerDistanceUnit();

    public abstract String getPerMinute();
}
