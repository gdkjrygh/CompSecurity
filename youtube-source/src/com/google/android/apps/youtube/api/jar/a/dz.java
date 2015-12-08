// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.api.b.a.ax;
import com.google.android.apps.youtube.core.player.am;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ec, dy

final class dz
    implements Runnable
{

    final ax a;
    final dy b;

    dz(dy dy1, ax ax)
    {
        b = dy1;
        a = ax;
        super();
    }

    public final void run()
    {
        dy.a(b, new ec(a));
        dy.b(b).setListener(dy.a(b));
    }
}
