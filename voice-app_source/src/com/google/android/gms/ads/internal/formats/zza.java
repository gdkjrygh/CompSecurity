// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

public class zza
{

    private static final int zzuW;
    private static final int zzuX;
    static final int zzuY;
    static final int zzuZ;
    private final int mTextColor;
    private final String zzva;
    private final Drawable zzvb;
    private final int zzvc;
    private final int zzvd;

    public zza(String s, Drawable drawable, Integer integer, Integer integer1, Integer integer2)
    {
        zzva = s;
        zzvb = drawable;
        int i;
        if (integer != null)
        {
            i = integer.intValue();
        } else
        {
            i = zzuY;
        }
        zzvc = i;
        if (integer1 != null)
        {
            i = integer1.intValue();
        } else
        {
            i = zzuZ;
        }
        mTextColor = i;
        if (integer2 != null)
        {
            i = integer2.intValue();
        } else
        {
            i = 12;
        }
        zzvd = i;
    }

    public int getBackgroundColor()
    {
        return zzvc;
    }

    public Drawable getIcon()
    {
        return zzvb;
    }

    public String getText()
    {
        return zzva;
    }

    public int getTextSize()
    {
        return zzvd;
    }

    public int zzdu()
    {
        return mTextColor;
    }

    static 
    {
        zzuW = Color.rgb(12, 174, 206);
        zzuX = Color.rgb(204, 204, 204);
        zzuY = zzuX;
        zzuZ = zzuW;
    }
}
