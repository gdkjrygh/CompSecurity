// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.c.d;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.core.player.event.t;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            c

final class g
    implements d
{

    final c a;

    private g(c c1)
    {
        a = c1;
        super();
    }

    g(c c1, byte byte0)
    {
        this(c1);
    }

    public final void a(Object obj)
    {
label0:
        {
            if (((ac)obj).c() == com.google.android.apps.youtube.core.player.Director.VideoStage.ENDED)
            {
                if (!a.s_())
                {
                    break label0;
                }
                a.o();
            }
            return;
        }
        a.c.c(new t());
    }
}
