// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.analytics;


public interface GoogleAnalyticsEvent
{

    public abstract String getAction();

    public abstract String getCategory();

    public abstract String getLabel();

    public abstract int getValue();
}
