// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

public class zzbe
{

    private static final int zzsw;
    private static final int zzsx;
    static final int zzsy;
    static final int zzsz;
    private final int mTextColor;
    private final String zzsA;
    private final Drawable zzsB;
    private final int zzsC;
    private final int zzsD;

    public zzbe(String s, Drawable drawable, Integer integer, Integer integer1, Integer integer2)
    {
        zzsA = s;
        zzsB = drawable;
        int i;
        if (integer != null)
        {
            i = integer.intValue();
        } else
        {
            i = zzsy;
        }
        zzsC = i;
        if (integer1 != null)
        {
            i = integer1.intValue();
        } else
        {
            i = zzsz;
        }
        mTextColor = i;
        if (integer2 != null)
        {
            i = integer2.intValue();
        } else
        {
            i = 12;
        }
        zzsD = i;
    }

    public int getBackgroundColor()
    {
        return zzsC;
    }

    public Drawable getIcon()
    {
        return zzsB;
    }

    public String getText()
    {
        return zzsA;
    }

    public int getTextSize()
    {
        return zzsD;
    }

    public int zzcz()
    {
        return mTextColor;
    }

    static 
    {
        zzsw = Color.rgb(12, 174, 206);
        zzsx = Color.rgb(204, 204, 204);
        zzsy = zzsx;
        zzsz = zzsw;
    }
}
