// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.medialib.player.x;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            ae

final class ah
    implements android.media.AudioManager.OnAudioFocusChangeListener
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

    public final void onAudioFocusChange(int i)
    {
        switch (i)
        {
        case 0: // '\0'
        default:
            return;

        case -2: 
        case -1: 
            a.l();
            ae.a(a, false);
            return;

        case -3: 
            ae.d(a).a(0.1F);
            ae.a(a, false);
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            ae.a(a, true);
            break;
        }
        ae.d(a).a(1.0F);
    }
}
