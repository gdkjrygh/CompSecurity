// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.apps.desks.diy.filter.core;

import android.graphics.Bitmap;

// Referenced classes of package com.jiubang.ggheart.apps.desks.diy.filter.core:
//            AbsFilterHandler, FilterParameter

public class OriginalHandler extends AbsFilterHandler
{

    public OriginalHandler()
    {
    }

    public static boolean canHandle(int i)
    {
        return (getHadlerIds() & i) == i;
    }

    public static int getHadlerIds()
    {
        return 0;
    }

    public Bitmap handler(FilterParameter filterparameter)
    {
        if (filterparameter != null)
        {
            return filterparameter.mSrcBitmap;
        } else
        {
            return null;
        }
    }
}
