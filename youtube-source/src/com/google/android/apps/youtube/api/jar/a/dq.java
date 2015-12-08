// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.ak;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            do

final class dq
    implements Runnable
{

    final long a;
    final boolean b;
    final boolean c;
    final do d;

    dq(do do1, long l, boolean flag, boolean flag1)
    {
        d = do1;
        a = l;
        b = flag;
        c = flag1;
        super();
    }

    public final void run()
    {
        com.google.android.apps.youtube.api.jar.a.do.b(d).a(a, b, c);
    }
}
