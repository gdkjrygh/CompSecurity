// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.feed;


public interface LocalyticsModuleHandler
{

    public abstract void recordInFeed();

    public abstract void viewIsMoreThanHalfVisible();

    public abstract void viewIsNotVisible();
}
