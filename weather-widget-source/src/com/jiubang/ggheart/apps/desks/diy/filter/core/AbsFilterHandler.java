// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.apps.desks.diy.filter.core;

import android.graphics.Bitmap;

// Referenced classes of package com.jiubang.ggheart.apps.desks.diy.filter.core:
//            FilterParameter

public abstract class AbsFilterHandler
{

    public AbsFilterHandler()
    {
    }

    protected Bitmap a(int ai[], int i, int j)
    {
        Object obj = null;
        Bitmap bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(ai, i, j, android.graphics.Bitmap.Config.ARGB_8888);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            try
            {
                ai = Bitmap.createBitmap(ai, i, j, android.graphics.Bitmap.Config.ARGB_4444);
            }
            // Misplaced declaration of an exception variable
            catch (int ai[])
            {
                ai.printStackTrace();
                ai = obj;
            }
            outofmemoryerror.printStackTrace();
            return ai;
        }
        return bitmap;
    }

    public abstract Bitmap handler(FilterParameter filterparameter);
}
