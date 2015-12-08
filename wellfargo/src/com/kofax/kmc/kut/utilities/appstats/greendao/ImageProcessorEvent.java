// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;


public class ImageProcessorEvent
{

    private String a;
    private String b;
    private Long c;
    private Long d;
    private Integer e;
    private String f;
    private String g;
    private String h;
    private String i;

    public ImageProcessorEvent()
    {
    }

    public ImageProcessorEvent(String s)
    {
        a = s;
    }

    public ImageProcessorEvent(String s, String s1, Long long1, Long long2, Integer integer, String s2, String s3, 
            String s4, String s5)
    {
        a = s;
        b = s1;
        c = long1;
        d = long2;
        e = integer;
        f = s2;
        g = s3;
        h = s4;
        i = s5;
    }

    public String getID()
    {
        return a;
    }

    public String getInstanceID()
    {
        return b;
    }

    public String getProcessedImageID()
    {
        return h;
    }

    public String getProcessingProfile()
    {
        return f;
    }

    public Integer getResultCode()
    {
        return e;
    }

    public String getSessionKey()
    {
        return i;
    }

    public String getSourceImageID()
    {
        return g;
    }

    public Long getStartTime()
    {
        return c;
    }

    public Long getStopTime()
    {
        return d;
    }

    public void setID(String s)
    {
        a = s;
    }

    public void setInstanceID(String s)
    {
        b = s;
    }

    public void setProcessedImageID(String s)
    {
        h = s;
    }

    public void setProcessingProfile(String s)
    {
        f = s;
    }

    public void setResultCode(Integer integer)
    {
        e = integer;
    }

    public void setSessionKey(String s)
    {
        i = s;
    }

    public void setSourceImageID(String s)
    {
        g = s;
    }

    public void setStartTime(Long long1)
    {
        c = long1;
    }

    public void setStopTime(Long long1)
    {
        d = long1;
    }
}
