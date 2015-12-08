// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public abstract class ag extends Drawable
{

    public static final int a[] = {
        0
    };
    public static final int b[] = {
        1
    };
    public static final int c[] = {
        2
    };
    protected static final int d = Color.rgb(218, 0, 14);
    protected static final int e = Color.rgb(130, 1, 10);
    protected static final int f = Color.rgb(255, 204, 48);
    protected static final int g = Color.rgb(185, 148, 34);
    protected static final int h = Color.rgb(127, 127, 127);
    protected Shader i;
    protected Shader j;
    protected Shader k;
    protected int l;
    protected int m;

    public ag()
    {
    }

    protected abstract void a();

    protected final void a(Rect rect, int ai[])
    {
        i = new LinearGradient(0.0F, rect.top, 0.0F, rect.bottom, d, e, android.graphics.Shader.TileMode.CLAMP);
        j = new LinearGradient(0.0F, rect.top, 0.0F, rect.bottom, f, g, android.graphics.Shader.TileMode.CLAMP);
        if (ai == b)
        {
            rect = j;
        } else
        {
            rect = i;
        }
        k = rect;
    }

    public final int getOpacity()
    {
        return -1;
    }

    protected boolean onLevelChange(int i1)
    {
        if (getState() == c)
        {
            m = 100;
            l = 100;
        } else
        {
            m = i1 / 1000;
            l = i1 % 1000;
        }
        a();
        return true;
    }

    protected final boolean onStateChange(int ai[])
    {
        a(getBounds(), ai);
        return true;
    }

    public final void setAlpha(int i1)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }

}
