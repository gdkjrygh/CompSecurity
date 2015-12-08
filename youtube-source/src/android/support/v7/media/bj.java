// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;

// Referenced classes of package android.support.v7.media:
//            f, i, bp, bo, 
//            bk, bq, bt, ad

abstract class bj extends f
{

    protected bj(Context context)
    {
        super(context, new i(new ComponentName("android", android/support/v7/media/bj.getName())));
    }

    public static bj a(Context context, bt bt)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return new bp(context, bt);
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return new bo(context, bt);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new bk(context, bt);
        } else
        {
            return new bq(context);
        }
    }

    public void a(ad ad)
    {
    }

    public void b(ad ad)
    {
    }

    public void c(ad ad)
    {
    }

    public void d(ad ad)
    {
    }
}
