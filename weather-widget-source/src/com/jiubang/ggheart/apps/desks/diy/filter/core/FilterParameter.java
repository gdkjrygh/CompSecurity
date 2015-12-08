// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.apps.desks.diy.filter.core;

import android.graphics.Bitmap;

public class FilterParameter
{

    public static final int PAY_EXTRA_IDS_INDEX_EDIT = 0;
    public static final int PAY_EXTRA_IDS_INDEX_SETTING = 1;
    private int a;
    private boolean b;
    private int c[];
    private int d;
    private int e;
    private int f[];
    public Bitmap mSrcBitmap;

    public FilterParameter(int i, int j, int ai[])
    {
        a = i;
        e = j;
        f = ai;
    }

    public boolean canDiyColor()
    {
        return b;
    }

    public void cleanUp()
    {
        mSrcBitmap = null;
        c = null;
    }

    public int getDiyColor()
    {
        return d;
    }

    public int[] getDiyColors()
    {
        return c;
    }

    public int getFilterNameResId()
    {
        return e;
    }

    public int[] getPayExtraIds()
    {
        return f;
    }

    public int getTypeId()
    {
        return a;
    }

    public void setDiyColor(int i)
    {
        d = i;
    }

    public void setFilterNameResId(int i)
    {
        e = i;
    }
}
