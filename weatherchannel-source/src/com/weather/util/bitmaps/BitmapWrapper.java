// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.bitmaps;

import android.graphics.Bitmap;

public final class BitmapWrapper
{

    public static final BitmapWrapper EMPTY_WRAPPER = new BitmapWrapper("", null, false);
    public final Bitmap bitmap;
    public final boolean isCacheable;
    public final String pathName;

    public BitmapWrapper(String s, Bitmap bitmap1)
    {
        this(s, bitmap1, true);
    }

    public BitmapWrapper(String s, Bitmap bitmap1, boolean flag)
    {
        pathName = s;
        bitmap = bitmap1;
        isCacheable = flag;
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("BitmapWrapper: { pn=").append(pathName).append(", isC?=").append(isCacheable).append(", bitmap=").append(bitmap).toString();
        if (bitmap == null)
        {
            return (new StringBuilder()).append(s).append(", no dimensions}").toString();
        } else
        {
            return (new StringBuilder()).append(s).append(", b.w=").append(bitmap.getWidth()).append(", b.h=").append(bitmap.getHeight()).append(", b.r?=").append(bitmap.isRecycled()).append('}').toString();
        }
    }

}
