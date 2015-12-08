// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.player.event.y;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            ae

final class ag
    implements Runnable
{

    final ae a;

    ag(ae ae1)
    {
        a = ae1;
        super();
    }

    public final void run()
    {
        a.u();
        ae.c(a).c(new y());
    }
}
