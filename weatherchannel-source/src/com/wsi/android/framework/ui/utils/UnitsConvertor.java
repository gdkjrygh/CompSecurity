// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.utils;


public class UnitsConvertor
{

    private static float screenDensity;

    public UnitsConvertor()
    {
    }

    public static float convertDipToPx(double d)
    {
        return (float)((double)screenDensity * d);
    }

    public static int convertDipToPx(int i)
    {
        return (int)((float)i * screenDensity + 0.5F);
    }

    public static long convertMPHToKPH(int i)
    {
        return Math.round((double)i * 1.6093440000000001D);
    }

    public static void setScreenDensity(float f)
    {
        screenDensity = f;
    }
}
