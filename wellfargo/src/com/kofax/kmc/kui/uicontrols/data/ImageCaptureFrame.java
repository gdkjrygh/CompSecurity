// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.data;


public class ImageCaptureFrame
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public ImageCaptureFrame()
    {
        d = -1;
    }

    public int getFrameBorderColor()
    {
        return d;
    }

    public int getFrameBorderWidth()
    {
        return c;
    }

    public int getFrameHeight()
    {
        return b;
    }

    public int getFrameOuterColor()
    {
        return e;
    }

    public int getFrameWidth()
    {
        return a;
    }

    public void setFrameBorderColor(int i)
    {
        d = i;
    }

    public void setFrameBorderWidth(int i)
    {
        c = i;
    }

    public void setFrameHeight(int i)
    {
        b = i;
    }

    public void setFrameOuterColor(int i)
    {
        e = i;
    }

    public void setFrameWidth(int i)
    {
        a = i;
    }
}
