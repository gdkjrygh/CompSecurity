// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import android.os.Handler;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            ae

final class af
    implements Runnable
{

    final Handler a;
    final ae b;

    af(ae ae1, Handler handler)
    {
        b = ae1;
        a = handler;
        super();
    }

    public final void run()
    {
        ae.a(b, a, ae.a(b));
    }
}
