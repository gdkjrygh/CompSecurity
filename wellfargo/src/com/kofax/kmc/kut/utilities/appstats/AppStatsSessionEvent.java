// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;


public class AppStatsSessionEvent
{

    private static final String a = "AppStatsSessionEvent";
    private String b;
    private String c;

    public AppStatsSessionEvent()
    {
        b = "";
        c = "";
    }

    public AppStatsSessionEvent(String s)
    {
        b = "";
        c = "";
        b = s;
    }

    public AppStatsSessionEvent(String s, String s1)
    {
        b = "";
        c = "";
        b = s;
        c = s1;
    }

    public String getResponse()
    {
        return c;
    }

    public String getType()
    {
        return b;
    }

    public void setResponse(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("setType: response parameter cannot be null");
        } else
        {
            c = s;
            return;
        }
    }

    public void setType(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("setType: sessionType parameter cannot be null");
        } else
        {
            b = s;
            return;
        }
    }
}
