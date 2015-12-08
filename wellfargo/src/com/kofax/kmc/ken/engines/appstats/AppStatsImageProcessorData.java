// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;


public class AppStatsImageProcessorData
{

    int a;
    String b;
    String c;
    int d;
    String e;
    int f;
    private String g;
    private String h;
    private String i;

    public AppStatsImageProcessorData()
    {
        g = null;
        b = null;
        c = null;
        e = "";
        h = null;
        i = null;
    }

    public String getDocumentID()
    {
        return i;
    }

    public int getImageSize()
    {
        return f;
    }

    public String getPerfectionProfile()
    {
        return g;
    }

    public String getProcesedID()
    {
        return b;
    }

    public String getProcessingProfile()
    {
        return c;
    }

    public int getResultCode()
    {
        return d;
    }

    public int getSource()
    {
        return a;
    }

    public String getSourceImageID()
    {
        return h;
    }

    public void setDocumentID(String s)
    {
        i = s;
    }

    public void setImageSize(int j)
    {
        f = j;
    }

    public void setProcesedID(String s)
    {
        b = s;
    }

    public void setProcessingProfile(String s)
    {
        c = s;
    }

    public void setProfile(String s)
    {
        g = s;
    }

    public void setResultCode(int j)
    {
        d = j;
    }

    public void setSource(int j)
    {
        a = j;
    }

    public void setSourceImageID(String s)
    {
        h = s;
    }
}
