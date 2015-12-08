// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.api.ApiPlayer;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            d

final class p
    implements Runnable
{

    final String a;
    final int b;
    final d c;

    p(d d1, String s, int i)
    {
        c = d1;
        a = s;
        b = i;
        super();
    }

    public final void run()
    {
        d.a(c).b(a, b);
    }
}
