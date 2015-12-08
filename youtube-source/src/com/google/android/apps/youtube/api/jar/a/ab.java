// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.a;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            v

final class ab
    implements Runnable
{

    final int a;
    final int b;
    final v c;

    ab(v v1, int i, int j)
    {
        c = v1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        v.b(c).a(a, b);
    }
}
