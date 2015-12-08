// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import com.google.android.apps.youtube.app.offline.r;
import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.core.player.y;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            ay

final class bg
    implements y
{

    final ay a;
    private final String b;

    private bg(ay ay1, String s)
    {
        a = ay1;
        super();
        b = s;
    }

    bg(ay ay1, String s, byte byte0)
    {
        this(ay1, s);
    }

    public final void a()
    {
    }

    public final void a(PlaybackServiceException playbackserviceexception)
    {
    }

    public final void b()
    {
        ay.b(a).b(ay.a(a), b, null);
    }
}
