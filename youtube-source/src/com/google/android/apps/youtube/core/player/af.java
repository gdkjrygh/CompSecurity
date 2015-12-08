// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            ae, Director

final class af
    implements Runnable
{

    final ae a;

    af(ae ae1)
    {
        a = ae1;
        super();
    }

    public final void run()
    {
        ae.a(a).e();
        if (ae.b(a) != null)
        {
            ae.b(a).j();
        }
    }
}
