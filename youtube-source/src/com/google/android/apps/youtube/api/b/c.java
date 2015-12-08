// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b;

import com.google.android.apps.youtube.api.s;

// Referenced classes of package com.google.android.apps.youtube.api.b:
//            a

final class c
    implements Runnable
{

    final String a;
    final int b;
    final a c;

    c(a a1, String s1, int i)
    {
        c = a1;
        a = s1;
        b = i;
        super();
    }

    public final void run()
    {
        com.google.android.apps.youtube.api.b.a.a(c).a(a, b);
    }
}
