// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.a;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            v

final class y
    implements Runnable
{

    final String a;
    final boolean b;
    final boolean c;
    final String d;
    final v e;

    y(v v1, String s, boolean flag, boolean flag1, String s1)
    {
        e = v1;
        a = s;
        b = flag;
        c = flag1;
        d = s1;
        super();
    }

    public final void run()
    {
        v.b(e).a(a, b, c, d);
    }
}
