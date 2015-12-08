// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            aq, ae, ag, YouTubeTvScreen, 
//            bk

final class ah
    implements aq
{

    final ae a;

    private ah(ae ae1)
    {
        a = ae1;
        super();
    }

    ah(ae ae1, byte byte0)
    {
        this(ae1);
    }

    public final void a(RemoteControl.RemotePlayerState remoteplayerstate)
    {
        ae.d(a);
    }

    public final void a(RemoteControl.State state)
    {
        switch (ag.b[state.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            break;
        }
        if (ae.b(a).hasDevice())
        {
            state = a.a.a(ae.b(a).getDevice());
        } else
        {
            state = ae.b(a).getScreen();
        }
        ae.a(a, ae.c(a), state);
    }

    public final void a(SubtitleTrack subtitletrack)
    {
    }

    public final void a(String s)
    {
        ae.d(a);
    }

    public final void a(List list)
    {
    }

    public final void l_()
    {
    }
}
