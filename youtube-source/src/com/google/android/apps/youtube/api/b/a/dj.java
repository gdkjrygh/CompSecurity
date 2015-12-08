// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;


// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            dg, df

final class dj
    implements Runnable
{

    final dg a;

    dj(dg dg1)
    {
        a = dg1;
        super();
    }

    public final void run()
    {
        if (dg.a(a) != null)
        {
            dg.a(a).c_();
        }
    }
}
