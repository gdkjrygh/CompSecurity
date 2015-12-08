// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.os.Message;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            MediaActionHelper

final class aq
    implements android.os.Handler.Callback
{

    final MediaActionHelper a;

    aq(MediaActionHelper mediaactionhelper)
    {
        a = mediaactionhelper;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 234)
        {
            MediaActionHelper.b(a, (MediaActionHelper.Action)message.obj);
            return true;
        } else
        {
            return false;
        }
    }
}
