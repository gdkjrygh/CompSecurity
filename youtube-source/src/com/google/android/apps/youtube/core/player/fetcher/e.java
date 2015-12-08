// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.fetcher;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.event.q;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.ay;
import com.google.android.apps.youtube.datalib.innertube.bb;

// Referenced classes of package com.google.android.apps.youtube.core.player.fetcher:
//            f

public final class e
{

    private final ay a;
    private final a b;

    protected e()
    {
        b = null;
        a = null;
    }

    public e(a a1, ay ay1)
    {
        b = (a)c.a(a1);
        a = (ay)c.a(ay1);
    }

    static a a(e e1)
    {
        return e1.b;
    }

    public final void a(PlaybackStartDescriptor playbackstartdescriptor, l l)
    {
        a(playbackstartdescriptor.getVideoId(), playbackstartdescriptor.getPlaylistId(), playbackstartdescriptor.getPlaylistIndex(), playbackstartdescriptor.getParams(), playbackstartdescriptor.getClickTrackingParams(), l);
    }

    public final void a(String s, String s1, int i, String s2, byte abyte0[], l l)
    {
        b.a(new q());
        l = new f(this, l, (byte)0);
        bb bb1 = a.a();
        bb1.b(s1);
        bb1.a(i);
        bb1.a(s);
        bb1.c(s2);
        bb1.a(abyte0);
        a.a(bb1, l);
    }
}
