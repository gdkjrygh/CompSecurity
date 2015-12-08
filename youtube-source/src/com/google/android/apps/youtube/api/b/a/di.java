// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;


// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            dg, df

final class di
    implements Runnable
{

    final int a;
    final int b;
    final dg c;

    di(dg dg1, int i, int j)
    {
        c = dg1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        if (dg.a(c) != null)
        {
            df df1 = dg.a(c);
            int i = a;
            i = b;
            df1.b_();
        }
    }
}
