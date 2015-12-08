// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.analytics.j;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            s

final class t
    implements Runnable
{

    final String a;
    final String b;
    final int c;
    final s d;

    t(s s1, String s2, String s3, int i)
    {
        d = s1;
        a = s2;
        b = s3;
        c = i;
        super();
    }

    public final void run()
    {
        s.b(d).a(s.a(d), a, b, c);
    }
}
