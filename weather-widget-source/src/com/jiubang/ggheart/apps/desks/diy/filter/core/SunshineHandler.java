// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.apps.desks.diy.filter.core;

import android.graphics.Bitmap;

// Referenced classes of package com.jiubang.ggheart.apps.desks.diy.filter.core:
//            AbsFilterHandler, FilterParameter

public class SunshineHandler extends AbsFilterHandler
{

    public SunshineHandler()
    {
    }

    public static boolean canHandle(int i)
    {
        return (getHadlerIds() & i) == i;
    }

    public static int getHadlerIds()
    {
        return 256;
    }

    public native void doFilt(int ai[], int i, int j, int k, float f, float f1);

    public Bitmap handler(FilterParameter filterparameter)
    {
        Object obj;
        if (filterparameter == null || filterparameter.mSrcBitmap == null)
        {
            obj = null;
        } else
        {
            int i = filterparameter.mSrcBitmap.getWidth();
            int j = filterparameter.mSrcBitmap.getHeight();
            obj = new int[i * j];
            filterparameter.mSrcBitmap.getPixels(((int []) (obj)), 0, i, 0, 0, i, j);
            doFilt(((int []) (obj)), i, j, 10, 0.1F, 0.1F);
            Bitmap bitmap = a(((int []) (obj)), i, j);
            obj = bitmap;
            if (bitmap == null)
            {
                return filterparameter.mSrcBitmap;
            }
        }
        return ((Bitmap) (obj));
    }
}
