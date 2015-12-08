// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.analytics;


public class AnalyticsEvent
{

    public String action;
    public String category;
    public String label;
    public int value;

    public AnalyticsEvent(String s, String s1)
    {
        this(s, s1, "");
    }

    public AnalyticsEvent(String s, String s1, String s2)
    {
        this(s, s1, s2, 0);
    }

    public AnalyticsEvent(String s, String s1, String s2, int i)
    {
        category = s;
        action = s1;
        label = s2;
        value = i;
    }
}
