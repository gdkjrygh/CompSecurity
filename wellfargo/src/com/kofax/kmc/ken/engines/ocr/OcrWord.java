// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.ocr;


public class OcrWord
{

    String a;
    int b;
    int c;
    int d;
    int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public OcrWord()
    {
    }

    public int getHeight()
    {
        return f - g;
    }

    public String getText()
    {
        return a;
    }

    public int getWidth()
    {
        return h - j;
    }

    public int getX()
    {
        return b;
    }

    public int getY()
    {
        return c;
    }

    protected void setBRy(int k)
    {
        f = k;
    }

    public void setHeight(int k)
    {
        e = k;
    }

    protected void setTLx(int k)
    {
        j = k;
    }

    protected void setTRx(int k)
    {
        h = k;
    }

    protected void setTRy(int k)
    {
        g = k;
    }

    public void setText(String s)
    {
        a = s;
    }

    public void setWidth(int k)
    {
        d = k;
    }

    public void setX(int k)
    {
        b = k;
    }

    public void setY(int k)
    {
        c = k;
    }
}
