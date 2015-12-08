// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.core.player.overlay.p;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bx

final class cd
    implements Runnable
{

    final SubtitleTrack a;
    final bx b;

    cd(bx bx1, SubtitleTrack subtitletrack)
    {
        b = bx1;
        a = subtitletrack;
        super();
    }

    public final void run()
    {
        bx.a(b).a_(a);
    }
}
