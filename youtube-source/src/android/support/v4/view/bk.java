// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//            bo, bm, bl, bp, 
//            bn

public final class bk
{

    static final bn a;

    public static void a(ViewGroup viewgroup, boolean flag)
    {
        a.a(viewgroup, false);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 18)
        {
            a = new bo();
        } else
        if (i >= 14)
        {
            a = new bm();
        } else
        if (i >= 11)
        {
            a = new bl();
        } else
        {
            a = new bp();
        }
    }
}
