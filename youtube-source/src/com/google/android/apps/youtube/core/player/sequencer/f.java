// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.common.c.d;
import com.google.android.apps.youtube.core.player.event.w;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            c

final class f
    implements d
{

    final c a;

    private f(c c1)
    {
        a = c1;
        super();
    }

    f(c c1, byte byte0)
    {
        this(c1);
    }

    public final volatile void a(Object obj)
    {
        obj = (w)obj;
        a.a(((w) (obj)).a());
    }
}
