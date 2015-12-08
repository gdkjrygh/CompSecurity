// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.ocr;


public class OcrRegion
{

    int a;
    int b;
    int c;
    int d;
    private RegionType e;

    public OcrRegion()
    {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = null;
    }

    public int getRegionHeight()
    {
        return d;
    }

    public int getRegionLeft()
    {
        return b;
    }

    public int getRegionTop()
    {
        return a;
    }

    public RegionType getRegionType()
    {
        return e;
    }

    public int getRegionWidth()
    {
        return c;
    }

    public void setRegionHeight(int i)
    {
        d = i;
    }

    public void setRegionLeft(int i)
    {
        b = i;
    }

    public void setRegionTop(int i)
    {
        a = i;
    }

    public void setRegionType(RegionType regiontype)
    {
        e = regiontype;
    }

    public void setRegionWidth(int i)
    {
        c = i;
    }
}
