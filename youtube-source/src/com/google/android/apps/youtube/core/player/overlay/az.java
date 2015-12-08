// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.am;
import com.google.android.apps.youtube.core.player.event.af;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            ControlsOverlay, ba

public final class az
{

    private final am a;
    private final ControlsOverlay b;

    public az(am am1, ControlsOverlay controlsoverlay)
    {
        a = (am)c.a(am1);
        b = (ControlsOverlay)c.a(controlsoverlay);
        am1.setListener(new ba(this, (byte)0));
    }

    static ControlsOverlay a(az az1)
    {
        return az1.b;
    }

    public final void handleYouTubePlayerStateEvent(af af1)
    {
        switch (af1.a())
        {
        case 6: // '\006'
        default:
            return;

        case 2: // '\002'
        case 5: // '\005'
            a.setKeepScreenOn(true);
            return;

        case 3: // '\003'
        case 4: // '\004'
        case 7: // '\007'
        case 8: // '\b'
            a.setKeepScreenOn(false);
            break;
        }
    }
}
