// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import android.os.Handler;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            ah, ae

final class ai
    implements Runnable
{

    final Handler a;
    final ah b;

    ai(ah ah1, Handler handler)
    {
        b = ah1;
        a = handler;
        super();
    }

    public final void run()
    {
        ae.a(b.a, a, ae.a(b.a));
    }
}
