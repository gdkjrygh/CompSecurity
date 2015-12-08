// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.content.Context;

// Referenced classes of package com.google.android.apps.youtube.api:
//            j, m

final class k
    implements Runnable
{

    final Context a;
    final String b;
    final String c;
    final String d;
    final String e;
    final m f;

    k(Context context, String s, String s1, String s2, String s3, m m1)
    {
        a = context;
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = m1;
        super();
    }

    public final void run()
    {
        try
        {
            j.a(j.a(a, b, c, d, e), f);
            return;
        }
        catch (Exception exception)
        {
            f.a(exception);
        }
    }
}
