// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.be;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitlesStyle;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ed

final class ei
    implements Runnable
{

    final SubtitlesStyle a;
    final ed b;

    ei(ed ed1, SubtitlesStyle subtitlesstyle)
    {
        b = ed1;
        a = subtitlesstyle;
        super();
    }

    public final void run()
    {
        ed.a(b).setSubtitlesStyle(a);
    }
}
