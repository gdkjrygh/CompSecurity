// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class ViewHelper
{

    public ViewHelper()
    {
    }

    public static Drawable getGradient()
    {
        return new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
            0xff000000, 0
        });
    }
}
