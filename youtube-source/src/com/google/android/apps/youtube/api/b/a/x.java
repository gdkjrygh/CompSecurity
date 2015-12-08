// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.api.ApiPlayer;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            d

final class x
    implements Runnable
{

    final String a;
    final int b;
    final int c;
    final d d;

    x(d d1, String s, int i, int j)
    {
        d = d1;
        a = s;
        b = i;
        c = j;
        super();
    }

    public final void run()
    {
        com.google.android.apps.youtube.api.b.a.d.a(d).a(a, b, c);
    }
}
