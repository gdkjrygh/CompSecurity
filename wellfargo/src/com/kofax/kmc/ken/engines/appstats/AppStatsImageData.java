// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;


public class AppStatsImageData
{

    String a;
    int b;
    long c;
    String d;
    private long e;

    public AppStatsImageData()
    {
    }

    public long getCreation()
    {
        return e;
    }

    public String getDocumentID()
    {
        return d;
    }

    public long getFileSize()
    {
        return c;
    }

    public String getImageID()
    {
        return a;
    }

    public int getSource()
    {
        return b;
    }

    public void setCreationTime(long l)
    {
        e = l;
    }

    public void setDocumentID(String s)
    {
        d = s;
    }

    public void setFileSize(int i)
    {
        c = i;
    }

    public void setImageID(String s)
    {
        a = s;
    }

    public void setSource(int i)
    {
        b = i;
    }
}
